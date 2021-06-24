package MyPack;
public class Player
{
	String name;
	int score;
	public Player(String name, int score)
	{
		this.name = name;
		this.score = score;
	}
	public void display()
	{
		System.out.println("Name  = "+name);
		System.out.println("Score = "+score);
	}
}