

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
            ogrM1[v_ogrenciSayisi] = new OgrenciModel(p_id, p_isim, p_tel);

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
        for (int i = 0; i < v_ogrenciSayisi; i++)
        {
            if (ogrM1[i].getId() == p_id)
            {
                // Sonraki öğrencileri bir basamak sola kaydırır.
                for (int j = i; j < v_ogrenciSayisi - 1; j++)
                {
                    ogrM1[j] = ogrM1[j + 1];
                }
    
                ogrM1[v_ogrenciSayisi - 1] = null;
                v_ogrenciSayisi--;
    
                System.out.println("Öğrenci silindi.");
                return;
            }
        }
        System.out.println("Öğrenci bulunamadı.");
    } 
    
    public void etkinlikEkle(int p_etkinlikId,String p_etkinlikIsim,int p_etkinlikTarih){
        if (v_etkinlikSayisi < etkM1.length)
        {
            etkM1[v_etkinlikSayisi] = new EtkinlikModel(p_etkinlikId,p_etkinlikIsim,p_etkinlikTarih);
    
            v_etkinlikSayisi++;
    
            System.out.println("Etkinlik eklendi.");
        }
        else
        {
            System.out.println("Etkinlik dizisi dolu.");
        }
        //etkM1 = new EtkinlikModel(p_etkinlikId,p_etkinlikiIsim,p_etkinlikTarih);
    }
    
    public void etkinlikSil(int p_etkinlikId)
    {
        for (int i = 0; i < v_etkinlikSayisi; i++)
        {
            if (etkM1[i].getEtkinlikID() == p_etkinlikId)
            {
                // Sonraki etkinlikleri bir basamak sola kaydırır.
                for (int j = i; j < v_etkinlikSayisi - 1; j++)
                {
                    etkM1[j] = etkM1[j + 1];
                }
    
                // En son konumda kalan tekrar eden değeri temizler.
                etkM1[v_etkinlikSayisi - 1] = null;
    
                v_etkinlikSayisi--;
    
                System.out.println("Etkinlik silindi.");
                return;
            }
        }
    
        System.out.println("Etkinlik bulunamadı.");
    }
    
    public void ogrenciEtkinlikEkle(int p_ogrenci_id,int p_etkinlik_id){
    
    }
    
    public void ogrenciEtkinlikSil(int p_ogrenci_id,int p_etkinlik_id){
     
    }
    
    public void getOgrenciEtkinlikList(){
    
    }
    
}
    
    
    
    
    
    