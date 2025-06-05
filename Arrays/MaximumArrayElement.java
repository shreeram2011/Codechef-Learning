import java.util.Scanner;
import java.util.Arrays;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        
        while(T-- > 0){
            int N = sc.nextInt();
            
            int[] arr = new int[N];
        
            for(int i = 0; i < N; i ++){
                arr[i] = sc.nextInt();
            }
            
            int M = Arrays.stream(arr).max().getAsInt();
            
            System.out.println(M);
        }
        sc.close();
	}
	
}
