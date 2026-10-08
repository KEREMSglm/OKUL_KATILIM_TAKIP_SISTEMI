import java.util.ArrayList;
/**
 * Write a description of class UserModel here.
 *
 * @author (Kerem SAGLAM)
 * @version (V0.1)
 */
public class UserModel
{
    private int v_id;
    private String v_name;
    private int v_tel;
    private boolean v_isStudent;
    private boolean v_isPersonal;
    private boolean v_isAttendEtk;
    ArrayList<EtkinlikModel> _etkinlikModel;
    public UserModel(int p_id,String p_name,int p_tel,boolean p_isStudent,boolean p_isPersonal,boolean p_isAttendEtk)
    {
         v_id = p_id;
         v_name = p_name;
         v_tel = p_tel;
         v_isStudent = p_isStudent;
         v_isPersonal = p_isPersonal;
         v_isAttendEtk = p_isAttendEtk;
        _etkinlikModel = new ArrayList<EtkinlikModel>();
       
    }
    //getter method
    public int getId(){
        return v_id;
    }
    
    public String getName(){
        return v_name;
    }
    
    public int getTel(){
        return v_tel;
    }
    
    public boolean getStudent(){
        return v_isStudent;
    }
    
    public boolean getAttend(){
        return v_isAttendEtk;
    }
    /*
     * burada her öğrenciye ait etkinlikler çağırılabiliyor
     */
    public ArrayList<EtkinlikModel> getEtkinlikler(){
        return new ArrayList<EtkinlikModel>(_etkinlikModel);
    }
    
    public boolean getPersonal(){
        return v_isPersonal;
    }
    //setter method
    public void setId(int p_id){
         v_id=p_id;
    }
    
    public void setName(String p_name){
        v_name=p_name;
    }
    
    public void setTel(int p_tel){
         v_tel=p_tel;
    }
    
    public void setisStudent(boolean p_isStudent){
        v_isStudent=p_isStudent;
    }
    
    public void setisPersonal(boolean p_isPersonal){
        v_isPersonal=p_isPersonal;
    }
    
    public void setAttend(boolean p_isAttendEtk){
        v_isAttendEtk = p_isAttendEtk;
    }
    /*
     * burada her öğrenciye ait etkinlikler atanabiliyor
     */
    public void setEtkinlikler(ArrayList<EtkinlikModel> p_etkinlikler) {
        _etkinlikModel = new ArrayList<EtkinlikModel>(p_etkinlikler);
    }
    
    
}