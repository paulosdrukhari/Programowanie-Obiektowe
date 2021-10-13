import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int suma=0;
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for (int i=0;i<number ; i++)
        {
            int n = scan.nextInt();
            n=Math.abs(n);
            suma+=n;
        }
        System.out.println(suma + " " + number);
    }
}
