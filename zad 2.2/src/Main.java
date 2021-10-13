import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] anArray;
        double suma=0;
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        anArray = new double[number];
        for (int i=0;i < number ; i++)
        {
            double n = scan.nextInt();
            anArray[i]=n;
        }
        for (int i=1;i < number ; i++)
        {
            System.out.println(anArray[i]);
        }
        System.out.println(anArray[0]);
    }
}
