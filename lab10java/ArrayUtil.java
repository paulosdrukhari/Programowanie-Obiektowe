
import java.util.ArrayList;

public class ArrayUtil<T> {



    public static <T extends Comparable<T>> void isSorted(ArrayList<T> aray){

        for(int i = 0; i <= aray.size()-2; i++){
            if(aray.get(i).compareTo(aray.get(i+1)) > 0) {
                System.out.println("Tablica nie jest posortowana niemalejaco");
                return;
            }
            }
        System.out.println("Tablica jest posortowana niemalejaco");
        }
    }