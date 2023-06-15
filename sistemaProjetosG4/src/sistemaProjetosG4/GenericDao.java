package sistemaProjetosG4;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GenericDao {
	
	//********************************************************
	//***Update/Insert/Delete
	//********************************************************
	public void execUID(String insertsql, Object... parametros) throws SQLException {
	    try {
		      PreparedStatement ps = Conecta.getConnection().prepareStatement(insertsql);
		      for (int i = 0; i < parametros.length; i++) {
		        ps.setObject(i + 1, parametros[i]);
		      }
		      ps.execute();
		      ps.close();
		    } catch (SQLException e) {
		      e.printStackTrace();
		    } finally {
		    	//Conecta.getConnection().close();
		    }
		

		  }
	
	//---------------------------------------------------------
	
	
	//*********************************************************
	//***Insert com Identity -> Projetos tem ID AUTO-INCREMENT
	//*********************************************************
	public long execInsertIdentity(String insertsql, Object... parametros) throws SQLException {
	    
		
		try {
		      PreparedStatement ps = Conecta.getConnection().prepareStatement(insertsql, Statement.RETURN_GENERATED_KEYS);
		      for (int i = 0; i < parametros.length; i++) {
		        ps.setObject(i + 1, parametros[i]);
		      }
		      int rolls = ps.executeUpdate();
		
		      if(rolls == 0) return -1;
		      
			    try(ResultSet keys = ps.getGeneratedKeys()) {
			    	if(keys.next()) {
			    	long l = keys.getLong(1);
			    	ps.close();
			    	return l;
			    	}
			    }
			    return -1;
			      
		    } catch (SQLException e) {
		      e.printStackTrace();
		      return -1;
		    } finally {
		    	//Conecta.getConnection().close();
		    }
		

		  }
	//----------------------------------------------------------
	
	

		
}


