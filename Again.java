package Work;

import java.util.*;

public class Again {

	public static void main(String[] args) 
	{
		//5�� �л��� 5�� �׸� ���� �Է� o
		//0~100�� �������� Ȯ�� o
		//�� �л��� ����, ��� ,, �� ������ ��� ��� ����ϴ� ���α׷� o
		//��������л�, ���� �ְ� ������
		
		String name[] = {"��", "��", "��", "��","��"}; //�л� �迭
		String sub[] = {"JAVA","C","C++","PYTHON","C#"}; //���� �迭
		int[][] st_sub = new int[name.length][sub.length]; //�л�, ���� Ű���� �Է°� 
		double[] st_arr = new double[name.length]; //�� �л� ���
		int[] st_sum = new int[name.length];// �� �л� �� ��
		
		
		System.out.println("5�� �л� 5�� ������ �Է��Ͻÿ�");
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < name.length; i++) //�л� �� ��ŭ for
		{
			for(int j = 0; j < sub.length; j++) //���� �� ��ŭ for
			{
				System.out.print(name[i] + " �л��� " + sub[j]+" ���� �Է� : "); //� �л�, � ���� 
				st_sub[i][j] = sc.nextInt(); //Ű���� �Է�
				
				if(st_sub[i][j] < 0 || st_sub[i][j] > 100) //0~100 �Ǻ�
				{
					System.out.println("�ٽ� �Է��Ͻÿ�");
					--j;
				}//if
				
				st_sum[i] += st_sub[i][j]; //�� �л� ���� �� ��
				st_arr[i] = st_sum[i]/sub.length; //�� �л� �� ���
				
			}//sub.length (for)
			System.out.println("=====================");
			System.out.println(name[i] + " �л��� �� �� : " + st_sum[i]);
			System.out.println(name[i] + " �л��� ��� : " + st_arr[i]);
			System.out.println("=====================");
			
		}//name.length (for)
		for(int i =0; i < st_sum.length; i++)
		{
			System.out.println(st_sum[i]);
			System.out.println();
		}
		
	}//main

}//class