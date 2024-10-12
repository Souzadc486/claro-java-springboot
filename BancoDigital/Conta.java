/*
 * Classe pai ou super classe para 
 * ContaCorrente e ContaPouanca
 * 
 * Podemos definar uma classe como abstrata para que ela não possa ser
 * instânciada, ou seja, garante que ninguem vai dar um new nela.
 * 
 */

public abstract class Conta implements iConta{

  protected int agencia;
  protected int numero;
  protected double saldo;
  private static final int AGENCIA_PADRAO = 1;
  private static int SEQUENCIAL = 1;
  protected Cliente cliente;
  protected Banco banco;

  public Conta(Cliente cliente) {
    this.agencia = AGENCIA_PADRAO;
    this.numero = SEQUENCIAL++;
    this.cliente = cliente;
  }
  
  public int getAgencia() {
    return agencia;
  }
  public int getNumero() {
    return numero;
  }
  public double getSaldo() {
    return saldo;
  }

  @Override
  public void depositar(double valor) {
    saldo += valor; // mesmo que this.saldo = saldo + valor
    
  }
  @Override
  public void sacar(double valor) {
    saldo -= valor; // mesoe que this.saldo = saldo - valor
    
  }
  @Override
  public void transferir(double valor, Conta contaDestino) {
    this.sacar(valor);
    contaDestino.depositar(valor);
  }
  
  protected void imprimirInfos(Banco banco) {
    System.out.println(String.format("%s", banco.getNome()));
    System.out.println(String.format("Agencia: %d", this.agencia));
    System.out.println(String.format("Numero: %d", this.numero));
    System.out.println(String.format("Saldo: %.2f", this.saldo));    
    System.out.println(String.format("nome: %s", this.cliente.getNome()));    
  }
}
