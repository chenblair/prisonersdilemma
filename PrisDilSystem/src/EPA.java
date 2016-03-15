
public class EPA extends Player
{
	int score=0;
	boolean sPrev=true;
	boolean first=false;
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
