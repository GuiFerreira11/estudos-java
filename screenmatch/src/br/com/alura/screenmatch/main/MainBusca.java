package br.com.alura.screenmatch.main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.FieldNamingPolicy;

import br.com.alura.screenmatch.exception.ErroDeConversaoAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainBusca {
  public static void main(String[] args) throws IOException, InterruptedException {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o filme que deseja buscar");
    String busca = scanner.nextLine();
    busca = busca.replaceAll(" ", "+");
    String uri = "http://www.omdbapi.com/?apikey=e5a99d20&t=" + busca;
    try {

      HttpClient client = HttpClient.newHttpClient();
      HttpRequest request = HttpRequest.newBuilder()
          .uri(URI.create(uri))
          .build();
      HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
      System.out.println(response.body());
      String json = response.body();

      Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
      TituloOmdb tituloOmdb = gson.fromJson(json, TituloOmdb.class);
      Titulo titulo = new Titulo(tituloOmdb);
      System.out.println(titulo);

    } catch (NumberFormatException e) {
      System.out.println("Ocorreu um erro na formatação de algum número:");
      System.out.println(e.getMessage());
    } catch (IllegalArgumentException e) {
      System.out.println("Verifique o nome do filme digitado, osorreu algum erro com o nome do filme");
    } catch (ErroDeConversaoAnoException e) {
      System.out.println(e.getMessage());
    }
  }
}
