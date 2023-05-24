package vistas;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controlador.ControladorCalculadora;
import controlador.Operaciones;

public class CalculadoraGUI extends JFrame implements CalculadoraVista{

    Container contenedor;
    JTextField campoNumero1, campoNumero2, campoResultado;
    JLabel etiqueta1, etiqueta2, etiqueta3;
    JButton accion;
    

    public CalculadoraGUI() {
        contenedor = getContentPane();
        contenedor.setLayout(new GridLayout(3,2));
        campoNumero1 = new JTextField(10);
        campoNumero2 = new JTextField(10);
        campoResultado = new JTextField(10);
        campoResultado.setEditable(false);
        etiqueta1 = new JLabel("Numero 1");
        etiqueta2 = new JLabel("Numero 2");
        etiqueta3 = new JLabel("Resultado");
        accion = new JButton("Sumar");
        contenedor.add(etiqueta1);
        contenedor.add(campoNumero1);
        contenedor.add(etiqueta2);
        contenedor.add(campoNumero2);
        contenedor.add(accion);
        contenedor.add(campoResultado);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
    }

    @Override
    public void iniciar(ControladorCalculadora controlador) {
        controlador.setOperacion(Operaciones.SUMA);
        accion.addActionListener(controlador);
        setVisible(true);
    }

    @Override
    public String getNumero1() {
        return campoNumero1.getText();
    }

    @Override
    public String getNumero2() {
        return campoNumero2.getText();
    }

    @Override
    public void setResultado(String resultado) {
        campoResultado.setText(resultado);
    }
    
}
