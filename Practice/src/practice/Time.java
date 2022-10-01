package practice;

import java.util.Scanner;

/*
 * 题目输入
 * 一个整数，表示BJT的时和分。
 * 整数的个位和十位表示分，百位和千位表示小时。
 * 如果小时小于10，则没有千位部分；
 * 如果小时是0，则没有百位部分；
 * 如果小时不是0而且分小于10分，需要保留十位上的0。
 * 如1124表示11点24分，而905表示9点5分，36表示0点36分，7表示0点7分。
 * 有效的输入范围是0到2359
 *
 * */

//分析：
//h=BJT/100&m=BJT%100
//此题可分为两种情况：
//1：h>=8&h<=23,m>=0&m<60
//则UTC时间为：
//UTC=（h-8)*100+m
//UTC=(BJT/100-8)*100+BJT%100
//2:h>=0&h<=8,m>=0&m<60
//则UTC时间为：
//UTC=(h-8+24)*100+m
//UTC=(BJT/100-8+24)*100+BJT%100
public class Time{
	public static void main(String[] args)
	{
		Scanner t=new Scanner(System.in);
		int BJT=t.nextInt();
		int UTC=0;
		int h=BJT/100;
		int m=BJT%100;
		if ((h>=8 && h<24) && (m >= 0 && m < 60))
		{
			UTC=(h-8)*100+m;
		}
		else if ((h == 0 || h < 8) && (m >= 0 && m <60))
		{
			UTC=(h - 8 + 24) * 100 + m;
		}
		else
		{
			System.out.println("输入错误");
			System.exit(-1);//退出
		}
		System.out.println(UTC);
	}
}