package sistemaProjetosG4;

public class SolicitacaoCompra {
	private String numero_projeto;
	private String cd_solicitacao;
	private String descricao_material;
	private double valor;
	
	public SolicitacaoCompra(){
		
	}
	
	//getters
	public String getNumeroProjeto() {
		return numero_projeto;
	}
	public String getCdSolicitacao() {
		return cd_solicitacao;
	}
	public String getDescricaomaterial() {
		return descricao_material;
	}
	public double getvalor() {
		return valor;
	}
	
	//setters
	public void setNumeroProjeto(String numero_projeto) {
		this.numero_projeto = numero_projeto;
	}
	public void setCdSolicitacao(String cd_solicitacao) {
		this.cd_solicitacao = cd_solicitacao;
	}
	
	public void setDescricaomaterial(String descricao_material) {
		this.descricao_material = descricao_material;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	

}
