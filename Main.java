import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main
{
    public static void main(String[] args)
    {
        JFrame pencere = new JFrame("Okul Katilim Sistemi");

        JLabel yazi = new JLabel("Sisteme hos geldiniz!");
        pencere.add(yazi);

        pencere.setSize(500, 300);
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pencere.setLocationRelativeTo(null);
        pencere.setVisible(true);   
    }
}