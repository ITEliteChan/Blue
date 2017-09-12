package ao.rf.ch.di4zhou;

public class Qionju {

	public static void main(String[] args) {
		int[] arr ={0,1,2,3,4,5,6,7,8,9};
		int[] p = {4,0,9,0};
		int i = 0;
		for(int a = 0;a<=9;a++){
			for(int b= 0;b<=9;b++){
				for(int c= 0;c<=9;c++){
					for(int d = 0;d<=9;d++){
						i++;
						if(arr[a] ==p[0]&&arr[b]==p[1]&&arr[c]==p[2]&&arr[d]==p[3]){
							System.out.println("mimashi:"+arr[a]+arr[b]+arr[c]+arr[d]);
							System.out.println("共执行"+i+"次");
							
						}
					}
				}
			}
		}
		
	}
 }
