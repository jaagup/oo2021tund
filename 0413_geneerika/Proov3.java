import java.util.*;
public class Proov3{
    public static <T> Map<T, Integer> sagedustabel(List<T> m){
        Map<T, Integer> vastus=new HashMap<T, Integer>();
        for(T e: m){
            if(vastus.containsKey(e)){
                vastus.put(e, vastus.get(e)+1);
            } else {
                vastus.put(e, 1);
            }
        }
        return vastus;
    }
    public static void main(String[] arg){
        Paar<String, String> p1=new Paar<>("Juku", "Kati");
        Paar<String, String> p2=new Paar<>("Juku", "Kati");
        System.out.println(p1.equals(p2));
        List<Paar<String, String> > paarid=new ArrayList<Paar<String, String> >();
        paarid.add(new Paar<String, String>("Juku", "Kati"));
        paarid.add(new Paar<String, String>("Juku", "Kati"));
        paarid.add(new Paar<String, String>("Kati", "Mati"));
        System.out.println(sagedustabel(paarid));
    }
}