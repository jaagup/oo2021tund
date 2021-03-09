public class Proov1{
	public static void main(String[] arg){
		Hoidla h=new LihtneHoidla();
		for(int i=0; i<arg.length; i++){
			h.lisa(Integer.parseInt(arg[i]));
		}
		System.out.println(h.kysiSumma());
	}
}