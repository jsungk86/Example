import java.util.Arrays;
import java.util.Scanner;

public class Back_5569 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
	
		boolean[] flag = new boolean[a + b -2];
	
		Arrays.fill(flag, false);
		
		System.out.println(findPath(b,a,0,0,flag, 0, false) % 10000);
		
	}

	public static int findPath(int M, int N, int y, int x, boolean[] flag, int target, boolean flag1){
	
		if(y < 0 || y > M - 1)
			return 0;
		if(x < 0 || x > N - 1)
			return 0;
		
		if(target == (M + N -2)){
			
			return 1;
	
		}
		
		int result = 0;
		
		boolean flagTemp = flag[target];
		
		flag[target] = flag1;
		
		if(target < 2){
			result += findPath(M, N, y+1, x ,flag, target + 1, false);
			result += findPath(M, N, y, x+1 ,flag, target + 1, true);	
		}
		else if((flag[target - 2] == flag[target -1])){
			result += findPath(M, N, y+1, x ,flag, target + 1, false);
			result += findPath(M, N, y, x+1 ,flag, target + 1, true);
		}
		else{
			
			if(flag[target -1]){
				
				result += findPath(M, N, y+1, x ,flag, target + 1, false);
				
			}
			else{
				
				result += findPath(M, N, y, x+1 ,flag, target + 1, true);
				
			}
		}
	
		flag[target] = flagTemp;
		
		return result;
	}
	
}
