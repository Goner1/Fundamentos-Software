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
public class ProductosRefrigerados extends Producto {

    private int temp;
    private int codigo;

    public ProductosRefrigerados(String fechaEnvasado, int numeroLote, String fechaCaducidad, String paisOrigen, int temp, int codigo) {
        super(fechaEnvasado, numeroLote, fechaCaducidad, paisOrigen);
        this.temp = temp;
        this.codigo = codigo;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void mostrar() {
        System.out.println("*************************");
        System.out.println("Pais origen: " + super.getPaisOrigen() + "\nNumero de lote: " + super.getNumeroLote()
                + "\nFecha envasado: " + super.getFechaEnvasado() + "\nFecha caducidad: " + super.getFechaCaducidad()
                + "\nCodigo organismo de supervision: " + codigo + "\nTemperatura de mantenimiento: " + temp);

    }

}
