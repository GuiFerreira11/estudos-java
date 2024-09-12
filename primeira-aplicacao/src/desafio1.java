public class desafio1 {
  public static void main(String[] args){

    System.out.println("Desafio 1.1");
    
    double nota1 = 8.5;
    double nota2 = 9.1;
    double media = (nota1 + nota2) / 2;
    System.out.println(String.format("A média entre a nota 1 - %.2f e a nota 2 - %.2f é igual a %.2f", nota1, nota2, media));


    System.out.println("Desafio 1.2");
    
    double varDouble = 2.5;
    int varInt = (int) varDouble;
    System.out.println(String.format("O casting da variável double %.2f em int é igual a %d", varDouble, varInt));


    System.out.println("Desafio 1.3");
    
    char letra = 'G';
    String mensagem = "Meu nome começa com a letra ";
    System.out.println(mensagem + letra);


    System.out.println("Desafio 1.4");

    double precoProduto = 31.2;
    int quantidade = 5;
    System.out.println(String.format("Temos na loja %d produtos, cada um custa R$%.2f, no total temos R$%.2f", quantidade, precoProduto, quantidade * precoProduto));


    System.out.println("Desafio 1.5");

    double valorEmDolares = 28;
    double valorEmReais = valorEmDolares / 4.94;
    System.out.println(String.format("Convertendo U$%.2f em reais, temos R$%.2f", valorEmDolares, valorEmReais));


    System.out.println("Desafio 1.6");

    double precoOriginal = 404.23;
    double percentualDesconto = 0.1;
    System.out.println(String.format("Com o desconto de %.2f%% o valor original do produto vai de R$%.2f para R$%.2f", percentualDesconto, precoOriginal, precoOriginal * (1.0 - percentualDesconto)));
  }
}
