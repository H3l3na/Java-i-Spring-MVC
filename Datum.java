public class Datum {
    int dan;
    int mjesec;
    int godina;
    public static Datum Napravi(int dan, int mjesec, int godina){
        Datum newD=new Datum();
        newD.dan=dan;
        newD.mjesec=mjesec;
        newD.godina=godina;
        return newD;
    }
    public boolean equals(Object d){
        if (!(d instanceof Datum)){
            return false;
        }
        Datum drugi=(Datum) d;
        return(drugi.dan==dan && drugi.mjesec==mjesec && drugi.godina==godina);

    }
    public final void Ispis(){
        System.out.println(dan);
        System.out.println(".");
        System.out.println(mjesec);
        System.out.println(".");
        System.out.println(godina);
        System.out.println("\n");
    }
}
