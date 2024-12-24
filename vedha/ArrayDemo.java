package vedha;

		import java.util.Scanner;

		public class ArrayDemo {

			public static void main(String[] args) {
				int[] num;
				Scanner sc = new Scanner(System.in);
				System.out.println("enter size");
				int size = sc.nextInt();
				num = new int[size];
				for(int i=0;i<size;i++) {
					System.out.println("enter "+(i+1)+" number");
					num[i] = sc.nextInt();
				}
				
				for(int i=0;i<size;i++) {
					System.out.print(num[i]+" ");
				}
				

			}

		
	  

	}


