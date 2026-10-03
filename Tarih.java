

public class Tarih
{
    private int v_gun_id;
    private String v_gun_isim;
    
    
    public Tarih()
    {
        // initialise instance variables
        
    }
    
    public String getStringGun(int p_gun_id){
        if(p_gun_id==0){
            return "Pazartesi";
        }
        else if(p_gun_id==1){
            return "Salı";
        }
        else if(p_gun_id==2){
            return "Çarşamba";
        }
        else if(p_gun_id==3){
            return "Perşembe";
        }
        else if(p_gun_id==4){
            return "Cuma";
        }
        else if(p_gun_id==5){
            return "Cumartesi";
        }
        else if(p_gun_id==6){
            return "Pazar";
        }
        return "wrong number";
        
    }
    
   
}