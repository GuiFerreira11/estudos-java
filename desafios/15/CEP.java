import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.*;

public class CEP {

  private static void ValidarCEP(String cep) {
    if (cep.length() == 8) {
      Integer.valueOf(cep);
    }
  }

  public static Endereco endereco(String cep) {
    HttpClient client = HttpClient.newHttpClient();
    try {
      ValidarCEP(cep);
      URI uri = URI.create("https://viacep.com.br/ws/" + cep + "/json");
      System.out.println(uri);
      HttpRequest request = HttpRequest.newBuilder().uri(uri).build();
      HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
      System.out.println(response.statusCode());
      System.out.println(response.body());
      Gson gson = new Gson();
      Endereco endereco = gson.fromJson(response.body(), Endereco.class);
      return endereco;
    } catch (IOException | InterruptedException e) {
      throw new RuntimeException("Erro ao utilizar a API ViaCEP.");
    } catch (NumberFormatException e) {
      throw new RuntimeException("Digite apenas 8 números para o CEP, sem espaços!");
    }
  }
}
