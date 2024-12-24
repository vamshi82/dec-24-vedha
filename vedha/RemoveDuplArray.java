package vedha;

import java.util.Scanner;

public class RemoveDuplArray {

	public static void main(String[] args) {

		int[] num;
		Scanner sc = new Scanner(System.in);
		/*
		 * Write a program to find unique  numbers
		 * 
		 */
		System.out.println("enter total no size");
		int size = sc.nextInt();
		num = new int[size];
		System.out.println("enter all "+size+" numbers");
		for(int p=0;p<size;p++) {
			num[p] = sc.nextInt();
		}
		
		//1 2 3 -999 4 -999 5 -999 -999 8
		// 1 2 3 4 5 8
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(    (num[i] != -999) 
						&& 
						(num[i] == num[j])
				   ) {
						num[j]=-999;
				}// if
			}// for	
		}// for
		
		System.out.print(" Final Array \n");
		for(int i=0;i<num.length;i++) {
			if(num[i] != -999)
			System.out.print(num[i]+" ");
		}

	}

}