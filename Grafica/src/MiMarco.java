import java.awt.Frame;

import javax.swing.JFrame;

public class MiMarco extends JFrame {

    public MiMarco() {
        // setSize(500, 300); // Indicamos anchura y altura

        // setLocation(500, 300); // Indicar coordenadas donde aparecera el marco

        setBounds(500, 300, 550, 250); // metodo que requiere parametros de coordenadas x, y y altura y anchura

        // setResizable(false); //true: permite aumentar disminuir tamaño; false: no

        // permite alterar el tamaño

        // setExtendedState(Frame.MAXIMIZED_BOTH); // Pantalla completa

        setTitle("Mi primer programa grafico");
    }

}
