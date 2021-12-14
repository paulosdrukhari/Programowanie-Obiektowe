import pl.pawel155257.deptula.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestOsoba {
    public static void main(String[] args) {
        ArrayList<Osoba>x = new ArrayList<Osoba>();
        x.add(new Osoba("srama",LocalDate.of(1999,12,12)));
        x.add(new Osoba("srama",LocalDate.of(1998,12,12)));
        x.add(new Osoba("Ars",LocalDate.of(2137,12,11)));
        x.add(new Osoba("arsa",LocalDate.of(2137,12,11)));
        x.add(new Osoba("Deptuła",LocalDate.of(2000,11,24)));
        System.out.print(x);
        System.out.print("STOP");
        System.out.print("\n");
        Collections.sort(x);
        System.out.print(x); 
    }
}
