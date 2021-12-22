package View;
import Modelo.SeleccionadorMenu;

import java.util.Scanner;
public class Menus {
    static Scanner lector = new Scanner(System.in);

    static public SeleccionadorMenu menuPrincipal(){
        SeleccionadorMenu SeleccionMenuPrincipal = new SeleccionadorMenu();
        System.out.println("===== Universidad Angel de Leon====");
        System.out.println(" Ingrese el número que desea trabajar");
        System.out.println(" 1.- Profesor");
        System.out.println(" 2.- Alumno");
        System.out.println(" 3.- Administrativo");
        System.out.println(" 4.- Centro y Departamento");
        System.out.println(" 5.- Terminar");
        SeleccionMenuPrincipal.setSeleccionadorMenuprincipal(lector.nextInt()); lector.nextLine();
        return SeleccionMenuPrincipal;
    }
    static public SeleccionadorMenu menuProfesor(){
        SeleccionadorMenu SelccionadorProfesor = new SeleccionadorMenu();
        System.out.println("====== Profesores ======");
        System.out.println("1.- Agregar profesor");
        System.out.println("2.- Actualizar profesor");
        System.out.println("3.- Eliminar profesor");
        System.out.println("4.- Buscar profesor por nombre");
        System.out.println("5.- Desplegar lista completa de profesores");
        System.out.println("6.- Regresar");
        SelccionadorProfesor.setSeleccionadorMenuProfesor(lector.nextInt());lector.nextLine();
        return SelccionadorProfesor;
    }
    static public SeleccionadorMenu menuAlumno(){
        SeleccionadorMenu SeleciconadorAlumno = new SeleccionadorMenu();
        System.out.println("====== Alumnos ======");
        System.out.println("1.- Agregar alumno");
        System.out.println("2.- Actualizar alumno");
        System.out.println("3.- Eliminar alumno");
        System.out.println("4.- Buscar alumno por nombre");
        System.out.println("5.- Desplegar lista completa de alumnos");
        System.out.println("6.- Regresar");
        SeleciconadorAlumno.setSeleccionadorMenuAlumno(lector.nextInt());lector.nextLine();
        return SeleciconadorAlumno;
    }
    static public SeleccionadorMenu menuAdministrativo(){
        SeleccionadorMenu SeleccionadorAdministrativo= new SeleccionadorMenu();
        System.out.println("====== Administrativo ======");
        System.out.println("1.- Agregar administrativo");
        System.out.println("2.- Actualizar administrativo");
        System.out.println("3.- Eliminar administrativo");
        System.out.println("4.- Buscar administrativo por nombre");
        System.out.println("5.- Desplegar lista completa de administrativos");
        System.out.println("6.- Regresar");
        SeleccionadorAdministrativo.setSeleccionadorMenuAdministrativo(lector.nextInt());lector.nextLine();
        return SeleccionadorAdministrativo;
    }
    static public SeleccionadorMenu menuCentroDepartamento(){
        SeleccionadorMenu SeleccionadorCentroDepartamento = new SeleccionadorMenu();
        System.out.println("1.- Agregar centro");
        System.out.println("2.- Eliminar centro");
        System.out.println("3.- Agregar departamento");
        System.out.println("4.- Eliminar departamento");
        System.out.println("5.- Desplegar lista de centros");
        System.out.println("6.- Desplegar lista de departamentos");
        System.out.println("7.- Regresar");
        SeleccionadorCentroDepartamento.setSeleccionadorMenuCentroDepartamento(lector.nextInt());lector.nextLine();
        return SeleccionadorCentroDepartamento;
    }




}





