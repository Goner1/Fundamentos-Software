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
public class Producto {

    private String fechaEnvasado;
    private int numeroLote;
    private String fechaCaducidad;
    private String paisOrigen;

    public Producto(String fechaEnvasado, int numeroLote, String fechaCaducidad, String paisOrigen) {
        this.fechaEnvasado = fechaEnvasado;
        this.numeroLote = numeroLote;
        this.fechaCaducidad = fechaCaducidad;
        this.paisOrigen = paisOrigen;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public void mostrar() {
        System.out.println("********************");
        System.out.println("Pais origen: " + paisOrigen + "\nNumero de lote: " + numeroLote + "\nFecha envasado: "
                + fechaEnvasado + "\nFecha caducidad: " + fechaCaducidad);

    }

}
