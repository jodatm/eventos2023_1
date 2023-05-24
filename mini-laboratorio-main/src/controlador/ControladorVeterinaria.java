package controlador;

import logica.Mascota;
import vistas.VistaVeterinario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorVeterinaria implements ActionListener{
    
    VistaVeterinario vista;
    Mascota mascota;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    String operacion;
    String nombre;
    public ControladorVeterinaria(VistaVeterinario vista, Mascota mascota) {
        this.vista = vista;
        this.mascota = mascota;
    }

    public String getOperacion() {
        return operacion;
    }

    public void iniciar(){
        vista.iniciar(this);
    }



    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        switch(getOperacion()){
            case "insertar":
                Mascota nuevaMascota = vista.getMascota();
                mascota.insertarMascota(nuevaMascota);
                break;
            case "eliminar":
                mascota.eliminarMascota(getNombre());
        }
    }

    


}
