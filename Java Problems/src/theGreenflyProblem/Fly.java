package theGreenflyProblem;

public class Fly {
	private int NumFlies;
	private int lifeTime;
	
	
	public Fly(int numFlies, int lifeTime) {
		super();
		NumFlies = numFlies;
		this.lifeTime = lifeTime;
	}
	public int getNumFlies() {
		return NumFlies;
	}
	public void setNumFlies(int numFlies) {
		NumFlies = numFlies;
	}
	public int getLifeTime() {
		return lifeTime;
	}
	public void setLifeTime(int lifeTime) {
		this.lifeTime = lifeTime;
	}
	

}
