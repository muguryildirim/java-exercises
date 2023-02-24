package OOPAtm;

import java.util.Scanner;

import static java.lang.System.*;

public class ATM {
    public void calis(Hesap hesap) {


        Login login = new Login();

        Scanner sc = new Scanner(in);

        out.println("***********************");
        out.println("Kullanici Girisi: ");
        out.println("***********************");

        int giris_hakki = 3;

        while (true) {
            if (login.login(hesap)) {
                out.println("Giris Basarili...");
                break;
            } else {
                out.println("Giris Basarisiz...");
                giris_hakki -= 1;
                out.println("Kalan giris hakki: " + giris_hakki);
            }
            if (giris_hakki == 0) {
                out.println("Giris hakkiniz bitti...");
                return;
            }
        }

        out.println("****************");
        String islemler = "1. Bakiye Goruntulu\n" + "2. Para Yatirma\n" + "3. Para Cekme\n" + "Cikis icin q'ya basiniz...";
        out.println(islemler);
        out.println("****************");

        while (true) {
            out.println("Islemi seciniz= ");
            String islem = sc.nextLine();

            if (islem.equals("q")) {
                break;
            } else if (islem.equals("1")) {
                out.println("Bakiyeniz = " + hesap.getBakiye());
            } else if (islem.equals("2")) {
                out.print("Yatirmak istediginiz tutar = ");
                int tutar = sc.nextInt();
                sc.nextLine();
                hesap.paraYatir(tutar);
            } else if (islem.equals("3")) {
                out.print("Cekmek istediginiz tutar = ");
                int tutar = sc.nextInt();
                sc.nextLine();
                hesap.paraCek(tutar);
            } else {
                out.print("Gecersiz islem...");
            }

        }
    }
}
