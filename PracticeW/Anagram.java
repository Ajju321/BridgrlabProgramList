package PracticeW;
import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  String str1,str2;
		  int i,j,len,len1,len2,found=0,not_found=0;
		  
		  
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the first string");
		  str1=sc.nextLine();
		  System.out.println("Enter the first string");
		  str2=sc.nextLine();
		  
		  len1=str1.length();
		  len2=str2.length();
		  if(len1==len2)
		  {
			  len=len2;
			  for(i=0;i<len;i++)
			  {
				  found=0;
				  for(j=0;j<len;j++)
				  {
					  if(str1.charAt(i)==str2.charAt(j))
					  {
						  found=1;break;
					  }
				  }
				  if(found == 0)
	                {
	                    not_found = 1;
	                    break;
	                }
					  
			  }
			  if(not_found == 1)
	            {
	                System.out.print("Strings are not Anagram to Each Other..!!");
	            }
	            else
	            {
	                System.out.print("Strings are Anagram");
	            }
			  
		  }
		  else {System.out.println("Both string is not match");}
	}

}
