public class Professor {
	
	private String nome;
	private String departamento;
	private String titulacao;
	
	public Professor(String n, String d, String t) {
		this.nome = n;
		this.departamento = d;
		this.titulacao = t;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public String getTitulacao() {
		return titulacao;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public void setDepartamento(String novoDepartamento) {
		this.departamento = novoDepartamento;
	}

}
