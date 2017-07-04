/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller6_2;

import java.util.Scanner;

/**
 *
 * @author omar
 */
public class Juego {

    String palabras[] = {"hormiga", "corchete", "libreta", "jugador", "computador", "independencia", "temuco", "informatica", "escondite", "cazador"};

    public Juego() {
        this.palabras = palabras;
    }

    public String[] getPalabras() {
        return palabras;
    }

    public void setPalabras(String[] palabras) {
        this.palabras = palabras;
    }

    public void ahorcado() {
        Scanner s = new Scanner(System.in);
        int puntos = 50, cont = 0, aciertos = 0;
        int i, largo;
        String opcion;
        String palabra;

        char[] incognita;
        palabra = palabras[(int) (Math.random() * 10)];
        largo = palabra.length();
        incognita = new char[largo];

        for (i = 0; i < largo; i++) {
            incognita[i] = '_';
        }

        do {

            System.out.println("=======================");
            System.out.println("|     Puntos = " + puntos+"     |" );
            System.out.println("=======================");

            System.out.println("");
            for (i = 0; i < largo; i++) {

                System.out.print(" " + incognita[i] + " ");
            }
            System.out.println("");
            System.out.println("\nIngresa una letra para ir completando la palabra: ");
            opcion = s.next();
            if (palabra.contains(opcion)) {
                for (i = 0; i < largo; i++) {
                    if (palabra.charAt(i) == opcion.charAt(0)) {
                        incognita[i] = opcion.charAt(0);
                        cont++;
                    }

                }

            } else {
                puntos = puntos - 10;
            }
            aciertos = aciertos + cont;
            cont = 0;

            System.out.println("");
            for (i = 0; i < largo; i++) {

                System.out.print(" " + incognita[i] + " ");
            }
            System.out.println("");
            if (puntos == 0) {
                System.out.println("");
                for (i = 0; i < largo; i++) {
                    System.out.print("***");
                }
                System.out.println("");
                System.out.println("GAME OVER!!");
                System.exit(0);
            }

        } while (aciertos < largo);

        System.out.println("");
        for (i = 0; i < largo; i++) {
            System.out.print("***");
        }

        System.out.println("");
        System.out.println("Felicidades a ganado el juego!!");

    }
}
