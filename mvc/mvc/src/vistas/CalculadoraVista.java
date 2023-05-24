package vistas;

import controlador.ControladorCalculadora;

public interface CalculadoraVista {
    public void iniciar(ControladorCalculadora controlador);
    public String getNumero1();
    public String getNumero2();
    public void setResultado(String resultado);
}
