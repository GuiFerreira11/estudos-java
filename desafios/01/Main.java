public class Main {
  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa();
    pessoa.exibeSaudacao();

    Calculadora calculadora = new Calculadora();
    System.out.println(calculadora.dobraNumero(5));

    Musica musica = new Musica();
    musica.titulo = "Sonífera Ilha";
    musica.artista = "Titãs";
    musica.anoLancamento = 1984;
    musica.exibeFichaTecnica();
    musica.avaliarMusica(9);
    musica.avaliarMusica(10);
    musica.avaliarMusica(9.5);
    musica.exibeMediaAvaliacoes();

    Carro carro = new Carro();
    carro.modelo = "Monza";
    carro.cor = "Prata";
    carro.anoLancamento = 1992;
    carro.exibeFichaTecnica();
    System.out.println(carro.calculaIdadeCarro());

    Aluno aluno = new Aluno();
    aluno.nome = "Guilherme";
    aluno.idade = 28;
    aluno.exibeInformacoes();
  }
}
