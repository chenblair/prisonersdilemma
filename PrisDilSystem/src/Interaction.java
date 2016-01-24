//strategies: https://docs.google.com/spreadsheets/d/1io7_Tw5uInuwc7YjdeJb2QsRziiIh7Knjn1GdFc-7yg/edit#gid=0
public class Interaction
{
	boolean prevA1=false,prevA2=false;
	int prevS1=0,prevS2=0;
	Rewards reward=new Rewards();
	public void interact(Player a,Player b)
	{
		prevS1=reward.getScore1(a.respond(prevA2,prevS1),b.respond(prevA1,prevS2));
		prevS2=reward.getScore2();
	}
}
