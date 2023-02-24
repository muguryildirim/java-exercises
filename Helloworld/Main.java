package Helloworld;

import java.util.Scanner;

import static java.lang.System.*;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        out.println("Mehmet Ugur Yildirim");

        int number = 1;
        String message;
        out.println("" + number);

        if(number == 10)
        {
            message = "Number = 10";
            out.println("Message :" + message);
        } else
        {
            message = "Number is different than 10";
            out.println(message);
        }

        out.println("Please enter a number :");
        String variableNumber = sc.next();

        out.println("Entered number :" + variableNumber);
    }
}
