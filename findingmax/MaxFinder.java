package findingmax;

import java.util.Scanner;

import static java.lang.System.*;

public class MaxFinder {
    public static void main(String[] args) {
        Scanner s = new Scanner(in);

        out.println("1st number: ");
        int a = s.nextInt();

        out.println("2nd number: ");
        int b = s.nextInt();

        out.println("3rd number: ");
        int c = s.nextInt();

        int max = -1; // to ignore errors

        if(a >= b && a>= c){
            max = a;
        }
        else if (b >=a && b>= c){
            max = b;
        } else {
            max = c;
        }
        out.println("Max number: " + max);
    }
}
