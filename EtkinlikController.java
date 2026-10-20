
import java.util.ArrayList;

/**
 * Etkinlik modelinin ekleme, guncelleme, silme ve okuma
 * islemlerini yoneten controller sinifi.
 *
 * @author (Kerem SAGLAM)
 * @version (V0.1)
 */
public class EtkinlikController
{
    private EtkinlikModel v_etkinlikModel;

    public EtkinlikController(EtkinlikModel p_etkinlikModel)
    {
        v_etkinlikModel = p_etkinlikModel;
    }

    public void etkinlikCreate(EtkinlikModel p_etkinlikModel)
    {
        v_etkinlikModel = p_etkinlikModel;
    }

    public void etkinlikUpdate(int p_id, String p_etkinlikName, int p_tarih)
    {
        if (v_etkinlikModel != null)
        {
            v_etkinlikModel.setId(p_id);
            v_etkinlikModel.setName(p_etkinlikName);
            v_etkinlikModel.setTarih(p_tarih);
        }
    }

    public void etkinlikDelete()
    {
        v_etkinlikModel = null;
    }

    public void katilimciAdd(UserModel p_userModel)
    {
        if (v_etkinlikModel != null && p_userModel != null)
        {
            ArrayList<UserModel> katilimcilar =
                v_etkinlikModel.getKatilimcilar();

            if (!katilimcilar.contains(p_userModel))
            {
                katilimcilar.add(p_userModel);
                v_etkinlikModel.setKatilimcilar(katilimcilar);
            }
        }
    }

    public void katilimciDelete(UserModel p_userModel)
    {
        if (v_etkinlikModel != null && p_userModel != null)
        {
            ArrayList<UserModel> katilimcilar =
                v_etkinlikModel.getKatilimcilar();

            katilimcilar.remove(p_userModel);
            v_etkinlikModel.setKatilimcilar(katilimcilar);
        }
    }

    public EtkinlikModel getEtkinlikModel()
    {
        return v_etkinlikModel;
    }
}
