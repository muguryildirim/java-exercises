package muy;

public class Main {
    public static void main(String[] args) {
        try {
            int result = 10/0;
        } catch(ArithmeticException e) {
            System.out.println("E");
        } catch(Exception ae) {
            System.out.println("AE");
        }
    }
}
