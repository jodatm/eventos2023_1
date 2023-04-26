import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Container;

public class App2 extends JFrame implements MouseListener, KeyListener{

    Container contenedor;
    int x1 = -1;
    int x2 = -1;
    int y1 = -1;
    int y2 = -1;
    String letraSeleccionada = "";

    public App2(){
        contenedor = getContentPane();
        addMouseListener(this);
        addKeyListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
    }

    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawLine(50, 50, 100, 100);
        g.setColor(Color.blue);
        g.drawRect(250, 250, 100, 75);
        g.setColor(Color.black);
        g.drawOval(150,75,75,50);
        g.setColor(Color.green);
        g.fillRect(350, 350, 75, 75);
        g.fillOval(25, 25, 50, 50);
        g.setColor(new Color(255,100,50));
        g.drawString("hola",175,175);
        if(x1 != -1 && x2 != -1  && y1 != -1 && y2 != -1){
            g.setColor(Color.red);
            if(letraSeleccionada=="l"){
                g.drawLine(x1, y1, x2, y2);
            }else if(letraSeleccionada=="c"){
                if(x2 > x1 && y2 > y1){
                    int ancho = x2 - x1;
                    int alto = y2 - y1;
                    g.fillRect(x1, y1, ancho, alto);
                }else if(x2 > x1 && y1 > y2){

                    int ancho = x2 - x1;
                    int alto = y1 - y2;
                    g.fillRect(x1, y2, ancho, alto);
                }else if(x1 > x2 && y1 > y2){

                    int ancho = x1 - x2;
                    int alto = y1 - y2;
                    g.fillRect(x2, y2, ancho, alto);
                }else if(x1 > x2 && y2 > y1){

                    int ancho = x1 - x2;
                    int alto = y2 - y1;
                    g.fillRect(x2, y1, ancho, alto);
                }
            }
            
            x1 = y1 = x2 = y2 = -1;
        }
    }   

    public static void main(String[] args) {
        App2 app = new App2();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println();
        System.out.println(x1 + "," + y1);
        if(x1 == -1 || y1 == -1){
            x1 = e.getX();
            y1 = e.getY();
            System.out.println(x1 + y1);
        }else{
            x2 = e.getX();
            y2 = e.getY();
            repaint();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //contenedor.setBackground(Color.red);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //contenedor.setBackground(Color.blue);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyChar()=='l'){
            letraSeleccionada = "l";
        }else if(e.getKeyChar()=='c'){
            letraSeleccionada = "c";
        }
        JOptionPane.showMessageDialog(null, letraSeleccionada);
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

}
