package Work;

import java.util.Scanner;

public class Rain {
	public static void main(String[] args) 

	{

		String[] years = {"2012", "2013","2014","2015","2016","2017","2018","2019","2020","2021"};
		String[] month = {"1","2","3","4","5","6","7","8","9","10","11","12"};
		int[][] rain = new int [years.length][month.length];
		
		int[] sum = new int [years.length]; // ����
		double arr =  0; //�� ���
		int years_sum = 0; //10�� ���췮 ��
		double years_arr = 0.0; //10�� ���췮 ���
		int[] month_sum = new int[month.length];
		int a=0;
		double[] month_avg =new double[month.length];

		Scanner sc = new Scanner(System.in);

		for(int i =0; i < years.length; i++) 

		{
			for(int j = 0; j < month.length; j++)
			{
				System.out.print(years[i] + "�� "+ month[j]+"�� ���췮 �Է� : ");
				rain[i][j] = sc.nextInt();
				sum[i] += rain[i][j]; //���� ������ �Է�
				arr = (double)sum[i] / month.length; //���� ���
				
				if(rain[i][j] < 0 || rain[i][j] > 1500) //0~1500 ����
				{
					System.out.println("0~1500 ���̸� �Է��Ͻÿ�");
					--j;
				}//if			

			}//month(for-j)
			years_sum += sum[i]; //10�� ���췮 ��
			years_arr = years_sum / 10; //10�� ���췮 ���
			System.out.println("===============================");
		}// years(for-i)	
		for(int i =0; i < years.length; i++)
		{
			
			System.out.println(years[i]+"�� �� ���췮 : "+sum[i]);
			System.out.println(years[i]+"�� �� ��� ���췮 : " + arr);
			System.out.println("===============================");
		}
			
		System.out.println("���� 10�� ��� ���췮 : "+years_arr);
		System.out.println();
		
		for(int i = 0; i < month.length; i++)
		{
			for(int j = 0; j < years.length; j++)
			{
				month_sum[i] += rain[j][i];
			}
			month_avg[i] += month_sum[i] /years.length;
		}
		for(int i = 0; i < month.length; i++)
		{
			System.out.println(month[i]+"�� �� ��� ���췮 : " + month_avg[i]);
		}
	}//main
}//class
