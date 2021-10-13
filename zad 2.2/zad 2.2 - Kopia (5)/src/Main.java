import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double suma=0;
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for (int i=0;i<number ; i++)
        {
            double n = scan.nextInt();
            n=Math.pow(n,2);
            suma+=n;
        }
        System.out.println(suma + " " + number);
    }
}
