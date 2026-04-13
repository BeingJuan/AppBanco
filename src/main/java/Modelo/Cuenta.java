/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author JuanA
 */

public class Cuenta {   

    private String numero;
    private String nombreDueño;
    private int dia, mes, año;
    protected double saldo;

    public Cuenta(String numero, String nombreDueño, int dia, int mes, int año) {
        this.numero      = numero;
        this.nombreDueño = nombreDueño;
        this.dia         = dia;
        this.mes         = mes;
        this.año        = año;
        this.saldo       = 0;
    }

    public String getNumero()      { return numero; }
    public String getNombreDueno() { return nombreDueño; }
    public int getDia()            { return dia; }
    public int getMes()            { return mes; }
    public int getAño()           { return año; }
    public double getSaldo()       { return saldo; }

    public void setNumero(String numero)           { this.numero = numero; }
    public void setNombreDueño(String nombreDueno) { this.nombreDueño = nombreDueno; }
    public void setDia(int dia)                    { this.dia = dia; }
    public void setMes(int mes)                    { this.mes = mes; }
    public void setAño(int año)                  { this.año = año; }

    public void consignar(double valor) {
        saldo += valor;
    }


    public void retirar(double valor) {
        
    }


    public void retirar(double valor, String mensaje) {
        if (mensaje != null && !mensaje.isEmpty()) {
            if (valor > 0) {
                retirar(valor);
                System.out.println("Motivo: " + mensaje);
            }
        }
    }

    @Override
    public String toString() {
        return "Número: " + numero +
               " | Dueño: " + nombreDueño +
               " | Apertura: " + dia + "/" + mes + "/" + año +
               " | Saldo: $" + saldo;
    }
}