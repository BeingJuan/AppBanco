/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author JuanA
 */
public class CuentaAhorros extends Cuenta {

    public CuentaAhorros(String numero, String nombreDueno, int dia, int mes, int anio) {
        super(numero, nombreDueno, dia, mes, anio);
    }

    
    @Override
    public void retirar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente. Saldo actual: $" + saldo);
        }
    }

    @Override
    public String toString() {
        return "[Ahorros] " + super.toString();
    }
}
