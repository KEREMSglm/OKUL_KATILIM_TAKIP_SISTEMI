import java.util.ArrayList;
/**
 * Write a description of class UserView here.
 *
 * @author (Kerem SAGLAM)
 * @version (V0.1)
 */
public class UserController
{
    private UserModel v_userModel;

    public UserController(UserModel p_userModel)
    {
        /**
         * burada hangi kullanıcı kontollerı kullanıyor içine yazılacak
         * gennelliklede yönetici izni olanlar gözükçek yönetiçi izni
         * olan user ayrıldığında kendini silebilecek böyleliklede kendi şirket
         * kaydını silebilecek 
         */
        v_userModel = p_userModel;
    }

    public boolean userAdd(UserModel p_userModel)
    {
        /**
         * burada önceden yada çağrı içinde oluşturulan bir user model nesnesi 
         * oluşturuluyor sonra oluşturulan nesne ile id foreach kullanılarak
         * karşılaştırılıyor .Eğer oluşturulan nesne UserListesinde yoksa 
         * userlistesine ekliyor
         */
        if (p_userModel == null)
        {
            return false;
        }

        for (UserModel user : UserList.users)
        {
            if (user.getId() == p_userModel.getId())
            {
                return false;
            }
        }

        UserList.users.add(p_userModel);
        v_userModel = p_userModel;

        return true;
    }

    public boolean userDelete(String p_userIsim)
    {
        /**
         * eğer belirtilen isimde nesne varsa o nesneyi siliyor 
         */
        for (UserModel user : UserList.users)
        {
            if (p_userIsim.equals(user.getName()))
            {
                UserList.users.remove(user);

                if (v_userModel == user)
                {
                    v_userModel = null;
                }

                return true;
            }
        }

        return false;
    }

    
    public boolean userAddEtkinlikISIM(String userIsim,String etkinlikIsmi,int p_tarih)
    {
        for (UserModel user : UserList.users)
        {
            if (userIsim.equals(user.getName()))
            {
                for (EtkinlikModel etkinlik : EtkinlikList.etkinlik)
                {
                    if (etkinlikIsmi.equals(etkinlik.getName()) &&
                        etkinlik.getTarih() == p_tarih)
                    {
                         user.setEtkinlikler(etkinlikIsmi,p_tarih);
                         return true;
                    }
                }
    
                // Öğrenci bulundu, etkinlik bulunamadı.
                return false;
            }
        }
    
        // Öğrenci bulunamadı.
        return false;
    }

    public UserModel getUserModel()
    {
        return v_userModel;
    }
}