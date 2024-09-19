public class Musica {
  
  String titulo;
  String artista;
  int anoLancamento;
  double avaliacao = 0;
  double numAvaliacoes = 0;

  void exibeFichaTecnica(){
    System.out.println("O titulo da música é " + titulo);
    System.out.println("O cantor dessa música é " + artista);
    System.out.println("Essa música foi lançada em " + anoLancamento);
  }

  void avaliarMusica(double nota){
    avaliacao += nota;
    numAvaliacoes++;
  }

  double exibeMediaAvaliacoes(){
    return avaliacao / numAvaliacoes;
  }
}
