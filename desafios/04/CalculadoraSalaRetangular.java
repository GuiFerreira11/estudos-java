public class CalculadoraSalaRetangular implements CalculoGeometrico{

  @Override
  public double calcularArea(double altura, double largura) {
    return altura * largura;
  }

  @Override
  public double calcularPerimetro(double altura, double largura) {
    return 2 * altura + 2 * largura;
  }
  
}
