public class Proov4{
    public static void main(String[] arg){
        Puhver<Integer, Integer> p1=
         new Puhver<Integer, Integer>(new RuuduArvutaja());
        System.out.println(p1.arvuta(3));
        System.out.println(p1.arvuta(5));
        System.out.println(p1.arvuta(3));
        System.out.println(p1.hoidla);
    }
}