public class Arvutus2{
    public static void main(String[] arg){
        System.out.println("argumente: "+arg.length);
        if(arg.length==1){
            System.out.println("Ainuke: "+arg[0]);
        }
        if(arg.length==2){
            System.out.println("Loodetavasti kaks arvu");
            int arv1=Integer.parseInt(arg[0]);
            int arv2=Integer.parseInt(arg[1]);
            System.out.println(arv1*arv2);
        }
        //Kui on kolm arvu, kuvage nende summa
        // + kui valmis
        for(String a: arg){
            System.out.println(a);
        }
        for(int i=0; i<arg.length; i++){
            System.out.println("Kohal "+i+" on "+arg[i]);
        }
        //4 ja rohkema arvu puhul kuvage arvude summa
        //tsükli abil
        
    }
}