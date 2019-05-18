package testes;

import java.sql.Connection;
import java.sql.SQLException;

import jdbc.ConnectionFactory;

public class TesteConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection con = new ConnectionFactory().getConnection();
		System.out.println("Conexão aberta");
		
		con.close();
		
	}

}
