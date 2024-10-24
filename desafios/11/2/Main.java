import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException, InterruptedException {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o nome da criptomoeda que deseja ver a cotação");
    String cripto = scanner.nextLine();
    scanner.close();
    String uri = "https://api.coingecko.com/api/v3/simple/price?ids=" + cripto
        + "&vs_currencies=brl&x_cg_api_key=CG-fzHpLc4zX9NLrMiHzJCiWv2S";
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder().uri(URI.create(uri)).build();
    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
    System.out.println(response.body());
  }
}
