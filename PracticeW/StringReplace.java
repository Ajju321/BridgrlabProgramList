package PracticeW;

import java.util.Scanner;
public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String str= "Hello <username,> how are you ?".replace("<username,>", "ajay");
		/*
		 * String name; System.out.println("Enter tghe name "); name=sc.nextLine();
		 * 
		 * for(int i=0;i<str.length;i++) { if(str[i]== "<username,>") {
		 * 
		 * str[i]=name; }
		 * 
		 * } System.out.println(Arrays.toString(str));
		 */
		System.out.println(str);
	}

}
