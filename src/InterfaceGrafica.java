import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class InterfaceGrafica {
    public static final JFrame frame = new JFrame("Titulo da Janela");

    public abstract JPanel mostrar();

    public static void abrir(JPanel panel) {
        frame.add(panel);
        frame.setSize(500, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void changePanel(JPanel panel) {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(panel);
        frame.revalidate();
        frame.repaint();
    }
}