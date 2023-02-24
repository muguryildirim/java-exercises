package FizzBuzz;

public class Main {
    public static String fizzbuzz(int number) {
        if (number % 3 == 0) {
            if (number % 5 == 0) {
                return "Fizzbuzz";
            } else {
                return "fizz";
            }
        } else if (number % 5 == 0) {
            return "buzz";
        }
        return String.valueOf(number);
    }
}

