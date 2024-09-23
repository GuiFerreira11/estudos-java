package br.com.alura.audioplayer.modelos;

import br.com.alura.audioplayer.modelos.Audio;

public class ListaPrioridades {
  public void ordenarPrioridades(Audio audio) {
    if (audio.getClassificacao() > 8.5) {
      System.out.println("Você tem alta prioridade para escutar " + audio.getTitulo());
    } else if (audio.getClassificacao() > 6.5) {
      System.out.println("Você tem média prioridade para escutar " + audio.getTitulo());
    } else {
      System.out.println("Você tem baixa prioridade para escutar " + audio.getTitulo());
    }
  }
}
