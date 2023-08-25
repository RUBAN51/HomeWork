package homeworks;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String reversed="";
		System.out.println("Enter The String:");
		String original = s.nextLine();
		StringBuffer sb = new StringBuffer(original);
		for(int i=sb.length()-1;i>=0;i--) {
			char slice=sb.charAt(i);
			reversed+=slice;
		}
		System.out.println("Reversed String is: "+reversed);

	}

}
