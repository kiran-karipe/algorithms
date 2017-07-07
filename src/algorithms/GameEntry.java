
public class GameEntry {

	private String name;
	private int score;
	
	public GameEntry(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	
	public String toString() {
		return "("+name+",  "+score+")";
	}
	
	public static void main(String[] args) {
		GameEntry ge = new GameEntry("kiran", 50);
		System.out.println(ge);
	}
}
