public class ContaPoupanca extends Conta {
  Banco banco = new Banco();

  public ContaPoupanca(Cliente clientepop) {
    super(clientepop);
    banco.setNome("Conta Poupança Digital");
  }


  @Override
  public void imprimirExtrado() {
    System.out.println("Extrato conta poupança");
    super.imprimirInfos(banco);  
  }
}
