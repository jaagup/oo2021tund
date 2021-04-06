public class Proov2{
    public static void kuvaOlek(Voolujuht v){
        if(v.kasJuhib()){
            System.out.println("Juhib");
        } else {
            System.out.println("Ei juhi");
        }
    }
    public static void main(String[] arg){
        Lyliti l1=new Lyliti();
        l1.seisund(false);
        Lyliti l2=new Lyliti();
        l2.seisund(true);
        Roopyhendus r1=new Roopyhendus();
        r1.lisa(l1);
//        r1.lisa(l2);
        kuvaOlek(r1);
    }
}