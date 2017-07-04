/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller7;

/**
 *
 * @author omar
 */
public class Taller7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Producto ProductoFresco1 = new Producto("2017-06-30", 56789, "2018-06-30", "Portugal");
        Producto ProductoFresco2 = new Producto("2017-06-30", 56790, "2018-06-30", "Chile");
        ProductosRefrigerados ProductoRefrigerado1 = new ProductosRefrigerados("2017-06-30", 88561, "2018-06-30", "Chile", 2, 89765);
        ProductosRefrigerados ProductoRefrigerado2 = new ProductosRefrigerados("2017-06-30", 88562, "2018-06-30", "Alemania", -5, 89766);
        ProductosRefrigerados ProductoRefrigerado3 = new ProductosRefrigerados("2017-06-30", 88563, "2018-06-30", "Portugal", 5, 89767);
        ProdCongAire ProductoCongeladoAire1 = new ProdCongAire("2017-06-30", 40551, "2018-06-30", "Dinamarca", -8, 5, 30, 20);
        ProdCongAire ProductoCongeladoAire2 = new ProdCongAire("2017-06-30", 40551, "2018-06-30", "Mexico", -6, 2, 25, 10);
        ProdCongAgua ProductoCongeladoAgua1 = new ProdCongAgua("2017-06-30", 68221, "2018-06-30", "Argentina", -6, "4 g/l");
        ProdCongAgua ProductoCongeladoAgua2 = new ProdCongAgua("2017-06-30", 68222, "2018-06-30", "Brasil", -6, "5 g/l");
        ProdCongNitrogeno ProductoCongeladoNitrogeno1 = new ProdCongNitrogeno("2017-06-30", 68222, "2018-06-30", "Francia", -5, "60 segundos.");

        System.out.println("\nProducto Fresco N°1: ");
        ProductoFresco1.mostrar();
        System.out.println("\nProducto Fresco N°2:");
        ProductoFresco2.mostrar();
        System.out.println("\nProducto refrigerado N°1: ");
        ProductoRefrigerado1.mostrar();
        System.out.println("\nProducto refrigerado N°2: ");
        ProductoRefrigerado2.mostrar();
        System.out.println("\nProducto refrigerado N°3: ");
        ProductoRefrigerado3.mostrar();
        System.out.println("\nProducto congelado por aire N°1: ");
        ProductoCongeladoAire1.mostrar();
        System.out.println("\nProducto congelado por aire N°2: ");
        ProductoCongeladoAire1.mostrar();
        System.out.println("\nProducto congelado por Agua N°1: ");
        ProductoCongeladoAgua1.mostrar();
        System.out.println("\nProducto congelado por Agua N°2: ");
        ProductoCongeladoAgua1.mostrar();
        System.out.println("\nProducto congelado por Nitrogeno N°1: ");
        ProductoCongeladoNitrogeno1.mostrar();

    }

}
