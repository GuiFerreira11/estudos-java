public class Main {
  public static void main(String[] args) {

    ModeloCarro meuCarro = new ModeloCarro();
    meuCarro.setModelo("Gol");
    meuCarro.setPrecoAnual(39900, 45000, 31990);
    meuCarro.exibirInformacoesCarro();

    Animal animal = new Animal();
    animal.emitirSom();
    Cachorro cachorro = new Cachorro();
    cachorro.emitirSom();
    Gato gato = new Gato();
    gato.emitirSom();

    ContaBancaria conta01 = new ContaBancaria();
    conta01.depositar(100);
    conta01.depositar(-10);
    conta01.sacar(-10);
    conta01.sacar(90);
    conta01.consultarSaldo();
    conta01.sacar(100);

    ContaCorrente conta02 = new ContaCorrente();
    conta02.depositar(100);
    conta02.depositar(-10);
    conta02.sacar(-10);
    conta02.cobrarTarifaMensal();
    conta02.sacar(50);
    conta02.consultarSaldo();
    conta02.sacar(100);

    NumerosPrimos numerosPrimos = new NumerosPrimos();
    numerosPrimos.listarPrimos(110);

    VerificadorPrimo verificador = new VerificadorPrimo();
    verificador.verificarSeEhPrimo(103);

    GeradorPrimo gerador = new GeradorPrimo();
    gerador.gerarProximoPrimo(103);
  }
}
