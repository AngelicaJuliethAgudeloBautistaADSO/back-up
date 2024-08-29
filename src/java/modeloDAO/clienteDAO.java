
package modeloDAO;

import java.sql.Connection;
import confing.conexionBD;
import interfaces.CRUD;
import java.util.List;
import modelo.cliente;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class clienteDAO implements CRUD{
    
    public boolean registrar(cliente cliente) {
        Connection conexion = conexionBD.conectarDB();
        String sql = "INSERT INTO clientes (nombre, apellidos, correo, genero, tipo, documento, edad, telefono, contrasena) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellidos());
            ps.setString(3, cliente.getCorreo());
            ps.setString(4, cliente.getGenero());
            ps.setString(5, cliente.getTipo());
            ps.setInt(6, cliente.getDocumento());
            ps.setInt(7, cliente.getEdad());
            ps.setInt(8, (int) cliente.getTelefono());
            ps.setString(9, cliente.getContrasena());

            int filasAfectadas = ps.executeUpdate();

            return filasAfectadas > 0;

        } catch (SQLException e) {
            System.out.println("Error al registrar cliente: " + e.getMessage());
            return false;
        } finally {
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    @Override
    public List listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public cliente list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean add(cliente clie) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean edit(cliente clie) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
