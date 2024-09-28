import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
 public static void main(String[] args) {
   Scanner scanner= new Scanner(System.in).useLocale(Locale.US);
   
   System.out.println("Bem-vindo a conta banco");
   
   System.out.print("Digite o Número da conta: ");
   int numeroConta = scanner.nextInt();

   System.out.print("Digite o número da agência: ");
   String numeroAgencia = scanner.next();

   System.out.print("Digite o nome do cliente: ");
   String nomeCliente = scanner.next();

   System.out.print("Digite o saldo: ");
   double numeroSaldo = scanner.nextDouble();

  String conta = String.valueOf(numeroConta);
  String saldo = String.valueOf(numeroSaldo);

  String saudacao = "Olá ".concat(nomeCliente).concat(" obrigado por criar uma conta em nosso banco, ");
  String dados = "sua agência é " + numeroAgencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.";

  System.out.println(saudacao + dados);
   
 } 
}
