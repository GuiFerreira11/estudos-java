public class IdadePessoa {
  
  private String nome;
  private int idade;

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public String getNome() {
    return nome;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public boolean verificarIdade() {
    return idade >= 18;
  }


}
