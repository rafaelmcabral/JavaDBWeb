package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.ConnectionFactory;
import modelo.Cliente;

public class ClienteDao {

	private Connection con;

	public ClienteDao() throws ClassNotFoundException {
		this.con = new ConnectionFactory().getConnection();
	}
	
	public List<Cliente> getClientes() {
		try {
			List<Cliente> clientes = new ArrayList<Cliente>();
			PreparedStatement stmt = this.con.prepareStatement("select * from clientes");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setId(rs.getLong("id"));
				cliente.setNome(rs.getString("nome"));
				cliente.setEmail(rs.getString("email"));
				cliente.setEndereco(rs.getString("endereco"));

				clientes.add(cliente);
			}

			rs.close();
			stmt.close();
			return clientes;

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public void insert(Cliente cliente) {
		String sql = "insert into clientes(nome, email, endereco) values (?,?,?)";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getEmail());
			stmt.setString(3, cliente.getEndereco());

			stmt.execute();
			stmt.close();

		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	public void editar(Cliente cliente) {
		String sql = "update clientes set nome=?, email=?, endereco=? where id=?";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getEmail());
			stmt.setString(3, cliente.getEndereco());
			stmt.setLong(4, cliente.getId());

			stmt.execute();
			stmt.close();

		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	public void excluir(Cliente cliente) {
		String sql = "delete from clientes where id = ?";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setLong(1, cliente.getId());

			stmt.execute();
			stmt.close();

		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	/*
	 * public Boolean isClienteExiste(Long id) { boolean retorno = false; String sql
	 * = "select * from clientes where id = ?"; try { PreparedStatement stmt =
	 * con.prepareStatement(sql); ResultSet rs = stmt.executeQuery();
	 * 
	 * stmt.setLong(1, cliente.getId()); while (rs.next()) { Cliente cliente = new
	 * Cliente();
	 * 
	 * cliente.setId(rs.getLong("id")); cliente.setNome(rs.getString("nome"));
	 * cliente.setEmail(rs.getString("email"));
	 * cliente.setEndereco(rs.getString("endereco")); } stmt.execute();
	 * stmt.close();
	 * 
	 * } catch (Exception e) { throw new RuntimeException(e); } return retorno; }
	 */

	public void fecharConexao() throws SQLException, ClassNotFoundException {
		this.con = new ConnectionFactory().getConnection();
		con.close();
	}

}