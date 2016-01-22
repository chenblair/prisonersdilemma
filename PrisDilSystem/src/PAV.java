
public class PAV extends Player
{
	int score=0;
	boolean sPrev=true;
	boolean first=true;
	public boolean respond(boolean previous,int points)
	{
		if (first)
		{
			first=false;
			return true;
		}
		score+=points;
		if (score>=3)
		{
			return sPrev;
		}
		sPrev=!sPrev;
		return sPrev;
	}
}
