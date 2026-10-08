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
        v_userModel = p_userModel;
    }

    public void userAdd(UserModel p_userModel)
    {
        v_userModel = p_userModel;
    }

    public void userDelete()
    {
        v_userModel = null;
    }

    public void userAddEtkinlik(EtkinlikModel p_etkinlik)
    {
        if (v_userModel != null && p_etkinlik != null)
        {
            ArrayList<EtkinlikModel> etkinlikler =
                v_userModel.getEtkinlikler();

            etkinlikler.add(p_etkinlik);
            v_userModel.setEtkinlikler(etkinlikler);
        }
    }

    public void userDeleteEtkinlik(EtkinlikModel p_etkinlik)
    {
        if (v_userModel != null && p_etkinlik != null)
        {
            ArrayList<EtkinlikModel> etkinlikler =
                v_userModel.getEtkinlikler();

            etkinlikler.remove(p_etkinlik);
            v_userModel.setEtkinlikler(etkinlikler);
        }
    }

    public UserModel getUserModel()
    {
        return v_userModel;
    }
}