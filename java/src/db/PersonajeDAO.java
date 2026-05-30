package db;

import model.Personaje;
import model.Guerrero;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;

public class PersonajeDAO {

    private Conexion conexion;

    // constructor
    public PersonajeDAO() {

        conexion = new Conexion();
    }

    // INSERT
    public void insertarPersonaje(
            Personaje personaje
    ) {

        try{

            Connection con =
                    conexion.conectar();

            String sql =
                    "INSERT INTO personaje(nombre,nivel)"
                    + " VALUES(?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(
                    1,
                    personaje.getNombre()
            );

            ps.setInt(
                    2,
                    personaje.getNivel()
            );

            ps.executeUpdate();

        }catch(Exception e){

            System.out.println(
                    e.getMessage()
            );
        }
    }

    // SELECT
    public ArrayList<Personaje>
    listarPersonajes(){

        ArrayList<Personaje> lista =
                new ArrayList<>();

        try{

            Connection con =
                    conexion.conectar();

            String sql =
                    "SELECT * FROM personaje";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ResultSet rs =
                    ps.executeQuery();

            while(rs.next()){

                Personaje p =
                        new Guerrero(
                                rs.getInt("id"),
                                rs.getString("nombre"),
                                rs.getInt("nivel")
                        );

                lista.add(p);
            }

        }catch(Exception e){

            System.out.println(
                    e.getMessage()
            );
        }

        return lista;
    }

    // Buscar por nombre
    public Personaje buscarPorNombre(
            String nombre
    ){

        Personaje personaje = null;

        try{

            Connection con =
                    conexion.conectar();

            String sql =
                    "SELECT * FROM personaje "
                    + "WHERE nombre=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, nombre);

            ResultSet rs =
                    ps.executeQuery();

            if(rs.next()){

                personaje =
                        new Guerrero(
                                rs.getInt("id"),
                                rs.getString("nombre"),
                                rs.getInt("nivel")
                        );
            }

        }catch(Exception e){

            System.out.println(
                    e.getMessage()
            );
        }

        return personaje;
    }

    // UPDATE
    public void actualizarNivel(
            int id,
            int nivel
    ){

        try{

            Connection con =
                    conexion.conectar();

            String sql =
                    "UPDATE personaje "
                    + "SET nivel=? "
                    + "WHERE id=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, nivel);
            ps.setInt(2, id);

            ps.executeUpdate();

        }catch(Exception e){

            System.out.println(
                    e.getMessage()
            );
        }
    }

    // DELETE
    public void eliminarPersonaje(
            int id
    ){

        try{

            Connection con =
                    conexion.conectar();

            String sql =
                    "DELETE FROM personaje "
                    + "WHERE id=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

        }catch(Exception e){

            System.out.println(
                    e.getMessage()
            );
        }
    }
}