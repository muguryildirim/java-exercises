package BubbleSort;

import java.util.Scanner;

import static java.lang.System.*;

public class Main
{
    public static void main(String[] args) {
        int n, c, d, swap;

        Scanner s = new Scanner(in);

        out.println("Input number of integers to sort");
        n = s.nextInt();

        int array[] = new int[n];

        out.println("Enter " + n + " integers" );

        for(c = 0; c < n; c++)
            array[c] = s.nextInt();

        for(c = 0; c < (n - 1); c++)
        {
            for(d = 0; d < n - c - 1; d++)
            {
                if(array[d] > array[d + 1])
                {
                    swap = array[d];
                    array[d] = array[d + 1];
                    array[d + 1] = swap;
                }
            }
        }
        out.println("Sorted list of numbers");

        for(c = 0; c < n; c++)
            out.println(array[c]);
    }
}
