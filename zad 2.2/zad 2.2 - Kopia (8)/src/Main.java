import java.util.Scanner;

public class Main {
    public static int silnia(int n) {
        int iloczyn = 1;
        for(int i = 1; i <= n; i++) {
            iloczyn *= i;
        }
        return iloczyn;
    }
    public static void main(String[] args) {
        double suma=0;
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for (int i=0;i < number ; i++)
        {
            double n = scan.nextInt();
            if(i%2==0)
            {
                n=Math.pow(-1,n)*n;
                suma-=(n/silnia(i));
            }
            else if(i%2==1) {
                n = Math.pow(-1, n) * n;
                suma += (n / silnia(i));
            }
        }
        System.out.println(suma );
    }
}