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
public class ProdCongAire extends ProductosCongelados {

    private int porcOxigeno;
    private int porcN;
    private int porcVaporAgua;

    public ProdCongAire(String fechaEnvasado, int numeroLote, String fechaCaducidad, String paisOrigen, int temp, int porcOxigeno, int porcN, int porcVaporAgua) {
        super(fechaEnvasado, numeroLote, fechaCaducidad, paisOrigen, temp);
        this.porcOxigeno = porcOxigeno;
        this.porcN = porcN;
        this.porcVaporAgua = porcVaporAgua;

    }

    public int getPorcOxigeno() {
        return porcOxigeno;
    }

    public void setPorcOxigeno(int porcOxigeno) {
        this.porcOxigeno = porcOxigeno;
    }

    public int getPorcN() {
        return porcN;
    }

    public void setPorcN(int porcN) {
        this.porcN = porcN;
    }

    public int getPorcVaporAgua() {
        return porcVaporAgua;
    }

    public void setPorcVaporAgua(int porcVaporAgua) {
        this.porcVaporAgua = porcVaporAgua;
    }

    public void mostrar() {
        System.out.println("********************************");
        System.out.println("Pais origen: " + super.getPaisOrigen() + "\nNumero de lote: " + super.getNumeroLote() + "\nFecha envasado: "
                + super.getFechaEnvasado() + "\nFecha caducidad: " + super.getFechaCaducidad() + "\nTemperatura de mantenimiento: "
                + temp + "\nPorcentaje de Oxigeno: " + porcOxigeno + "\nPorcentaje de Nitrogeno: " + porcN + "\nPorcentaje de vapor de agua: " + porcVaporAgua);

    }
}
