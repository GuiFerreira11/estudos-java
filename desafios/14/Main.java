import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.*;

public class Main {
  public static void main(String[] args) {
    try {
    FileWriter file = new FileWriter("arquivo.txt");
    file.write("Conteúdo a ser gravado no arquivo.");
    file.close();
    } catch (IOException e) {
      System.out.println("Ocorreu um erro na escrita do arquivo");
      e.printStackTrace();
    }

    Titulo titulo = new Titulo("A serva do império", "Raymond E. Feist", 1990);

    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    System.out.println(gson.toJson(titulo));

    Veiculo veiculo = new Veiculo("Monza", 1993, "Alcool");

    System.out.println(gson.toJson(veiculo));



  }
}
