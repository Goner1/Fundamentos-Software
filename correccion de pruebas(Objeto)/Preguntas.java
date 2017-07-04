/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

import java.util.Scanner;

/**
 *
 * @author rdt
 */
public class Preguntas {

    public int altern[];
    public int resp[];
    public int puntaje;
    public float nota;

    public Preguntas(int[] altern, int[] resp, int puntaje, float nota) {
        this.altern = altern;
        this.resp = resp;
        this.puntaje = puntaje;
        this.nota = nota;
        
    }

    public int[] getAltern() {
        return altern;
    }
    
    public int[] getResp() {
        return resp;
    }
    
    public int getPuntaje() {
        return puntaje;
    }
    
    public float getNota() {
        return nota;
    }

    public void setAltern(int[] altern) {
        this.altern = altern;
    }
    
    public void setResp(int[] resp) {
        this.resp = resp;
    }
    
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
    public void setNota(float nota) {
        this.nota = nota;
    }
    
 
    public void generar() {
        int i;

        //Se crea arreglo con alternativas
        for (i = 0; i < 10; i++) {
            altern[i] = (int) (Math.random() * 3) + 1;
        }
        //Se comprueba arreglo
        for (i = 0; i < 10; i++) {
            System.out.print(altern[i] + " ");
        }
        System.out.println("");
        
    }

    //Metodo respuestas ingresadas por usuario
    public void respustas() {
        int i=0;
        Scanner entrada = new Scanner(System.in);

        //Entrada de datos(respuestas)
        for (i = 0; i < 10; i++) {

            do {
                System.out.println("************");
                System.out.println("Pregunta Nº" + (i + 1));
                System.out.println("A.\nB.\nC.");
                resp[i] = entrada.nextInt();

                if ((resp[i] < 1) || (resp[i] > 3)) {
                    System.out.println("Alternativa incorrecta, debe ser A, B o C (1, 2 o 3)");
                }

                System.out.println();
            } while ((resp[i] < 1) || (resp[i] > 3));

            System.out.println();

            //Se calcula puntaje
            
                }

            
                for (i = 0; i < 10; i++) {

                    if (altern[i] == resp[i]) {
                        System.out.println("Pregunta Nº " + (i + 1) + " es correcta");

                        puntaje = puntaje + 10;

                    } else {
                        if (altern[i] != resp[i]) {
                            System.out.println("Pregunta Nº " + (i + 1) + " es incorrecta");
                        }
                    }
   
        }
    }
    

    public void calificacion() {

        System.out.println();
        System.out.println("El puntaje total es " + puntaje);

        if (puntaje >= 60) {
            nota = (int) (puntaje * 0.06) + 1;
        } else {
            if (puntaje < 60) {
                nota = (int) (puntaje * 0.05) + 1;
            }
        }

        System.out.println("Su nota es: " + nota);
    }

}
