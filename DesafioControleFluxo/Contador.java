import java.util.Locale;
import java.util.Scanner;

public class Contador {

  public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Bem-vindo ao programa contador");

    System.out.print("Digite o primeiro parâmetro: "); int parametroUm = terminal.nextInt();
    System.out.print("Digite o segundo parâmetro: "); int parametroDois = terminal.nextInt();
    terminal.close();

    try {
      contar(parametroUm, parametroDois);
    }

    catch (ParametrosInvalidosException e) {
      System.out.println("O segundo parâmetro deve ser maior que o primeiro");
    }
  }

  static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {

    if (parametroUm > parametroDois) {
      throw new ParametrosInvalidosException();
    }

    int contagem = parametroDois - parametroUm;

    for (int ocorrencias = 1; ocorrencias <= contagem; ocorrencias++ ) {
      System.out.println("Imprimindo o número " + ocorrencias);
    }
  }
}
