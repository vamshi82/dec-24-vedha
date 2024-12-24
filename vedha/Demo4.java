package vedha;

	import java.util.Scanner;

	public class Demo4 {

		public static void main(String[] xyz) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter data");
			String name = sc.next();
			
			char eachChar;
			int diff = (int)('d'-'D');
			diff = diff<0?-1 * diff:diff;
			
			String resStr = "";
			
			for(int i=0;i<name.length();i++) {
				eachChar = name.charAt(i);
				 if(eachChar >='a' && eachChar <='z') {
					 eachChar = (char)(eachChar - diff);
				 }//if
				 else if(eachChar >='A' && eachChar <='Z') {
					 eachChar = (char)(eachChar + diff);
				 }//if
				 resStr = resStr+eachChar;
			}// for
			System.out.println("res---->"+resStr);

		
			
		}

	

}
