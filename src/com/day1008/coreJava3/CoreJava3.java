package com.day1008.coreJava3;

import java.util.Random;

public class CoreJava3 {
	public static void main(String[] args) {
		int[][] scores = new int[10][5];
		int[] student = new int[10];
		double[] avgScore = new double[5];
		Random rand = new Random();
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				scores[i][j] = rand.nextInt(101);
			}
		}
		System.out.println("Java  C++  Ruby  OC  C#");
		for (int i = 0; i < 10; i++) {
			sum = 0;
			for (int j = 0; j < 5; j++) {
				sum = sum + scores[i][j];
				System.out.print(scores[i][j] + "    ");
			}
			student[i] = sum;
			System.out.println();
		}
		System.out.println("===============================================");
		for (int i = 0; i < 10; i++) {
			System.out.println("学员" + (i + 1) + "的总分是：" + student[i]);
		}
		for (int i = 0; i < 5; i++) {
			sum = 0;
			for (int j = 0; j < 10; j++) {
				sum = sum + scores[j][i];
			}
			avgScore[i] = sum / 10.0;
		}
		System.out.println("===============================================");

		System.out.println("Java的平均分是：" + avgScore[0]);
		System.out.println("C++的平均分是：" + avgScore[1]);
		System.out.println("Ruby的平均分是：" + avgScore[2]);
		System.out.println("OC的平均分是：" + avgScore[3]);
		System.out.println("C#的平均分是：" + avgScore[4]);

	}
}
