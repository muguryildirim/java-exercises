package BubbleSort;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number of integers to sort: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        bubbleSort(array);

        System.out.println("Sorted list of numbers:");

        for (int num : array) {
            System.out.println(num);
        }
    }

    private static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements at j and j+1
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

