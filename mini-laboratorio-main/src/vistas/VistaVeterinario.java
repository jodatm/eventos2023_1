package vistas;

import controlador.ControladorVeterinaria;
import logica.Mascota;

public interface VistaVeterinario {
    public void iniciar(ControladorVeterinaria controlador);
    public Mascota getMascota();
    public void insertarMascota();
}
