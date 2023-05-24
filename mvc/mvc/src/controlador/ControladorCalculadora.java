package controlador;

import modelo.Calculadora;
import vistas.CalculadoraVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorCalculadora implements ActionListener{
    Calculadora calculadora;
    CalculadoraVista vista;
    Operaciones operacion;

    public Operaciones getOperacion() {
        return operacion;
    }
    public void setOperacion(Operaciones operacion) {
        this.operacion = operacion;
    }
    public ControladorCalculadora(Calculadora calculadora, CalculadoraVista vista) {
        this.calculadora = calculadora;
        this.vista = vista;
    }

    public void inicializacion(){
        vista.iniciar(this);
    }

    public void actionPerformed(ActionEvent e){
        calculadora.setNumero1(Integer.parseInt(vista.getNumero1()));
        calculadora.setNumero2(Integer.parseInt(vista.getNumero2()));
        switch(operacion){
            case SUMA:
                calculadora.sumar();
                break;
            case RESTA:
                calculadora.restar();
                break;
        }
        vista.setResultado(calculadora.getResultado()+""); 
    }

    
    
}
