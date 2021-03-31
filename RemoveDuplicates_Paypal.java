package w3_D6;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates_Paypal {

	public static void main(String[] args) {

		String str = "PayPal  India";

		char[] charArray = str.toCharArray();
//		Declare Set	
		Set<Character> ch = new LinkedHashSet<Character>();
		for (Character eachcharacter : charArray) {
			ch.add(eachcharacter);
		}

		for (Character chars : ch) {
//	    	  To remove the space
			if (chars != ' ') {
				System.out.print(chars);

			}
		}

	}
}
