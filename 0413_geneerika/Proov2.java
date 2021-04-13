import java.util.*;
public class Proov2{
    
    
    //Koostage alamprogramm massiivi esimese ja viimase elemendi vahetamiseks
    //Katsetage
    
    
    
    public static <T> void tryki(T[] m){
        for(int i=0; i<m.length; i++){
            T a=m[i];
            System.out.println(a);
        }
    } 

    public static <T> Map<T, Integer> sagedustabel(T[] m){
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

    public static Character[] teisenda(char[] m){
       Character[] vastus=new Character[m.length];
       for(int i=0; i<m.length; i++){
           vastus[i]=m[i];
       }
       return vastus;
    }

    public static void main(String[] arg){
        tryki(arg);
//        tryki(new Integer[]{3, 10, 21});
        System.out.println(sagedustabel(arg));
        System.out.println(sagedustabel(teisenda("tere".toCharArray())));
        System.out.println(sagedustabel("tere".split("")));
        System.out.println(sagedustabel(new String[][]{{"t", "e"}, {"t", "e"}, {"e", "r"}}));
    }
}