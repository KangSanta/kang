package Work;

import java.util.*;

public class Again {

	public static void main(String[] args) 
	{
		//5명 학생의 5개 항목 성적 입력 o
		//0~100점 사이인지 확인 o
		//각 학생의 총점, 평균 ,, 각 과목의 평균 계산 출력하는 프로그램 o
		//성적우수학생, 과목별 최고 득점자
		
		String name[] = {"가", "나", "다", "롸","뭐"}; //학생 배열
		String sub[] = {"JAVA","C","C++","PYTHON","C#"}; //과목 배열
		int[][] st_sub = new int[name.length][sub.length]; //학생, 과목 키보드 입력값 
		double[] st_arr = new double[name.length]; //각 학생 평균
		int[] st_sum = new int[name.length];// 각 학생 총 합
		
		
		System.out.println("5명 학생 5개 성적을 입력하시오");
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < name.length; i++) //학생 수 만큼 for
		{
			for(int j = 0; j < sub.length; j++) //과목 수 만큼 for
			{
				System.out.print(name[i] + " 학생의 " + sub[j]+" 점수 입력 : "); //어떤 학생, 어떤 과목 
				st_sub[i][j] = sc.nextInt(); //키보드 입력
				
				if(st_sub[i][j] < 0 || st_sub[i][j] > 100) //0~100 판별
				{
					System.out.println("다시 입력하시오");
					--j;
				}//if
				
				st_sum[i] += st_sub[i][j]; //각 학생 과목 총 합
				st_arr[i] = st_sum[i]/sub.length; //각 학생 총 평균
				
			}//sub.length (for)
			System.out.println("=====================");
			System.out.println(name[i] + " 학생의 총 점 : " + st_sum[i]);
			System.out.println(name[i] + " 학생의 평균 : " + st_arr[i]);
			System.out.println("=====================");
			
		}//name.length (for)
		for(int i =0; i < st_sum.length; i++)
		{
			System.out.println(st_sum[i]);
			System.out.println();
		}
		
	}//main

}//class