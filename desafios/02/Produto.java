public class Produto {
  
  private String nome;
  private double preco;

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public String getNome() {
    return nome;
  }

  public double getPreco() {
    return preco;
  }

  public double aplicaDesconto(double desconto) {
    return preco * (1 - desconto);
  }
}
