package sistemaProjetosG4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//import java.sql.*;

public class Main {

	public static void main(String[] args) {
		
		
		//********************************************************
		//***Cliente
		//********************************************************
		/*
		String nome = "Natália";
		String dt_nascimento = "11/11/1999";
		String cpf = "12345678911";
		Cliente c = new Cliente(nome,dt_nascimento,cpf);
		
		
		ClienteDao cd = new ClienteDao(c);
		*/
		//Insere no banco
		//cd.inserir();
		
		//Atualiza no banco
		//cd.atualizar();
		
		//Deleta do banco
		//cd.deletar();
		
		
		
		//********************************************************
		//***Projeto
		//********************************************************
		
		
		String dt_inicio = "15/06/2023";
		String dt_termino = "16/06/2023";
		String descricao = "Projeto final de DOOC5";
		String cliente = "31921032111";
		String projetista = "12345";
		double valor = 2.5;
		
		  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		 
		  //converte String para LocalDate
		  LocalDate dt_inicioDate = LocalDate.parse(dt_inicio, formatter);
		  LocalDate dt_terminoDate = LocalDate.parse(dt_termino, formatter);
		
		  
		 //Verificação da data_termino maior que a data_inicio
		if(dt_inicioDate.isAfter(dt_terminoDate)) {
			System.out.println("Data de termino menor que a data inicial. Favor regularizar.");
			return;
		}
		  
		Projeto p = new Projeto(cliente,descricao,dt_inicioDate,dt_terminoDate,projetista,valor);
		
		//Numero (ID) do projeto a ser deletado/atualizado -> Deve ser perguntado ao usuário ao invés de settado desse modo.
		//p.setNumeroProjeto("4");
		
		
		ProjetoDao pd = new ProjetoDao(p);
		//Insere no banco
		pd.inserir();
		
		//Atualiza no banco
		p.setDescricao("Bananinhas");
		pd.atualizar();
		
		//Deleta do banco
		//pd.deletar();
		
		//--------------------------------------------------------

	}

}
