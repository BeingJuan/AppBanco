/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.*;
import Vista.BancoVista;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author JuanA
 */
public class BancoControlador {

    private List<Cuenta> lista;
    private BancoVista vista;

    public BancoControlador(BancoVista vista) {
        this.vista = vista;
        this.lista = new ArrayList<>();
        iniciar();
    }

    public void iniciar() {
        vista.getBtnAgregarAhorros().addActionListener(e -> {
            CuentaAhorros c = new CuentaAhorros(
                vista.getNumero(), vista.getNombre(),
                vista.getDia(), vista.getMes(), vista.getAnio()
            );
            lista.add(c);
            vista.mostrarResultado("Cuenta de ahorros creada: " + c.getNumero());
        });
        vista.getBtnAgregarCorriente().addActionListener(e -> {
            CuentaC c = new CuentaC(
                vista.getNumero(), vista.getNombre(),
                vista.getDia(), vista.getMes(), vista.getAnio(),
                vista.getCupo()
            );
            lista.add(c);
            vista.mostrarResultado("Cuenta corriente creada: " + c.getNumero());
        });
        
        vista.getBtnConsignar().addActionListener(e -> {
            if (!lista.isEmpty()) {
                Cuenta c = lista.get(lista.size() - 1);
                c.consignar(vista.getValor());
                vista.mostrarResultado("Consignación exitosa. Saldo: $" + c.getSaldo());
            } else {
                vista.mostrarResultado("No hay cuentas creadas.");
            }
        });
        vista.getBtnRetirar().addActionListener(e -> {
            if (!lista.isEmpty()) {
                Cuenta c = lista.get(lista.size() - 1);
                c.retirar(vista.getValor());
                vista.mostrarResultado("Retiro procesado. Saldo: $" + c.getSaldo());
            } else {
                vista.mostrarResultado("No hay cuentas creadas.");
            }
        });
        vista.getBtnRetirarMensaje().addActionListener(e -> {
            if (!lista.isEmpty()) {
                Cuenta c = lista.get(lista.size() - 1);
                c.retirar(vista.getValor(), vista.getMensaje());
                vista.mostrarResultado("Retiro con motivo procesado. Saldo: $" + c.getSaldo());
            } else {
                vista.mostrarResultado("No hay cuentas creadas.");
            }
        });
        vista.getBtnMostrar().addActionListener(e -> {
            vista.mostrarResultado("=== CUENTAS REGISTRADAS ===");
            for (Cuenta c : lista) {
                vista.mostrarResultado(c.toString());
            }
        });
    }
}
