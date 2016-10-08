package com.day1008.coreJava6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoreJava6 {
	public static void main(String[] args) {
		System.out.print("输入一个整数：");
		int num;
		int sum1=0,sum2=0;
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		int flag=1;
		while(num>0){
			
			
			if(flag%2==0){
				list1.add(num%10);
			}else{
				list2.add(num%10);
			}
			flag++;
			num=num/10;
		}
		System.out.print("奇数位有：");
		for(int i:list1){
			System.out.print(i+" ");
			sum1=sum1+i;
		}
		System.out.println();
		System.out.print("偶数位有：");
		for(int i:list2){
			System.out.print(i+" ");
			sum2=sum2+i;
		}
		System.out.println();
		System.out.println("奇数位之和："+sum1);
		System.out.println("偶数位之和："+sum2);
		sc.close();
	}
}
