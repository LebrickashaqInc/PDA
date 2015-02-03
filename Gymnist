import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Gymnist {

	public List<String> scores = new ArrayList<String>();
	 void addScore(String s){
		 scores.add(s);
		 
	 }
	 
	 void fix(){
		 Collections.sort(scores);
		 scores.remove(0);
		 scores.remove(scores.size()-1);
	 }
	 double average(){
		 double avrg=0;
		for(int i=0; i< scores.size();i++){
			//System.out.println( scores.get(i));
			avrg+= Double.parseDouble( scores.get(i));
		}
		avrg/=scores.size();
		 return avrg ; 
	 }
}
