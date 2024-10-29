import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    System.out.println("Digite o CEP que deseja procurar:");
    Scanner scanner = new Scanner(System.in);
    String cep = scanner.next();
    scanner.close();

    Endereco endereco = CEP.endereco(cep);

    System.out.println(endereco);

    String nomeArquivo = endereco.cep() + ".json";

    EscritaArquivo escrita = new EscritaArquivo();

    escrita.salvarDado(nomeArquivo, endereco);
    

    
    
  }
}
