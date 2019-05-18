package testes;

import java.sql.SQLException;
import java.util.List;

import dao.ClienteDao;
import modelo.Cliente;

public class TesteGetClientes {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		ClienteDao dao = new ClienteDao();
		try {
			List<Cliente> clientes = dao.getClientes();

			for (Cliente cliente : clientes) {
				System.out.println("Nome: " + cliente.getNome());
				System.out.println("Email: " + cliente.getEmail());
				System.out.println("Endereco: " + cliente.getEndereco());
				System.out.println("----------------------------");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			dao.fecharConexao();
		}

	}

}
