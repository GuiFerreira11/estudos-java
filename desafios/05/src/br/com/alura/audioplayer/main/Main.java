package br.com.alura.audioplayer.main;

import br.com.alura.audioplayer.modelos.Musica;
import br.com.alura.audioplayer.modelos.Podcast;
import br.com.alura.audioplayer.modelos.ListaPrioridades;

public class Main {
  public static void main(String[] args) {
    Musica musica = new Musica();
    musica.setTitulo("A Urgência");
    musica.setCantor("Dead Fish");
    musica.setGenero("Punk");
    musica.setAlbum("Zero e Um");
    musica.setAnoDeLancamento(2012);

    for (int i = 1; i <= 3400; i++) {
      musica.curtir();
    }

    for (int i = 1; i <= 580000; i++) {
      musica.reproduzir();
    }

    musica.avaliar(9.7);
    musica.avaliar(8.0);
    musica.avaliar(10);
    musica.avaliar(9.3);
    musica.avaliar(6.0);
    musica.avaliar(9.0);
    System.out.println("""
        A música %s da banda %s foi tocada um total de %d.
        Essa música foi lançada em %d e faz parte do álbum %s.
        Alcançando uma avaliacão de %.1f com %d curtidas, essa música é considerada um sucesso.
        """.formatted(musica.getTitulo(), musica.getCantor(), musica.getTotalDeReproducoes(),
        musica.getAnoDeLancamento(), musica.getAlbum(), musica.getClassificacao(), musica.getTotalCurtidas()));

    Podcast podcast = new Podcast();
    podcast.setTitulo("Desce a Letra Show");
    podcast.setApresentador("Cauê Moura, Load Comics e Bulbasauro");
    podcast.setCategoria("Entretenimento");
    podcast.setTotalDeEpisodios(322);
    podcast.setAnoDeLancamento(2022);

    for (int i = 1; i <= 12000; i++) {
      podcast.curtir();
    }

    for (int i = 1; i <= 500000; i++) {
      podcast.reproduzir();
    }
    podcast.avaliar(9.7);
    podcast.avaliar(8.0);
    podcast.avaliar(9.3);
    podcast.avaliar(9.0);
    podcast.avaliar(4);
    podcast.avaliar(1);
    podcast.avaliar(10);
    podcast.avaliar(10);
    podcast.avaliar(10);
    podcast.avaliar(10);
    podcast.avaliar(10);
    podcast.avaliar(10);
    System.out.println(
        """
              Um dos mais relevante em sua categoria (%s), o podcast %s apresentado por %s foi lançado em %d.
              Desde então já conta com %d episódios e um total de %d reproduções.
              O carinho do publico não se limita apenas a avaliação de %.1f e %d curtidas, o podcast já foi ganhador de um premio iBest.
              """
            .formatted(podcast.getCategoria(), podcast.getTitulo(), podcast.getApresentador(),
                podcast.getAnoDeLancamento(), podcast.getTotalDeEpisodios(), podcast.getTotalDeReproducoes(),
                podcast.getClassificacao(), podcast.getTotalCurtidas()));

    ListaPrioridades lista = new ListaPrioridades();
    lista.ordenarPrioridades(musica);
    lista.ordenarPrioridades(podcast);
  }
}
