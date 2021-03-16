public class JaagupiKalkulaator implements KalkulaatoriLiides{
	String paneel="";
	public void vajutus(String nupp){
		if(nupp.equals("C")){
			paneel="0";
		}	else {
			paneel=nupp;
		}
	}
	public String kuvatav(){
		return paneel;
	}
}