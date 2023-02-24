package BMIclassic;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(in);

        out.println("Weight: ");
        int weight = s.nextInt();
        out.println("Height (in cm):");
        double height = s.nextDouble();

        double bmi = (weight/(height*height));

        if(bmi < 18.5){
            out.println("Skinny");
        } else if (bmi >= 18.5 && bmi < 25) {
            out.println("Normal");
        } else if (bmi >= 25 && bmi < 30) {
            out.println("Overweight");
        }
        else {
            out.println("Obese");
        }
    }
}
