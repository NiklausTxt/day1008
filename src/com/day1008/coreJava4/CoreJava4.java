package com.day1008.coreJava4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CoreJava4 {
	public static void main(String[] args) {
		String string;
		System.out.println("输入多个任意整数，以逗号隔开");
		Scanner sc =new Scanner(System.in);
		string = sc.nextLine();
		String[] str = string.split(",");
		String fileName = "result.txt";
		int len = str.length;
		int[] nums = new int[len];
		for(int i=0;i<len;i++){
			nums[i]=Integer.parseInt(str[i]);
		}
		
		System.out.println("请选择升序还是降序1.升序2.降序：");
		int select = sc.nextInt();
		int[] newNums = null;
		if(select==1){
			newNums = sort1(nums);
		}else if(select==1){
			newNums = sort2(nums);
		}else {
			System.out.println("输入错误");
		}
		File file = new File(fileName);
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedWriter writer = null;

		try {
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file,true)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i:newNums){
			try {
				writer.write(i+",");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sc.close();
	}
	
	public static int[] sort1(int data[]){
		int minVal;  
        int minIndex;  
        for (int i = 0; i < data.length - 1; i++) {  
            minVal = data[i];  
            minIndex = i;  
            for (int j = i + 1; j < data.length; j++) {  
                if (data[j] < minVal) {  
                    minVal = data[j];  
                    minIndex = j;  
                }  
            }  
            if (minVal != data[i] && minIndex != i) {  
                data[minIndex] = data[i];  
                data[i] = minVal;  
            }  
        }  
        return data;
	}
	public static int[] sort2(int data[]){
		int maxVal;  
        int maxIndex;  
        for (int i = 0; i < data.length - 1; i++) {  
            maxVal = data[i];  
            maxIndex = i;  
            for (int j = i + 1; j < data.length; j++) {  
                if (data[j] > maxVal) {  
                    maxVal = data[j];  
                    maxIndex = j;  
                }  
            }  
            if (maxVal != data[i] && maxIndex != i) {  
                data[maxIndex] = data[i];  
                data[i] = maxVal;  
            }  
        }  
        return data;
	}

}
