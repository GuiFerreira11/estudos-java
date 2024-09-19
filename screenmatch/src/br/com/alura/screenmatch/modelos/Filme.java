package br.com.alura.screenmatch.modelos;

public class Filme {
  private String nome;
  private int anoDeLancamento;
  private boolean incluidoNoPlano;
  private double somaDasAvaliacoes = 0;
  private int totalDeAvaliacoes = 0;
  private int duracaoEmMinutos;

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setAnoDeLancamento(int anoDeLancamento) {
    this.anoDeLancamento = anoDeLancamento;
  }

  public void setIncluidoNoPlano(boolean incluidoNoPlano) {
    this.incluidoNoPlano = incluidoNoPlano;
  }

  public void setDuracaoEmMinutos(int duracaoEmMinutos) {
    this.duracaoEmMinutos = duracaoEmMinutos;
  }

  public void getTotalDeAvaliacoes() {
    System.out.println("O total de avaliações é " + totalDeAvaliacoes);
  }

  public void avalia(double nota) {
    somaDasAvaliacoes += nota;
    totalDeAvaliacoes++;
  }

  public void exibeFichaTecnia() {
    System.out.println("Nome do filme: " + nome);
    System.out.println("Ano de lançamento: " + anoDeLancamento);
    System.out.println("Duração do filme em minutos: " + duracaoEmMinutos);
    System.out.println("O Filme está incluso no plano atual: " + incluidoNoPlano);
  }

  public double pegaMedia() {
    return somaDasAvaliacoes / totalDeAvaliacoes;
  }

}
