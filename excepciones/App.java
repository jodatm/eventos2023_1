import java.io.IOException;

public class App{

    public static void main(String[] args) {
        App app = new App();
        Estudiante estudiante = new Estudiante();
        estudiante.ingresarAsignaturas();
        estudiante.prueba1(2);
        try {
            estudiante.prueba2();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}