import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException, InterruptedException {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o título do livro que deseja buscar");
    String titulo = scanner.nextLine();
    scanner.close();
    titulo = titulo.replaceAll(" ", "+");
    String uri = "https://www.googleapis.com/books/v1/volumes?q=intitle:" + titulo
        + "&printType=books&maxResults=1&key=AIzaSyCQqgVKbb0qyV0n0e3JLNKcQncD2ow0Oqw";
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder().uri(URI.create(uri)).build();
    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
    System.out.println(response.body());
  }
}
