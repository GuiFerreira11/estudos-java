public class GeradorPrimo extends NumerosPrimos {
  public void gerarProximoPrimo(int primoConhecido) {
    int proximoNumero = primoConhecido + 1;
    while (!verificarPrimalidade(proximoNumero)) {
      proximoNumero++;
    }
    System.out.println(String.format("O próximo número primo depois de %d é %d.", primoConhecido, proximoNumero));
  }

}
