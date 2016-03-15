
public class ETI extends Player
{
	int score=0;
	boolean first=false;
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
