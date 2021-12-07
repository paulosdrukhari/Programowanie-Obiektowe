package pl.pawel155257.deptula;
import java.time.LocalDate;
import java.util.ArrayList;
public class TestInstrumenty{
        public static void main(String[] args)
        {
            ArrayList<String> orkiestra = new ArrayList<String>();
            Instrument[] instrumenty = new Instrument[6];
            instrumenty[0] = new Flet("Fleciara",LocalDate.of(2000,12,12)){};
            instrumenty[1] = new Fortepian("Forti",LocalDate.of(2077,12,12)){};
            instrumenty[2] = new Skrzypce("Skrzyp",LocalDate.of(2020,12,12)){};
            instrumenty[3] = new Flet("Fleciarz",LocalDate.of(1222,12,12)){};
            instrumenty[4] = new Fortepian("Dell",LocalDate.of(1070,12,12)){};
            instrumenty[5] = new Skrzypce("Skrzypiara",LocalDate.of(2001,12,12)){};
            for(int i=0;i<instrumenty.length;i++)
            {
                orkiestra.add(instrumenty[i].dzwiek());
            }

            for(int i = 0; i < orkiestra.size(); i++)   
            {
                System.out.print(orkiestra.get(i));
            }
        }      
}