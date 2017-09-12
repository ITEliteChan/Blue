package com.rf.ch.demo2;

import java.util.Scanner;

public class clssss {

		// 大小写转换
		char caseSensitive(char c) {
			return 65 <= (int) c && (int) c <= 90 ? (char) ((int) c + 32) : (char) ((int) c - 32);
		}

		// 返回较大值
		int max(int i, int j) {
			return i > j ? i : j;
		}

		// 数字转汉字大写,小于一万
		String int2CC(int n, boolean flag) {
			int inputNum = n;
			String[] chineseChar = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };
			StringBuilder sb = new StringBuilder();
			for (int i = 1000; i >= 1; i /= 10) {
				switch (i) {
				case 1000:
					if (n / i == 0 && !flag)
						sb.append(chineseChar[0]);
					else if (n / i != 0) {
						sb.append(chineseChar[n / i]);
						sb.append("仟");
					}
					break;
				case 100:
					if (n / i == 0 && inputNum / 1000 != 0 && inputNum % 100 > 0)
						sb.append(chineseChar[0]);
					else if (n / i != 0) {
						sb.append(chineseChar[n / i]);
						sb.append("佰");
					}
					break;
				case 10:
					if (n / i == 0 && inputNum % 1000 / 100 != 0 && inputNum % 10 > 0)
						sb.append(chineseChar[0]);
					else if (n / i != 0) {
						sb.append(chineseChar[n / i]);
						sb.append("拾");
					}
					break;
				case 1:
					if (n / i > 0)
						sb.append(chineseChar[n / i]);
					break;
				}
				n %= i;
			}
			return sb.toString();
		}

		// 数字转换为大写
		String int2ChineseCharacters(int num) {
			int inputNum = num;
			boolean flag = true;
			StringBuilder sb = new StringBuilder();
			for (int i = 100000000; i >= 1; i /= 10000) {
				if (num >= i) {
					int n = num / i;
					sb.append(int2CC(n, flag));
					flag = false;
					switch (i) {
					case 100000000:
						sb.append("亿");
						break;
					case 10000:
						sb.append("万");
						break;
					case 1:
						break;
					}
				}
				num %= i;
			}
			return sb.toString();
		}

		// 随机生成并输出
		void randomNum() {
			int[] arr = new int[10];
			int sum = 0;
			for (int i = 0; i < 10; i++) {
				arr[i] = (int) (Math.random() * 99) + 1;
				sum += arr[i];
			}
			printArray(arr);
			System.out.println("它们的和是: " + sum);
		}

		// 拆分数组为子集
		public void separateArray(int[] arr) {
			int[] arr1 = new int[arr.length];
			int[] arr2 = new int[arr.length];
			arr1[0] = arr[0];
			int length1 = 1;
			int length2 = 0;
			boolean isExist = false;
			for (int i = 1; i < arr.length; i++) {
				for (int j = 0; j < length1; j++) {
					if (arr[i] == arr1[j]) {
						isExist = true;
						break;
					}
				}
				if (isExist) {
					arr2[length2] = arr[i];
					length2++;
					isExist = false;
				} else {
					arr1[length1] = arr[i];
					length1++;
				}
			}
			int[] arr3 = new int[length1];
			int[] arr4 = new int[length2];
			for (int i = 0; i < arr3.length; i++) {
				arr3[i] = arr1[i];
			}
			for (int i = 0; i < arr4.length; i++) {
				arr4[i] = arr2[i];
			}
			printArray(arr3);
			if (arr4.length != 0) {
				separateArray(arr4);
			}
		}

		// 删除数组中的重复元素
		public int[] deleteRepeat(int[] arr) {
			int[] arr1 = new int[arr.length];
			arr1[0] = arr[0];
			int length = 1;
			boolean isExist = false;
			for (int i = 1; i < arr.length; i++) {
				for (int j = 0; j < length; j++) {
					if (arr[i] == arr1[j]) {
						isExist = true;
						break;
					}
				}
				if (!isExist) {
					arr1[length] = arr[i];
					length++;
				} else {
					isExist = false;
				}
			}
			int[] newArr = new int[length];
			for (int i = 0; i < newArr.length; i++) {
				newArr[i] = arr1[i];
			}
			return newArr;
		}

		// 并集
		public int[] union(int[] arr1, int[] arr2) {
			int newArr1[] = deleteRepeat(arr1);
			int newArr2[] = deleteRepeat(arr2);
			int[] arr3 = new int[newArr1.length + newArr2.length];
			int length3 = 0;
			for (int i = 0; i < newArr1.length; i++) {
				arr3[i] = newArr1[i];
			}
			length3 = newArr1.length;
			boolean isExist = false;
			for (int i = 0; i < newArr2.length; i++) {
				for (int j = 0; j < length3; j++) {
					if (newArr2[i] == arr3[j]) {
						isExist = true;
						break;
					}
				}
				if (!isExist) {
					arr3[length3] = newArr2[i];
					length3++;
				} else {
					isExist = false;
				}
			}
			int[] newArr3 = new int[length3];
			for (int i = 0; i < newArr3.length; i++) {
				newArr3[i] = arr3[i];
			}
			return newArr3;
		}

		// 交集
		public int[] intersection(int[] arr1, int[] arr2) {
			int newArr1[] = deleteRepeat(arr1);
			int newArr2[] = deleteRepeat(arr2);
			int[] arr3 = new int[newArr1.length > newArr2.length ? newArr2.length : newArr1.length];
			int length3 = 0;
			boolean isExist = false;
			for (int i = 0; i < newArr2.length; i++) {
				for (int j = 0; j < newArr1.length; j++) {
					if (newArr2[i] == newArr1[j]) {
						isExist = true;
						break;
					}
				}
				if (isExist) {
					arr3[length3] = newArr2[i];
					length3++;
					isExist = false;
				}
			}
			int[] newArr3 = deleteRepeat(arr3);
			return newArr3;
		}

		// 打印数组
		public void printArray(int[] arr) {
			System.out.print("{");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
				if (i != arr.length - 1) {
					System.out.print(", ");
				}
			}
			System.out.println("}");
		}

		public static void main(String[] args) {
			clssss home = new clssss();
			Scanner scan = new Scanner(System.in);

			int[] arr1 = { 0, 0, 0, 0, 3, 3, 4, 7, 7, 8, 9, 9, 9, 9, 9, 10, 10, 11, 11, 11, 12, 12, 12 };
			int[] arr2 = { 0, 3, 5, 5, 6, 8, 8, 9, 9 };
			int[] arr3 = { 0, 3, 5, 7, 8, 9, 10 };

			System.out.println("(大小写转换)请输入一个字母: ");
			System.out.println(home.caseSensitive(scan.next().charAt(0)));
			System.out.println("\n(返回较大值)请输入两个数字: ");
			System.out.println(home.max(scan.nextInt(), scan.nextInt()));
			System.out.println("\n(数字大小写转换)请输入一个数字: ");
			System.out.println(home.int2ChineseCharacters(scan.nextInt()));
			System.out.println("\n(随机生成数组并输出和)");
			home.randomNum();

			System.out.println("\n(拆分数组)");
			System.out.println("原始数组是: ");
			home.printArray(arr1);
			System.out.println("拆分结果是: ");
			home.separateArray(arr1);

			System.out.println("\n(删除重复元素)");
			System.out.println("原始数组是: ");
			home.printArray(arr1);
			System.out.println("删除结果是: ");
			home.printArray(home.deleteRepeat(arr1));

			System.out.println("\n(并集)");
			System.out.println("原始数组是: ");
			home.printArray(arr1);
			home.printArray(arr2);
			System.out.println("并集结果是: ");
			home.printArray(home.union(arr1, arr2));

			System.out.println("\n(交集)");
			System.out.println("原始数组是: ");
			home.printArray(arr3);
			home.printArray(arr2);
			System.out.println("交集结果是: ");
			home.printArray(home.intersection(arr3, arr2));

		}
}
