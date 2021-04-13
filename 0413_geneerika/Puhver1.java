import java.util.*;
public class Puhver1{
    Map<Integer,Integer> hoidla=new HashMap<Integer, Integer>();
    public int faktoriaal(int arv){
        if(!(hoidla.containsKey(arv))){
            int abi=1;
            for(int i=1; i<=arv; i++){
                abi=abi*i;
            }
            hoidla.put(arv, abi);
        }
        System.out.println(hoidla);
        return hoidla.get(arv);
    }
    public static void main(String arg[]){
        Puhver1 p=new Puhver1();
        System.out.println(p.faktoriaal(5));
        System.out.println(p.faktoriaal(3));
        System.out.println(p.faktoriaal(5));
    }
}