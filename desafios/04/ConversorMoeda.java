public class ConversorMoeda implements ConversaoFinanceira {

  @Override
  public double converterDolarParaReal(double valorEmDolar) {
    double taxaConversao = 5.52;
    return valorEmDolar * taxaConversao;
  }

  
  
}
