package ReverseString;

import java.util.Scanner;

import static java.lang.System.*;

class Main
{
    String reverse(String s)
    {
        if(s.length() == 0)
            return " ";
        return s.charAt(s.length()-1) + reverse(s.substring(0,s.length()-1));
    }
    public static void main(String[ ] arg)
    {
        Main main = new Main();
        Scanner sc = new Scanner(in);
        out.println("Enter a String : ");
        String str = sc.nextLine();
        out.println("Reverse of a String :" + main.reverse(str));
    }
}