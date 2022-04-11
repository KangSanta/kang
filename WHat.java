package Work;

public class WHat {

	public static void main(String[] args) 
	{
		if (args.length > 0)
		{
			for(int i = 0; i < args.length; i++)
			{
				System.out.print(" " + args[i]);
			}//for
			
			if(args[0].equals("-h"))
			{
				System.out.println("HELP ");
			}
		}//if
	}

}
