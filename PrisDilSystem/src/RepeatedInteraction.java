import java.util.*;
public class RepeatedInteraction {
	int ttlReps=100;
	Map<Integer,Integer> numReps= new HashMap<Integer,Integer>();
	public void interact(Player a,Player b)
	{
		Interaction interaction=new Interaction(a,b);
		for (int i=0;i<ttlReps;i++)
		{
			interaction.interact();
		}
	}
	
	public boolean controlledInteract(int id,Player a,Player b)
	{
		if (numReps.containsKey(id))
		{
			if (numReps.get(id).intValue()>100)
				return false;
			numReps.put(id,new Integer(numReps.get(id).intValue() + 1));
		} else
			numReps.put(id, 1);
		return true;
	}
}
