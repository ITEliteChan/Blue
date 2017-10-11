package ao.rf.ch.di4zhou;

import java.util.ArrayList;
import java.util.Arrays;

public class Charu {

	public static void main(String[] args) {
//		 int array[] = { 3, 4, 2, 1, 5, 6, 9, 8, 7, 0 };
//		 for (int i = 1; i < array.length; i++) {
//		     int j = i; //  i = 1 ; j = 1
//		     int temp = array[i];
//		     while (j > 0 && temp < array[j - 1]) {
//		             int a = array[j];
//		             array[j] = array[j - 1]; // array[2] = array[1];
//		             array[j - 1] = a;
//		             j--;        }
//		     System.out.println("第" + i + "次移动后：");
//		     for (int i1 = 0; i1 < array.length; i1++) {
//		         System.out.print("," + array[i1]);
//		     }
//		     System.out.println();
//		     array[j] = temp;
//		 }
//		 System.out.println("array 直接插入排序之后：");
//		 for (int i = 0; i < array.length; i++) {
//		     System.out.println("array6[" + i + "] = " + array[i]);
//		 }
	
		int[] arr ={1,2,3,4};
		System.out.print("{");
		for(int a = 0;a<arr.length;a++){
			if(a != arr.length-1){
				System.out.print(arr[a]+",");
			}else{
				System.out.print(arr[a] + "}");
			}
		}
	}	
}
