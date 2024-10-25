public class Veiculo {
  private String modelo;
  private int ano;
  private String combustivel;

  public Veiculo(String modelo, int ano, String combustivel) {
    this.modelo = modelo;
    this.ano = ano;
    this.combustivel = combustivel;
  }

  @Override
  public String toString() {
    return "Modelo: %s, Ano de fabricação: %d, Tipo de combustivel: %s".formatted(modelo, ano, combustivel);
  }

}
