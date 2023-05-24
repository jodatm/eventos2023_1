package vistas;

import java.util.Scanner;

import controlador.ControladorCalculadora;
import controlador.Operaciones;

public class CalculadoraConsola implements CalculadoraVista{

    String numero1, numero2;
    ControladorCalculadora controlador;

    @Override
    public void iniciar(ControladorCalculadora controlador) {
        boolean continuar = true;
        this.controlador = controlador;
        while(continuar){
            System.out.println("----------------");
            System.out.println("----------------");
            System.out.println("-- Bienvenido --");
            System.out.println("----------------");
            System.out.println("Que deseas hacer?");
            System.out.println("sumar: +");
            System.out.println("restar: -");
            System.out.println("salir: .");
            Scanner scanner = new Scanner(System.in);
            String opcion = scanner.nextLine();
            switch(opcion){
                case "+":
                    controlador.setOperacion(Operaciones.SUMA);
                    break;
                case "-":
                controlador.setOperacion(Operaciones.RESTA);
                    break;
                case ".":
                    continuar = false;
                    continue;
            }
            System.out.println("Ingrese el numero 1");
            numero1 = scanner.nextLine();
            System.out.println("Ingrese el numero 2");
            numero2 = scanner.nextLine();
            controlador.actionPerformed(null);
            

        }
        
    }

    @Override
    public String getNumero1() {
        return numero1;
    }

    @Override
    public String getNumero2() {
        return numero2;
    }

    @Override
    public void setResultado(String resultado) {
        System.out.println("El resultado es :" + resultado);    
    }
    
}
