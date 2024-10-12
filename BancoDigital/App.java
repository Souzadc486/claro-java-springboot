public class App {
    public static void main(String[] args) throws Exception {

        Cliente vernilton = new Cliente();

        vernilton.setNome("Vernilton");


        Conta cc = new ContaCorrente(vernilton);
        Conta poupanca = new ContaPoupanca(vernilton);

        cc.imprimirExtrado();
        poupanca.imprimirExtrado();

    }
}
