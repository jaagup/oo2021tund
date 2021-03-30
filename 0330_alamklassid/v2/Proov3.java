public class Proov3{
    public static void main(String[] arg){
        Lyliti l1=new Lyliti();
        Lyliti l2=new Lyliti();
        Roopyhendus r1=new Roopyhendus();
        r1.lisa(l1);
        r1.lisa(l2);
        Sisend a=new Sisend();
        a.lisa(l1);
        Sisend b=new Sisend();
        b.lisa(l2);
        a.seisund(false);
        b.seisund(false);
        System.out.println(r1.kysiTakistus());
    }
}