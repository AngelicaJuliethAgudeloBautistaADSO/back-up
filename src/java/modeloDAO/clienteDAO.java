package modeloDAO;

import confing.Conexion;
import interfaces.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.cliente;

public class clienteDAO implements CRUD {
    Conexion conexion = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List<cliente> listar() {
        List<cliente> lista = new ArrayList<>();
        String sql = "SELECT * FROM tb_cliente";
        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                cliente cliente = new cliente();
                cliente.setId_cliente(rs.getInt("id_cliente"));
                cliente.setNom_cliente(rs.getString("nom_cliente"));
                cliente.setApell_cliente(rs.getString("apell_cliente"));
                cliente.setTipo_cliente(rs.getString("tipo_cliente"));
                cliente.setDocument_cliente(rs.getInt("document_cliente"));
                cliente.setGenero_cliente(rs.getString("genero_cliente"));
                cliente.setTelef_cliente(rs.getString("telef_cliente"));
                cliente.setEmail_cliente(rs.getString("email_cliente"));
                cliente.setContrasena(rs.getString("contrasena"));
                cliente.setRol_fk(rs.getInt("rol_fk"));
                lista.add(cliente);
            }
        } catch (Exception e) {
            System.err.println("Error al listar clientes: " + e.getMessage());
        }
        return lista;
    }
}
