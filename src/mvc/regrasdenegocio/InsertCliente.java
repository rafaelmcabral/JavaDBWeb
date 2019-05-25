package mvc.regrasdenegocio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDao;
import modelo.Cliente;

public class InsertCliente implements Regra {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ClienteDao dao;
		
		dao = new ClienteDao();
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String endereco = request.getParameter("endereco");

		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setEndereco(endereco);
		cliente.setEmail(email);
		dao.insert(cliente);
		return "insertclienteok.jsp";
	}

}
