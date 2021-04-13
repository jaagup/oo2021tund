public class Paar<T, U>{
    T esimene;
    U teine;
    public Paar(T e, U t){
        esimene=e;
        teine=t;
    }
    public String toString(){
        return esimene+" - "+teine;
    }
    @Override
    public boolean equals(Object vorreldav){
        if(!(vorreldav instanceof Paar)){return false;}
        Paar v2=(Paar)vorreldav;
        return esimene.equals(v2.esimene) &&
               teine.equals(v2.teine);
    }
    @Override
    public int hashCode(){
        return (int)esimene.hashCode()*teine.hashCode();
    }
}