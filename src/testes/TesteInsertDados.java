package testes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbc.ConnectionFactory;

public class TesteInsertDados {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

	Connection con = new ConnectionFactory().getConnection();
	String sql = "insert into clientes(nome, email, endereco) values (?,?,?)";
	
	PreparedStatement stmt = con.prepareStatement(sql);
	stmt.setString(1, "Maria");
	stmt.setString(2, "maria@maria.com");
	stmt.setString(3, "Av. Brasil");
	stmt.execute();
	stmt.close();
	
	con.close();
System.out.println("Gravado com sucesso!");
	}

}
