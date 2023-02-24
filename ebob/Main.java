package ebob;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static int ebob(int sayi1, int sayi2){
        int ebob = 1;
        for(int i = 1;i <= sayi1 && i <= sayi2; i++){
            if((sayi1 % i == 0) && (sayi2 % i == 0)){
                ebob = i;
            }
        }
        return ebob;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(in);
        out.println("Birinci Sayi: ");
        int birinci_sayi = s.nextInt();

        out.println("Ikinci Sayi: ");
        int ikinci_sayi = s.nextInt();

        out.println("Iki sayinin ebobu : " + ebob(birinci_sayi, ikinci_sayi));
    }
}
