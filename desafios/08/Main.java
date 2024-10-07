import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> listaString = new ArrayList<>();
    listaString.add("Desafios");
    listaString.add("Estudo");
    listaString.add("Programação");

    for (String elemento : listaString) {
      System.out.println(elemento);
    }

    Cachorro sohpie = new Cachorro();
    Animal animal = (Animal) sohpie;

    Animal dog = new Cachorro();
    if (dog instanceof Cachorro) {
      Cachorro cachorro = (Cachorro) dog;
      cachorro.fazBarulho();
    }

    Produto produto1 = new Produto("Mouse", 153.90);
    Produto produto2 = new Produto("Teclado", 450.99);
    Produto produto3 = new Produto("Headset", 402.50);
    Produto produto4 = new Produto("Cubo Magico", 105.90);
    Produto produto5 = new Produto("Megaminx", 30.89);

    ArrayList<Produto> listaDeProdutos = new ArrayList<>();
    listaDeProdutos.add(produto1);
    listaDeProdutos.add(produto2);
    listaDeProdutos.add(produto3);
    listaDeProdutos.add(produto4);
    listaDeProdutos.add(produto5);

    double somaPrecos = 0;

    for (Produto produto : listaDeProdutos) {
      somaPrecos += produto.getPreco();
    }

    System.out
        .println(String.format("O preço médio da lista de produtos é de R$ %.2f", somaPrecos / listaDeProdutos.size()));

    Circulo circulo = new Circulo(2.5);
    Quadrado quadrado = new Quadrado(5);

    ArrayList<Forma> listaDeFormas = new ArrayList<>();

    listaDeFormas.add(circulo);
    listaDeFormas.add(quadrado);

    for (Forma forma : listaDeFormas) {
      System.out.println(forma.calcularArea());
    }

    ContaBancaria conta1 = new ContaBancaria(1, 1503);
    ContaBancaria conta2 = new ContaBancaria(2, 2384);
    ContaBancaria conta3 = new ContaBancaria(3, 129);
    ContaBancaria conta4 = new ContaBancaria(4, 9402);
    ContaBancaria conta5 = new ContaBancaria(5, 92);

    ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();

    listaDeContas.add(conta1);
    listaDeContas.add(conta2);
    listaDeContas.add(conta3);
    listaDeContas.add(conta4);
    listaDeContas.add(conta5);

    ContaBancaria contaComMenorSaldo = listaDeContas.get(0);
    for (ContaBancaria conta : listaDeContas) {
      if (conta.getSaldo() < contaComMenorSaldo.getSaldo()) {
        contaComMenorSaldo = conta;
      }
    }

    System.out.println(String.format("A conta com o menor saldo é a %d com um saldo de R$ %.2f",
        contaComMenorSaldo.getNumero(), contaComMenorSaldo.getSaldo()));

  }
}
