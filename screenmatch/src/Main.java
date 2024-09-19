import br.com.alura.screenmatch.modelos.Filme;

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

    meuFilme.getTotalDeAvaliacoes();
  }
}
