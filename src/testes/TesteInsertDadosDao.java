package testes;

import java.sql.SQLException;

import dao.ClienteDao;
import modelo.Cliente;

public class TesteInsertDadosDao {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		ClienteDao dao = new ClienteDao();
		try {
			Cliente cliente = new Cliente();
			cliente.setNome("Carmen");
			cliente.setEmail("carmen@gmail.com");
			cliente.setEndereco("Rua A");

			dao.insert(cliente);
			System.out.println("Cliente gravado com sucesso");

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			dao.fecharConexao();
		}

	}

}
