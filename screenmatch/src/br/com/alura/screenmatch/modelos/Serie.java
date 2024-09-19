package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {

  private int temporadas;
  private int episodiosPorTemporada;
  private int minutosPorEpisodio;
  private boolean ativa;

  public void setTemporadas(int temporadas) {
    this.temporadas = temporadas;
  }

  public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
    this.episodiosPorTemporada = episodiosPorTemporada;
  }

  public void setMinutosPorEpisodio(int minutosPorEpisodio) {
    this.minutosPorEpisodio = minutosPorEpisodio;
  }

  public void setAtiva(boolean ativa) {
    this.ativa = ativa;
  }

  public int getTemporadas() {
    return temporadas;
  }

  public int getEpisodiosPorTemporada() {
    return episodiosPorTemporada;
  }

  public int getMinutosPorEpisodio() {
    return minutosPorEpisodio;
  }

  public boolean isAtiva() {
    return ativa;
  }

  @Override
  public int getDuracaoEmMinutos() {
    return temporadas * episodiosPorTemporada * minutosPorEpisodio;
  }

}
