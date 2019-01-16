package com.java.gkq;

public class ArrayTest {
	public static void main(String[] args)
	{
		//静态初始化1
		String[] books = new String[]
				{
						"疯狂java讲义",
						"第一天学习",
						"数组的静态初始化"
				};
		//静态初始化2
		String[] names = new String[]
				{
						"果果",
						"莹莹"
						
				};
		//动态初始化
		String[] strArr = new String[5];
		//访问3个数组的长度
		System.out.println("第一个数组的长度：" + books.length);//Ctrl+alt+向下
		System.out.println("第二个数组的长度：" + names.length);
		System.out.println("第三个数组的长度：" + strArr.length);
		
		System.out.println("strArr第一个数的初值 ：" + strArr[1]);
		//让books数组变量，strArr数组变量指向names所引用的数组，造成数组长度变化
		books = names;
		strArr = names;
		System.out.println("-----------");
		System.out.println("books数组的长度:" + books.length);
		System.out.println("strArr数组的长度:" + strArr.length);
		//改变books数组第二元素的值
		books[1] = "猪八戒";
		System.out.println("names数组的第二个元素：" + books[1]);
	}
}
