package com.day1008.coreJava7;

import java.io.UnsupportedEncodingException;

public class CoreJava7 {

	public static boolean isChineseChar(char c) throws UnsupportedEncodingException {
		return String.valueOf(c).getBytes("GBK").length > 1;
	}

	public static String substring(String orignal, int count) throws UnsupportedEncodingException {
		// ԭʼ�ַ���Ϊnull��Ҳ���ǿ��ַ���
		if (orignal != null && !"".equals(orignal)) {
			// ��ԭʼ�ַ���ת��ΪGBK�����ʽ
			orignal = new String(orignal.getBytes(), "GBK");
			// Ҫ��ȡ���ֽ�������0����С��ԭʼ�ַ������ֽ���
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
		// ԭʼ�ַ���
		String s = "��ABC��DEF";
		System.out.println("ԭʼ�ַ�����" + s);
		try {
			System.out.println("��ȡǰ1λ��" + CoreJava7.substring(s, 1));
			System.out.println("��ȡǰ2λ��" + CoreJava7.substring(s, 2));
			System.out.println("��ȡǰ4λ��" + CoreJava7.substring(s, 4));
			System.out.println("��ȡǰ5λ��" + CoreJava7.substring(s, 5));
			System.out.println("��ȡǰ6λ��" + CoreJava7.substring(s, 6));
			System.out.println("��ȡǰ7λ��" + CoreJava7.substring(s, 7));
			System.out.println("��ȡǰ8λ��" + CoreJava7.substring(s, 8));
			System.out.println("��ȡǰ9λ��" + CoreJava7.substring(s, 9));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
