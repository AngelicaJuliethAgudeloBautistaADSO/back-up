
package controlador;

import modeloDAO.MetodosSQL;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class controlador extends HttpServlet {
    String listar="../vistas/listar.jsp";
    String add="../vistas/add.jsp";
    String edit="../vistas/edit.jsp";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        /*String nombre = request.getParameter("nombre");
        String apellidos = request.getParameter("apellidos");
        String correo = request.getParameter("correo");
        String genero = request.getParameter("genero");
        String tipo = request.getParameter("tipo");
        int documento = Integer.parseInt(request.getParameter("documento"));
        int edad = Integer.parseInt(request.getParameter("edad"));
        int telefono = Integer.parseInt(request.getParameter("telefono"));
        String contrasena = request.getParameter("contrasena");
        
        MetodosSQL metodos = new MetodosSQL();*/
        
        
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<body>");
            out.println("<script type=\"text/javascript\">");
            
            /*boolean registro = metodos.registrarUsuario(edad, nombre, apellidos, documento, genero, telefono, correo, contrasena);
            
            if (registro) {
            response.sendRedirect("registro_exitoso.jsp");
            } else {
            response.sendRedirect("registro_fallido.jsp");
            }*/
            
            out.println("</script>");
            out.println("</body>");
            out.println("</html>");

        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acceso ="";
        String accion = request.getParameter("accion");
        if (accion.equalsIgnoreCase("listar")) {
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
