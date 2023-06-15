package sistemaProjetosG4;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conecta {
	
	private static Connection conexao_unica = null;
	static protected String dsn="bd?useSSL=false", user="root", pwd="";
	private Conecta() {}
	
	public static Connection getConnection() {
		try {
			String servidor1 = "localhost:3306";
			if ((conexao_unica == null) ) {
				
				conexao_unica = DriverManager.getConnection("jdbc:mysql://"+servidor1+"/"+dsn,user,pwd);
			}
			return conexao_unica;

		} catch (Exception ex) {
			 ex.printStackTrace();
	         return null;
		}
		
	}
	

}
