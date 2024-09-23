public class Servico implements Vendavel {
  private double precoHora;

  public void setPrecoHora(double precoHora) {
    this.precoHora = precoHora;
  }

  @Override
  public void aplicarDesconto(double desconto) {
    precoHora *= (1 - desconto);
  }

  @Override
  public double calcularPrecoTotal(int quantidade) {
    return precoHora * quantidade;
  }

}
