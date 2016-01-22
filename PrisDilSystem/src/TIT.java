
public class TIT extends Player
{
	int score=0;
	boolean first=true;
	public boolean respond(boolean previous,int points)
	{
		if (first)
		{
			first=false;
			return true;
		}
		score+=points;
		return previous;
	}
}
