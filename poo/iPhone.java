import java.util.InputMismatchException;
import java.util.Scanner;

import Funcionalidades.AparelhoTelefonico;
import Funcionalidades.NavegadorInternet;
import Funcionalidades.ReprodutorMusical;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int operacao = 0;
    
    iPhone phone = new iPhone();

    System.out.println("Bem-vindo ao iPhone 2007");
    System.out.println("Escolha uma operação:");
    System.out.println("Music Player - 1-Selecionar música   2-Tocar música   3-Pausa música");
    System.out.println("Telefone     - 4-Ligar               5-Atender        6-Iniciar chamada de voz ");
    System.out.println("Internet     - 7-Abrir pagina        8-Adicionar aba  9-Atualizar pagina");

    // Tratamento de Exceção
    try {
      System.out.print("\nDigite o numero da operação: ");
      operacao = scanner.nextInt();
    }

    catch (InputMismatchException e) {
      System.out.println("Digite apenas dígitos de 1 a 9");
      scanner.close();
      return;
    }

    switch (operacao) {
      case 1:
        String musica;
        System.out.print("Entre com o nome da música: ");
        musica = scanner.next();
        phone.selecionarMusica(musica);
        break;

      case 2:
        phone.tocar();
        break;
      
      case 3:
        phone.pausar();
        break;

      case 4:
        String numero;
        System.out.print("Entre com o número da pesso que você deseja ligar: ");
        numero = scanner.next();
        phone.ligar(numero);
        break;

      case 5:
        phone.atender();
        break;

      case 6:
        phone.iniciarCorreioVoz();
        break;

      case 7:
        String pagina;
        System.out.print("Entre com a url da pagina: ");
        pagina = scanner.next();
        phone.exibirPagina(pagina);
        break;

      case 8:
        phone.adicionarNovaAba();
        break;

      case 9:
        phone.atualizarPagina();
        break;
    
      default:
        System.out.println("Digite apenas dígitos de 1 a 9");
        break;
    }
    scanner.close();
  }

  // AparelhoTelefonico
  public void ligar(String numero) {
    System.out.println("Ligando para: "+ numero);
  }

  public void atender() {
    System.out.println("Atendendo o telefone...");
  }

  public void iniciarCorreioVoz() {
    System.out.println("Iniciando chamada de voz...");
  }

  // Reprodutor Musical
  public void tocar() {
    System.out.println("Tocando música...");
  }

  public void pausar() {
    System.out.println("Pausando música...");
  }

  public void selecionarMusica(String musica) {
    System.out.println("Selecionando música: "+ musica);
  }

  // Navegador Internet
  public void exibirPagina(String url) {
    System.out.println("Abrindo pagina: "+ url);
  }

  public void adicionarNovaAba() {
    System.out.println("Adicionando nova aba...");
  }

  public void atualizarPagina() {
    System.out.println("Atualizando pagina...");
  }
}
