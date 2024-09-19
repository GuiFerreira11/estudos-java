public class Main {
  public static void main(String[] args) {

    ContaBancaria conta = new ContaBancaria();
    conta.setNumeroConta(123);
    conta.titular = "Guilherme";
    System.out.println("""
        Dados da conta bancária:

        Nome do titular: %s
        Número da conta: %d
        Saldo da conta: R$ %.2f
        """.formatted(conta.titular, conta.getNumeroConta(), conta.getSaldo()));

    IdadePessoa pessoa = new IdadePessoa();
    pessoa.setNome("Guilherme");
    pessoa.setIdade(29);
    System.out.println("""
        Dados da pessoa:

        Nome: %s
        Idade: %d
        Maior de idade: %b
        """.formatted(pessoa.getNome(), pessoa.getIdade(), pessoa.verificarIdade()));

    Produto produto = new Produto();
    produto.setNome("Anel");
    produto.setPreco(159.99);
    System.out.println("""
        Dados do produto:

        Nome: %s
        Preço original: R$ %.2f
        Preço com desconto: R$ %.2f
        """.formatted(produto.getNome(), produto.getPreco(), produto.aplicaDesconto(0.1)));

    Aluno aluno = new Aluno("Guilherme", 10, 9.6);
    System.out.println("""
      Dados do aluno:

      Nome: %s
      Nota 1: %.1f
      Nota 2: %.1f
      Média final: %.1f
      """.formatted(aluno.getNome(), aluno.getNota1(), aluno.getNota2(), aluno.geraMedia()));


    Livro livro = new Livro("Guerra dos Tronos", "G.R.R. Martin");
    livro.exibirDetalhes();
  }
}
