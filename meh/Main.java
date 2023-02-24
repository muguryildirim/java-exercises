package meh;

import java.util.Scanner;

import static java.lang.System.*;

public class Main
{
    public static void main(String[] args)
    {
        String original, reverse = " ";

        Scanner sc = new Scanner(in);

        int length;

        out.println("Enter the number or String = ");
        original = sc.nextLine();

        length = original.length();

        for(int i = length -1; i >= 0; i--)
        {
            reverse = reverse + original.charAt(i);
        }
        out.println("reverse is = " + reverse);

        if(original.equals(reverse))

            out.println("The number or string is palindrome");
        else
            out.println("The number or string is not palindrome");
    }
}
