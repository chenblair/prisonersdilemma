
public class Rewards {
	int dc=0,dd=2,cc=1,cd=3;
	int reward2=0;
	public int getScore1(boolean action1,boolean action2)
	{
		if (action1&&action2)
		{
			reward2=cc;
			return cc;
		}
		if (action1&&!action2)
		{
			reward2=dc;
			return cd;
		}
		if (!action1&&action2)
		{
			reward2=cd;
			return dc;
		}
		reward2=dd;
		return dd;
	}
	public int getScore2()
	{
		return reward2;
	}
}
