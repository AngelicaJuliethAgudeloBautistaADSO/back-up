/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.cliente;
import modeloDAO.clienteDAO;

/**
 *
 * @author angel
 */
public class Guardar extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String nomb = request.getParameter("nombre");
        String apell = request.getParameter("apellidos");
        String email = request.getParameter("correo");
        String genero = request.getParameter("genero");
        String tipo = request.getParameter("tipo");
        int id = Integer.parseInt(request.getParameter("documento"));
        int edad = Integer.parseInt(request.getParameter("edad"));
        long telef = Long.parseLong(request.getParameter("telefono"));
        String contrasena = request.getParameter("contrasena");
        
        
        
        cliente cliente = new cliente();
        cliente.setNombre(nomb);
        cliente.setApellidos(apell);
        cliente.setCorreo(email);
        cliente.setGenero(genero);
        cliente.setTipo(tipo);
        cliente.setDocumento(id);
        cliente.setEdad(edad);
        cliente.setTelefono(telef);
        cliente.setContrasena(contrasena);
        
        
        clienteDAO clienteDao = new clienteDAO();
        boolean registrado = clienteDao.registrar(cliente);

        if (registrado) {
            response.sendRedirect("ingreso.jsp"); // Redirigir al login después del registro exitoso
        } else {
            response.sendRedirect("registro.jsp?error=true"); // Redirigir al registro en caso de error
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
