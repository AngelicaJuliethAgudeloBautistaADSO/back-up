
package modeloDAO;

import confing.Conexion;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import interfaces.CRUD;
import java.util.ArrayList;
import java.util.List;
import modelo.cliente;

public class clienteDAO extends Conexion implements CRUD {
    Conexion cn=new Conexion();//se instancia la clase conexion para que la clase modelo interactue con la base de datos
    Connection con;//se crea un variable de tipo Connection
    PreparedStatement ps;
    ResultSet rs;
    cliente c =new cliente();//se instancia la clase cliente
    
    
    @Override
    public List<cliente> listar() {
        ArrayList<cliente>list=new ArrayList<>();
        String sql="select * from tb_cliente";//se crea una variable string para la consulta de sql
        try {
            con=cn.getConnection();////la Connection es igual a la clase instanciada con el metodo connectio*n
            ps=con.prepareStatement(sql);//el PreparedStatement es igual a Connection . preparar la consult*a sql
            rs=ps.executeQuery();
            while (rs.next()){
                cliente clie=new cliente();//se instancia la clase cliente
                //clie.setId(rs.getInt("id_cliente"));
                clie.setNom_cliente(rs.getString("nom_cliente"));
                clie.setApell_cliente(rs.getString("apell_cliente"));
                clie.setDocument_cliente(rs.getInt("document_cliente"));
                clie.setGenero_cliente(rs.getString("genero_cliente"));
                clie.setTelef_cliente(rs.getInt("telef_cliente"));
                clie.setEmail_cliente(rs.getString("email_cliente"));
                list.add(clie);
            }
        } catch (Exception e) {
            System.err.println("Error" + e);
        }
        return list;
    }

    @Override
    public cliente list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean add(cliente clie) {
        String sql ="insert into tb_cliente(id_cliente, nom_cliente, apell_cliente, tipo_cliente, document_cliente, genero_cliente, telef_cliente, email_cliente, contrasena) values ('"+clie.getNom_cliente()+"','"+clie.getApell_cliente()+"','"+clie.getTipo_cliente()+"','"+clie.getDocument_cliente()+"','"+clie.getGenero_cliente()+"','"+clie.getTelef_cliente()+"','"+clie.getEmail_cliente()+"','"+clie.getContrasena()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
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
