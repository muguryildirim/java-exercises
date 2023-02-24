package OOPAtm;

import static java.lang.System.out;

public class Main
{
    public static void main(String[] args) {


        ATM atm = new ATM();

        Hesap hesap = new Hesap("Mehmet Ugur Yildirim", "12345", 2000);

        atm.calis(hesap);
        out.println("Programdan cikiliyor...");
    }
}
