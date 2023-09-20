public class Reverse_String {
	
	public static void main(String[] args) {
		
		String name = "Mohan";
		
		String reverse="";
		
		for (int i = name.length()-1; i>=0; i--) {
			
			//int i=3; 3>=0;
			//int i=2; 2>=0;
			//int i=1; 1>=0;
			//int i=0; 0>=0;
			
			reverse = reverse+name.charAt(i);
			
		}
		
		System.out.println(reverse);
	}

}
