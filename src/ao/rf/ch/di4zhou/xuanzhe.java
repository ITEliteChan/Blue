package ao.rf.ch.di4zhou;

import java.util.Arrays;

public class xuanzhe {

	public static void main(String[] args) {
		int[] arr = { 1, 8, 3, 9};
		for(int a = 0;a<arr.length-1;a++) {
			for(int b = a+1;b<arr.length;b++) {
				if(arr[a]>arr[b]) {
					int temp = arr[a];
					arr[a]=arr[b];
					arr[b] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
