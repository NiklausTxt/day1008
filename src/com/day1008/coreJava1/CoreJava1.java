package com.day1008.coreJava1;

import java.util.Random;

public class CoreJava1 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] arr = new int[10];
		for(int i=0; i<10; i++){
			arr[i]=rand.nextInt(100);
		}
		
		int max = arr[0];
		double avg;
		int sum = 0;
		
		for(int i:arr){
			System.out.print(i+"  ");
			sum=sum+i;
			if(i>max){
				max = i;
			}
		}
		System.out.println();
		avg = sum/10.0;
		
		System.out.println("���ֵΪ��"+max);
		System.out.println("ƽ��ֵΪ��"+avg);
		System.out.println("��Ϊ��"+sum);
		
	}
}
