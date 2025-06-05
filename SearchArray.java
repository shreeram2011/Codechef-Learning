//Search an element in an array

import java.util.Scanner;
import java.util.Arrays;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int[] A = new int [N];
		for(int i = 0; i < N; i ++){
		    A[i] = sc.nextInt();
		}
		
		boolean found = Arrays.stream(A).anyMatch(element -> element == X);
		
		System.out.print(found ? "YES" : "NO");

	}
}
