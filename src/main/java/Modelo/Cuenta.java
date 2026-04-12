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
    private String nombreDueno;
    private int dia, mes, anio;
    protected double saldo;

    public Cuenta(String numero, String nombreDueno, int dia, int mes, int anio) {
        this.numero      = numero;
        this.nombreDueno = nombreDueno;
        this.dia         = dia;
        this.mes         = mes;
        this.anio        = anio;
        this.saldo       = 0;
    }

    public String getNumero()      { return numero; }
    public String getNombreDueno() { return nombreDueno; }
    public int getDia()            { return dia; }
    public int getMes()            { return mes; }
    public int getAnio()           { return anio; }
    public double getSaldo()       { return saldo; }

    public void setNumero(String numero)           { this.numero = numero; }
    public void setNombreDueno(String nombreDueno) { this.nombreDueno = nombreDueno; }
    public void setDia(int dia)                    { this.dia = dia; }
    public void setMes(int mes)                    { this.mes = mes; }
    public void setAnio(int anio)                  { this.anio = anio; }

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
               " | Dueño: " + nombreDueno +
               " | Apertura: " + dia + "/" + mes + "/" + anio +
               " | Saldo: $" + saldo;
    }
}