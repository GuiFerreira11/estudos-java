import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoPerecivel extends Produto {
  private LocalDate dataValidade;
  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy");

  public ProdutoPerecivel(String nome, double preco, String dataValidade) {
    super(nome, preco);
    this.dataValidade = LocalDate.parse(dataValidade, formatter);
  }

  @Override
  public String toString() {
    return super.toString() + " Data de validade: " + formatter.format(dataValidade);
  }

  public LocalDate getDataValidade() {
    return dataValidade;
  }

}
