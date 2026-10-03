

public class EtkinlikModel
{
    // instance variables - replace the example below with your own
    private int v_etkinlik_id;
    private String v_etkinlik_isim;
    private int v_etkinlik_tarihi;
    private Tarih trh1;
    
    public EtkinlikModel(int p_etkinlik_id,String p_etkinlik_isim,int p_etkinlik_tarihi)
    {
        // initialise instance variables
        v_etkinlik_id = p_etkinlik_id;
        v_etkinlik_isim = p_etkinlik_isim;
        v_etkinlik_tarihi = p_etkinlik_tarihi;
       
    }
    
    //getter methods
    public String getEtkinlikIsim(){
        return v_etkinlik_isim;
    }
    
    public int getEtkinlikID(){
        return v_etkinlik_id;
    }
        
    public int getEtkinlikTarihi(){
        return trh1.getTarih();
    }
    //setter methods
    public void setEtkinlikIsim(String p_etkinlik_isim){
         v_etkinlik_isim = p_etkinlik_isim ;
    }
    
    public void setEtkinlikID(int p_etkinlik_id){
         v_etkinlik_id = p_etkinlik_id;
    }
        
    public void setEtkinlikTarihi(){
         v_etkinlik_tarihi = trh1.getTarih();
    }
    
    
    
}