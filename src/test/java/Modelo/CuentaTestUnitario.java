/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author JuanA
 */

public class CuentaTestUnitario {
    @Test
    public void testSaldoInicial() {
        CuentaAhorros c = new CuentaAhorros("001", "Juan", 1, 1, 2024);
        assertEquals(0, c.getSaldo());
    }
    @Test
    public void testConsignar() {
        CuentaAhorros c = new CuentaAhorros("001", "Juan", 1, 1, 2024);
        c.consignar(100);
        assertEquals(100, c.getSaldo());
    }

   
    @Test
    public void testRetirarAhorros() {
        CuentaAhorros c = new CuentaAhorros("001", "Juan", 1, 1, 2024);
        c.consignar(200);
        c.retirar(80);
        assertEquals(120, c.getSaldo());
    }

    @Test
    public void testRetirarSinSaldoAhorros() {
        CuentaAhorros c = new CuentaAhorros("001", "Juan", 1, 1, 2024);
        c.retirar(50); 
        assertEquals(0, c.getSaldo());     }

        @Test
    public void testRetirarConSobregiro() {
        CuentaC c = new CuentaC("002", "Ana", 5, 3, 2023, 500);
        c.retirar(300); 
        assertEquals(-300, c.getSaldo());
    }

    
    @Test
    public void testRetirarSuperaSobregiro() {
        CuentaC c = new CuentaC("002", "Ana", 5, 3, 2023, 100);
        c.retirar(200); 
        assertEquals(0, c.getSaldo());
    }

    
    @Test
    public void testGetNumero() {
        CuentaAhorros c = new CuentaAhorros("999", "Luis", 10, 6, 2022);
        assertEquals("999", c.getNumero());
    }

    
    @Test
    public void testGetNombreDueno() {
        CuentaC c = new CuentaC("003", "María", 1, 1, 2024, 200);
        assertEquals("María", c.getNombreDueno());
    }
}
