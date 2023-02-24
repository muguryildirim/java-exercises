package multiplication;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        for(int i = 1; i<=10;i++){
            out.println("*********************");
            for(int j = 1;j <= 10;j++){
                out.println(i+"x"+j+" = " + (j*i));
            }
            out.println("*********************");
        }
    }
}
