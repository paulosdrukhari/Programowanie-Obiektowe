import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int suma=0;
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for (int i=0;i<number ; i++)
        {
            int n = scan.nextInt();
            if(i%2==0)
            {
                suma+=n;
            }
            else if(i%2==1){
                suma-=n;
            }
            else{
                suma+=(Math.pow(-1,n+1)*n);
            }

        }
        System.out.println(suma + " " + number);
    }
}
