package theGreenflyProblem;

import java.util.ArrayList;
import java.util.TreeMap;

public class GreenflyMethod {
	
	public static int greenFlyRepro() {
		int totalGreenFly = 1;
		int totalAdults = 1;
		ArrayList<Fly> flyList = new ArrayList<Fly>();
		for (int days = 0; days < 28; days++) {
			System.out.println("Day "+(days+1));
			int newBabies = totalAdults * 8;
			Fly fly = new Fly(newBabies, 0);
			flyList.add(fly);
			Fly flyRemove = null;
			totalGreenFly += newBabies;
			for(Fly f : flyList) {
				System.out.println("NumberOfBabies "+f.getNumFlies());
				f.setLifeTime(f.getLifeTime() + 1);
				if(f.getLifeTime() == 7) {
					totalAdults += f.getNumFlies();
					flyRemove = f;
					continue;
				}
			}
			flyList.remove(flyRemove);
			System.out.println("Adults "+totalAdults);
			System.out.println("Total flies "+totalGreenFly);
		}
		
		return totalGreenFly;
	}
	
	public static void main(String[] args) {
		System.out.println(greenFlyRepro());
	}

}
