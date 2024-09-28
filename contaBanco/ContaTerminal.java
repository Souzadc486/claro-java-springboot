import javal.util.Locale;
import java.util.Scanner;

public class ContaTermial {
 public static void main(String[] args) {
   Scanner scanner= new Scanner(System.in).useLocale(Locale.US);
   
   System.out.println("Bem-vindo a conta banco");
   
   System.out.println("Por favor digite o Número da conta: ");
   int numeroConta = scanner.nextInt();

   System.out.println("Por favor digite o número da agência: ");
   String numeroAgencia = scanner.next();

   System.out.println("Por favor digite o nome do cliente: ");
   String nomeCliente = scanner.next();

   System.out.println("Por favor Digite o Número da agência: ");
   double saldo = scanner.nextDouble();

   System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + " conta " + numeroConta + " e seu saldo " + saldo + " já está disponivel
                      para saque");
   
 } 
}

//Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".
