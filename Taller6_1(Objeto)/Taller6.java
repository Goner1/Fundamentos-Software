/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller6;

import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.Scanner;

/**
 *
 * @author omar
 */
public class Taller6 {

    /**
     * @param args the command line arguments
     */
    public static int cord1 = 0;
    public static int cord2 = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int contra = 0;

        Persona Sara = new Persona("Sara", 28000, 3485);
        Persona Joel = new Persona("Joel", 310000, 9175);
        Persona Carolina = new Persona("Carolina", 780000, 1917);

        do {
            System.out.println("Ingrese la contraseña señora " + Sara.getNombre());
            contra = contraseña();
            if (Sara.getContraseña() != contra) {
                System.out.println("Su contraseña es incorreccta!");
            }
        } while (Sara.getContraseña() != contra);
        System.out.println("************************************************");

        do {
            System.out.println("Ingrese la contraseña señora " + Joel.getNombre());
            contra = contraseña();
            if (Joel.getContraseña() != contra) {
                System.out.println("Su contraseña es incorreccta!");
            }
        } while (Joel.getContraseña() != contra);

      
    }

    static int entero() {
        Scanner s = new Scanner(System.in);
        int i = 0;

        try {
            return s.nextInt();
        } catch (Exception e) {
            System.out.println("Ingrese un numero enter valido");
            return -1;
        }
    }

    public static int contraseña() {
        Scanner s = new Scanner(System.in);
        int i = 0;

        try {
            i = s.nextInt();

        } catch (Exception e) {
            System.out.println("Ingrese una contraseña de 4 digitos valido: ");
            i = 0;
        }
        if (i <= 999 || i >= 10000) {
            System.out.println("Ingrese una contraseña de 4 digitos valida!");
        }
        return i;

    }

    public static void cordenadas(int coord) {
        Scanner s = new Scanner(System.in);
        int resp;

        do {
            resp = s.nextInt();
            if(coord != resp){
                System.out.println("Correcta");
            }else{
                System.out.println("Coordenada incorrecta");
            }

        } while (coord != resp);
    }

    public static void cord1() {

        cord1 = (int) (Math.random() * (4) + 1);

    }

    public static void cord2() {

        cord2 = (int) (Math.random() * (9) + 1);
    }
}
