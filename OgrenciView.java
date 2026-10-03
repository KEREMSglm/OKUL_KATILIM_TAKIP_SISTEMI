

public class OgrenciView
{
    // instance variables - replace the example below with your own
    private OgrenciModel ogrM1;
    public OgrenciView()
    {
        
        
    }

    public void ogrenciEkle(int p_id,String p_isim,int p_tel){
        ogrM1 = new OgrenciModel(p_id,p_isim,p_tel);
    }
    
    public void ogrenciSil(int p_id,String p_isim,int tel){ 
    
    }    
    
}