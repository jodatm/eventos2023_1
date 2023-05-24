package vistas;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import controlador.ControladorVeterinaria;
import logica.Gato;
import logica.Mascota;
import logica.Pais_Origen;
import logica.Perro;
import logica.Vacuna;

public class VistaVeterinariaTerminal implements VistaVeterinario {

    Mascota mascota;    

    public void insertarMascota() {
        String nombre,color,raza;
        byte numero_patas, años, cantidad_vacunas=0;
        int precio,opcion,opcion_animal;
        Pais_Origen pais_origen;
        nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre de su mascota");
        años = Byte.parseByte(JOptionPane.showInputDialog(null,"Ingrese el año de su mascota"));
        numero_patas = Byte.parseByte(JOptionPane.showInputDialog(null,"Ingrese el numero de piernas de su mascota"));
        color = JOptionPane.showInputDialog(null,"Ingrese el color de su mascota");
        precio = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor de su mascota"));
        raza = JOptionPane.showInputDialog(null,"Ingrese la raza de su mascota: ");
        opcion = 0;
        //Origen
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese que pais de origen es su animal\n1. Colombia\n2. España\n3. Alemania\n4. Inglaterra\n5. Ecuador\n6. Brasil \n7. Canada\n8. Noruega"));
        switch(opcion){
            //Colombia,España,USA,Alemania,Inglaterra,Ecuador,Brasil,Canada,Noruega
            case 1:pais_origen = Pais_Origen.Colombia;break;
            case 2:pais_origen = Pais_Origen.España;break;
            case 3:pais_origen = Pais_Origen.Alemania;break;
            case 4:pais_origen = Pais_Origen.Inglaterra;break;
            case 5:pais_origen = Pais_Origen.Ecuador;break;
            case 6:pais_origen = Pais_Origen.Brasil;break;
            case 7:pais_origen = Pais_Origen.Canada;break;
            case 8:pais_origen = Pais_Origen.Noruega;break;
            default:pais_origen =null;break;
        }
        //Puede ser una o pueden ser varias.
        //Por ahora solo van a ser una
        ArrayList<String> lista_vacunas = new ArrayList<String>();
            lista_vacunas.add("malota");
            lista_vacunas.add("rabia");
            lista_vacunas.add("mejorcito");
            lista_vacunas.add("alivio2000");
            int numero_vacuna;
            numero_vacuna = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese que vacuna desea inyectar \n 1. Malota\n 2. Rabia \n 3. Mejorcito \n 4. Alivio2000"));
            Vacuna vacuna = new Vacuna(lista_vacunas.get(numero_vacuna-1));
        opcion_animal = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese que mascota:\n1. Perro \n2. Gato"));
        if(opcion_animal == 1){        
            mascota = new Perro(nombre,numero_patas,años,cantidad_vacunas,precio,raza,pais_origen,color);
            mascota.insertarInyeccion(vacuna);
        }
        else if(opcion_animal == 2){
            mascota = new Gato(nombre,numero_patas,años,cantidad_vacunas,precio,raza,pais_origen,color);
            mascota.insertarInyeccion(vacuna);
        }
        
        
    }
    
    @Override
    public void iniciar(ControladorVeterinaria controlador) {
        System.out.println("------------");
        System.out.println("------------");
        System.out.println("- Bienvenido");
        System.out.println("------------");
        System.out.println("------------");
        boolean seguir = true;
        while(seguir){
            System.out.println("Selecciona la opción deseada: ");
            System.out.println("1 Insertar mascota");
            System.out.println("2 Eliminar mascota");
            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();
            switch(opcion){
                case 1:
                    insertarMascota();
                    controlador.setOperacion("insertar");
                    controlador.actionPerformed(null);
                    break;
                case 2:
                    scanner = new Scanner(System.in);
                    System.out.println("Inserta el nombre");
                    String nombre = scanner.nextLine();
                    controlador.setOperacion("eliminar");
                    controlador.setNombre(nombre);
                    controlador.actionPerformed(null);
                    break;
                default:
                    seguir = false;
                    break;
            }
            
        }

        
        
    }

    @Override
    public Mascota getMascota() {
        return mascota;    
    }

}
