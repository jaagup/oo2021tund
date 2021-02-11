import java.util.*;
public class Retsept{
    Hashtable<String, Double> ained=new Hashtable<String, Double>();
    public Set kysiAinenimed(){return ained.keySet();}
    public Hashtable<String, Double> kysiAined(){return ained;}
    public void lisa(String aine, double kogus){
        if(ained.containsKey(aine)){
            throw new RuntimeException(aine+" juba olemas");
        }
        ained.put(aine, kogus);
    }
    public double koguMass(){
        double summa=0;
        for(double kogus: ained.values()){
            summa+= kogus;
        }
        return summa;
    }
    public Retsept koopia(double koef){
        Retsept uus=new Retsept();
        for(String aine: ained.keySet()){
            uus.lisa(aine, koef*ained.get(aine));
        }
        return uus;
    }
    public Retsept soovitudMassigaKoopia(double grammid){
        //Koostage funktsioon soovitud massiga retseptikoopia saamiseks
        return koopia(grammid/koguMass());
    }
}