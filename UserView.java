    import java.util.ArrayList;
/**
 * Write a description of class UserView here.
 *
 * @author (Kerem SAGLAM)
 * @version (V0.1)
 */
public class UserView
{
    private UserModel v_userModel;
    private String[] v_strarray;
    public UserView(UserModel p_userModel)
    {
       v_userModel = p_userModel;       
    }
    
    //bu method MVC mantığı üzerinde çalıştığından Model içindeki veriler ile eşleştirilmesi lazım
    //burada getName methodları karışabilir ayrı Modellerde Aynı isimde Methodlar var 
    public void EtkinllikleriGöster(int tarih_araligi){
        //System.out.println(v_userModel.getName() + " isimli öğrencinin etkinlikleri:");//model deki ismi buraya yazdık
        int i=0;
        ArrayList<EtkinlikModel> etkinlikler = v_userModel.getEtkinlikler();// burdaki listeyi Model içindeki liste ile eşitledik
        
        for(EtkinlikModel etkinlik:etkinlikler){
            if(etkinlik.getTarih()==tarih_araligi){
                v_strarray[i] = etkinlik.getName()+" - Tarih" +etkinlik.getTarih();
            }
            i++;
        }
        
    }
    
    public String[] getInformation(){
        return v_strarray;
    }
    
    
    
   
}