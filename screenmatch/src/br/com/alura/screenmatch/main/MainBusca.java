package br.com.alura.screenmatch.main;

import com.google.gson.*;

import br.com.alura.screenmatch.exception.ErroDeConversaoAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainBusca {
  public static void main(String[] args) throws IOException, InterruptedException {

    Scanner scanner = new Scanner(System.in);
    Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();
    List<Titulo> minhaLista = new ArrayList<>();

    while (true) {

      System.out.println("Digite o filme que deseja buscar");
      String busca = scanner.nextLine();
      busca = busca.replaceAll(" ", "+");

      if (busca.equals("sair")) {
        break;
      }

      String uri = "http://www.omdbapi.com/?apikey=e5a99d20&t=" + busca;

      try {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(uri))
            .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        String json = response.body();

        TituloOmdb tituloOmdb = gson.fromJson(json, TituloOmdb.class);
        Titulo titulo = new Titulo(tituloOmdb);
        System.out.println(titulo);

        minhaLista.add(titulo);

      } catch (NumberFormatException e) {
        System.out.println("Ocorreu um erro na formatação de algum número:");
        System.out.println(e.getMessage());
      } catch (IllegalArgumentException e) {
        System.out.println("Verifique o nome do filme digitado, osorreu algum erro com o nome do filme");
      } catch (ErroDeConversaoAnoException e) {
        System.out.println(e.getMessage());
      }
    }
    if (!minhaLista.isEmpty()) {
      FileWriter fileWriter = new FileWriter("meus-filmes.json");
      fileWriter.write(gson.toJson(minhaLista));
      fileWriter.close();
    }
  }
}
