import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

    Pessoa guilherme = new Pessoa();
    guilherme.setNome("Guilherme");
    guilherme.setIdade(28);

    Pessoa vinicius = new Pessoa();
    vinicius.setNome("Vinicius");
    vinicius.setIdade(25);

    Pessoa fernanada = new Pessoa();
    fernanada.setNome("Fernanada");
    fernanada.setIdade(30);

    listaDePessoas.add(guilherme);
    listaDePessoas.add(vinicius);
    listaDePessoas.add(fernanada);

    System.out.println("A lista de pessoas tem %d pessoas".formatted(listaDePessoas.size()));
    System.out.println("A primeira pessoa da lista é " + listaDePessoas.get(0));
    System.out.println(listaDePessoas);
  }
}
