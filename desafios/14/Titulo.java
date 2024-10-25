public class Titulo {
  private String titulo;
  private String autor;
  private int anoLancamento;

  public Titulo(String titulo, String autor, int anoLancamento) {
    this.titulo = titulo;
    this.autor = autor;
    this.anoLancamento = anoLancamento;
  }

  @Override
  public String toString() {
    return "Titulo: %s, Autor: %s, Ano de Lancamento: $d".formatted(titulo, autor, anoLancamento);
  }
}
