package com.day1008.coreJava7;

import java.io.UnsupportedEncodingException;

public class CoreJava7 {

	public static boolean isChineseChar(char c) throws UnsupportedEncodingException {
		return String.valueOf(c).getBytes("GBK").length > 1;
	}

	public static String substring(String orignal, int count) throws UnsupportedEncodingException {
		// 原始字符不为null，也不是空字符串
		if (orignal != null && !"".equals(orignal)) {
			// 将原始字符串转换为GBK编码格式
			orignal = new String(orignal.getBytes(), "GBK");
			// 要截取的字节数大于0，且小于原始字符串的字节数
//			System.out.println(orignal.getBytes("GBK").length);
			if (count > 0 && count < orignal.getBytes("GBK").length) {
				StringBuffer buff = new StringBuffer();
				char c;
				int index=0;
				for (int i = 0; i < count; i++) {
					
					c = orignal.charAt(index);

					if (CoreJava7.isChineseChar(c)) {
						if (i + 2 <= count) {
							buff.append(c);
							i=i+1;
						}
					}else {
						buff.append(c);
					}
					
					index++;
				}
				return buff.toString();
			}
		}
		return orignal;
	}

	public static void main(String[] args) {
		// 原始字符串
		String s = "我ABC汉DEF";
		System.out.println("原始字符串：" + s);
		try {
			System.out.println("截取前1位：" + CoreJava7.substring(s, 1));
			System.out.println("截取前2位：" + CoreJava7.substring(s, 2));
			System.out.println("截取前4位：" + CoreJava7.substring(s, 4));
			System.out.println("截取前5位：" + CoreJava7.substring(s, 5));
			System.out.println("截取前6位：" + CoreJava7.substring(s, 6));
			System.out.println("截取前7位：" + CoreJava7.substring(s, 7));
			System.out.println("截取前8位：" + CoreJava7.substring(s, 8));
			System.out.println("截取前9位：" + CoreJava7.substring(s, 9));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
