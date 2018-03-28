

import java.util.Arrays;

public class Transakcija {
    public enum VrstaTransakcije {UPLATA, ISPLATA};
    static Datum datumTransakcije;
    static float iznos;
    char _TO[]=new char[20];
    VrstaTransakcije _vrstaTransakcije;
    boolean _aktivna;
    public final void Ispis(){
        if (_aktivna==true){
            System.out.println("Vrsta transakcije: ");
            System.out.println(_vrstaTransakcije);
            System.out.println("\n");
            System.out.println("Iznos: ");
            System.out.println(iznos);
            System.out.println("\n");
            System.out.println("To: ");
            System.out.println(_TO);
            System.out.println("\n");
        }else {
            System.out.println("Transakcija je obrisana.");
            System.out.println("\n");
        }
    }
    public static Transakcija NapraviUplatu(float _iznos, Object datum){
        Datum d=(Datum) datum;
        Transakcija t=new Transakcija();
        t._vrstaTransakcije=VrstaTransakcije.UPLATA;
        t.iznos=_iznos;
        t.datumTransakcije=d;
        t._aktivna=true;
        return t;
    }
    public static Transakcija NapraviIsplatu(float _iznos, char[] to, Object datum){
        Datum d=(Datum) datum;
        Transakcija t=new Transakcija();
        t._vrstaTransakcije=VrstaTransakcije.ISPLATA;
        t.iznos=_iznos;
        t.datumTransakcije=d;
        t._aktivna=true;
        t._TO=Arrays.copyOf(to, to.length);
        return t;
    }
}
