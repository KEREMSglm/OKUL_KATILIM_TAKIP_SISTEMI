

public class Yonetici
{
    // instance variables 
    private OgrenciModel[] ogrM1;
    private int v_ogrenciSayisi;
    private EtkinlikModel[] etkM1;
    private int v_etkinlikSayisi;
    
    public Yonetici()
    {
        ogrM1 = new OgrenciModel[100];
        v_ogrenciSayisi = 0;
        etkM1 = new EtkinlikModel[100];
        v_etkinlikSayisi = 0;
    }
    
    public void ogrenciEkle(int p_id,String p_isim,int p_tel){
        if (v_ogrenciSayisi < ogrM1.length)
        {
            ogrM1[v_ogrenciSayisi] =
                new OgrenciModel(p_id, p_isim, p_tel);

            v_ogrenciSayisi++;

            System.out.println("Öğrenci eklendi.");
        }
        else
        {
            System.out.println("Öğrenci dizisi dolu.");
        }
        //ogrM1 = new OgrenciModel(p_id,p_isim,p_tel);
    }
    
    public void ogrenciSil(int p_id,String p_isim,int tel){ 
        
        
        
        v_ogrenciSayisi--;
        //ogrM1 = null;
    } 
    
    public void etkinlikEkle(int p_etkinlikId,String p_etkinlikiIsim,int p_etkinlikTarih){
        //etkM1 = new EtkinlikModel(p_etkinlikId,p_etkinlikiIsim,p_etkinlikTarih);
    }
    
    public void etkinlikSil(int p_id,String p_isim,int tel){ 
        //etkM1 = null;
    } 
    
    public void ogrenciEtkinlikEkle(int p_ogrenci_id,int p_etkinlik_id){
    
    }
    
    public void ogrenciEtkinlikSil(int p_ogrenci_id,int p_etkinlik_id){
     
    }
    
    public void getOgrenciEtkinlikList(){
    
    }
    
}
    
    
    
    
    
    