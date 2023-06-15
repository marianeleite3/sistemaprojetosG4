package sistemaProjetosG4;

public class Projetista extends Pessoa{
	protected String codfuncional;
	
	Projetista(String nome, String dt_nascimento ,String codfuncional){
		super(nome, dt_nascimento);
		this.setcodfuncional(codfuncional);
		
	}

	
	public String getcodfuncional() {
		return codfuncional;
	}
	
	public void setcodfuncional(String codfuncional) {
		this.codfuncional = codfuncional;
	}

}
