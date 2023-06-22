package sistemaProjetosG4;
import java.sql.SQLException;

public class ProjetoDao extends GenericDao{
	private Projeto p;
	
	public ProjetoDao(Projeto p) {
		this.p = p;
	}
	


	public boolean inserir() {
		try {
			String comando = "insert into projeto (dt_inicio, dt_termino, descricao, projetista, cliente, valor_financeiro) values (?,?,?,?,?,?)";
			long projetoID = super.execInsertIdentity(comando, p.getDtinicio(), p.getDttermino(), p.getDescricao(), p.getProjetista(), p.getCliente(), p.getValor());
			p.setNumeroProjeto(String.valueOf(projetoID));
			System.out.println(projetoID);
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
			return false;
		}
	}
	public boolean deletar() {
		try {
			String comando = "delete from projeto where ID = ?";
			super.execUID(comando, p.getNumeroProjeto());
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
			return false;
		}
	}
	public boolean atualizar() {
		try {
			String comando = "update projeto set dt_inicio = ?, dt_termino = ?, descricao = ?, projetista = ?, cliente = ?, valor_financeiro = ? where ID = ?";
			super.execUID(comando, p.getDtinicio(), p.getDttermino(), p.getDescricao(), p.getProjetista(), p.getCliente(), p.getValor(), p.getNumeroProjeto() );
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
			return false;
		}
	}
}
