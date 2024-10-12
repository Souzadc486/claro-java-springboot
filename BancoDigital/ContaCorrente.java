public class ContaCorrente extends Conta {

Banco banco = new Banco();

public ContaCorrente(Cliente cliente) {
  super(cliente);
  banco.setNome("Conta Corrente Digital");
}


  @Override
  public void imprimirExtrado() {
    System.out.println("Extrato conta corrente");
    super.imprimirInfos(banco);  
  }
// static: variavel tem relação com a classe e não com a instância

}

