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
public class ProdCongAgua extends ProductosCongelados {

    private String salanidadAgua;

    public ProdCongAgua(String fechaEnvasado, int numeroLote, String fechaCaducidad, String paisOrigen, int temp, String salanidadAgua) {
        super(fechaEnvasado, numeroLote, fechaCaducidad, paisOrigen, temp);
        this.salanidadAgua = salanidadAgua;
    }

    public String getSalanidadAgua() {
        return salanidadAgua;
    }

    public void setSalanidadAgua(String salanidadAgua) {
        this.salanidadAgua = salanidadAgua;
    }

    public void mostrar() {
        System.out.println("********************************");
        System.out.println("Pais origen: " + super.getPaisOrigen() + "\nNumero de lote: " + super.getNumeroLote() + "\nFecha envasado: "
                + super.getFechaEnvasado() + "\nFecha caducidad: " + super.getFechaCaducidad() + "\nTemperatura de mantenimiento: "
                + temp + "\nSalanidad del agua: " + salanidadAgua);

    }

}
