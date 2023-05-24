import controlador.ControladorCalculadora;
import modelo.Calculadora;
import vistas.CalculadoraConsola;
import vistas.CalculadoraGUI;
import vistas.CalculadoraVista;

public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora();
        CalculadoraVista vista = new CalculadoraGUI();
        ControladorCalculadora control = new ControladorCalculadora(calculadora, vista);
        control.inicializacion(); 
    }
}
