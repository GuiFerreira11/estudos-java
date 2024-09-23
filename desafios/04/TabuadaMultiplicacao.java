public class TabuadaMultiplicacao implements Tabuada {

  @Override
  public void mostrarTabuada(int numero) {
    System.out.println(String.format("A tabuada do numero %d é:", numero));
    for (int i = 1; i <= 10; i++) {
      System.out.println(numero * i);
    }
  }
}
