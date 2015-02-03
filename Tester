
public class Tester 
{
 static MonteCarlo monteCarlo = new MonteCarlo(5,3,2);
 static int cirCount=0;
 static int sqrCount =0;
  public static void main(String[] args)
  {  		
   		for(int i=0; i<10000000;i++){
   			double randx = monteCarlo.nextRainDrop_x();
   			double randy = monteCarlo.nextRainDrop_y();
   			if(monteCarlo.insideCirle(randx, randy)){
   				cirCount++; 				
   			}
   			sqrCount++;
   		}
   		System.out.println("Pi is about "+cirCount*Math.pow((2*monteCarlo.r), 2)/(sqrCount*Math.pow(monteCarlo.r, 2)));
  }
	
}
