package vedha;


public class ArrayDemo2 {

	public static void main(String[] args) {
	
		int[] num = {10,2,3,67,90,31,44,66,77};
		int max = num[0] ,min=num[0];
		
		for(int a=1;a<num.length;a++) {
			if(num[a] > max) {
				max = num[a];
			}
			if(num[a] < min) {
				min = num[a];
			}
		}
		
		System.out.println("max---->"+max);
		System.out.println("min---->"+min);
		
	}



	}


