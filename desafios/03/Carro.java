public class Carro {
  private String modelo;
  private double precoAno1;
  private double precoAno2;
  private double precoAno3;

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public void setPrecoAnual(double precoAno1, double precoAno2, double precoAno3) {
    this.precoAno1 = precoAno1;
    this.precoAno2 = precoAno2;
    this.precoAno3 = precoAno3;
  }

  private double definirMenorPreco() {
    double menorPreco = precoAno1;
    if (precoAno2 < menorPreco) {
      menorPreco = precoAno2;
    }

    if (precoAno3 < menorPreco) {
      menorPreco = precoAno3;
    }
    return menorPreco;
  }

  private double definirMaiorPreco() {
    double maiorPreco = precoAno1;
    if (precoAno2 > maiorPreco) {
      maiorPreco = precoAno2;
    }

    if (precoAno3 > maiorPreco) {
      maiorPreco = precoAno3;
    }
    return maiorPreco;
  }

  public void exibirInformacoesCarro() {
    System.out.println("""
        Modelo do Carro: %s
        Preço no ano 1: R$ %.2f
        Preço no ano 2: R$ %.2f
        Preço no ano 3: R$ %.2f
        Menor preço: R$ %.2f
        Maior preço: R$ %.2f
        """.formatted(modelo, precoAno1, precoAno2, precoAno3, this.definirMenorPreco(), this.definirMaiorPreco()));
  }
}
