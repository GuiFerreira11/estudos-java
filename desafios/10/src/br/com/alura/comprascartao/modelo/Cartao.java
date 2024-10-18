package br.com.alura.comprascartao.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.comprascartao.modelo.Produto;

public class Cartao {
  private double limite;
  private List<Produto> listaCompras;

  public Cartao(double limite) {
    this.limite = limite;
    listaCompras = new ArrayList<>();
  }

  public double getLimite() {
    return limite;
  }

  public List<Produto> getListaCompras() {
    return listaCompras;
  }

  public boolean compraAprovada(Produto produto) {
    if (produto.getPreco() <= limite) {
      limite -= produto.getPreco();
      listaCompras.add(produto);
      System.out.println("Compra realizada!");
      return true;
    }
    return false;
  }

}
