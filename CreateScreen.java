import javax.swing.JFrame;
/**
 * Write a des1cription of class ScreenModel here.
 *
 * @author (Kerem SAGLAM)
 * @version (v0.1)
 */
public class CreateScreen
{
    private JFrame v_frame;
    private int v_posx;
    private int v_posy;
    private int v_dimx;
    private int v_dimy;

    public CreateScreen(int p_dimx,int p_dimy,int p_posx,int p_posy)
    {
        v_frame = new JFrame("Etkinlik Ekranı");
        v_posx = p_posx;
        v_dimx = p_dimx;
        v_dimy = p_dimy;
        v_posy = p_posy;
        v_frame.setBounds(v_posx,v_posy,v_dimy,v_dimx);
        v_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        v_frame.setLayout(null);
        
        // Pencereyi ekranın ortasına yerleştirir.
        v_frame.setLocationRelativeTo(null);

        // Pencereyi görünür yapar.
        v_frame.setVisible(true);
    }
    
    public JFrame getScreen(){
        return v_frame;
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
        v_frame.setSize(v_dimx,v_dimy);
    }
    
    public void setDimY(int p_dimy){
        v_dimy = p_dimy;
        v_frame.setSize(v_dimx,v_dimy);
    }

    public void setPosX(int p_posx){
        v_posx=p_posx;
        v_frame.setLocation(v_posx,v_posy);
    }
    
    public void setPosY(int p_posy){
        v_posy=p_posy;
        v_frame.setLocation(v_posx,v_posy);
    }
    
    
    
}