package testes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbc.ConnectionFactory;

public class TesteInsertDados2 {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		try {
			con = new ConnectionFactory().getConnection();
			String sql = "insert into clientes(nome, email, endereco) values (?,?,?)";

			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, "Maria");
			stmt.setString(2, "maria@maria.com");
			stmt.setString(3, "Av. Brasil");
			stmt.execute();
			stmt.close();

			System.out.println("Gravado com sucesso!");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
	}

}
