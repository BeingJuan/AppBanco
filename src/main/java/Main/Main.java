/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import Vista.BancoVista;
import Controlador.BancoControlador;
/**
 *
 * @author JuanA
 */
public class Main {
    public static void main(String[] args) {
        BancoVista vista          = new BancoVista();
        BancoControlador control  = new BancoControlador(vista);
        vista.mostrar();
    }
}