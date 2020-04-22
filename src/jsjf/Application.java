package jsjf;
import java.util.*;


/**
 * Application that read the sentence
 * @author omarsanyang
 *Application that read the sentence
 */
public class Application {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan;
		char c;
		
		do {
			scan = new Scanner(System.in);
			String st;
			
			System.out.println("please write a sentence: ");
			st = scan.nextLine();
			
			System.out.println("sentence reversed: " + reverseString(st));
			System.out.println("would you like to write another sentence?:");
			c = scan.next().charAt(0);
			if(c != 'Y' || c != 'y')
				System.out.println("GoodBye");
			
		}
		while(c == 'y' ||c == 'y');
		
	}//end of main class
	/**
	 *reverseString reverses the sentence you put 
	 * @param st
	 * @return
	 *04/202
	 */
	public static String reverseString(String st) {
		
		ArrayStack<Character> stack = new ArrayStack<Character>(st.length());
		
		String v = "";
		String[] ar = st.split(" ");
		for(int k = 0; k < ar.length;k++) {
		for(int i = 0; i < ar[k].length();i++) 
			stack.push(ar[k].charAt(i));
		for(int j = 0; j < ar[k].length();j++)
			v += stack.pop();
		if(v.length() < st.length())
			v += " ";
		
		}	// end of reverseString 
		return v;
		
	}//end of reverseString

}//end of class 
