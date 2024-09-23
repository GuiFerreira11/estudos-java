package br.com.alura.audioplayer.modelos;

public class Musica extends Audio {
  private String cantor;
  private String album;
  private String genero;

  public void setCantor(String cantor) {
    this.cantor = cantor;
  }

  public void setAlbum(String album) {
    this.album = album;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public String getCantor() {
    return cantor;
  }

  public String getAlbum() {
    return album;
  }

  public String getGenero() {
    return genero;
  }

}
