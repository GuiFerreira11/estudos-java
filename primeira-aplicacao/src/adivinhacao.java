import java.util.Random;
import java.util.Scanner;

public class adivinhacao {
  public static void main(String[] args) {

    System.out.println("*************************");
    System.out.println("***Jogo de Adivinhação***");
    System.out.println("*************************");
    System.out.println();
    System.out.println("Tente adivinhar o número secreto inteiro escolhido entre 0 e 100.");

    Scanner input = new Scanner(System.in);
    int numeroSecreto = new Random().nextInt(100);
    int totalDeTentativas = 0;
    int chute;

    System.out.println("""
      Escolha sua dificuldade:
      1 - Difícil > 3 tentativas
      2 - Médio   > 5 tentativas
      3 - Fácil   > 10 tentativas
      """);

    int dificuldade = input.nextInt();
    System.out.println();

    switch (dificuldade) {
      case 1:
      totalDeTentativas = 3;
      System.out.println("Dificuldade 1 - Difícil selecionada");
      System.out.println();
        break;
      case 2:
      totalDeTentativas = 5;
      System.out.println("Dificuldade 2 - Médio selecionada");
      System.out.println();
     break;
      case 3:
      totalDeTentativas = 10;
      System.out.println("Dificuldade 3 - Fácil selecionada");
      System.out.println();
      break;
      default:
      System.out.println("Dificuldade inválida!");
        break;
    }

    while (totalDeTentativas > 0) {
      System.out.println("Digite um número:");
      chute = input.nextInt();
      totalDeTentativas--;
      if (chute == numeroSecreto) {
        System.out.println(String.format("Parabéns você ganhou o número secreto era %d!", chute));
        break;
      }
      if (totalDeTentativas > 0) {
        if (chute < numeroSecreto) {
          System.out.println("Você errou seu chute foi MENOR do que o número secreto, tente novamente.");
        } else if (chute > numeroSecreto) {
          System.out.println("Você errou seu chute foi MAIOR do que o número secreto, tente novamente.");
        } else if (chute <= 0 || chute >= 100) {
          System.out.println("Por favor, digite um número entre 0 e 100!");
        }
        System.out.println(String.format("Ainda restam %d tentativas!", totalDeTentativas));
      } else if (totalDeTentativas == 0) {
        System.out.println(String.format("Que pena, você perdeu! o número secreto era %d!",numeroSecreto));
      }
    }
  }
}
