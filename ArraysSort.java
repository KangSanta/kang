package Work;

import java.util.*;

public class ArraysSort {

	public static void main(String[] args) 
	{
		System.out.println("몇개의 랜덤 숫자를 가ㅣㅈ고 정렬을 실시할까요? : ");
		Scanner sc = new Scanner(System.in);
		int numbers = sc.nextInt();
		Integer[] element = new Integer [numbers];
		
		for(int i = 0; i < numbers; i++)
		{
			element[i] = (int)(Math.random()*100) + 1;
		}
		System.out.println("생선된 " + numbers + "개의 요소는 다음과 같습니다.");
		for(int i = 0; i < numbers; i++)
		{
			System.out.print(element[i] + " ");
		}
		System.out.println();
		System.out.println("오름차순으로 정렬");
		Arrays.sort(element);
		for(int i =0; i < numbers; i++)
			System.out.print(element[i] + " ");
		System.out.println();
			
		System.out.println("내림차순으로 정렬");
		Arrays.sort(element, Collections.reverseOrder());
		for(int i = 0; i < numbers; i++)
		{
			System.out.print(element[i] + " ");
		}
		System.out.println();
		
	}//main

}
