import java.io.File;
import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gym {

	static List<Gymnist> Gymnists = new ArrayList<Gymnist>();

	
	public static void initScores(){
		Scanner sc;
		try {
			sc = new Scanner(new File("MoreTestData.txt"));
			while (sc.hasNext()) {
				Scanner sc2 = new Scanner(sc.nextLine());
				Gymnist g = new Gymnist();
				while (sc2.hasNext()) {
				//	System.out.println(sc2.next());
					g.addScore(sc2.next());
				}
				g.fix();
				Gymnists.add(g);

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	
	}
	public static void main(String[] args) {
		initScores();
		NumberFormat fmt = NumberFormat.getNumberInstance();
		fmt.setMinimumFractionDigits(4);
		fmt.setMaximumFractionDigits(4);

		for(int i=0;i<Gymnists.size();i++){
			System.out.println("For Competitor #"+(i+1)+", the average is "+fmt.format(Gymnists.get(i).average()) );
		}
		
	}

}
