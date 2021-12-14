
import java.util.Date;
import java.lang.Cloneable;
import java.lang.Comparable;
import java.time.LocalDate;
import java.util.Calendar;

public class Osoba implements java.lang.Comparable<Osoba>,Cloneable{
    public Osoba(String nazwisko,LocalDate data)
    {
        this.nazwisko = nazwisko;
        this.data = data;
    }
    private String nazwisko;
    private LocalDate data;
    @Override
    public String toString()
    {
       return getClass().getName() + '[' + getNazwisko() + "] data"+ getDate();
    }
    public LocalDate getDate()
    {
        return data;
    }
    public String getNazwisko()
    {
        return nazwisko;
    }
    
    @Override
    public boolean equals(Object x)
    {
        if (x== null) {
            return false;
        }

        if (x.getClass() != this.getClass()) {
            return false;
        }
        final Osoba other = (Osoba) x;
        if ((this.nazwisko== null) ? (other.nazwisko != null) : !this.nazwisko.equals(other.nazwisko)) {
            return false;
        }

        if (this.data != other.data) {
            return false;
        }

        return true;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    @Override
    public int compareTo(Osoba o) {
        if(this.nazwisko != o.nazwisko)
        {
            return 0;
        }
        if ((this.data).isAfter(o.data)) {
            return 0;
        }

        if (data.isBefore(o.data)) {
            return 0;
        }
        return 1;
    };

}
