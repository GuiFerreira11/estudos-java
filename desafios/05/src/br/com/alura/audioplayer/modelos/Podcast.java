package br.com.alura.audioplayer.modelos;

public class Podcast extends Audio {
  private String apresentador;
  private String descricao;
  private String categoria;
  private int totalDeEpisodios;

  public void setApresentador(String apresentador) {
    this.apresentador = apresentador;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public void setTotalDeEpisodios(int totalDeEpisodios) {
    this.totalDeEpisodios = totalDeEpisodios;
  }
   public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public String getApresentador() {
    return apresentador;
  }

  public String getDescricao() {
    return descricao;
  }

  public int getTotalDeEpisodios() {
    return totalDeEpisodios;
  }

  public String getCategoria(){
    return categoria;
  }
}
