/**
* Mod5 contains main, and a testPrint method to test recursive and iterative methods
* 
* @author Coda Bool
* 
*/
public class Mod5 {
	/**
	* Uses a recursive way of processing the sequence
	* @param nth the number to enter into the fibonacci sequence 
	* 
	*/
	public static int fibRecursion(int nth) {
		if (nth == 0) {
			return 0;
		} else if (nth == 1) {
			return 1;
		}   
		return fibRecursion(nth - 1) + fibRecursion(nth - 2);
	}
	/**
	* Uses a iterative way of processing the sequence
	* @param nth the number to enter into the fibonacci sequence 
	* @param n1 works as the current number
	* @param n2 works as the previous number
	* @param n3 works as the number before the previous number
	* 
	*/
	public static int fibIteration(int nth) {
		int n3, n2 = 0, n1 = 1;
		for (int i = 1; i < nth ; i++) {
			n3 = n2;
			n2 = n1;
			n1 = n3 + n2;
		}
		return n1;
	}
	/**
	* Both recursion and iteration are listed to output the method of your choice
	* @param startTime holds the time in nanoseconds before running the sequence
	* 
	*/
	public static void testPrint(int n) {
		//Recursion nanoseconds to console
//		long startTime = System.nanoTime();
//		fibRecursion(n);
//		System.out.println(System.nanoTime() - startTime);
		//Iteration nanoseconds to console
		long startTime = System.nanoTime();
		fibIteration(n);
		System.out.println(System.nanoTime() - startTime);
	}
	/**
	* Loops through the sequence using testPrint method to print the time spent
	* 
	*/
	public static void main(String[] args) {
		for (int i = 1; i < 51; i++) {
			testPrint(i);
		}
	}
}
