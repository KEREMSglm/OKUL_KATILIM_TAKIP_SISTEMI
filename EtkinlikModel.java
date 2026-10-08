
/**
 * Write a description of class EtkinlikModel here.
 *
 * @author (Kerem SAGLAM)
 * @version (V0.1)
 */
public class EtkinlikModel
{
    
    private int v_id;
    private String v_etkinlikName;
    private int v_tarih;
    
    public EtkinlikModel(int p_id,String p_etkinlikName,int p_tarih)
    {
      v_id = p_id;
      v_etkinlikName = p_etkinlikName;
      v_tarih = p_tarih;
    }
    //getter method
    public int getId(){
        return v_id;
    }
    
    public String getName(){
        return v_etkinlikName;
    }
    
    public int getTarih(){
        return v_tarih;
    }
    //setter method
    public void setId(int p_id){
        v_id = p_id;
    }
    
    public void setName(String p_etkinlikName){
        v_etkinlikName = p_etkinlikName;
    }
    
    public void setTarih(int p_tarih){
        v_tarih = p_tarih;
    }
    
    
    
}