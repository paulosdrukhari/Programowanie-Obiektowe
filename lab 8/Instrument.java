package pl.pawel155257.deptula;
import java.time.LocalDate;
abstract class Instrument{
String producent;
LocalDate dataProdukcji;
public Instrument(String producent,LocalDate rokProdukcji)
{
    this.producent = producent;
    this.dataProdukcji = rokProdukcji;
}

public String getProducent()
{
    return producent;
}

public abstract String dzwiek();
public boolean equals(Instrument other)
{
        return producent.equals(other.producent) && dataProdukcji.equals(other.dataProdukcji);
}
public LocalDate getrokProdukcji()
{
        return dataProdukcji;
}
public String toString()
{
        return  producent + " "  + dataProdukcji;
}
}

abstract class Flet extends Instrument
{
    public String dzwiek()
    {
        return "Habudabi na flecie ";
    };
    public Flet(String producent,LocalDate dataProdukcji)
    {
        super(producent,dataProdukcji);
    }    
}
abstract class Fortepian extends Instrument
{
    public String dzwiek()
    {
        return " Szopen na fortepianie ";
    };
    public Fortepian(String producent,LocalDate dataProdukcji)
    {
        super(producent,dataProdukcji);
    }    
}

abstract class Skrzypce extends Instrument
{
    public String dzwiek()
    {
        return " gra na skrzypcach z kosci mamuciej ";
    };
    public Skrzypce(String producent,LocalDate dataProdukcji)
    {
        super(producent,dataProdukcji);
    }
}