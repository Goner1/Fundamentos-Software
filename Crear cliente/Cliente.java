/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import static main.Main.arreglo;

/**
 *
 * @author omar
 */
public class Cliente {
    private String Nombre;
    private String rut;
    private String telefono;
    private String email;

    public Cliente(String Nombre, String rut, String telefono, String email) {
        this.Nombre = Nombre;
        this.rut = rut;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
  public static void menu() {
        Scanner s = new Scanner(System.in);
        int opc = 0;

        System.out.println("Menu.");
        System.out.println("1.Crear nuevo usuario");
        System.out.println("2.Leer usuario");
        System.out.println("3.Actualizar Usuario");
        System.out.println("4.Eliminar ");
        opc = s.nextInt();

        switch (opc) {
            case 1:
                crear();
                break;
            case 2:
                leer();
                break;
            case 3:
                actualizar();
                break;
            case 4:
                eliminar();
                break;

        }
    }

    public static void crear() {
        Scanner s = new Scanner(System.in);
        String nombre;
        String rut;
        String telefono;
        String email;

        for (int i = 0; i < 10; i++) {
            if (arreglo[i] == null) {
                System.out.println("Ingrese su nombre: ");
                nombre = s.nextLine();
                System.out.println("Ingrese su RUT: ");
                rut = s.nextLine();
                System.out.println("Ingrese su telefono: ");
                telefono = s.nextLine();
                System.out.println("Ingrese su email: ");
                email = s.nextLine();

                arreglo[i] = new Cliente(nombre, rut, telefono, email);

                break;
            }

        }

    }

    public static void leer() {
        for (int i = 0; i < 10; i++) {
            if (arreglo[i] != null) {
                System.out.println("Nombre: " + arreglo[i].getNombre());
                System.out.println("Rut: " + arreglo[i].getRut());
                System.out.println("Telefono: " + arreglo[i].getTelefono());
                System.out.println("Email: " + arreglo[i].getEmail());
            }
        }
    }

    public static void actualizar() {
        Scanner s = new Scanner(System.in);
        String Nombre;
        String Rut;
        String Telefono;
        String email;

        System.out.println("Ingrese nombre a buscar: ");
        String busqueda = s.nextLine();

        int posicion;

        for (int i = 0; i < 10; i++) {
            if (arreglo[i] != null) {
                if (arreglo[i].getNombre().equals(busqueda)) {
                    posicion = i;
                    System.out.println("El nombre que busca esta en " + posicion);

                    System.out.println("Ingrese nuevo nombre");
                    Nombre = s.nextLine();
                    if (!Nombre.equals("")) {
                        System.out.println(Nombre);
                        arreglo[posicion].setNombre(Nombre);
                    }

                    System.out.println("Ingrese nuevo Rut");
                    Rut = s.nextLine();
                    if (!Rut.equals("")) {
                        System.out.println(Rut);
                        arreglo[posicion].setRut(Rut);
                    }

                    System.out.println("Ingrese nuevo telefono");
                    Telefono = s.nextLine();
                    if (!Telefono.equals("")) {
                        System.out.println(Telefono);
                        arreglo[posicion].setTelefono(Telefono);
                    }
                    System.out.println("Ingrese nuevo email");
                    email = s.nextLine();
                    if (!email.equals("")) {
                        System.out.println(email);
                        arreglo[posicion].setEmail(email);
                    }
                }
            }
        }

        // if(arreglo[i].getNombre().equals("nombre"){ ------
    }

    public static void eliminar() {
        Scanner s = new Scanner(System.in);
        int opc = 0;

        System.out.println("Que usuario desea eliminar: ");
        opc = s.nextInt();

        arreglo[opc] = null;

        System.out.println("Usuario " + opc + " eliminado");
    }

}
