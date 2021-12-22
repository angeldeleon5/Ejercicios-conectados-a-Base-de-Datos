package Modelo;

public class Alumno {
    int carnet, telefono;
    String nombre, email, direccion, carrera, centro;

    public Alumno(int carnet, int telefono, String nombre, String email, String direccion, String carrera, String centro) {
        this.carnet = carnet;
        this.telefono = telefono;
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
        this.carrera = carrera;
        this.centro = centro;
    }

    public Alumno (){
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }
}
