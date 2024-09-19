public class ContaBancaria {
  protected double saldo;

  public void depositar(double valor) {
    if (valor <= 0) {
      System.out.println("Impossível depositar um valor menor ou igual a R$ 0,00");
    } else {
      saldo += valor;
      System.out.println("Depósito realizado com sucesso");
    }
  }

  public void sacar(double valor) {
    if (valor > saldo) {
      System.out.println("Saldo indisponível");
    } else if (valor <= 0) {
      System.out.println("Impossível sacar um valor menor ou igual a R$ 0,00");
    } else {
      saldo -= valor;
      System.out.println("Saque realizado com sucesso");
    }
  }

  public void consultarSaldo() {
    System.out.println(String.format("Seu saldo é de R$ %.2f", saldo));
  }
}
