package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.cliente;
import modeloDAO.clienteDAO;

@WebServlet(name = "control_admin_usuario", urlPatterns = {"/control_admin_usuario"})
public class controlAdminUsuario extends HttpServlet {

    String listar="panel_admin/carpetica/panel_usuarios_admin.jsp";
    String add="vistas/add.jsp";
    String edit="vistas/edit.jsp";
    cliente c =new cliente();//se instancia la clase cliente
    clienteDAO dao=new clienteDAO();
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet control_admin_usuario</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet control_admin_usuario at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String acceso="";
            String action=request.getParameter("accion");
            if (action.equalsIgnoreCase("listar")) {
                acceso=listar;
            }else if (action.equalsIgnoreCase("add")){
                acceso=add;
            }
            else if(action.equalsIgnoreCase("Agregar")){
                String nom = request.getParameter("nombre");
                String apell = request.getParameter("apellido");
                String tipo = request.getParameter("tipo");
                String documentSTR = request.getParameter("documento");
                String genero = request.getParameter("genero");
                String telefSTR = request.getParameter("telefono");
                String email = request.getParameter("email");
                String contrasena = request.getParameter("contrasena");
                
                //convertimos document y telef de string a int
                int document = Integer.parseInt(documentSTR);
                int telef = Integer.parseInt(telefSTR);
                
                c.setNom_cliente(nom);
                c.setApell_cliente(apell);
                c.setTipo_cliente(tipo);
                c.setDocument_cliente(document);
                c.setGenero_cliente(genero);
                c.setTelef_cliente(telef);
                c.setEmail_cliente(email);
                c.setContrasena(contrasena);
                dao.add(c);
                
                acceso=listar;
            }
            RequestDispatcher vista=request.getRequestDispatcher(acceso);
            vista.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
