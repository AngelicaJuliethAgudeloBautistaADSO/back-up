package modeloDAO;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import confing.Conexion;
import interfaces.CRUD_cosmetologo;
import java.util.ArrayList;
import java.util.List;
import modelo.cosmetologo;

public class cosmetologoDAO implements CRUD_cosmetologo{
    
    Conexion cn=new Conexion();//se instancia la clase conexion para que la clase modelo interactue con la base de datos
    Connection con;//se crea un variable de tipo Connection
    PreparedStatement ps;
    ResultSet rs;
    cosmetologo cosm=new  cosmetologo();
    
    @Override
    public List<cosmetologo> listar() {
        ArrayList<cosmetologo>list=new ArrayList<>();
        String sql="select * form tb_cosmetolo";
        try {
            con=cn.getConnection();////la Connection es igual a la clase instanciada con el metodo connectio*n
            ps=con.prepareStatement(sql);//el PreparedStatement es igual a Connection . preparar la consult*a sql
            rs=ps.executeQuery();
            while (rs.next()) {
                cosmetologo cosmet=new cosmetologo();
                cosmet.setId_cosmetolo(rs.getInt("id_cosmetolo"));
                cosmet.setNom_cosmetolo(rs.getString("nom_cosmetolo"));
                cosmet.setApell_cosmetolo(rs.getString("apell_cosmetolo"));
                cosmet.setTelef_cosmetolo(rs.getInt("telef_cosmetolo"));
                cosmet.setEspeci_cosmetolo(rs.getString("especi_cosmetolo"));
                list.add(cosm);
            }
        } catch (Exception e) {
        }
        return list;
    }   

    @Override
    public cosmetologo list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean add(cosmetologo clie) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean edit(cosmetologo clie) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
