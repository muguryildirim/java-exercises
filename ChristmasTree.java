public class ChristmasTree {

    public static void main(String[] args) {
        printChristmasTree(5);
    }

    private static void printChristmasTree(int height) {
        if (height < 3 || height % 2 == 0) {
            System.out.println("Please provide an odd height greater than or equal to 3.");
            return;
        }

        for (int i = 0; i < height; i++) {
            int spaces = height - i - 1;
            int stars = i * 2 + 1;

            printSpaces(spaces);
            printStars(stars);
            System.out.println();
        }

        printTrunk(height);
    }

    private static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    private static void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
    }

    private static void printTrunk(int height) {
        int trunkWidth = Math.max(height / 3, 2);
        int trunkHeight = height / 3;

        for (int i = 0; i < trunkHeight; i++) {
            printSpaces(height - trunkWidth / 2);
            printStars(trunkWidth);
            System.out.println();
        }
    }
}
