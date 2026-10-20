import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JScrollPane;
/**
 * Write a description of class CreateListBox here.
 *
 * @author (Kerem SAGLAM)
 * @version (v0.1)
 */
public class CreateListBox extends JList<String> {
    private int listboxID;
    private int width;
    private int height;
    private int pos_x;
    private int pos_y;
    
    public CreateListBox(
    int p_listboxID,
    int p_width,
    int p_height,
    int p_pos_x,
    int p_pos_y,
    String[] items) {
        
        
        super(items);
        listboxID = p_listboxID;
        width = p_width;
        height = p_height;
        pos_x = p_pos_x;
        pos_y = p_pos_y;
        setSize(width,height);
        setLocation(pos_x,pos_y);
        
    }
}