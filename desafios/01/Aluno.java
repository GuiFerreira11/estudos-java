public class Aluno {
  String nome;
  int idade;

  void exibeInformacoes(){
    System.out.println(String.format("Meu nome é %s e eu tenho %d anos.", nome, idade));
  }
}
