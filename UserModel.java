import java.util.ArrayList;

public class UserModel
{
    private int v_id;
    private String v_name;
    private int v_tel;
    private boolean v_isStudent;
    private boolean v_isPersonal;
    private boolean v_isAttendEtk;
    private ArrayList<EtkinlikModel> _etkinlikModel;

    public UserModel(int p_id, String p_name, int p_tel, boolean p_isStudent,
        boolean p_isPersonal, boolean p_isAttendEtk)
    {
        v_id=p_id;
        v_name=p_name;
        v_tel=p_tel;
        v_isStudent=p_isStudent;
        v_isPersonal=p_isPersonal;
        v_isAttendEtk=p_isAttendEtk;
        _etkinlikModel=new ArrayList<EtkinlikModel>();
    }

    public int getId()
    {
        return v_id;
    }
    
    public String getName()
    {
        return v_name;
    }
    
    public int getTel()
    {
        return v_tel;
    }
    
    public boolean getStudent()
    {
        return v_isStudent;
    }
    
    public boolean getAttend()
    {
        return v_isAttendEtk;
    }
    
    public boolean getPersonal()
    {
        return v_isPersonal;
    }
    
    public ArrayList<EtkinlikModel> getEtkinlikler()
    {
        return new ArrayList<EtkinlikModel>(_etkinlikModel);
    }
    
    public void setId(int p_id)
    {
        v_id=p_id;
    }
    
    public void setName(String p_name)
    {
        v_name=p_name;
    }
    
    public void setTel(int p_tel)
    {
        v_tel=p_tel;
    }
    
    public void setisStudent(boolean p)
    {
        v_isStudent=p;
    }
    
    public int userNumber(){
        int userSayisi = 0;

        for (UserModel user : UserList.users)
        {
            userSayisi++;
        }
        
        return userSayisi;
    }
    
    public void setisPersonal(boolean p)
    {
        v_isPersonal=p;
    }
    
    public void setAttend(boolean p)
    {
        v_isAttendEtk=p;
    }

    public void setEtkinlikler(String p_etkinlik_ismi,int p_tarih)
    {
        /**
         * burada her bir kullanıcının elinde bulundurduğu gireceği etkinlik listesi
         * ile mevcut olan etkinlikleri karşılaştırıp etkinlik eklenmişse zaten
         * ekleme yapmayacak ama eklenmemiş etkinlik bilgileri seçilmişse ekleme
         * yapacak
             
           */
        for(EtkinlikModel etk : EtkinlikList.etkinlik){
            if(p_etkinlik_ismi.equals(etk.getName()) && etk.getTarih() == p_tarih){
                return ;
            }
            
        }
        
        EtkinlikModel etkinlik = new EtkinlikModel(_etkinlikModel.size()+1,p_etkinlik_ismi,p_tarih);
        _etkinlikModel.add(etkinlik);
    }
    
    
}
