package pl.pawel155257.deptula;
import java.time.*;

class TestOsoba
{
    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];
        String[] imiona = new String[2];
        imiona[0]="ala";
        imiona[1]="katakan";
        String[] imiona2 = new String[2];
        imiona2[0]="eala";
        imiona2[1]="Tatakan";
        ludzie[0] = new Pracownik(imiona, "aramen",LocalDate.of(2020, 1, 8),true,LocalDate.of(2020, 1, 1),2000);
        ludzie[1] = new Student(imiona2,"Korwinus", "informatyka",LocalDate.of(2020, 1, 1),false,4.47);
        ludzie[1].getplec();
        ludzie[1].getOpis();
        ludzie[1].getplec();
        ludzie[0].getplec();
        ludzie[0].getOpis();
        System.out.println(ludzie[0].getplec()?"kobieta":"facet");
        System.out.println(ludzie[0].getdate());
        System.out.println(ludzie[0].getOpis());
        System.out.println(ludzie[1].getplec()?"kobieta":"facet");
        System.out.println(ludzie[1].getOpis());
        System.out.println(ludzie[1].getdate());

        for (Osoba p : ludzie) {
            System.out.println(p.getNazwisko() + ": " + p.getOpis());
        }
    }
}

abstract class Osoba
{
    public Osoba(String[] imiona,String nazwisko,LocalDate data , boolean plec)
    {
        this.imiona = imiona;
        this.nazwisko = nazwisko;
        this.data = data;
        this.plec = plec;
    }

    public abstract String getOpis();

    public String getNazwisko()
    {
        return nazwisko;
    }
    public String getimie()
    {
        return imiona[0]+" "+ imiona[1];
    }
    public LocalDate getdate()
    {
        return data;
    }
    public boolean getplec()
    {
        return plec;
    }
    private String[] imiona;
    private String nazwisko;
    private LocalDate data;
    private boolean plec;
}

class Pracownik extends Osoba
{
    private LocalDate datap;
    public Pracownik(String[] imiona, String nazwisko, LocalDate data , boolean plec , LocalDate datap, double pobory )
    {
        super(imiona,nazwisko,data,plec);
        this.pobory = pobory;
        this.datap=datap;
    }

    public double getPobory()
    {
        return pobory;
    }
    public LocalDate getdatazatrudnienia()
    {
        return datap;
    }
    public String getOpis()
    {
        return String.format("pracownik z pensją %.2f zł", pobory);
    }

    private double pobory;
}

class Student extends Osoba
{
    public Student(String[] imiona,String nazwisko,String kierunek,LocalDate data,boolean plec,double sredniaocen)
    {
        super(imiona,nazwisko,data,plec);
        this.kierunek = kierunek;
        this.sredniaocen=sredniaocen;
    }

    public String getOpis()
    {
        return "kierunek studiów: " + kierunek;
    }
    public double getSredniaocen()
    {
        return  sredniaocen;
    }
    private double sredniaocen;
    private String kierunek;
}