import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int suma=1;
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for (int i=0;i<number ; i++)
        {
            int n = scan.nextInt();
            suma*=n;
        }
        System.out.println(suma + " " + number);
    }
}

