package com.java.gkq;

public class ArrayTest3 {
	public static void main(String[] args)
	{
		//�����ʼ��nums����
		int[] nums = new int[] {3,5,20,12};
		//����һ��prices�������
		int[] prices;
		//��prices����ָ��nums�����õ��������
		prices = nums;
		for (int i =0;i <prices.length ; i++) {
			System.out.println(prices[i]);
			
		}
		prices[2] = 34;
		System.out.println("nums����ĵ�����Ԫ�ص�ֵ�ǣ�" + nums[2]);
		
	}
}
