package vedha;


public class DemoWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 15243
		// 1234
		
		
		
		String str = "sree";// 65+66---131
		String str1 = "ster";
		int w =0,w1=0;
		for(int i=0;i<str.length();i++) {
			w = w+ str.charAt(i);
		}
		for(int i=0;i<str1.length();i++) {
			w1 = w1+ str1.charAt(i);
		}
		System.out.println("weight---W>"+w);
		System.out.println("weight---W1>"+w1);

	}

}
