package Service;

import Modelo.Alumno;
import View.infoAlumno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Alumno_Servicio {
    static public  void seleecionarAlumnosNombreCarrera () throws SQLException {
        Database_Connection queryN2 = new Database_Connection();
        Connection conexion =queryN2.queryN2(); //Primero llamo a la conexion
        String queryString= "Select nombre, carrera from alumno ";
        try(PreparedStatement STMT = conexion.prepareStatement(queryString)) {

            try(ResultSet ExecuteQuery= STMT.executeQuery()){
                while(ExecuteQuery.next()){
                    String alumnoNombre= ExecuteQuery.getString("nombre");
                    String alumnoCarrera= ExecuteQuery.getString("carrera");
                    System.out.println(alumnoNombre + "\t" + alumnoCarrera);
                }
            }

        } catch (SQLException ErrorDeConexion){
            System.err.println(ErrorDeConexion.getMessage());
        }
    }
    static public void agregarAlumno(Alumno miAlumno) throws SQLException{
        Database_Connection queryN2= new Database_Connection();
        Connection conexion= queryN2.queryN2();

        String queryString = "insert into alumno (carnet, nombre, direccion, email, telefono, carrera, centro) values (? , ? , ?, ?, ?, ?, ?)";
        try(PreparedStatement STMT = conexion.prepareStatement(queryString)){
            STMT.setInt(1,miAlumno.getCarnet());
            STMT.setString(2,miAlumno.getNombre());
            STMT.setString(3,miAlumno.getDireccion());
            STMT.setString(4,miAlumno.getEmail());
            STMT.setInt(5,miAlumno.getTelefono());
            STMT.setString(6,miAlumno.getCarrera());
            STMT.setString(7,miAlumno.getCentro());
            STMT.executeUpdate();
        }catch (SQLException Error_de_conexion){
            System.err.println(Error_de_conexion.getMessage());
        }
        System.out.println("Modelo.Alumno agregado con éxito");
    }
    static public void agregarAlumnousuario() throws SQLException {
        infoAlumno miInfoAlumno = new infoAlumno();//cuando creo un objetto accedo a los metodos de esa clase
        Alumno miAlumno = miInfoAlumno.solicitarInfo();// creo otro objeto de tipo objeto original, = al ojbeto con el que accesdo a los metodos. metodo
        agregarAlumno(miAlumno);
    };
    static public void actualizarAlumno(Alumno updateAlumno)throws SQLException{
        Database_Connection queryN2 = new Database_Connection();
        Connection conexion= queryN2.queryN2( );
        String queryString = " update alumno set nombre = ?, direccion =?, email =?,telefono=?, carrera=?, centro=? where carnet = ?";
        try(PreparedStatement STMT= conexion.prepareStatement(queryString)){
            STMT.setString(1,updateAlumno.getNombre());
            STMT.setString(2,updateAlumno.getDireccion());
            STMT.setString(3,updateAlumno.getEmail());
            STMT.setInt(4,updateAlumno.getTelefono());
            STMT.setString(5,updateAlumno.getCarrera());
            STMT.setString(6,updateAlumno.getCentro());
            STMT.setInt(7,updateAlumno.getCarnet());

            STMT.executeUpdate();
        }catch (SQLException Error_de_conexion){
            System.err.println(Error_de_conexion.getMessage());
        }
    };
    static public Alumno buscandoinfoAlumno (String nombreAlumno)throws SQLException {
        Database_Connection queryN2 = new Database_Connection();
        Alumno updatedAlumno = new Alumno();
        Connection conexion = queryN2.queryN2();
        String queryString = " Select* from alumno where nombre =? ";

        try (PreparedStatement STMT = conexion.prepareStatement(queryString)) {
            STMT.setString(1, nombreAlumno);
            try (ResultSet RST = STMT.executeQuery()) {
                while (RST.next()) {
                    String alumnoNombre = RST.getString("nombre");
                    int alumnoCarnet= RST.getInt("carnet");
                    String alumnoDireccion = RST.getString("direccion");
                    String alumnoEmail = RST.getString("email");
                    int alumnoTelefono= RST.getInt("telefono");
                    String alumnoCarrera = RST.getString("carrera");
                    String alumnoCentro = RST.getString("centro");
                    System.out.println("Carnet: " +alumnoCarnet);
                    System.out.println("Nombre: " +alumnoNombre);
                    System.out.println("Direccion: "+alumnoDireccion);
                    System.out.println("Email: " +alumnoDireccion);
                    System.out.println("Telefono:" +alumnoTelefono);
                    System.out.println("Carrera:  " +alumnoCarrera);
                    System.out.println("Centro:  " +alumnoCentro);

                    updatedAlumno.setNombre(alumnoNombre);
                    updatedAlumno.setCarnet(alumnoCarnet);
                    updatedAlumno.setDireccion(alumnoDireccion);
                    updatedAlumno.setEmail(alumnoEmail);
                    updatedAlumno.setTelefono(alumnoTelefono);
                    updatedAlumno.setCarrera(alumnoCarrera);
                    updatedAlumno.setCentro(alumnoCentro);

                }
            }
        } catch (SQLException ErrorDeConexion) {
            System.err.println(ErrorDeConexion.getMessage());
        }
        return updatedAlumno;
    }

}
