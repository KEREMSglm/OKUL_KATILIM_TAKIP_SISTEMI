import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
/**
 * Write a description of class UserView here.
 *
 * @author (Kerem SAGLAM)
 * @version (V0.1)
 */
public class CreateTextBox
{
    private JTextField v_textBox;
    private int v_id;
    private int v_dimx;
    private int v_dimy;
    private int v_posx;
    private int v_posy;
    private String v_text;

    public CreateTextBox(
        int p_id,
        boolean type,
        int p_dimy,
        int p_dimx,
        int p_posy,
        int p_posx,
        String p_text,
        String p_write
    )
    {
        v_dimx = p_dimx;
        v_dimy = p_dimy;
        v_posx = p_posx;
        v_posy = p_posy;
        v_text = p_text;
        v_id = p_id;

        if (type == false) {
            v_textBox = new JTextField(p_write);
        }
        else {
            v_textBox = new JPasswordField(p_write);
        }
        
        if (type == false) {
            v_textBox = new JTextField(p_write) {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
        
                    if (getDocument().getLength() == 0) {
                        g.setColor(Color.GRAY);
                        g.drawString(p_text, 5, getHeight() / 2 + 5);
                    }
                }
            };
        }
        else {
            v_textBox = new JPasswordField(p_write) {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
        
                    if (getDocument().getLength() == 0) {
                        g.setColor(Color.GRAY);
                        g.drawString(p_text, 5, getHeight() / 2 + 5);
                    }
                }
            };
        }
        
        Dimension textBoxSize =
            new Dimension(v_dimx, v_dimy);

        v_textBox.setMinimumSize(textBoxSize);
        v_textBox.setPreferredSize(textBoxSize);
        v_textBox.setMaximumSize(textBoxSize);

        v_textBox.setAlignmentX(0.5f);
    }

    public JTextField getTextBox() {
        return v_textBox;
    }

    public String getValue() {
        return v_textBox.getText();
    }

    public void setValue(String p_value) {
        v_textBox.setText(p_value);
    }
}
