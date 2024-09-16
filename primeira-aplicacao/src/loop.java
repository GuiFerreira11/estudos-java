import java.util.Scanner;

public class loop {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    double mediaAvaliacao = 0;
    double nota = 0;

    for (int i = 0; i < 3; i++) {
      System.out.println(String.format("Digite a nota %d para o filme", i + 1));
      nota = leitura.nextDouble();
      mediaAvaliacao += nota;
    }

    System.out.println(String.format("A média de avaliação do filme foi %.1f",
        mediaAvaliacao / 3));
  }
}
