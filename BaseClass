import java.util.Random;

public class MonteCarlo 
{
    public double  h,k,r;
    private  Random rndm = new Random();
	public MonteCarlo(double h,double k,double r)
	{
	 this.h=h;
	 this.k=k;
	 this.r=r;
	}
	
	public double nextRainDrop_x(){
		return (rndm.nextDouble()*2*r)+(h-r);
	}
	
	public double nextRainDrop_y(){
		return (rndm.nextDouble()*2*r)+(k-r);
	}
	
	public boolean insideCirle(double x , double y){
		
		return Math.pow((x-h), 2)+Math.pow((y-k), 2)<=Math.pow(r,2);
	}
}
