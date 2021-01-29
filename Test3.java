//https://www.softwaretestinghelp.com/java-coding-interview-programs/

import java.util.Arrays;

public class Test3 {
	
	

	
	public static void main(String[] args) {
	// Swap 2 numbers
		//swap(21,55); 
	
		//Prime or not		
	/*	boolean p = prime(-1001);
		if(p)
			System.out.println("Is a prime");
		else
			System.out.println("Is NOT a prime");*/
		
		// Prime or not Method		
		//prime2(13);
		
		//Reverse string		
		//reverse("automation test");
		
		//Palindrome
		//palindrome("test");
		
		//Fibonicci
		//fib(10);
		
		//iterate(10,20,30);
		
		//Duplicate chars
		//dup("sory0oos");
		
		//first,second, third largest
		//large();
		
		//Armstrong num
		//arm(153);
		
		//remove whitespace
		//str("ring ring ding");
		

	}

	
	
	//Write a Java Program to remove all white spaces from a string without using replace().
	/*private static void str(String str) {
		char [] chars = str.toCharArray();
		StringBuilder str2 = new StringBuilder();
		for (int i=0;i<chars.length;i++) {
			if(chars[i]!= ' ')
				str2.append(chars[i]);
		
}
		System.out.println(str2);
		
	}	
	
	//Write a Java Program to remove all white spaces from a string with using replace().
	/*private static void str(String str) {
		String str1 = str.replaceAll("\\s", "");
		System.out.println(str1);
		
	}
	
	
	
	//Write a Java Program to check Armstrong number.
	/*private static void arm(int num) {
		// TODO Auto-generated method stub
		int n=0,  sum=0, count =0, x=0;
		int temp = num;
		int temp1 = num;
		while(temp1>0) {
		temp1=temp1/10;
		count++;
		}
		System.out.println(count);

		while(num>0) {
		n=num%10;
		num=num/10;
		sum = (int) (sum + Math.pow(n, count));
		}
		if(temp == sum)
			System.out.println("armstrong num");
		else
			System.out.println(" NOT armstrong num");
		
		
		
		
	}
	
	//Write a Java Program to find the large, second-highest and thirs=dnumber in an array.
	/*private static void large() {
		int arr[] = {10,100,34,12,54,0, 54, 78};
		int largest =0, secondLargest =0, thirdlargest = 0;
		for(int i= 0; i<arr.length; i++) {
			if(arr[i]> largest) {
				secondLargest= largest;	
				largest = arr[i];
				
			}
			else if(arr[i]>secondLargest) {	
				thirdlargest = secondLargest;
				secondLargest = arr[i];
			}
			else if(arr[i]>thirdlargest)
				thirdlargest = arr[i];
		}
			
			
			System.out.println("largest"+largest);
			System.out.println("secondLargest"+secondLargest);
			System.out.println("thirdlargest"+thirdlargest);
		
		
	}
	
	
	
	
	//Write a Java Program to find the duplicate characters in a string.
	private static void dup(String val) {
		char[] chars = val.toCharArray();
		int count =0;
		for(int i = 0; i< val.length(); i++) {
			for(int j= i+1; j< val.length();j++)
			{
				if(chars[i]==chars[j]) {
					System.out.println(chars[i]);
				count++;
				break;
				}
			}
		}
		System.out.println(count);
		
	}
	

	//Write a Java Program to iterate ArrayList using for-loop, while-loop, and advance for-loop.
	/*private static void iterate(int i, int j, int k) {
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Write a Java Program for the Fibonacci series.

	/*private static void fib(int num) {
		int a= 0;
		int b= 0;
		int c =1;
		
		
		for(int i= 0; i<num; i++) {
			a=b;
			b=c;
			c=a+b;
			 
			System.out.println(a);
		}
		
	}

	//Write a Java Program to find whether a string or number is palindrome or not.
	private static void palindrome(String pali) {
		// TODO Auto-generated method stub
		
		String rev = "";
		for(int i= pali.length()-1; i>=0; i--)
		{
			rev = rev + pali.charAt(i);			
		}
		
		if(pali.equals(rev))
			System.out.print("its a palindrome");
		else
			System.out.print("its not palindrome");
		
	}
	

	
	
	//Write a Java Program to reverse a string without using String inbuilt function reverse().
	
	public static void reverse(String str2) {
		// TODO Auto-generated method stub
			
		char chars[] = str2.toCharArray();
			
		for(int i = chars.length-1;i>0 ; i--)
		{
					
			System.out.println(chars[i]);
		}

		
	}
	
	
	
	
	
	//Write a Java Program to reverse a string without using String inbuilt function.
	
	private static void reverse(String str2) {
		// TODO Auto-generated method stub
		
		StringBuilder str = new StringBuilder();
		str.append(str2);		
		System.out.println(str.reverse());
		
	}
	
	
	
	

	// swap 2 number
	public static void swap(int i, int j) {
		
		 i= i+j;
		 j=i-j;
		 i=i-j;
		 
		 System.out.println("i =" +i);
		 System.out.println("j =" +j);
		
	}
	
	
	
	
	
	// Prime number
	public static boolean prime(int i) {
		
		int[] j = {2,3,5,7};
		if(i==1)
			return true;	
		else
			if(i<1)
				System.out.println("provide posivite  integers");	
		
		for(int k =0; k<j.length;k++)	 
		{
			if(i%j[k] == 0) {
				return false;
				
			}
								
		}
		 return true;

	}
	
	
	
	
	
	// Prime number Method2
	
	public static void prime2(int num) {
		
		boolean isprime = true;
		
		for(int i=2;i<num/2;i++)
		{
			
			if (num%i ==0) {
				isprime = false;
				break;	
			}
		}
		
		if(isprime)
			System.out.println(" prime");
		else
			System.out.println("not a prime");
		

	}*/
	
	// Write a Java Program to count the number of words in a string using HashMap.
	//Write a Java Program to iterate HashMap using While and advance for loop.
	//Write a Java Program to demonstrate an explicit wait condition check.
	//Write a Java Program to iterate ArrayList using for-loop, while-loop, and advance for-loop.
	//Write a Java Program to demonstrate Scroll up/ Scroll down.
	//Write a Java Program to open all links of gmail.com.
	//Write a Selenium code to switch to the previous tab.
	//Write a Java Program to read an excel.
}
	
	

