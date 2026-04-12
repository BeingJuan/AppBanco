/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author JuanA
 */
public class BancoVista {

    private JFrame frame;
    private JTextField campoNumero, campoNombre, campoDia, campoMes, campoAnio;
    private JTextField campoCupo, campoValor, campoMensaje;
    private JButton btnAgregarAhorros, btnAgregarCorriente;
    private JButton btnConsignar, btnRetirar, btnRetirarMensaje, btnMostrar;
    private JTextArea areaResultado;

    public BancoVista() {
        frame = new JFrame("Sistema Bancario");
        frame.setSize(560, 580);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        
        JPanel panelDatos = new JPanel(new GridLayout(6, 2, 5, 5));
        panelDatos.setBorder(BorderFactory.createTitledBorder("Datos de la cuenta"));

        campoNumero = new JTextField();
        campoNombre = new JTextField();
        campoDia    = new JTextField();
        campoMes    = new JTextField();
        campoAnio   = new JTextField();
        campoCupo   = new JTextField("0");

        panelDatos.add(new JLabel("Número:"));          panelDatos.add(campoNumero);
        panelDatos.add(new JLabel("Nombre dueño:"));    panelDatos.add(campoNombre);
        panelDatos.add(new JLabel("Día apertura:"));    panelDatos.add(campoDia);
        panelDatos.add(new JLabel("Mes apertura:"));    panelDatos.add(campoMes);
        panelDatos.add(new JLabel("Año apertura:"));    panelDatos.add(campoAnio);
        panelDatos.add(new JLabel("Cupo sobregiro:")); panelDatos.add(campoCupo);

        
        JPanel panelOps = new JPanel(new GridLayout(4, 3, 5, 5));
        panelOps.setBorder(BorderFactory.createTitledBorder("Operaciones"));

        campoValor    = new JTextField("0");
        campoMensaje  = new JTextField();
        btnAgregarAhorros   = new JButton("Crear Ahorros");
        btnAgregarCorriente = new JButton("Crear Corriente");
        btnConsignar        = new JButton("Consignar");
        btnRetirar          = new JButton("Retirar");
        btnRetirarMensaje   = new JButton("Retirar + motivo");
        btnMostrar          = new JButton("Mostrar cuentas");

        panelOps.add(btnAgregarAhorros);         panelOps.add(btnAgregarCorriente); panelOps.add(btnMostrar);
        panelOps.add(new JLabel("Valor ($):"));  panelOps.add(campoValor);          panelOps.add(new JLabel());
        panelOps.add(btnConsignar);              panelOps.add(btnRetirar);          panelOps.add(new JLabel());
        panelOps.add(new JLabel("Motivo:"));     panelOps.add(campoMensaje);        panelOps.add(btnRetirarMensaje);

        
        areaResultado = new JTextArea(8, 40);
        areaResultado.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaResultado);
        scroll.setBorder(BorderFactory.createTitledBorder("Resultados"));

        frame.add(panelDatos, BorderLayout.NORTH);
        frame.add(panelOps, BorderLayout.CENTER);
        frame.add(scroll, BorderLayout.SOUTH);
    }

    public void mostrar() { frame.setVisible(true); }

    public void mostrarResultado(String msg) { areaResultado.append(msg + "\n"); }

    public String getNumero()   { return campoNumero.getText(); }
    public String getNombre()   { return campoNombre.getText(); }
    public int getDia()         { return Integer.parseInt(campoDia.getText()); }
    public int getMes()         { return Integer.parseInt(campoMes.getText()); }
    public int getAnio()        { return Integer.parseInt(campoAnio.getText()); }
    public double getCupo()     { return Double.parseDouble(campoCupo.getText()); }
    public double getValor()    { return Double.parseDouble(campoValor.getText()); }
    public String getMensaje()  { return campoMensaje.getText(); }

    public JButton getBtnAgregarAhorros()   { return btnAgregarAhorros; }
    public JButton getBtnAgregarCorriente() { return btnAgregarCorriente; }
    public JButton getBtnConsignar()        { return btnConsignar; }
    public JButton getBtnRetirar()          { return btnRetirar; }
    public JButton getBtnRetirarMensaje()   { return btnRetirarMensaje; }
    public JButton getBtnMostrar()          { return btnMostrar; }
}