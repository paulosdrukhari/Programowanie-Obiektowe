import java.util.Date;
import java.lang.Cloneable;
import java.lang.Comparable;
import java.time.LocalDate;
import java.util.Calendar;

class Student extends Osoba{
    public Student(String nazwisko,LocalDate dataUrodzenia,double sredniaOcen)
    {
        super(nazwisko,dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }
    public double compareTo(Student other)
    {
        return super.compareTo(other)+this.sredniaOcen;
    }

    public String toString()
    {
        return getClass().getName()+"["+getNazwisko()+" "+getDate()+" "+this.sredniaOcen+"]";
    }
    private double sredniaOcen;
}
