package com.livro.capitulo3.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaMySQL {
	
	public static void main(String args[]) {
	
	Connection conexao = null;
	
	try {
		
		String url= "jdbc:mysql://localhost:3306/agenda?useTimezone=true&serverTimezone=UTC";
		String usuario="root";
		String senha= "admin";
		
		conexao = DriverManager.getConnection(url,usuario,senha);
		System.out.println("conectou");
	}catch(SQLException e) {		
		System.out.println("Ocorreu um erro de SQL. Erro " + e.getMessage());
		
	}finally {
		try {
			conexao.close();
		}catch(SQLException e) {
			System.out.println("Ocorreu um erro de SQL. Erro " + e.getMessage());
		}
	}
	
}

}
