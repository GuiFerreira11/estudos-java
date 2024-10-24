package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.modelos.TituloOmdb;

public class Titulo implements Comparable<Titulo> {
  private String nome;
  private int anoDeLancamento;
  private boolean incluidoNoPlano;
  private double somaDasAvaliacoes;
  private int totalDeAvaliacoes;
  private int duracaoEmMinutos;

  public Titulo(String nome, int anoDeLancamento) {
    this.nome = nome;
    this.anoDeLancamento = anoDeLancamento;
  }

  public Titulo(TituloOmdb tituloOmdb) {
    this.nome = tituloOmdb.title();
    this.anoDeLancamento = Integer.valueOf(tituloOmdb.year());
    this.duracaoEmMinutos = Integer.valueOf(tituloOmdb.runtime().substring(0, 2));
  }

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

  public String getNome() {
    return nome;
  }

  public int getAnoDeLancamento() {
    return anoDeLancamento;
  }

  public boolean getIncluidoNoPlano() {
    return incluidoNoPlano;
  }

  public int getDuracaoEmMinutos() {
    return duracaoEmMinutos;
  }

  public void getTotalDeAvaliacoes() {
    System.out.println("O total de avaliações é " + totalDeAvaliacoes);
  }

  public void avalia(double nota) {
    somaDasAvaliacoes += nota;
    totalDeAvaliacoes++;
  }

  public void exibeFichaTecnia() {
    System.out.println("Nome: " + nome);
    System.out.println("Ano de lançamento: " + anoDeLancamento);
    System.out.println("Duração: " + duracaoEmMinutos);
    System.out.println("O Titulo está incluso no plano atual: " + incluidoNoPlano);
  }

  public double pegaMedia() {
    return somaDasAvaliacoes / totalDeAvaliacoes;
  }

  @Override
  public int compareTo(Titulo outroTitulo) {
    return this.getNome().compareTo(outroTitulo.getNome());
  }

  @Override
  public String toString() {
    return String.format("Nome: %s, Ano de Lançamento: %d, Duração em minutos: %d", this.nome, this.anoDeLancamento,
        this.duracaoEmMinutos);
  }

}
