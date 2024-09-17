import java.util.Scanner;

public class desafio3 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String nomeCliente = "Guilherme Ferreira";
    String tipoConta = "Corrente";
    double saldoConta = 3500;

    System.out.println("""
        **************************************
        Dados iniciais do cliente:

        Nome: %s
        Tipo de conta: %s
        Saldo inicial: R$ %.2f
        **************************************
        """.formatted(nomeCliente, tipoConta, saldoConta));

    boolean loop = true;

    while (loop) {
      System.out.println("""
          Operações disponíveis

          1 - Consultar saldo
          2 - Receber valor
          3 - Transferir valor
          4 - Sair

          Digite a opção desejada:
          """);

      if (input.hasNextInt()) {

        int opcaoSelecionada = input.nextInt();

        switch (opcaoSelecionada) {
          case 1:
            System.out.println(String.format("O Saldo atual é de R$ %.2f.", saldoConta));
            break;
          case 2:
            System.out.println("Informe o valor a receber:");
            double valorReceber = input.nextDouble();
            saldoConta += valorReceber;
            System.out.println(String.format("Saldo atualizado para R$ %.2f.", saldoConta));
            break;
          case 3:
            System.out.println("Informe o valor que deseja transferir:");
            double valorTransferir = input.nextDouble();
            if (valorTransferir <= saldoConta) {
              saldoConta -= valorTransferir;
              System.out.println(String.format("Saldo atualizado para R$ %.2f.", saldoConta));
            } else {
              System.out.println("Não há saldo suficiente para fazer esse transferência.");
            }
            break;
          case 4:
            loop = false;
            break;
          default:
            System.out.println("Opção inválida, tente novamente.");
            break;
        }
      } else {
        System.out.println("Opção inválida, tente novamente.");
        input.next();
      }
    }
    input.close();
  }
}
