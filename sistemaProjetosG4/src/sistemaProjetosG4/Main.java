package sistemaProjetosG4;
//import java.sql.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "joaozinho2";
		String dt_nascimento = "01/01/1990";
		String cpf = "01111111111";
		Cliente c = new Cliente(cpf,dt_nascimento,nome);
		
		ClienteDao cd = new ClienteDao(c);
		cd.inserir();
		

	}

}
