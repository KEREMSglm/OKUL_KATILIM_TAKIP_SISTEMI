import java.util.ArrayList;
public class EtkinlikModel
{
    private int v_id;
    private String v_etkinlikName;
    private int v_tarih;
    private ArrayList<UserModel> v_katilimcilar;
    
    public EtkinlikModel(int p_id,String p_name,int p_tarih)
    {
        v_id=p_id;v_etkinlikName=p_name;
        v_tarih=p_tarih;
        v_katilimcilar=new ArrayList<UserModel>();
    }
    
    public int getId()
    {
        return v_id;
    } 
    
    public String getName()
    {
        return v_etkinlikName;
    }
    
    public int getTarih()
    {
        return v_tarih;
    }
    
    public ArrayList<UserModel> getKatilimcilar()
    {
        return new ArrayList<UserModel>(v_katilimcilar);
    }
    
    public void setId(int p_id)
    {
        v_id=p_id;
    } 
    
    public void setName(String p_etkinlikName)
    {
        v_etkinlikName=p_etkinlikName;
    }
    
    public void setTarih(int p_tarih){
        v_tarih=p_tarih;
    }
    
    
    public boolean setKatilimcilar(String userIsim)
    {
        for (UserModel user : UserList.users)
        {
            if (userIsim.equals(user.getName()))
            {
                if (v_katilimcilar.contains(user))
                {
                    return false;
                }
    
                v_katilimcilar.add(user);
                return true;
            }
        }
    
        return false;
    }
    
    

    
    
}
