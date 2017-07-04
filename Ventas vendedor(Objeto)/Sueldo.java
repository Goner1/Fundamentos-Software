/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventasvendedor;

/**
 *
 * @author omar
 */
public class Sueldo {

    public double ventas;
    public int horas;
    public int horasextra;

    public Sueldo(double ventas, int horas) {
        this.ventas = ventas;
        this.horas = horas;

    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getHorasextra() {
        return horasextra;
    }

    public void setHorasextra(int horasextra) {
        this.horasextra = horasextra;
    }

    public void money() {
        if (horas > 40) {
            horasextra = ((horas - 40) * 3000) + 80000;
        }
        if (horas <= 40) {
            horasextra = horas * 2000;

        }
    }

    public void moneyvent() {
        double sueldo = 0;
        if (ventas > 300000 && ventas < 500000) {
            ventas = ventas * 0.05;
        }
        if (ventas > 500000) {
            ventas = ventas * 0.1;
        }
        if (ventas <= 300000) {
            ventas = 0;
        }

        sueldo = horasextra + ventas;

        System.out.println("El sueldo semanal es:  " + sueldo);
        System.out.println("El sueldo mensual es:  " + (sueldo * 4));
    }
}
