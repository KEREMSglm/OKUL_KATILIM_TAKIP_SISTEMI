import javax.swing.JButton;
import java.awt.event.ActionListener;
/**
 * Write a description of class ButtonModel here.
 *
 * @author (Kerem SAGLAM)
 * @version (v0.1)
 */
public class CreateButton extends JButton
{
    private int buttonID;
    private int button_height;
    private int button_width;
    private int pos_x;
    private int pos_y;
    private String word;
    

    public CreateButton(
    int p_buttonID,
    int p_button_height,
    int p_button_width,
    int p_pos_x,
    int p_pos_y,
    String p_word,
    ActionListener clickEvent)
    
    {
        super(p_word);
        buttonID = p_buttonID;
        button_height = p_button_height;
        button_width = p_button_width;
        pos_x = p_pos_x;
        pos_y = p_pos_y;  
        word = p_word;
        setSize(button_width,button_height);
        setLocation(pos_x,pos_y);
        addActionListener(clickEvent);
        
    }
    
    

}