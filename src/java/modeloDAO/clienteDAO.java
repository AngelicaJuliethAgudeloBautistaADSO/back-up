
package modeloDAO;

import confing.Conexion;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import interfaces.CRUD;
import java.util.ArrayList;
import java.util.List;
import modelo.cliente;

public class clienteDAO implements CRUD{
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    cliente c =new cliente();
    
    
    @Override
    public List<cliente> listar() {
        ArrayList<cliente>list=new ArrayList<>();
        String sql="select * from tb_cliente";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                cliente clie=new cliente();
                clie.setId(rs.getInt("id_cliente"));
                clie.setNom(rs.getString("nom_cliente"));
                clie.setApell(rs.getString("apell_cliente"));
                clie.setDocument(rs.getInt("document_cliente"));
                clie.setGenero(rs.getString("genero_cliente"));
                clie.setTelef(rs.getInt("telef_cliente"));
                clie.setEmail(rs.getString("email_cliente"));
                list.add(clie);
            }
        } catch (Exception e) {
            System.out.println("ayudaaaaaaaaaaaaaaaaaaaaaa");
        }
        return list;
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
