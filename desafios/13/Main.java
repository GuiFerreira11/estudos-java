import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.google.gson.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Divisão de dois números inteiros");
    try {
      System.out.println("Digite o numerador:");
      int numero1 = scanner.nextInt();
      System.out.println("Digite o denominador:");
      int numero2 = scanner.nextInt();
      int resultadoDivisao = numero1 / numero2;
      System.out.println("A divisão de %d por %d é igual a %d".formatted(numero1, numero2, resultadoDivisao));
    } catch (InputMismatchException e) {
      System.out.println("Digite apenas números inteiros!");
    } catch (ArithmeticException e) {
      System.out.println("Nao é possível realizar uma divisão com o denominador igual a 0!");
    }

    System.out.println("Digite uma nova senha:");
    String senhaUsuario = scanner.next();

    try {
      validaSenha(senhaUsuario);
      System.out.println("Senha configurada com sucesso!");
    } catch (SenhaInvalidaException e) {
      System.out.println("Senha inválida! " + e.getMessage());
    }

    System.out.println("Digite o nome do usuário do github que deseja consultar:");
    String usuarioGitHub = scanner.next();
    scanner.close();

    String uri = "https://api.github.com/users/" + usuarioGitHub;

    HttpClient client = HttpClient.newHttpClient();
    try {
      HttpRequest request = HttpRequest.newBuilder()
          .uri(URI.create(uri))
          .header("Accept", "application/vnd.github+json")
          .build();
      HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
      if (response.statusCode() == 404) {
        throw new ErroConsultaGitHubException("Usuário não encontrado, tente novamente!");
      }
      Gson gson = new Gson();
      UsuarioApi usuarioApi = gson.fromJson(response.body(), UsuarioApi.class);
      Usuario usuario = new Usuario(usuarioApi);
      System.out.println(usuario);
      
    } catch (IOException | InterruptedException e) {
      System.out.println("Ocorreu algum erro na chamada a API do GitHub.");
      System.out.println(e.getStackTrace());
    } catch (ErroConsultaGitHubException e){
      System.out.println(e.getMessage());
    }
  }

  private static void validaSenha(String senha) {
    if (senha.length() < 8) {
      throw new SenhaInvalidaException("A senha deve conter 8 ou mais caracteres.");
    }
  }
}
