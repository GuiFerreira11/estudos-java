
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.*;

public class EscritaArquivo {

  private Gson gson = new GsonBuilder().setPrettyPrinting().create();

  public void salvarDado(String nomeArquivo, Endereco endereco) {
    try {
    FileWriter fileWriter = new FileWriter(nomeArquivo);
    fileWriter.write(gson.toJson(endereco));
    fileWriter.close();
    } catch (IOException e) {
      throw new RuntimeException("Erro na escrita do arquivo.");
    }
  }
}
