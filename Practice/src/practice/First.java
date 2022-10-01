package practice;

import java.util.Scanner;

public class First {
	public static void main(String[] args)
	{
		System.out.println("请输入：");
		Scanner in = new Scanner(System.in);
//		if(type==1)
//			System.out.println("你好");
//		else if(type==2)
//			System.out.println("早上好");
//		else if(type==3)
//			System.out.println("晚上好");
		int type=in.nextInt();
//		else if(type==4)
//			System.out.println("再见");
//		else
//			System.out.println("啊，什么啊？");
		switch(type)
		{
		case 1:
			System.out.println("你好");	
			break;
		case 2:
			System.out.println("gooe morning");
			break;
		case 3:
			System.out.println("good night");
			break;
		case 4:
			System.out.println("good bye");
			break;
			default:
				System.out.println("What did you just say?");
		}
	}

}
