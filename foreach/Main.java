package foreach;

public class Main
{
    public static void main(String[] args) {

        String[] array = {"Elma", "Armut", "Kiraz"};

        int[] array2 = {1,2,4,5,6,7};

        Try[] array3 = {new Try("Mehmet"), new Try("Ugur"), new Try("Yildirim")};

        for(Try d : array3)
        {
            d.write();
        }
        for(int i : array2)
        {
            System.out.println(i);
        }
        for(String a : array)
        {
            System.out.println(a);
        }
    }
}
