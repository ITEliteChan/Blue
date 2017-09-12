package com.rf.ch.bagezuoye;

import java.util.Scanner;

public class Shuzizhuanhuanweidaxie {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 输入一个数字转换为一个汉字读法字符串
		 */
		while (true) {
			System.out.println("请输入一个数字：");
			Scanner scan = new Scanner(System.in);
			int b = scan.nextInt();
			char[] arr = { '零', '一', '二', '三', '四', '五', '六', '七', '八', '九' };
			char[] arr1 = { '十', '百', '千', '万', '十', '百', '千', '亿', '十', '百', '千' };
			char[] arr2 = new char[24];
			int temp = 10;
			int index = 0;
			for (int j = 0; j < 12; j++) {
				arr2[index++] = arr[b % temp];
				arr2[index++] = arr1[j];
				b /= temp; // b = b/temp; num += 10;num = num+10
				if (b == 0) {
					break;
				}
			}
			for (int j = index - 2; j >= 0; j--) {
				System.out.print(arr2[j]);
			}

		}
	}
}

