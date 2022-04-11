package Work;

public class Hahaha {

	public static void main(String[] args) 
	{
		String[] name = {"강","민","서"};
		String[] sub = {"국","영","수"};
		int[][] st_sub = new int[name.length][sub.length];
		
		for(int i =0; i < name.length; i++)
		{
			System.out.println("name.length : " + name.length);
			System.out.println();
			for(int j =0; j < name[i].length(); j++)
			{
				System.out.println("name[i].length() : " + name[i].length());
			}
			System.out.println();
		}
		for(int j =0; j < sub.length; j++)
		{
			System.out.println("sub.length ; " + sub.length);
		}
	}//main

}
