package sistemaProjetosG4;
import java.sql.SQLException;

public class ClienteDao extends GenericDao {
	private Cliente c;
	
	public ClienteDao(Cliente c) {
		this.c = c;
	}
	
	public boolean inserir() {
		try {
			String comando = "insert into cliente values (?,?,?)";
			super.inserir(comando, c.getcpf(), c.getDtNascimento(), c.getNome());
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
			return false;
		}
	}

}
