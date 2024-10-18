package br.com.alura.comprascartao.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import br.com.alura.comprascartao.modelo.Produto;
import br.com.alura.comprascartao.modelo.Cartao;

public class Main {
  public static void main(String[] args) {
    String nomeProduto;
    double precoProduto;
    double limiteCartao;
    int continuar = 1;

    Scanner reader = new Scanner(System.in);

    System.out.println("Insira o limite do seu cartão:");
    limiteCartao = reader.nextDouble();

    Cartao cartao = new Cartao(limiteCartao);

    while (continuar == 1) {

      System.out.println("Digite o nome do produto que deseja comprar");
      nomeProduto = reader.next();
      System.out.println("Digite o preço do produto que deseja comprar");
      precoProduto = reader.nextDouble();

      Produto produto = new Produto(nomeProduto, precoProduto);

      if (cartao.compraAprovada(produto)) {
        if (cartao.getLimite() == 0) {
          System.out.println("Limite esgotado!");
          break;
        }
        System.out.println("Digite 0 para sair ou 1 para continuar as compras");
        continuar = reader.nextInt();

      } else {
        System.out.println("Limite insuficiente!");
        break;
      }
    }
    Collections.sort(cartao.getListaCompras());
    System.out.println("Compras realizadas:");
    for (Produto produto : cartao.getListaCompras()) {
      System.out.println(produto);
    }
    System.out.println(String.format("Saldo restante no cartão R$ %.2f", cartao.getLimite()));
  }
}
