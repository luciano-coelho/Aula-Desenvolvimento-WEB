package br.com.farmacia.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private static final String USUARIO = "root";
	private static final String SENHA = "21122007";
	private static final String URL = "jdbc:mysql://localhost:3306/new_schema1";
	
	public static Connection conectar() throws SQLException {
		
		//Referencia ao driver MySql para versões antigas do java
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		
		Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
		return conexao;
	/*}
	

	public static void main(String[] args) {
		try {
			Connection conexao = ConnectionFactory.conectar();
			System.out.println("Conectado com Sucesso!");
		} catch (SQLException e) {
			System.out.println("Erro:"+e);
			
		}
	}*/
	

}
}