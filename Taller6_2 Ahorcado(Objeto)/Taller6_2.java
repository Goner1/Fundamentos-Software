/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller6_2;

import java.util.Scanner;
import static javax.management.Query.lt;

/**
 *
 * @author omar
 */
public class Taller6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] palabras = new String[]{};

        System.out.println("**********************************************Juego ahorcado**********************************************");
        System.out.println("Hola el juego ahorcado consiste en que usted deba adivinar la palabra con lo cual comenzara con 50 puntos,");
        System.out.println("se le restaran 10 puntos por letra erronea al llegar a 0 perdera la partida, buena suerte!!");
        System.out.println("**********************************************************************************************************");

        Juego ahorcado1 = new Juego();
        ahorcado1.ahorcado();

    }

}
