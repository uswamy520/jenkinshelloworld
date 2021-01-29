//https://seleniumautomationtester.wordpress.com/2017/03/29/java-programs-asked-in-interviews/
public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//odd or even
		//num(13);
		
		//factorial
		//fact(6);
		
		//reverse num
		//rev(120);
		
		//no of digit
		digit(-1234);

	}
	
	//Write a java program to find number of digits in given number
	private static void digit(int i) {
		int count = 0;
		while(i>0) {
			i =i/10;
			count++;
		}
		System.out.println(count);
		
	}


	//Java Program to Reverse Number
	/*public static void rev(int num) {
		int rev =0, r=0;
		while(num>0){
			r = num%10;
			rev = rev*10+r;
			num=num/10;
				
		}
		System.out.println(rev);
		
	}
	
	
	
	
	// Java Program to Find Factorial on Number
	/*private static void fact(int i) {
		int sum = i;
		for(int j=1; j<i;j++) {
			sum = sum*j;
		}
		System.out.println(sum);
		
	}

	//Java Program to Find Odd or Even number
	/*public static void num(int i) {
		if (i%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
				
	}*/



}


