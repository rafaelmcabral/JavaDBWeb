package testes;

import java.sql.SQLException;
import java.util.List;

import dao.ClienteDao;
import modelo.Cliente;

public class TesteEditarCliente2 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		ClienteDao dao = new ClienteDao();
		Cliente cliente = new Cliente();
		try {
			cliente.setId(1);

				cliente.setNome("Ciclano");
				cliente.setEndereco("Rua x");
				cliente.setEmail("teste@gmail.com");
				dao.editar(cliente);
				System.out.println("edição realizada");
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dao.fecharConexao();
			System.out.println("conexão finalizada");
		}

		/*
		 * try { List<Cliente> clientes = dao.getClientes();
		 * 
		 * for (Cliente cliente : clientes) { System.out.println("Nome: " +
		 * cliente.getNome()); System.out.println("Email: " + cliente.getEmail());
		 * System.out.println("Endereco: " + cliente.getEndereco());
		 * System.out.println("----------------------------"); }
		 * 
		 * dao.editar(cliente);
		 * 
		 * } catch (Exception e) { e.printStackTrace(); } finally {
		 * dao.fecharConcexao(); }
		 */
	}

}
