package br.com.alura.screenmatch.main;

import java.util.ArrayList;
import java.util.Collections;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class MainLista {
  public static void main(String[] args) {

    Filme meuFilme = new Filme("O poderoso chefão", 1972);
    Filme outroFilme = new Filme("Avatar - O caminho da água", 2022);
    Serie minhaSerie = new Serie("Lost", 2004);
    meuFilme.avalia(10);
    outroFilme.avalia(6);

    ArrayList<Titulo> lista = new ArrayList<>();
    lista.add(meuFilme);
    lista.add(outroFilme);
    lista.add(minhaSerie);
    for (Titulo item : lista) {
      System.out.println(item);
      if (item instanceof Filme filme) {
        System.out.println("Classificação " + filme.getClassificacao());
      }
    }
    Collections.sort(lista);
    System.out.println(lista);


  }
}
