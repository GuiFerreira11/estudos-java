import java.time.Year;

public class Carro {
  String modelo;
  String cor;
  int anoLancamento;

  void exibeFichaTecnica() {
    System.out.println("""
      Informações do carro

      Modelo: %s
      Cor: %s
      Ano de lançamento: %d
      """.formatted(modelo, cor, anoLancamento));
  }

  int calculaIdadeCarro(){
    return Year.now().getValue() - anoLancamento;
  }

}
