package Main;

import Modelo.Alumno;
import View.Correr_Menus;
import View.infoAlumno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.List;


public class Universidad {
    public static void main(String[] args) throws SQLException {
            Correr_Menus correrprograma = new Correr_Menus();
            correrprograma.correrMenuPrincipal();

    /*    //queryN2(); //This method is the conexion
        //queryN1(); // This method shows all the list of teachers
        //seleecionarAlumnosNombreCarrera();//It consults according to stablish parameter
        //buscandoinfoAlumno(busqueda());//IT consults asking the user the parameters
        //agregarAlumnousuario();
        //actualizarAlumno(updateAlumno);
        String nombreAlumnoModificar=busqueda();
        Alumno Alumno = buscandoinfoAlumno(nombreAlumnoModificar);
        Alumno Alumnomodificacion= alumnomodificado(Alumno);
        actualizarAlumno(Alumnomodificacion);*/
    }
}

//Modelo todas las clases
//Servicio todo lo que modifica elimina agrega o extrae a los objetos ligado a controlador(donde se valida dtos)
//Vista, extraes pedis informacion de la base de datos
//Main, Principal

