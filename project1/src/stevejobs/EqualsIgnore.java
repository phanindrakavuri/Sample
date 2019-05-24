package stevejobs;
public class EqualsIgnore
{
	public static void main(String[] args)
	{
		String x="mindq";
		String y="mindQ";
		if(x.equalsIgnoreCase(y))
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not same");                           
		}

	}

}
