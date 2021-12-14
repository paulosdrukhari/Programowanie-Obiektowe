import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Teststudent {
    public static void main(String[] args) {
        ArrayList<Student> grupa = new ArrayList<Student>();
        grupa.add(new Student("Artas",LocalDate.of(1332,11,12),2.4));
        grupa.add(new Student("Artas",LocalDate.of(1332,1,12),4.21));
        grupa.add(new Student("sarta",LocalDate.of(2000,1,11),2.53));
        grupa.add(new Student("satraq",LocalDate.of(2000,1,11),4.45));
        grupa.add(new Student("Deptuła",LocalDate.of(2137,11,27),5.1));
        Collections.sort(grupa);
        System.out.print(grupa);
    }
    
    
}

