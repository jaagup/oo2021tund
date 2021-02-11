public class Proov1{
    public static void main(String[] arg){
        Isikukood jaagup=new Isikukood("37605030299");
        Isikukood paula=new Isikukood("61009170132");
        System.out.println(jaagup.kuuNumber());
        System.out.println(jaagup.sugu());
        System.out.println(paula.sugu());
    }
}