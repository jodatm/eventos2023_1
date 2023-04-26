import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.concurrent.Flow;

public class App3 extends JFrame {

    Container contenedor;
    FlowLayout flowLayout;
    GridLayout gridLayout;
    BorderLayout borderLayout;
    ArrayList <JButton> lista;

    public App3() {
        contenedor = getContentPane();
        //flowLayout = new FlowLayout();
        //contenedor.setLayout(flowLayout);
        
        /*borderLayout = new BorderLayout(30,30);
        contenedor.setLayout(borderLayout);

        JButton button = new JButton("OK");
        contenedor.add(button, BorderLayout.NORTH);

        JButton button2 = new JButton("Cancelar");
        contenedor.add(button2, BorderLayout.SOUTH);

        JButton button3 = new JButton("Este");
        contenedor.add(button3, BorderLayout.EAST);

        JButton button4 = new JButton("Oeste");
        contenedor.add(button4, BorderLayout.WEST);

        JButton button5 = new JButton("CENTRO");
        contenedor.add(button5, BorderLayout.CENTER);
        */

        gridLayout = new GridLayout(2,2, 30, 30);
        contenedor.setLayout(gridLayout);

        JButton button = new JButton("OK");
        contenedor.add(button);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(3, 3));
        JLabel etiqueta1 = new JLabel("1");
        panel1.add(etiqueta1);
        JLabel etiqueta2 = new JLabel("2");
        panel1.add(etiqueta2);
        JLabel etiqueta3 = new JLabel("3");
        panel1.add(etiqueta3);
        JLabel etiqueta4 = new JLabel("4");
        panel1.add(etiqueta4);
        JLabel etiqueta5 = new JLabel("5");
        panel1.add(etiqueta5);
        JLabel etiqueta6 = new JLabel("6");
        panel1.add(etiqueta6);
        JLabel etiqueta7 = new JLabel("7");
        panel1.add(etiqueta7);
        JLabel etiqueta8 = new JLabel("8");
        panel1.add(etiqueta8);
        JLabel etiqueta9 = new JLabel("9");
        panel1.add(etiqueta9);
        contenedor.add(panel1);

        JButton button3 = new JButton("Este");
        contenedor.add(button3);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new BorderLayout());

        panel2.add(new JButton("1"), BorderLayout.NORTH);
        panel2.add(new JButton("2"), BorderLayout.EAST);
        panel2.add(new JButton("3"), BorderLayout.WEST);
        panel2.add(new JButton("4"), BorderLayout.SOUTH);
        
        JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout());
        JLabel titulo = new JLabel("Eventos");
        panel3.add(titulo);
        panel2.add(panel3, BorderLayout.CENTER);

        contenedor.add(panel2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        App3 app = new App3();
    }

}
