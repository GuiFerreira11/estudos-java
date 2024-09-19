public class VerificadorPrimo extends NumerosPrimos {
  public void verificarSeEhPrimo(int numero) {
    if (verificarPrimalidade(numero)){
      System.out.println(String.format("O número %d é primo.", numero));
    } else {
      System.out.println(String.format("O número %d não é primo.", numero));
    }
  }
  
}
