public class Produto implements Vendavel {
  protected double precoUnitario;

  public void setPrecoUnitario(double precoUnitario) {
    this.precoUnitario = precoUnitario;
  }

  @Override
  public void aplicarDesconto(double desconto) {
    precoUnitario *= (1 - desconto);
  }

  @Override
  public double calcularPrecoTotal(int quantidade) {
    return precoUnitario * quantidade;
  }

}
