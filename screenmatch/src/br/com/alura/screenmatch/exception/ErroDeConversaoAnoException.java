package br.com.alura.screenmatch.exception;

public class ErroDeConversaoAnoException extends RuntimeException {
  private String mensagem;

  public ErroDeConversaoAnoException(String mensagem) {
    this.mensagem = mensagem;
  }

  @Override
  public String getMessage() {
    return this.mensagem;
  }
}
