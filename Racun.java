import java.util.Arrays;

public class Racun {
    public enum VrstaRacuna {TEKUCI, DEVIZNI, STEDNI};
    VrstaRacuna _vrstaRacuna;
    char brojRacuna[]=new char[20];
    boolean _aktivan;
    Kolekcija transakcije;
    public final void Ispis(){
        System.out.println("Vrsta racuna: ");
        System.out.println(_vrstaRacuna);
        System.out.println("\n");
        System.out.println("Broj racuna: ");
        System.out.println(brojRacuna);
        System.out.println("\n");
        System.out.println("Broj transakcije: ");
        System.out.println(transakcije.brojac);
        System.out.println("\n");
    }
    public final void Deaktiviraj(){
        _aktivan=false;
    }
    public float Saldo(){
        float s=0;
        for (int i=0; i<transakcije.brojac; i++){
        }
        return s;
    }
    public void Uplata(float iznos, Datum datum)
    {
        Transakcija new_v = new Transakcija();
        new_v.NapraviUplatu(iznos, datum);
        transakcije.Dodaj(new_v);
    }
    public void Isplata(float iznos, char []to,  Datum datum)
    {
        Transakcija new_v = new Transakcija();
        new_v.NapraviIsplatu(iznos,to, datum);
        transakcije.Dodaj(new_v);
    }
    public  static Racun Napravi(VrstaRacuna vrsta_racuna, char[] _broj_racuna)
    {
        Racun r = new Racun();

        r._vrstaRacuna = vrsta_racuna;
        r.brojRacuna=Arrays.copyOf(_broj_racuna, _broj_racuna.length);
        return r;
    }

}
