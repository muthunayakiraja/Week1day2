package week2.day2;
public class Palindrome {
public static void main(String[] args) {
		int num = 34343;
		int  temp= 0,dummy=num;
		int r;
		for(int i = 0; num>0; i++ ) {
			
		r=num%10;
				temp =( temp *10)+r;
		num = num/10;
			}
		if(dummy==temp) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
