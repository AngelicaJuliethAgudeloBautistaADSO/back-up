
package confing;


import java.sql.Connection;
import java.sql.DriverManager;



public class Conexion {
    Connection con;//esta variable almacenara la informacion
    
 public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/base_datos_spa","root","");//se esta intentando realizar la conexion con los datos proporcionador (host, db, user, pss)
            System.out.println("conexion exitosa");//si la conexion a la base de datos es exitosa s imprimira un mesaje "conexion exitosa" en la consola
        } catch (Exception e) {
            System.err.println("Error"+e.getMessage());//se imprimira un mensaje de error
        }
    }
        //public static void main(String[]args){
        //    Conexion conexion = new Conexion();
        //    if (conexion.getConnection() != null) {
        //    System.out.println("Conexión a la base de datos exitosa.");
        //    } else {
        //    System.out.println("Error al conectar a la base de datos.");
  //}
      //  }
            //llamada al metodo conectarDB() para que se pueda establecer en la base de datos
            //Connection bd= conectarDB();
            
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
        //}

    public Connection getConnection() {
        //retorna el objeto Connection (con) si la conexion fue exitosa 
        return con;
    }

}
 