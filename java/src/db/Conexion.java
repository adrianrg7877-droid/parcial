package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    // datos conexión
    private String url =
            "jdbc:mysql://localhost:3306/rpg_manager";

    private String usuario = "root";

    private String password = "1234";

    // método conectar
    public Connection conectar() {

        Connection conexion = null;

        try{

            // crear conexión
            conexion = DriverManager.getConnection(
                    url,
                    usuario,
                    password
            );

            System.out.println(
                    "Conexion exitosa"
            );

        }catch(Exception e){

            System.out.println(
                    "Error de conexion"
            );

            System.out.println(
                    e.getMessage()
            );
        }

        return conexion;
    }
}