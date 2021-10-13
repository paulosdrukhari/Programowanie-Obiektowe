import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double suma=0;
        double suma2=1;
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for (int i=0;i<number ; i++)
        {
            double n = scan.nextInt();
            suma+=n;
            suma2*=n;
        }
        System.out.println(suma + " " + suma2);
    }
}