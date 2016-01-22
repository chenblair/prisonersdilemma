
public class RAN extends Player
{
	int score=0;
	public boolean respond(boolean previous,int points)
	{
		score+=points;
		return Math.random()< 0.5;
	}
}
