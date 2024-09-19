import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;

public class Main {
  public static void main(String[] args) {
    Filme meuFilme = new Filme();
    meuFilme.setNome("O poderoso chefão");
    meuFilme.setAnoDeLancamento(1972);
    meuFilme.setDuracaoEmMinutos(235);
    meuFilme.setIncluidoNoPlano(true);

    meuFilme.exibeFichaTecnia();
    meuFilme.avalia(8);
    meuFilme.avalia(5);
    meuFilme.avalia(10);

    System.out.println(meuFilme.pegaMedia());
    System.out.println("Duração do Filme: " + meuFilme.getDuracaoEmMinutos());

    meuFilme.getTotalDeAvaliacoes();

    Filme outroFilme = new Filme();
    outroFilme.setNome("Avatar - O caminho da água");
    outroFilme.setAnoDeLancamento(2022);
    outroFilme.setDuracaoEmMinutos(192);

    Serie minhaSerie = new Serie();
    minhaSerie.setNome("Lost");
    minhaSerie.setAnoDeLancamento(2004);
    minhaSerie.setTemporadas(6);
    minhaSerie.setEpisodiosPorTemporada(20);
    minhaSerie.setMinutosPorEpisodio(45);
    System.out.println("Duração para maratonar Lost: " + minhaSerie.getDuracaoEmMinutos());
    minhaSerie.exibeFichaTecnia();

    CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
    calculadora.incluiItem(meuFilme);
    calculadora.incluiItem(outroFilme);
    calculadora.incluiItem(minhaSerie);
    System.out.println("Tempo total necessário para assistir tudo: " + calculadora.getTempoTotal());



  }
}
