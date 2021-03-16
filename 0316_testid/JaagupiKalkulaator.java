public class JaagupiKalkulaator implements KalkulaatoriLiides{
	String paneel="";
	public void vajutus(String nupp){
		if(nupp.equals("C")){
			paneel="0";
		}	else if(paneel.equals("0")){
			paneel=nupp;
		} else {
			paneel+=nupp;
		}
	}
	public String kuvatav(){
		return paneel;
	}
}