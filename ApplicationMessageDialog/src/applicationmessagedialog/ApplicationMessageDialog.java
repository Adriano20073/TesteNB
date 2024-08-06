package applicationmessagedialog;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author adriano.faltobello
 */
public class ApplicationMessageDialog {
    public static void main(String[] args) {
        ImageIcon java = new ImageIcon("C:\\Users\\adriano.faltobello\\Downloads\\java.png");
        JOptionPane.showMessageDialog(null, "Bem-vindos!!", "SENAC", 0, java);
    }
    
}
