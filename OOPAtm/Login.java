package OOPAtm;

import java.util.Scanner;

import static java.lang.System.*;

public class Login
{
    public boolean login(Hesap hesap)
    {
        Scanner sc = new Scanner(in);
        String kullanici_adi;
        String parola;

        out.println("Kullanici Adi = ");
        kullanici_adi = sc.nextLine();
        out.println("Parola = ");
        parola = sc.nextLine();

        if(hesap.getKullanici_adi().equals(kullanici_adi) && hesap.getParola().equals(parola))
        {
            return true;
        } else {
            return false;
        }
    }
}
