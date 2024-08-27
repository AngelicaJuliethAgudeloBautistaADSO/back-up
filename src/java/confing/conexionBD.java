
package confing;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class conexionBD {
    /*se esta haciendo la coneccion a la base de datos **/
    /*private static Connection conexion;
    private static PreparedStatement sentenciapreparada;
    private static ResultSet resultado;*/
    
 public static Connection conectarDB() {
        Connection con;//esta variable almacenara la informacion
        
        String host = "jdbc:mysql://localhost/";//URL del host donde esta la base de datos
        String user = "root";//Nombre del usuario de la base de datos para poder ingresar a la base de datos
        String pass = "";//Contraseña de la base de datos para poder ingresar a la base de datos
        String bd = "base_datos_spa";//Nombre de la base de datos a la cual se conectara
        
        
        
        System.out.println("conectando ...");//esta parte es opcional se esta imprimiendo un mensaje por consola que indicara que esta en proceso de conexion
        try {
            con = DriverManager.getConnection(host + bd, user, pass);//se esta intentando realizar la conexion con los datos proporcionador (host, user, pss, db)
            System.out.println("conexion exitosa");//si la conexion a la base de datos es exitosa s imprimira un mesaje "conexion exitosa" en la consola
        } catch (SQLException e) {
            System.out.println(e.getMessage());//en lugara de ocurrir un error se imprimira un mensaje de error y un excepcion
            throw  new RuntimeException(e);
        }
        //retorna el objeto Connection (con) si la conexion fue exitosa 
        return con;
    }
        public static void main(String[]args){
            //llamada al metodo conectarDB() para que se pueda establecer en la base de datos
            Connection bd= conectarDB();
            
            /*try {
                conexion=conectarDB();
                String consulta = "INSERT INTO tb_cliente (id_cliente, nom_cliente, apell_cliente, edad_cliente, genero_cliente, telef_cliente, email_cliente, contrasena) VALUES ('5698', 'angel', 'agu', '20', 'mujer', '8585858', 'angelagu@gmail.com', '15698aa')";
                sentenciapreparada=conexion.prepareStatement(consulta);
                int i = sentenciapreparada.executeUpdate();
                
                if (i>0) {
                    System.out.println("se guardaron los datos");
                }else{
                    System.out.println("NO se guardaron los datos");
                }
                conexion.close();
            } catch (SQLException e) {
                System.out.println("Error: "+e);
            }**/
        }

    public Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Connection getonnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
 