package EmaiAdministration;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(in);
        out.print("Enter your First Name: ");
        String first = scn.next();
        out.print("Enter your Last Name: ");
        String last = scn.next();
        Email em1 = new Email(first,last);
        out.println(em1.showInfo());

    }
}
