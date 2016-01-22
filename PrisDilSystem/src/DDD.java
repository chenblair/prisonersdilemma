
public class DDD extends Player
{
	int score=0;
	public boolean respond(boolean previous,int points)
	{
		score+=points;
		return false;
	}
}
