/**
 * Write a description of class UserView here.
 *
 * @author (Kerem SAGLAM)
 * @version (V0.1)
 */
public class LoginScreen
{
    private CreateScreen v_screenObject;
    private CreatePanel v_panel;
    private CreateButton v_button_1;
    private CreateButton v_button_2;
    private CreateTextBox v_textfield_1;
    private CreateTextBox v_textfield_2;
    private String v_textname;
    private String v_textpassword;
    private UserController v_usercon;
    private OgrenciScreen v_ogrscreen;
    private PersonelScreen v_psnscreen;
    private YoneticiScreen v_yonscreen;
    private UserModel v_usrmdl;
    public LoginScreen()
    {   
        UserList.users.add(new UserModel(123, "Ali", 5551234, true, false, false));
        
        v_screenObject = new CreateScreen(300,250,300,300,"Login");
    
        int panelWidth = 250;
        int panelHeight = 200;
        
        int posX = (v_screenObject.getPosX() - panelWidth) / 2;
        int posY = (v_screenObject.getPosY() - panelHeight) / 2;
        
        v_panel = new CreatePanel(panelWidth, panelHeight, posX, posY);
        
        v_screenObject.add(v_panel.getPanel());

        v_textfield_1 = new CreateTextBox(1,false,27,200,10,10,"Kullanici Adi ve Soyadi","");
        v_textfield_2 = new CreateTextBox(2,true,27,200,10,10,"Kullanici numarasi ","");
        //String username = v_textfield_1.getValue();
        //String userNumberText = v_textfield_2.getValue();
        //v_usrmdl = new UserModel.getUser(username,userNumberText);
        
        
        v_button_1 = new CreateButton(1, 27, 200, 10, 10, "Giris", e -> {
        
            // Kullanıcı butona bastığı anda değerleri oku
            String username = v_textfield_1.getValue();
            String userNumberText = v_textfield_2.getValue();
        
            try {
                int userNumber = Integer.parseInt(userNumberText.trim());
                
                v_usrmdl = UserModel.getUser(username, userNumber);
                v_usercon = new UserController(v_usrmdl);
                if (v_usrmdl == null) {
                    System.out.println("Kullanici bulunamadi");
                    return;
                }
        
                switch (v_usercon.userFindForSetup(username, userNumber)) {
                    case 1:
                        v_ogrscreen = new OgrenciScreen();
                        v_screenObject.closeScreen();
                        System.out.println("Ogrenci Giris Yapti");
                        break;
        
                    case 2:
                        v_psnscreen = new PersonelScreen();
                        v_screenObject.closeScreen();
                        System.out.println("Personel Giris Yapti");
                        break;
        
                    case 3:
                        v_yonscreen = new YoneticiScreen();
                        v_screenObject.closeScreen();
                        System.out.println("Yonetici Giris Yapti");
                        break;
        
                    default:
                        System.out.println("Giris yetkisi bulunamadi");
                        break;
                }
        
            } catch (NumberFormatException ex) {
                System.out.println("Kullanici numarasi sayisal olmalidir.");
            }
        });



        
        

        v_panel.getPanel().add(v_textfield_1.getTextBox());
        v_panel.getPanel().add(v_textfield_2.getTextBox());
        v_panel.getPanel().add(v_button_1);
        
        
        v_screenObject.add(v_panel.getPanel());

        v_panel.getPanel().setVisible(true);
        //v_button_1.setVisible(true);
        v_screenObject.setVisible(true);

        v_screenObject.revalidate();
        v_screenObject.repaint();
    }
}