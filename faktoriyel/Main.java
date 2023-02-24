package faktoriyel;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(in);

        out.println("Bir sayi giriniz: ");
        int sayi = s.nextInt();

        int faktoriyel = 1;

        while (sayi > 0)
        {
            faktoriyel *= sayi;
            sayi--;
        }
        out.println("Faktoriyel = " + faktoriyel);
    }
}
