/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventasvendedor;

import java.util.Scanner;

/**
 *
 * @author omar
 */
public class Ventasvendedor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int horas = 0;
        double ventas = 0;

        System.out.println("Ingrese la cantidad de horas trajadas durante la semana ");
        horas = s.nextInt();
        System.out.println("Ingrese las ventas registradas durante la semana");
        ventas = s.nextDouble();

        Sueldo diner = new Sueldo(ventas, horas);
        diner.money();
        diner.moneyvent();
    }

}
