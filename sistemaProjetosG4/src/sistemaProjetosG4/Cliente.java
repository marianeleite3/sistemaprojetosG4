package sistemaProjetosG4;

public class Cliente extends Pessoa{
	protected String cpf;

	public Cliente(String nome, String dt_nascimento, String cpf) {
		super(nome, dt_nascimento);
		this.setcpf(cpf);
		
	}
	
	public String getcpf() {
		return cpf;
	}
	
	public void setcpf(String cpf) {
		this.cpf = cpf;
	}

}
