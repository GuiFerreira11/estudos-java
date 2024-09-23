public class Livro extends Produto implements Calculavel {

  @Override
  public double calcularPrecoFinal() {
    return precoUnitario * 0.95;
  }

}
