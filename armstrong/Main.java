package armstrong;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(in);

        out.println("Sayiyi giriniz: ");
        int sayi = s.nextInt();

        out.println("Basamak Sayisi: ");
        int basamak_sayisi = s.nextInt();

        int gecici_sayi = sayi;
        int toplam = 0;

        do {
            int basamak_degeri = gecici_sayi % 10;
            gecici_sayi /= 10;

            toplam += Math.pow(basamak_degeri, basamak_sayisi);
        } while (gecici_sayi > 0);
        if (sayi == toplam){
            out.println("Bu bir armstrong sayisidir...");
        }
        else {
            out.println("Bu bir armstrong sayisi degildir...");
        }
    }
}

