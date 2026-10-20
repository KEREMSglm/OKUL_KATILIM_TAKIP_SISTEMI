
import java.util.ArrayList;

/**
 * Etkinlik bilgilerini ve katilimcilarini ekranda gosteren view sinifi.
 *
 * @author (Kerem SAGLAM)
 * @version (V0.1)
 */
public class EtkinlikView
{
    private EtkinlikModel v_etkinlikModel;

    public EtkinlikView(EtkinlikModel p_etkinlikModel)
    {
        v_etkinlikModel = p_etkinlikModel;
    }

    public void etkinlikBilgileriniGoster()
    {
        if (v_etkinlikModel == null)
        {
            System.out.println("Gosterilecek etkinlik bulunamadi.");
            return;
        }

        System.out.println("Etkinlik ID: " + v_etkinlikModel.getId());
        System.out.println("Etkinlik adi: " + v_etkinlikModel.getName());
        System.out.println("Etkinlik tarihi: " + v_etkinlikModel.getTarih());
        System.out.println(
            "Katilimci sayisi: " +
            v_etkinlikModel.getKatilimcilar().size()
        );
    }

    public void katilimcilariGoster()
    {
        if (v_etkinlikModel == null)
        {
            System.out.println("Gosterilecek etkinlik bulunamadi.");
            return;
        }

        ArrayList<UserModel> katilimcilar =
            v_etkinlikModel.getKatilimcilar();

        System.out.println(
            v_etkinlikModel.getName() + " etkinliginin katilimcilari:"
        );

        if (katilimcilar.isEmpty())
        {
            System.out.println("Bu etkinlige henuz katilimci eklenmedi.");
            return;
        }

        for (UserModel katilimci : katilimcilar)
        {
            System.out.println(
                katilimci.getId() + " - " + katilimci.getName()
            );
        }
    }

    public void etkinliklerinTumunuGoster(
        ArrayList<EtkinlikModel> p_etkinlikler)
    {
        if (p_etkinlikler == null)
        {
            System.out.println("Gosterilecek etkinlik bulunamadi.");
            return;
        }

        System.out.println("Tum etkinlikler:");

        for (EtkinlikModel etkinlik : p_etkinlikler)
        {
            if (etkinlik != null)
            {
                System.out.println(
                    etkinlik.getId() + " - " +
                    etkinlik.getName() + " - Tarih: " +
                    etkinlik.getTarih() + " - Katilimci sayisi: " +
                    etkinlik.getKatilimcilar().size()
                );
            }
        }
    }
}
