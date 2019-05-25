package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDao;
import modelo.Cliente;

@WebServlet("/rnservletadiciona")
@SuppressWarnings("serial")
public class RNServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String action = request.getParameter("regra");
		
		//ClienteDao dao = new ClienteDao();
	/*
		if (action.equals("InserirCliente")) {
			// regra de negócio para inserir cliente
			String nome = request.getParameter("nome");
			String email = request.getParameter("email");
			String endereco = request.getParameter("endereco");

			Cliente cliente = new Cliente();
			cliente.setNome(nome);
			cliente.setEndereco(endereco);
			cliente.setEmail(email);
			dao.insert(cliente);
			RequestDispatcher rd = request.getRequestDispatcher("insertclienteok.jsp");
			rd.forward(request, response);
		} else if (action.equals("GetClientes")) {
			
		} else if (action.equals("DeleteCliente")) {
			
		}*/
		
		//codigo fazendo extract class
		//if (action.equals("InsertCliente")) {
		//	new InsertCliente().execute(request,response);
		//} else if (action.equals("GetCliente")) {
		//	new GetClientes().execute(request,response);
		//} else if (action.equals("DeleteCliente" )) {
		//	new DeleteCliente().execute(request,response);
		//}
		
		//out.println("<html>");
		//out.println("<head>");
		//out.println("</head>");
		//out.println("<body>");
		//out.println("Cliente "+cliente.getNome()+" Inserido no banco!");
		//out.println("</body>");
		//out.println("</html>");
		

	}
}
