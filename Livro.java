public class Livro {
	
	private String titulo;
	private String autor;
	private String editora;
	private int anoPublicacao;
	
	public Livro(String t, String a, String e, int aP) {
		this.titulo = t;
		this.autor = a;
		this.editora = e;
		this.anoPublicacao = aP;
	}

  public String novoTitulo() {
    return titulo;
  }

  public String novoAutor() {
    return autor;
  }

  public String novaEditora() {
    return editora;
  }

  public int novoAnoPublicacao() {
    return anoPublicacao;
  }

  public void setTitulo(String novoTitulo) {
    this.titulo = novoTitulo;
  }

  public void setAutor(String novoAutor) {
    this.autor = novoAutor;
  }

  public void setEditora(String novaEditora) {
    this.editora = novaEditora;
  }

  public void setAnoPublicacao(int novoAnoPublicacao) {
    this.anoPublicacao = novoAnoPublicacao;
  }
  
}
