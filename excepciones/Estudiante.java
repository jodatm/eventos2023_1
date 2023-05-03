import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Estudiante {
    
    ArrayList <String> nombreAsignatura;
    ArrayList <Integer> creditosAsignatura;
    
    public Estudiante(){
        nombreAsignatura = new <String>ArrayList();
        creditosAsignatura = new <Integer>ArrayList();
    }

    public void ingresarAsignaturas(){
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa el nombre de la asignatura");
            String nombre = scanner.nextLine();
            int creditos = 0;
            while(true){
                System.out.println("Ingresa el numero de creditos de la asignatura");
                
                try{
                    Scanner scanner2 = new Scanner(System.in);
                    creditos = scanner2.nextInt();
                    /*creditos = 2 / creditos;*/
                    if (creditos <= 0 || creditos >= 8){
                        throw new UnivalleException("Numero de creditos no valido");
                    }
                    break;
                }
                catch(InputMismatchException e){
                    System.out.println("vea cabezon! son numeros como 1,2 3");
                }
                catch(ArithmeticException e){
                    System.out.println("Error aritmetico" + e.getMessage());
                }
                catch(UnivalleException e){
                    System.out.println(e.getMessage());
                }
                catch(Exception e){
                    System.out.println("Algo salio mal");
                }
                finally{
                    
                }
            }
            
            nombreAsignatura.add(nombre);
            creditosAsignatura.add(creditos);
            System.out.println("desea continuar?");
            String salir = scanner.next().toLowerCase();
            if (salir.equals("no")){
                break;
            }    
        }

    }

    public void prueba1 (int n) throws ArithmeticException{
        System.out.println(2/n);
    }

    public void prueba2 () throws IOException{
        System.out.println(":D");
    }

}
