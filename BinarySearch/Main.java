package BinarySearch;

import java.util.Scanner;

import static java.lang.System.*;

class Main
{
    public static void main(String[] args)
    {
        int c, first, last, middle, n, search, array[];

        Scanner s = new Scanner(in);
        out.println("Enter number of elements");
        n = s.nextInt();
        array = new int[n];

        out.println("Enter " + n + " integers");

        for(c = 0; c < n; c++)

            array[c] = s.nextInt();

            out.println("Enter value to find");
            search = s.nextInt();

            first = 0;
            last = n - 1;
            middle = (first + last) / 2;

            while(first <= last)
            {
                if(array[middle] < search)

                    first = middle + 1;
                    else if (array[middle] == search)
                {
                    out.println(search + " found at location " + (middle + 1) + ".");
                    break;
                }
                else
                    last = middle - 1;
                middle = (first + last) / 2;
            }
            if (first > last)
                out.println(search + " is not present in the list.\n");
    }
}
