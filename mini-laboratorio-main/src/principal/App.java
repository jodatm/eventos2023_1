package principal;

import controlador.ControladorVeterinaria;
import logica.Mascota;
import vistas.VistaVeterinariaTerminal;

public class App {
    
    public static void main(String[] args) {
        VistaVeterinariaTerminal vista = new VistaVeterinariaTerminal();
        Mascota mascota = new Mascota();
        ControladorVeterinaria controlador = new ControladorVeterinaria(vista, mascota);
        controlador.iniciar();
    }

}
