package View;

import Modelo.Alumno;

import java.sql.SQLException;
import java.util.Scanner;

public class infoAlumno {

   public Alumno solicitarInfo(){

       Scanner lector = new Scanner(System.in);
       Alumno nuevoAlumno= new Alumno();
       System.out.println("Ingrese el número de carnet del nuevo alumno");
       nuevoAlumno.setCarnet(lector.nextInt());lector.nextLine();
       System.out.println("Ingrese el nombre del alumno");
       nuevoAlumno.setNombre(lector.nextLine());
       System.out.println("Ingrese el email del alumno");
       nuevoAlumno.setEmail(lector.nextLine());
       System.out.println("Ingrese la direccion del alumno");
       nuevoAlumno.setDireccion(lector.nextLine());
       System.out.println("Ingrese el telefono del alumno");
       nuevoAlumno.setTelefono(lector.nextInt());lector.nextLine();
       System.out.println("Ingrese la carrera del alumno");
       nuevoAlumno.setCarrera(lector.nextLine());
       System.out.println("Ingrese el centro del alumno");
       nuevoAlumno.setCentro(lector.nextLine());

       return nuevoAlumno;
   }
   static public Alumno alumnomodificado(Alumno alumnomodificar) throws SQLException{
       return alumnomodificar;
   }
    static public String busqueda(){
        Scanner lector = new Scanner(System.in);
        String busqueda;
        System.out.println("¿Que Modelo.Alumno esta buscando informacion?");
        busqueda = lector.nextLine();
        return busqueda;
    }


}
