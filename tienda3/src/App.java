import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

public class App extends JFrame implements ActionListener, ItemListener{

    Container contenedor;
    JLabel etiqueta1, etiqueta2;
    FlowLayout flowLayout;
    JTextField campo;
    JTextArea area;
    JScrollPane scroll;
    JPasswordField password;
    JButton boton, boton2;
    JCheckBox box1, box2;
    JComboBox <String> combo;
    JRadioButton radio1, radio2, radio3;
    ButtonGroup grupo;
    JList <String> listaColores;

    public App() {
        setTitle("Fundamento de eventos");
        contenedor = getContentPane();
        flowLayout = new FlowLayout();
        contenedor.setLayout(flowLayout);

        etiqueta1 = new JLabel("Notas del curso");
        contenedor.add(etiqueta1);

        etiqueta2 = new JLabel();
        etiqueta2.setIcon(new ImageIcon("boys.jpg"));
        contenedor.add(etiqueta2);

        campo = new JTextField(10);
        contenedor.add(campo);

        area = new JTextArea(10,5);
        scroll = new JScrollPane(area);
        contenedor.add(scroll);

        password = new JPasswordField(10);
        contenedor.add(password);

        boton = new JButton("Aceptar");
        boton.addActionListener(this);
        contenedor.add(boton);

        boton2 = new JButton("Borrar");
        boton2.addActionListener(this);
        contenedor.add(boton2);

        box1 = new JCheckBox("Casado");
        box1.addItemListener(this);
        contenedor.add(box1);

        box2 = new JCheckBox("Viudo");
        box2.addItemListener(this);
        contenedor.add(box2);

        grupo = new ButtonGroup();

        radio1 = new JRadioButton("Primero");
        radio1.addItemListener(this);
        grupo.add(radio1);
        contenedor.add(radio1);
        radio2 = new JRadioButton("Segundo");
        radio2.addItemListener(this);
        grupo.add(radio2);
        contenedor.add(radio2);
        radio3 = new JRadioButton("Tercero");
        radio3.addItemListener(this);
        grupo.add(radio3);
        contenedor.add(radio3);

        String lista [] = {"rojo","azul","blanco","violeta","negro"};

        combo = new JComboBox<>(lista);
        combo.addItemListener(this);
        contenedor.add(combo);
        
        listaColores = new JList(lista);
        
        contenedor.add(listaColores);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,300);
        setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        App app = new App();
        /*Astronauta <String, Double> pedro;
        pedro = new Astronauta <String, Double>("cuarenta", 58.7);
        System.out.println(pedro.getEdad());
        pedro.getNa*/

        

        //JOptionPane.showMessageDialog(contenedor, "Hola");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == boton){
            //String nombre = campo.getText();
            //JOptionPane.showMessageDialog(contenedor, nombre);
            /*if(box1.isSelected()){

            }*/
            JOptionPane.showMessageDialog(this, combo.getSelectedItem());
            
            List <String> colores  = listaColores.getSelectedValuesList();
            for(int i = 0; i < colores.size(); i++){
                System.out.println(colores.get(i));
            }

            if(radio1.isSelected()){
                radio2.setVisible(false);
                radio3.setVisible(false);
            }
        }
        else if(e.getSource() == boton2){
            if(radio1.isSelected()){
                radio2.setVisible(true);
                radio3.setVisible(true);
            }
        }
        
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub
        System.out.println("entra a item");
        if(e.getSource()==combo){
            if(e.getStateChange()==1){
                System.out.println("La opcion seleccionada es " + e.getItem());
            }
            
        }
        if(e.getSource()==box1){
            System.out.println(e.getStateChange());
            //JOptionPane.showMessageDialog(contenedor, "Modfique a casado" + e.getStateChange());
        }else{
            //JOptionPane.showMessageDialog(contenedor, "Modfique a viudo");
        
        }
        

    }



}
