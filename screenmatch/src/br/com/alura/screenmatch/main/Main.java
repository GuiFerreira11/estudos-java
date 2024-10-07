package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;

public class Main {
  public static void main(String[] args) {
    Filme meuFilme = new Filme("O poderoso chefão", 1972);
    meuFilme.setDuracaoEmMinutos(235);
    meuFilme.setIncluidoNoPlano(true);

    meuFilme.exibeFichaTecnia();
    meuFilme.avalia(8);
    meuFilme.avalia(5);
    meuFilme.avalia(10);

    System.out.println(meuFilme.pegaMedia());
    System.out.println("Duração do Filme: " + meuFilme.getDuracaoEmMinutos());

    meuFilme.getTotalDeAvaliacoes();

    Filme outroFilme = new Filme("Avatar - O caminho da água", 2022);
    outroFilme.setDuracaoEmMinutos(192);

    Serie minhaSerie = new Serie("Lost", 2004);
    minhaSerie.setTemporadas(6);
    minhaSerie.setEpisodiosPorTemporada(20);
    minhaSerie.setMinutosPorEpisodio(45);
    System.out.println("Duração para maratonar Lost: " + minhaSerie.getDuracaoEmMinutos());
    minhaSerie.exibeFichaTecnia();

    CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
    calculadora.incluiItem(meuFilme);
    calculadora.incluiItem(outroFilme);
    calculadora.incluiItem(minhaSerie);
    System.out.println("Tempo total necessário para assistir tudo: " + calculadora.getTempoTotal());

    Episodio episodio = new Episodio();
    episodio.setNumero(1);
    episodio.setSerie(minhaSerie);
    episodio.setTotalVisualizacoes(300);

    FiltroRecomendacao filtro = new FiltroRecomendacao();
    filtro.filtra(meuFilme);
    filtro.filtra(episodio);

    ArrayList<Filme> listaDeFilmes = new ArrayList<>();
    listaDeFilmes.add(meuFilme);
    listaDeFilmes.add(outroFilme);
    System.out.println("A lista de filmes tem %d filmes".formatted(listaDeFilmes.size()));
    System.out.println("O nome do primeiro filme é %s".formatted(listaDeFilmes.get(0).getNome()));
    System.out.println(listaDeFilmes);

  }
}
