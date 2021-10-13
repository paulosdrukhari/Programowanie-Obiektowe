import java.util.Scanner;

public class Main {
    public static double kwa(double k) {
        double wynik=1;
        for (int i = 1; i < k; i++)
        {
            wynik = wynik * i;
        }
        return wynik;
    }
    public static void main(String[] args) {
        double suma=0;
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for (int i=0;i < number ; i++) {
            double n = scan.nextInt();
            if (Math.pow(2, i)< n && n < kwa(i))
            {
                suma++;
            }
        }
        System.out.println(suma);
    }

}
