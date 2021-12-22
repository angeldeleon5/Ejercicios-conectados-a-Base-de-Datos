package View;

import Modelo.SeleccionadorMenu;

public class Correr_Menus {

    static public SeleccionadorMenu correrMenuPrincipal(){
        SeleccionadorMenu correrMenu =new SeleccionadorMenu();
        Menus desplegarMenu= new Menus();
        do{
            Menus.menuPrincipal();
            switch (correrMenu.getSeleccionadorMenuprincipal()){
                case 1:{
                    System.out.println("=== Menu Profesor ===");
                    correrProfesor();
                    break;
                }
                case 2:{
                    System.out.println("===Alumno===");
                    correrAlumno();
                    break;
                }
                case 3:{
                    System.out.println("=== Administrativo ===");
                    correrAdministrativo();
                }
                case 4:{
                    System.out.println(" Centro y Departamento");
                    correrCentroDepartamento();
                    break;
                }
                default:{
                    System.out.println("Opcion Invalida");
                    break;
                }
            }
        }while(correrMenu.getSeleccionadorMenuprincipal()!= 5);

        return correrMenu;
    }
    static public SeleccionadorMenu correrProfesor(){
        SeleccionadorMenu correrProfesor = new SeleccionadorMenu();
        while (correrProfesor.getSeleccionadorMenuProfesor()!=6){
            switch (correrProfesor.getSeleccionadorMenuProfesor()){
                case 1:{
                    System.out.println("=== Agregar Profesor ===");
                    break;
                }
                case 2:{
                    System.out.println("===Actualizar profesor===");
                    break;
                }
                case 3:{
                    System.out.println("=== Eliminar Profesor ===");
                    break;
                }
                case 4:{
                    System.out.println("=== Buscar profesor por Nombre ===");
                    break;
                }
                case 5:{
                    System.out.println("=== Lista completa de proesores ===");
                    break;
                }
                default:{
                    System.out.println("Opción Incorrecta");
                    break;
                }
            }
        }
        return correrProfesor;
    }
    static public SeleccionadorMenu correrAlumno(){
        SeleccionadorMenu correrAlumno= new SeleccionadorMenu();
        while (correrAlumno.getSeleccionadorMenuAlumno()!=6){
            switch (correrAlumno.getSeleccionadorMenuAlumno()){
                case 1:{
                    System.out.println("===Agregar Alumno===");
                    break;
                }
                case 2:{
                    System.out.println("=== Actualizar Alumno===");
                    break;
                }
                case 3:{
                    System.out.println("Eliminar Alumno");
                break;
                }
                case 4:{
                    System.out.println("=== Buscar Alumno por Nombre ===");
                    break;
                }
                case 5:{
                    System.out.println("=== Lista completa de Alumnos===");
                }
                default:{
                    System.out.println("Invalido");
                }
            }
        }
        return  correrAlumno;
    }
    static public SeleccionadorMenu correrAdministrativo(){
        SeleccionadorMenu correrAdministrativo = new SeleccionadorMenu();
        while (correrAdministrativo.getSeleccionadorMenuAdministrativo()!=6);{
            switch (correrAdministrativo.getSeleccionadorMenuAdministrativo()){
                case 1:{
                    System.out.println("===Agregar Administrativo ===");
                    break;
                }
                case 2:{
                    System.out.println("=== Actualizar Administrativo===");
                    break;
                }
                case 3:{
                    System.out.println("===Eliminar Administrativo===");
                    break;
                }
                case 4:{
                    System.out.println("===Buscar administrativo por Nombre");
                    break;
                }
                case 5:{
                    System.out.println("Lista de administrativos");
                    break;
                }
                default: {
                    System.out.println("Opcion invalida");
                }
            }
        }
        return correrAdministrativo;
    }
    static public SeleccionadorMenu correrCentroDepartamento() {
        SeleccionadorMenu correrCentroDepartamento = new SeleccionadorMenu();
        while (correrCentroDepartamento.getSeleccionadorMenuCentroDepartamento() != 7) {
            switch (correrCentroDepartamento.getSeleccionadorMenuCentroDepartamento()) {
                case 1: {
                    System.out.println("===Agregar Centro===");
                    break;
                }
                case 2: {
                    System.out.println("=== Eliminar Centro");
                    break;
                }
                case 3: {
                    System.out.println("=== Agregar Departamento");
                    break;
                }
                case 4: {
                    System.out.println("Eliminar Departamento");
                    break;
                }
                case 5: {
                    System.out.println("Lista de Centros");
                    break;
                }
                case 6: {
                    System.out.println("Lista de Departamentos");
                    break;
                }
                default: {
                    System.out.println("Opcion no disponible");
                }
            }
        }
        return correrCentroDepartamento;
    }
}
