package com.day1008.coreJava2;

import java.util.Scanner;

public class CoreJava2 {
	public static void main(String[] args) {
		System.out.println("������һ����С��5λ����������");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num > 9999) {
			System.out.println("���벻����Ҫ��");
		} else {
			System.out.print("��λ��" + num % 10 + ",");
			num = num / 10;
			if (num / 10 > 0) {
				System.out.print("ʮλ��" + num % 10 + ",");
			}
			num = num / 10;
			if (num / 10 > 0) {
				System.out.print("��λ��" + num % 10 + ",");
			}
			num = num / 10;
			System.out.print("ǧλ��" + num % 10);
		}
		sc.close();
	}
}
