public class Usuario {
  private String nomeUsuario;
  private String urlUsuario;
  private int numeroDeRepositórios;

  public Usuario(UsuarioApi usuarioApi) {
    this.nomeUsuario = usuarioApi.login();
    this.urlUsuario = usuarioApi.html_url();
    this.numeroDeRepositórios = usuarioApi.public_repos();
  }

  public String getNomeUsuario() {
    return nomeUsuario;
  }

  public String getUrlUsuario() {
    return urlUsuario;
  }

  public int getNumeroDeRepositórios() {
    return numeroDeRepositórios;
  }

  @Override
  public String toString() {
    return "Usuário: %s, URL para o perfil do usuário: %s, número de repósitórios publicos do usuário: %d"
        .formatted(nomeUsuario, urlUsuario, numeroDeRepositórios);
  }

}
