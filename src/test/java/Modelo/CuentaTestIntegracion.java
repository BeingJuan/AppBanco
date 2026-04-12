/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author JuanA
 */


public class CuentaTestIntegracion {

    
    @Test
    public void testConsignarYRetirar() {
        CuentaAhorros c = new CuentaAhorros("001", "Juan", 1, 1, 2024);
        c.consignar(500);
        c.retirar(200);
        assertEquals(300, c.getSaldo());
    }
    @Test
    public void testToStringAhorros() {
        CuentaAhorros c = new CuentaAhorros("001", "Juan", 1, 1, 2024);
        c.consignar(100);
        String resultado = c.toString();
        assertTrue(resultado.contains("Ahorros")); 
        assertTrue(resultado.contains("Juan"));    
        assertTrue(resultado.contains("100.0"));   
    }

    
    @Test
    public void testToStringCorriente() {
        CuentaC c = new CuentaC("002", "Ana", 5, 3, 2023, 500);
        String resultado = c.toString();
        assertTrue(resultado.contains("Corriente")); 
        assertTrue(resultado.contains("Ana"));       
        assertTrue(resultado.contains("500.0"));         
    }
    
    @Test
    public void testListaPolimorfismo() {
        List<Cuenta> lista = new ArrayList<>();
        lista.add(new CuentaAhorros("001", "Juan", 1, 1, 2024));
        lista.add(new CuentaC ("002", "Ana", 5, 3, 2023, 300));
        assertEquals(2, lista.size());
        for (Cuenta c : lista) {
            assertNotNull(c.toString());
        }
    }

    
    @Test
    public void testRetirarConMensajeIntegracion() {
        CuentaAhorros c = new CuentaAhorros("001", "Juan", 1, 1, 2024);
        c.consignar(300);
        c.retirar(100, "Pago de servicios"); 
        assertEquals(200, c.getSaldo()); 
    }
    @Test
    public void testMultiplesOperaciones() {
        CuentaC c = new CuentaC("003", "Luis", 1, 6, 2023, 200);
        c.consignar(400);
        c.retirar(100);
        c.consignar(50);
        c.retirar(500); 
        assertEquals(-150, c.getSaldo());
    }
}
