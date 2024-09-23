package br.com.alura.audioplayer.modelos;

public class Audio {
  private String titulo;
  private int duracaoEmMinutos;
  private int totalDeReproducoes;
  private int totalCurtidas;
  private double classificacao;
  private int totalDeAvalicacoes;
  private int anoDeLancamento;

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setDuracaoEmMinutos(int duracaoEmMinutos) {
    this.duracaoEmMinutos = duracaoEmMinutos;
  }

  public void setAnoDeLancamento(int anoDeLancamento) {
    this.anoDeLancamento = anoDeLancamento;
  }

  public String getTitulo() {
    return titulo;
  }

  public int getDuracaoEmMinutos() {
    return duracaoEmMinutos;
  }

  public int getTotalDeReproducoes() {
    return totalDeReproducoes;
  }

  public int getTotalCurtidas() {
    return totalCurtidas;
  }

  public double getClassificacao() {
    return classificacao / totalDeAvalicacoes;
  }

  public int getAnoDeLancamento() {
    return anoDeLancamento;
  }

  public void avaliar(double nota) {
    classificacao += nota;
    totalDeAvalicacoes++;
  }

  public void curtir() {
    totalCurtidas++;
  }

  public void reproduzir() {
    totalDeReproducoes++;
  }

}
