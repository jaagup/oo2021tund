public class Proov3{
    public static void main(String[] arg){
        Retsept pannkoogid=new Retsept();
        pannkoogid.lisa("piim", 500.0);
        pannkoogid.lisa("jahu", 250.0);
//        pannkoogid.lisa("piim", 50.0);
        System.out.println(pannkoogid.kysiAinenimed());
        System.out.println(pannkoogid.koguMass());
        System.out.println(pannkoogid.kysiAined());
        //Lisage veel mõned ained, katsetage toimimist
        Retsept paljuPannkooke=pannkoogid.koopia(3);
        System.out.println(paljuPannkooke.kysiAined());
        System.out.println(pannkoogid.soovitudMassigaKoopia(500).kysiAined());
    }
}