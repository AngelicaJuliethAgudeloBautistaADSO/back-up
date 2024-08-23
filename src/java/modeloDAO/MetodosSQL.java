/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloDAO;

import confing.conexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author angel
 */
public class MetodosSQL {

    private Connection conexion;
    private PreparedStatement sentenciaPreparada;
    private ResultSet resultado;

    public boolean registrarUsuario(int id, String nom_cliente, String apell_cliente, int edad_cliente, String genero_cliente, int telef_cliente, String email_cliente, String contrasena) {
        boolean registro = false;

        try {
            conexion = conexionBD.conectarDB();
            String consulta = "INSERT INTO tb_cliente (id_cliente, nom_cliente, apell_cliente, edad_cliente, genero_cliente, telef_cliente, email_cliente, contrasena) VALUES (?,?,?,?,?,?,?,?)";
            sentenciaPreparada = conexion.prepareStatement(consulta);
            sentenciaPreparada.setInt(1, id);
            sentenciaPreparada.setString(2, nom_cliente);
            sentenciaPreparada.setString(3, apell_cliente);
            sentenciaPreparada.setInt(4, edad_cliente);
            sentenciaPreparada.setString(5, genero_cliente);
            sentenciaPreparada.setInt(6, telef_cliente);
            sentenciaPreparada.setString(7, email_cliente);
            sentenciaPreparada.setString(8, contrasena);

            int resultadoInsercion = sentenciaPreparada.executeUpdate();

            if (resultadoInsercion > 0) {
                registro = true; //se ha registrado
                //System.out.println("se hizo el registro de cliente");
            } 
            conexion.close();
            //else {
              //  registro = false; //No se ha registrado
                //System.out.println("No se hizo el registro de cliente");
            //}
        } catch (SQLException e) {
            System.out.println("Error:" + e);
        } finally {
            try {
                if(conexion!= null){
                    conexion.close();
                }
            } catch (SQLException e) {
                System.out.println("Error: " + e);
            }
        }
        //System.out.println("valor del registro: " + registro);
        return registro;
    }
}
