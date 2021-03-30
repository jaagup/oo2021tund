public class Proov2{
    public static void main(String[] arg){
        Takisti t1=new Takisti(1000, 5);
        Takisti t2=new Takisti(1000, 5);
        Roopyhendus r1=new Roopyhendus();
        r1.lisa(t1);
        r1.lisa(t2);
        System.out.println(r1.kysiTakistus());
        System.out.println(r1.kysiMaxVoimsus());
        System.out.println(r1.kysiMaxPinge());
        //Leidke, kuidas muutub takistus, maxvõimsus ja maxpinge, 
        //kui siia rööbiti lisada 40W 220V lambipirn
    }
}