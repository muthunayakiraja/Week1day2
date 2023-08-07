package week2.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
int range = 8;
 int firstNum = 0;
 int secNum = 1;
 int sum;
 for (int i = 0; i < range; i++) {
	sum =  firstNum + secNum;
	firstNum = secNum;
	secNum = sum;
System.out.println("The fibonacciSeries are:"+sum);


	}

}
}