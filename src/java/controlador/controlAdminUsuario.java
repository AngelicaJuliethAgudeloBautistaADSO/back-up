package controlador;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.cliente;
import modeloDAO.clienteDAO;

@WebServlet(name = "ControlAdminUsuario", urlPatterns = {"/controlAdminUsuario"})
public class controlAdminUsuario extends HttpServlet {
    
    clienteDAO clienteDAO = new clienteDAO();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion.equals("listar")) {
            List<cliente> listaClientes = clienteDAO.listar();
            request.setAttribute("clientes", listaClientes);
            RequestDispatcher dispatcher = request.getRequestDispatcher("panel_usuarios_admin.jsp");
            dispatcher.forward(request, response);
        } else {
            // Puedes manejar otras acciones aquí (como agregar, eliminar, etc.)
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response); // Maneja las solicitudes POST como GET
    }
}

