import com.google.gson.*;

public class Main {
  public static void main(String[] args) {
    String json1 = """
        {
        "Nome" : "Rodrigo",
        "Idade" : 20,
        "Cidade" : "Sao Paulo"
        }
        """;
    System.out.println("Imprimindo o Json que será convertido");
    System.out.println(json1);

    Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
    Pessoa pessoa1 = gson.fromJson(json1, Pessoa.class);
    System.out.println("Json convertido para o objeto pessoa:");
    System.out.println(pessoa1);

    String json2 = """
        {
        "Nome" : "Rodrigo",
        "Cidade" : "Sao Paulo",
        "Estado" : "Sao Paulo"
        }
        """;
    System.out.println("Imprimindo o novo Json que será convertido");
    System.out.println(json2);
    Pessoa pessoa2 = gson.fromJson(json2, Pessoa.class);
    System.out.println("Json convertido para o objeto pessoa:");
    System.out.println(pessoa2);

    String json3 = """
            {
            "Titulo" : "A Serva do Império",
            "Autor" : "Raymond E. Feist",
            "Editora" : {
              "Nome" : "Saída  de Emergência",
              "Cidade" : "Sao Paulo"
              }
            }
            """;
    System.out.println("Imprimindo o Json do livro que será convertido");
    System.out.println(json3);
    Livro livro = gson.fromJson(json3, Livro.class);
    System.out.println("Json convertido para o objeto livro:");
    System.out.println(livro);
  }
}
