public class Main {
  public static void main(String[] args) {
    System.out.println("Esse é o Screen Match");
    System.out.println("Filme: Top Gun: Maverick");

    int anoDeLancamento = 2002;

    System.out.println("Ano de lançamento: " + anoDeLancamento);
    boolean incluidoNoPlano = true;
    double notaDoFilme = 8.1;

    System.out.println("O filme está incluso no seu plano: " + incluidoNoPlano);
    System.out.println("A nota do filme na plataforma é de: " + notaDoFilme);

    double media = (9.8 + 6.3 + 7.0) / 3;
    System.out.println(media);

    String sinopse = "Filme de aventura com galã dos anos 1980";

    System.out.println(sinopse);

    int classificacao = (int) media / 2;
    System.out.println(classificacao);
  }
}
