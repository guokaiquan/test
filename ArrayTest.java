package com.java.gkq;

public class ArrayTest {
	public static void main(String[] args)
	{
		//��̬��ʼ��1
		String[] books = new String[]
				{
						"���java����",
						"��һ��ѧϰ",
						"����ľ�̬��ʼ��"
				};
		//��̬��ʼ��2
		String[] names = new String[]
				{
						"����",
						"ӨӨ"
						
				};
		//��̬��ʼ��
		String[] strArr = new String[5];
		//����3������ĳ���
		System.out.println("��һ������ĳ��ȣ�" + books.length);//Ctrl+alt+����
		System.out.println("�ڶ�������ĳ��ȣ�" + names.length);
		System.out.println("����������ĳ��ȣ�" + strArr.length);
		
		System.out.println("strArr��һ�����ĳ�ֵ ��" + strArr[1]);
		//��books���������strArr�������ָ��names�����õ����飬������鳤�ȱ仯
		books = names;
		strArr = names;
		System.out.println("-----------");
		System.out.println("books����ĳ���:" + books.length);
		System.out.println("strArr����ĳ���:" + strArr.length);
		//�ı�books����ڶ�Ԫ�ص�ֵ
		books[1] = "��˽�";
		System.out.println("names����ĵڶ���Ԫ�أ�" + books[1]);
	}
}
