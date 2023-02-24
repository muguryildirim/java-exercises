package loginpassword;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(in);
        int giris_hakki = 3;

        String sys_kullanici_adi = "Mehmet Ugur";
        String sys_parola = "muymuy11";

        out.println("*********************");
        out.println("Kullanici Giris Sayfasina Hosgeldiniz");
        out.println("*********************");

        while(true){
            out.println("Kullanici Adi: ");
            String kullanici = s.nextLine();
            out.println("Parola: ");
            String parola = s.nextLine();

            if(kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
                out.println("Hosgeldiniz, " + kullanici);
                break;
            } else if (kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)) {
                out.println("Parolaniz Yanlis..");
                giris_hakki -= 1;

                out.println("Giris Hakki: " + giris_hakki );

            } else if (!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
                out.println("Kullanici Adiniz Yanlis..");
                giris_hakki -= 1;

                out.println("Giris Hakki: " + giris_hakki );
            } else{
                out.println("Kullanici adiniz ve Parolaniz Yanlis...");

                giris_hakki -= 1;
                out.println("Giris Hakki: " + giris_hakki);
                break;
            }
            if(giris_hakki == 0){
                out.println("Giris Hakkiniz Bitti...");
                break;
            }
        }
    }
}
