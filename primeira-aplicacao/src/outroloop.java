import java.util.Scanner;

public class outroloop {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    double nota = 0;
    double mediaAvaliacao = 0;
    int totalDeAvaliacoes = 0;

    while (nota != -1) {
      System.out.println(String.format("Digite sua avaliação n %d para o filme ou -1 para sair", totalDeAvaliacoes + 1));
      nota = leitura.nextDouble();
      if (nota != -1) {
        mediaAvaliacao += nota;
        totalDeAvaliacoes++;
      }
    }
    if (totalDeAvaliacoes >= 1) {
      System.out.println(String.format("A média das notas foi %.1f", mediaAvaliacao / totalDeAvaliacoes));
    } else {
      System.out.println("Nenhuma nota foi digitada");
    }
  }
}
