package com.day1008.coreJava5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CoreJava5 {
	public static void main(String[] args) {
		System.out.println("请输入整数的个数：");
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] nums = new int[n];
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			nums[i] = rand.nextInt(1000);
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		for(int i=0;i<n;i++){
			if(isPrime(nums[i])){
				list1.add(nums[i]);
			}else {
				list2.add(nums[i]);
			}
		}
		
		System.out.println("素数有：");
		for(int i:list1){
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("不是素数有：");
		for(int i:list2){
			System.out.print(i+" ");
		}

		sc.close();
	}

	public static boolean isPrime(int n) {
		if (n == 2) {
			return true;
		}

		if (n % 2 == 0) {
			return false;
		}

		int sqrtn = (int) Math.sqrt((double) n);
		boolean flag = true;

		for (int i = 3; i <= sqrtn; i += 2) {
			if (n % i == 0) {
				flag = false;
			}
		}
		return flag;
	}
}
