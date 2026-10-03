
/**
 * Write a description of class User here.
 *
 * @author (Kerem)
 * @version (v0.1)
 */
public class OgrenciModel
{
    // instance variables 
    private int v_id;
    private String v_isim;
    private int v_tel;
    private EtkinlikView etkV1;
    
    public OgrenciModel(int p_id, String p_isim, int p_tel)
    {
        // initialise instance variables
        v_id = p_id;
        v_isim = p_isim;
        v_tel = p_tel;
    }
    
    public int getId(){
        return v_id;
    }
    
    public String getIsim(){
        return v_isim;
    }
    
    public int getTel(){
        return v_tel;
    }
    
    

    
}