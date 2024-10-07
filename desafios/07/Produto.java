public class Produto {
  private String nome;
  private double preco;
  private int quantidade;

  public Produto(String nome, double preco) {
    this.nome = nome;
    this.preco = preco;
  }

  @Override
  public String toString() {
    return String.format("Nome: %s, preço: R$ %.2f, quantidade disponível: %d", nome, preco, quantidade);
  }

  public String getNome() {
    return nome;
  }

  public double getPreco() {
    return preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

}
