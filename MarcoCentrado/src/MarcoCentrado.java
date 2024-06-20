import javax.swing.JFrame;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

public class MarcoCentrado extends JFrame {

    public MarcoCentrado() {

        Toolkit miPantalla = Toolkit.getDefaultToolkit();

        Dimension tamanyoPantalla = miPantalla.getScreenSize(); // almacenamos la resolucion de la pantalla

        int alturaPantalla = tamanyoPantalla.height;
        int anchuraPantalla = tamanyoPantalla.width;

        setSize(anchuraPantalla / 2, alturaPantalla / 2);

        setLocation(anchuraPantalla / 4, alturaPantalla / 4); // centralizacion

        setTitle("Marco Centrado");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);

        Image miIcono = miPantalla.getImage("src/icono.jpg");

        setIconImage(miIcono);
    }
}
