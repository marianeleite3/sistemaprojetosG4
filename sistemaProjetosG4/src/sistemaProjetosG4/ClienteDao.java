package sistemaProjetosG4;
import java.sql.SQLException;

public class ClienteDao extends GenericDao {
	private Cliente c;
	
	public ClienteDao(Cliente c) {
		this.c = c;
	}
	
	public boolean inserir() {
		try {
			String comando = "insert into cliente (cpf, dt_nascimento, nome) values (?,?,?)";
			super.execUID(comando, c.getcpf(), c.getDtNascimento(), c.getNome());
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
			return false;
		}
	}
	public boolean deletar() {
		try {
			String comando = "delete from cliente where cpf = ?";
			super.execUID(comando, c.getcpf());
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
			return false;
		}
	}
	public boolean atualizar() {
		
		try {
			String comando = "update cliente set nome = ?, dt_nascimento = ? where cpf = ?";
			super.execUID(comando, c.getNome(), c.getDtNascimento(), c.getcpf());
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
			return false;
		}
	}

}
