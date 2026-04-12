/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author JuanA
 */
public class CuentaC extends Cuenta {

    private double cupoSobregiro;

    public CuentaC(String numero, String nombreDueno,
                           int dia, int mes, int anio, double cupoSobregiro) {
        super(numero, nombreDueno, dia, mes, anio);
        this.cupoSobregiro = cupoSobregiro;
    }

    public double getCupoSobregiro()         { return cupoSobregiro; }
    public void setCupoSobregiro(double cupo) { this.cupoSobregiro = cupo; }
    @Override
    public void retirar(double valor) {
        if (valor <= saldo + cupoSobregiro) {
            saldo -= valor; 
        } else {
            System.out.println("Cupo de sobregiro agotado. No se puede retirar.");
        }
    }

    @Override
    public String toString() {
        return "[Corriente] " + super.toString() +
               " | Sobregiro disponible: $" + cupoSobregiro;
    }
}          