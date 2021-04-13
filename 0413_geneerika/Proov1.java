import java.util.*;
public class Proov1{
    public static void main(String[] arg){
        Object ob1="tere";
        Object ob2=7;
        System.out.println(ob1+" "+ob2);
        //ob2="kapsas";
        if(ob2 instanceof Integer){
          int arv2=(int)ob2+1;
          System.out.println(arv2);
        }
        Object obm=new int[]{3, 6, 88};
        for(int arv:(int[])obm){
            System.out.println(arv);
        }
        Map<String, Integer> tulemused=new HashMap<String, Integer>();
        tulemused.put("Juku", 4);
        tulemused.put("Kati", 5);
        System.out.println(tulemused.get("Juku"));
    }
}