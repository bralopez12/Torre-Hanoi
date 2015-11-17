package Interface;

//Importate alguito ché. ¿Quien te conoce papu?
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Juan Camilo
 */

public class Ventana extends JFrame implements ActionListener{
    //Declarar imagenes, botones, y todo lo zukhulemtó.
    ImageIcon torre = new ImageIcon(getClass().getResource("/Imagenes/torre-eiffel.jpg"));
    
    ImageIcon base = new ImageIcon(getClass().getResource("/Imagenes/Isis2.jpg"));
    JLabel etiqueta = new JLabel(base);
    JPanel Panel;
    JButton Torre, Base, Siguiente;
    
    public Ventana() throws HeadlessException 
    {
        //
        
        super("Torres de hanói - Versión conflicto");
        
        Container contenedor = getContentPane();
        Torre = new JButton(torre);
        Base = new JButton(base);
        Siguiente = new JButton("Siguiente");
        Panel = new JPanel();
        setContentPane(Panel);
        Panel.setLayout(null);
//        Panel.setBackground(Color.yellow);
        Panel.setLayout(null);
        
       //Configurando la posicion de los botones
        
        
        
        ImageIcon icon = new ImageIcon("/Imagenes/torre-eiffel.jpg");
        Image img = icon.getImage(); 
//        Image otraimg = img.getScaledInstance(10,10,java.awt.Image.SCALE_DEFAULT); //creamos una imagen nueva dándole las dimensiones que queramos a la antigua
//        ImageIcon otroicon = new ImageIcon(otraimg);
        Panel.add(Torre);
        Torre.setBounds(200,100,100, 400);
        Torre.setMargin(new Insets(0, 0, 0, 0));
        
        
//        Torre.setBounds(200, 50, 300, 600);
         
        
        //Elementos de la ventana.
        setSize(1200, 650); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
        
    public static void main(String[] args) {
        Ventana app = new Ventana();
        app.setResizable(false);
        app.setLocationRelativeTo(null); //RelativeTo es para centrarlo meu irmão, ¿cade as gostosas?
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
