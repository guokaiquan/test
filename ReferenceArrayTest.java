package com.java.gkq;

public class ReferenceArrayTest {
	public static class Person{
		public int age;
		public double height;
		public void info() {
			System.out.println("我的年龄是："+age+",我的身高是："+height);
		}
	}
	public static void main(String[] args)
	{
		Person[] students;
		students = new Person[5];
		System.out.println("students所引用数组的长度是："+students.length);
		Person zhang = new Person();
		zhang.age=15;
		zhang.height=158;
		Person lee = new Person();
		lee.age=12;
		lee.height=122;
		students[0] = zhang;
		
		
		
	}
}
