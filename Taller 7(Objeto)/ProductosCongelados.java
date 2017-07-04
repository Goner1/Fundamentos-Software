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
public class ProductosCongelados extends Producto {

    int temp;

    public ProductosCongelados(String fechaEnvasado, int numeroLote, String fechaCaducidad, String paisOrigen, int temp) {
        super(fechaEnvasado, numeroLote, fechaCaducidad, paisOrigen);
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

}
