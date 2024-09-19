public class ContaCorrente extends ContaBancaria{

  double tarifaMensal = 15.00;

  public void cobrarTarifaMensal() {
    saldo -= tarifaMensal;
    System.out.println("Tarifa Mensal cobrada com sucesso!");
  }
  
}
