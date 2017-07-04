/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller6;

/**
 *
 * @author omar
 */
public class Persona {
    private String nombre;
    private int sueldo;
    private Tarjeta tarjeta;
    private int contraseña;
    
    public Persona(String nombre, int sueldo, int contraseña){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.contraseña = contraseña;
        System.out.println(this.nombre);
        System.out.println("persona creadaaa...");
        this.tarjeta = new Tarjeta(this.nombre, 5, 10);
        this.tarjeta.mostrarTarjeta(tarjeta.getTarjeta());
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }
    public void setSueldo(int sueldo){
        this.sueldo = sueldo;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }
    

    public int getContraseña() {
        return contraseña;
    }
    public void setContraseña(int contraseña){
        this.contraseña = contraseña;
    }
     

    
}
