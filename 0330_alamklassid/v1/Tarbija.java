public class Tarbija{
	double r, maxN;
	public Tarbija(double r, double maxN){
		this.r=r; this.maxN=maxN;
	}
	public double kysiTakistus(){
		return r;
	}
	public double kysiMaxVoimsus(){
		return maxN;
	}
	public double kysiVool(double pinge){
		//Koostage funktsioon
		//Koostage prooviprogramm Tarbija eksemplari katsetamiseks
		return pinge/kysiTakistus();
	}
	public double kysiMaxPinge(){
        return Math.sqrt(kysiTakistus()*kysiMaxVoimsus());
    }
    public boolean kasLubatudPinge(double pinge){
     if(pinge>kysiMaxPinge()){return false;}
     return true;   
    }
    public boolean kasLubatudVool(double vool){
       double pinge=vool*kysiTakistus();
       
      return kysiMaxVoimsus()>=pinge*vool;
    }
}