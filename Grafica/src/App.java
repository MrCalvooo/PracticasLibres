import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        MiMarco marco = new MiMarco();

        marco.setVisible(true); // Establecemos q sea visible
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Indicamos q se cierre la ventana automaticamente

        // Hacemos q se oculte la ventana al cerrarla pero el programa sigue
        // ejecutandose
        // marco.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    }
}
