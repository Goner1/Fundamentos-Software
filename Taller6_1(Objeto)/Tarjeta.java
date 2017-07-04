/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller6;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author omar
 */
public class Tarjeta {

    private int[][] tarjeta;
    private int alto = 4;
    private int ancho = 6;
    private String nombre;
    

    public Tarjeta(String nombre, int a, int b) {
        this.tarjeta = tarjeta;
        this.alto = a;
        this.ancho = b;
        int[] lista = crearLista();
        this.tarjeta = crearTarjeta(lista);

    }

  


    public int[][] getTarjeta() {
        return this.tarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTarjeta(int[][] tarjeta) {
        this.tarjeta = tarjeta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  

    public int[] crearLista() {
        Date semilla = new Date();
        Random rnum = new Random(semilla.getTime());
        int i = 0;
        int largo=this.ancho*this.alto;
        int[] lista = new int[largo];

        for (i = 0; i < lista.length; i++) {
            lista[i] = (int) (100+ rnum.nextInt(900));
        }
        return lista;
    }

    public int[] ordenarLista(int[] lista) {
        int j = 0, aux = 0;
        for (int i = 0; i < lista.length; i++) {
            for (j = i + 1; j < lista.length; j++) {
                if (lista[i] < lista[j]) {
                    aux = lista[i];
                    lista[i] = lista[j];
                    lista[j] = aux;
                }
            }
            System.out.println(lista[i]);
        }
        return lista;
    }
    public int[][] crearTarjeta(int[] lista){
        int[][] matriz = new int[this.alto][this.ancho];
        int cont=0;
        
        for (int i = 0; i < this.alto; i++) {
            for (int j = 0; j < this.ancho; j++) {
                matriz[i][j]=lista[cont];
                cont++;
            }
        }
        return matriz;
    }
    public void mostrarTarjeta(int[][] matriz){
        
        for (int i = 0; i < this.alto; i++) {
            for (int j = 0; j < this.ancho; j++) {
                System.out.print(" | "+matriz[i][j]+" | ");
            }
            System.out.println("");
        }
    }
    
    public int comparar(int[][] matriz, int x, int y){
        return matriz[x][y];
        
    }
  

}
