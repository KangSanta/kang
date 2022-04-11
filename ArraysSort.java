package Work;

import java.util.*;

public class ArraysSort {

	public static void main(String[] args) 
	{
		System.out.println("��� ���� ���ڸ� ���Ӥ��� ������ �ǽ��ұ��? : ");
		Scanner sc = new Scanner(System.in);
		int numbers = sc.nextInt();
		Integer[] element = new Integer [numbers];
		
		for(int i = 0; i < numbers; i++)
		{
			element[i] = (int)(Math.random()*100) + 1;
		}
		System.out.println("������ " + numbers + "���� ��Ҵ� ������ �����ϴ�.");
		for(int i = 0; i < numbers; i++)
		{
			System.out.print(element[i] + " ");
		}
		System.out.println();
		System.out.println("������������ ����");
		Arrays.sort(element);
		for(int i =0; i < numbers; i++)
			System.out.print(element[i] + " ");
		System.out.println();
			
		System.out.println("������������ ����");
		Arrays.sort(element, Collections.reverseOrder());
		for(int i = 0; i < numbers; i++)
		{
			System.out.print(element[i] + " ");
		}
		System.out.println();
		
	}//main

}
