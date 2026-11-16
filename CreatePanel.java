import javax.swing.JPanel;
import javax.swing.BoxLayout;
/**
 * Write a description of class CreatePanel here.
 *
 * @author (Kerem SAGLAM)
 * @version (v0.1)
 */
public class CreatePanel 
{
    private JPanel v_panel; 
    private int v_dimx;
    private int v_dimy;
    private int v_posx;
    private int v_posy;
    
    public CreatePanel(int p_dimx,int p_dimy,int p_posx,int p_posy)
    {
        v_panel = new JPanel();
        v_panel.setLayout(new BoxLayout(v_panel, BoxLayout.Y_AXIS));
        v_dimx = p_dimx;
        v_dimy = p_dimy;
        v_posx = p_posx;
        v_posy = p_posy;
        v_panel.setSize(v_dimx,v_dimy);
        v_panel.setLocation(v_posx,v_posy);
    }
    
    public JPanel getPanel(){
        return v_panel;
    }
    
    public int getPosX(){
        return v_posx;
    }
    
    public int getPosY(){
        return v_posy;
    }
    
    public int getDimX(){
        return v_dimx;
    }
    
    public int getDimY(){
        return v_dimy;
    }
    
    public void setDimX(int p_dimx){
        v_dimx = p_dimx;
        v_panel.setSize(v_dimx,v_dimy);
    }
    
    public void setDimY(int p_dimy){
        v_dimy = p_dimy;
        v_panel.setSize(v_dimx,v_dimy);
    }

    public void setPosX(int p_posx){
        v_posx=p_posx;
        v_panel.setLocation(v_posx,v_posy);
    }
    
    public void setPosY(int p_posy){
        v_posy=p_posy;
        v_panel.setLocation(v_posx,v_posy);
    }
}