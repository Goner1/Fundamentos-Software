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
public class ProdCongNitrogeno extends ProductosCongelados {

    private String timeExpoNitrogeno;

    public ProdCongNitrogeno(String fechaEnvasado, int numeroLote, String fechaCaducidad, String paisOrigen, int temp, String timeExpoNitrogeno) {
        super(fechaEnvasado, numeroLote, fechaCaducidad, paisOrigen, temp);
        this.timeExpoNitrogeno = timeExpoNitrogeno;
    }

    public String getTimeExpoNitrogeno() {
        return timeExpoNitrogeno;
    }

    public void setTimeExpoNitrogeno(String timeExpoNitrogeno) {
        this.timeExpoNitrogeno = timeExpoNitrogeno;
    }

    public void mostrar() {
        System.out.println("*************************************");
        System.out.println("Pais origen: " + super.getPaisOrigen() + "\nNumero de lote: " + super.getNumeroLote() + "\nFecha envasado: "
                + super.getFechaEnvasado() + "\nFecha caducidad: " + super.getFechaCaducidad() + "\nTemperatura de mantenimiento: "
                + temp + "\nTiempo exposicion al nitrogeno: " + timeExpoNitrogeno);

    }

}
