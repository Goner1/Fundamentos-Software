/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

/**
 *
 * @author rdt
 */
public class Prueba1 {

    public static void main(String[] args) {
        
    int[] altern = new int[10];
    int[] resp = new int[10];
    int puntaje = 0;
    float nota = 0;

    Preguntas classA = new Preguntas(altern, resp, puntaje, nota);

    classA.generar ();

    classA.respustas ();

    classA.calificacion ();

}

}