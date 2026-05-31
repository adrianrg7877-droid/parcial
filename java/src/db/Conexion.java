package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private String url =
            "jdbc:mysql://localhost:3306/parcial";

    private String usuario =
            "root";

    private String password =
            "123456";

    public Connection conectar() {

        Connection conexion = null;

        try {

            conexion =
                    DriverManager.getConnection(
                            url,
                            usuario,
                            password
                    );

        } catch (SQLException e) {

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