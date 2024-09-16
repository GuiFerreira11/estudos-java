import java.util.Scanner;

public class desafio2 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Desafio 2.1");

    System.out.println("Digite um número:");
    double numero = input.nextDouble();
    if (numero > 0) {
      System.out.println("Número positivo");
    } else if (numero < 0) {
      System.out.println("Número negativo");
    } else {
      System.out.println("Zero");
    }

    System.out.println("Desafio 2.2");

    System.out.println("Digite 2 números");
    System.out.println("Número 1:");
    double numeroUm = input.nextDouble();
    System.out.println("Número 2:");
    double numeroDois = input.nextDouble();

    if (numeroUm == numeroDois) {
      System.out.println("Os números digitados foram iguais");
    } else {
      System.out.println("Os números digitados foram difirentes");
      if (numeroUm > numeroDois) {
        System.out.println("O número 1 é maior do que o número 2");
      } else {
        System.out.println("O número 2 é maior do que o número 1");
      }
    }

    System.out.println("Desafio 2.3");

    System.out.println("""
        Escolha o que deseja calcular
        1. Calcular área do quadrado
        2. Calcular área do círculo
        """);
    int escolha = input.nextInt();
    if (escolha == 1) {
      System.out.println("Digite a medida do lado do quadrado");
      double ladoQuadrado = input.nextDouble();
      System.out.println("A área do quadrado é " + ladoQuadrado * ladoQuadrado);
    } else if (escolha == 2) {
      System.out.println("Digite o medida do raio do círculo");
      double raioCirculo = input.nextDouble();
      System.out.println("A área do círculo é " + raioCirculo * 2 * 3.14);
    }

    System.out.println("Desafio 2.4");

    System.out.println("Digite um número inteiro");
    int numeroTabuada = input.nextInt();
    for (int i = 1; i <= 10; i++) {
      System.out.println(numeroTabuada * i);
    }

    System.out.println("Desafio 2.5");

    System.out.println("Digite um número inteiro");
    if (!input.hasNextInt()) {
      System.out.println("Número inválido");
    } else {
      int numeroInteiro = input.nextInt();
      if (numeroInteiro % 2 == 0) {
        System.out.println("O número é par!");
      } else {
        System.out.println("O número é impar!");
      }
    }

    System.out.println("Desafio 2.6");

    System.out.println("Digite um número para calcular o fatorial");

    long numeroFatorial = input.nextInt();
    long numeroAnterior = numeroFatorial - 1;
    while (numeroAnterior > 1) {
      numeroFatorial *= numeroAnterior;
      numeroAnterior--;
    }
    System.out.println(numeroFatorial);
  }
}
