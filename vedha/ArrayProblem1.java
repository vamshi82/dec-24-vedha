package vedha;
		import java.util.Scanner;
		public class ArrayProblem1 {
			public static void main(String[] args) {
				int[] num;
				Scanner sc = new Scanner(System.in);
				/*
				 * Write a program to filter duplicate numbers
				 * 
				 */
				System.out.println("enter total no size");
				int size = sc.nextInt();
				num = new int[size];
				System.out.println("enter all "+size+" numbers");
				for(int p=0;p<size;p++) {
					num[p] = sc.nextInt();
				}
				
				
				//1 2 3 1 4 1 5 2 3 8
				// 1 2 3 4 5 8
				boolean found = false;
				for(int i=0;i<num.length;i++) {
					found = false;
					for(int j=i+1;j<num.length;j++) {
						if(    (num[i] != -999) 
								&& 
								(num[i] == num[j])
						   ) {
							if(found == false) {
								System.out.print(num[i]+" ");
								found = true;
							}
								num[j]=-999;
						}// if
					}// for	
				}// for
				
			//	System.out.print(" Final Array \n");
				//for(int i=0;i<num.length;i++) {
					//System.out.print(+num[i]+" ");
				//}
			

	}

}
