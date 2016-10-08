package com.day1008.coreJava2;

import java.util.Scanner;

public class CoreJava2 {
	public static void main(String[] args) {
		System.out.println("请输入一个（小于5位）的整数：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num > 9999) {
			System.out.println("输入不符合要求");
		} else {
			System.out.print("个位是" + num % 10 + ",");
			num = num / 10;
			if (num / 10 > 0) {
				System.out.print("十位是" + num % 10 + ",");
			}
			num = num / 10;
			if (num / 10 > 0) {
				System.out.print("百位是" + num % 10 + ",");
			}
			num = num / 10;
			System.out.print("千位是" + num % 10);
		}
		sc.close();
	}
}
