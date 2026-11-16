import javax.swing.JFrame;
/**
 * Write a description of class UserView here.
 *
 * @author (Kerem SAGLAM)
 * @version (V0.1)
 */
public class CreateScreen extends JFrame
{
    private int v_posx;
    private int v_posy;
    private int v_dimx;
    private int v_dimy;

    public CreateScreen(int p_dimx, int p_dimy,int p_posx, int p_posy,String screen_name)
    {
        super(screen_name);

        v_posx = p_posx;
        v_posy = p_posy;
        v_dimx = p_dimx;
        v_dimy = p_dimy;

        setBounds(v_posx, v_posy, v_dimx, v_dimy);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public JFrame getScreen(){
        return this;
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
        setSize(v_dimx, v_dimy);
    }

    public void setDimY(int p_dimy){
        v_dimy = p_dimy;
        setSize(v_dimx, v_dimy);
    }

    public void setPosX(int p_posx){
        v_posx = p_posx;
        setLocation(v_posx, v_posy);
    }

    public void setPosY(int p_posy){
        v_posy = p_posy;
        setLocation(v_posx, v_posy);
    }
    
    public void closeScreen() {
        dispose();
    }
}
