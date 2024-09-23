public class Main {
  public static void main(String[] args) {
    ConversorMoeda conversor = new ConversorMoeda();
    double valorEmDolar = 200;
    System.out.println(String.format("O valor de U$ %.2f convertido para reais fica R$ %.2f.", valorEmDolar,
        conversor.converterDolarParaReal(valorEmDolar)));

    CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();
    double altura = 4;
    double largura = 5;
    System.out.println(String.format("Uma sala com altura %.2f e largura %.2f tem um perimetro de %.2f e area de %.2f",
        altura, largura, calculadora.calcularPerimetro(altura, largura), calculadora.calcularArea(altura, largura)));

    TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
    tabuada.mostrarTabuada(8);

    ConversorTemperaturaPadrao conversorTemperatura = new ConversorTemperaturaPadrao();
    double temperaturaEmCelsius = 24.3;
    double temperaturaEmFahrenheit = 72.6;
    System.out.println(String.format("Convertendo %.1f graus Celsius para Fahrenheit temos %.1f",
        temperaturaEmCelsius, conversorTemperatura.celsiusParaFahrenheit(temperaturaEmCelsius)));
    System.out.println(String.format("Convertendo %.1f graus Fahrenheit para Celsius temos %.1f",
        temperaturaEmFahrenheit, conversorTemperatura.fahrenheitParaCelsius(temperaturaEmFahrenheit)));

    Produto produto = new Produto();
    double precoProduto = 42;
    double descontoProduto = 0.1;
    int quantidadeProduto = 40;
    produto.setPrecoUnitario(precoProduto);
    produto.aplicarDesconto(descontoProduto);
    System.out.println(String.format(
        "A venda de %d unidades de um produto com custo unitário de R$ %.2f e desconto de %.1f %% renderá R$ %.2f",
        quantidadeProduto, precoProduto, descontoProduto * 100, produto.calcularPrecoTotal(quantidadeProduto)));

    Servico servico = new Servico();
    double precoServico = 95;
    double descontoServico = 0.15;
    int quantidadeServico = 20;
    servico.setPrecoHora(precoServico);
    servico.aplicarDesconto(descontoServico);
    System.out.println(String.format(
        "A venda de %d unidades de um servico com custo unitário de R$ %.2f e desconto de %.1f %% renderá R$ %.2f",
        quantidadeServico, precoServico, descontoServico * 100, servico.calcularPrecoTotal(quantidadeServico)));

    Livro livro = new Livro();
    livro.setPrecoUnitario(58);
    System.out.println(String.format("A venda de um livro irá custar R$ %.2f", livro.calcularPrecoFinal()));

    ProdutoFisico produtoFisico = new ProdutoFisico();
    produtoFisico.setPrecoUnitario(129);
    System.out
        .println(String.format("A venda de um produto fisico irá custar R$ %.2f", produtoFisico.calcularPrecoFinal()));
  }
}
