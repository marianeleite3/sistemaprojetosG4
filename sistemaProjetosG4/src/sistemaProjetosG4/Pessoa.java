package sistemaProjetosG4;

public abstract class Pessoa {
	protected String nome;
	protected String dt_nascimento;
	
	public Pessoa(String nome, String dt_nascimento) {
		this.setNome(nome);
		this.setDtNascimento(dt_nascimento);

	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDtNascimento() {
		return dt_nascimento;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDtNascimento(String dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}

}
