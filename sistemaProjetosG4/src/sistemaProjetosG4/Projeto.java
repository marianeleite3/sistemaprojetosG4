package sistemaProjetosG4;

import java.time.LocalDate;

public class Projeto {
    private String numero_projeto;
    private LocalDate dt_inicio;
    private LocalDate dt_termino;
    private String descricao;
    private String projetista;
    private String cliente;
    private double valor;
	
	public Projeto(String cliente, String descricao, LocalDate dt_inicio,
			LocalDate dt_termino, String projetista, double valor ){
		
		this.setCliente(cliente);
		this.setDescricao(descricao);
		this.setDtinicio(dt_inicio);
		this.setDttermino(dt_termino);
		this.setProjetista(projetista);
		this.setValor(valor);
	}
	
	//getters
	
	public String getNumeroProjeto() {
		return numero_projeto;
	}
	public LocalDate getDtinicio() {
		return dt_inicio;
	}
	public LocalDate getDttermino() {
		return dt_termino;
	}
	public String getDescricao() {
		return descricao;
	}
	public String getProjetista() {
		return projetista;
	}
	public String getCliente() {
		return cliente;
	}
	public double getValor() {
		return valor;
	}
	//setters
	
	public void setNumeroProjeto(String numero_projeto) {
		this.numero_projeto = numero_projeto;
	}
	public void setDtinicio(LocalDate dt_inicio) {
		this.dt_inicio = dt_inicio;
	}
	public void setDttermino(LocalDate dt_termino) {
		this.dt_termino = dt_termino;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setProjetista(String projetista) {
		this.projetista = projetista;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
		
		
	
	public void valida_data_inicio(LocalDate dt_inicio) throws Exception {
		LocalDate now = LocalDate.now(); 
		
		if (now.isAfter(dt_inicio)) {
			String errMsg = new String("data de inicio invalida");
			throw new Exception(errMsg);
		}
		
		
		
	}
	

}
