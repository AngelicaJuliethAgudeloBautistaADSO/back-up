
package modeloDAO;

import java.sql.Connection;
import confing.conexionBD;
import interfaces.CRUD;
import java.util.List;
import modelo.cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class clienteDAO implements CRUD{
    conexionBD cn=new conexionBD();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    cliente clien=new cliente();
     
    @Override
    public List listar() {
        ArrayList<cliente>list=new  ArrayList<>();
        String sql="selec * from cliente";
        try {
            con=cn.getonnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                cliente clie = new cliente();
                clie.setId(rs.getInt("id_cliente"));
                clie.setNom(rs.getString("nom_cliente"));
                clie.setApell(rs.getString("apell_cliente"));
                clie.setEdad(rs.getInt("edad_cliente"));
                clie.setGenero(rs.getString("genero_cliente"));
                clie.setTelef(rs.getInt("telef_cliente"));
                clie.setEmail(rs.getString("email_cliente"));
                list.add(clie); 
                
            }
        } catch (Exception e) {
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
