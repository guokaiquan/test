package com.java.gkq;

public class ArrayTest3 {
	public static void main(String[] args)
	{
		//定义初始化nums数组
		int[] nums = new int[] {3,5,20,12};
		//定义一个prices数组变量
		int[] prices;
		//让prices数组指向nums所引用的数组对象
		prices = nums;
		for (int i =0;i <prices.length ; i++) {
			System.out.println(prices[i]);
			
		}
		prices[2] = 34;
		System.out.println("nums数组的第三个元素的值是：" + nums[2]);
		
	}
}
