import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Produto> listaDeProdutos = new ArrayList<>();

    Produto feijao = new Produto("feijao", 8.50);
    Produto energetico = new Produto("Monster", 7.6);
    Produto chocolate = new Produto("Milka", 11.50);

    listaDeProdutos.add(feijao);
    listaDeProdutos.add(energetico);
    listaDeProdutos.add(chocolate);

    System.out.println("A lista de produtos possui " + listaDeProdutos.size() + " itens.");
    System.out.println("O produto de número 3 é " + listaDeProdutos.get(2));
    System.out.println("A lista completa de produtos pode ser vista abaixo:");
    System.out.println(listaDeProdutos);

    ProdutoPerecivel queijo = new ProdutoPerecivel("Gorgonzola", 89.9, "10/10/2024");

    listaDeProdutos.add(queijo);

    System.out.println("Lista de produtos atualizada:");
    System.out.println(listaDeProdutos);

  }
}
