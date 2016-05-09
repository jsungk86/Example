import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class test3 {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		//int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		int[][] arr = new int[b][c];
		
		for(int i = 0; i < b; i ++){
			
			for(int j = 0; j < c; j++){
				
				arr[i][j] = scan.nextInt();
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		String[][] temp = new String[b][c];
		
		for(int i = 0; i < b; i++){
			
			Arrays.fill(temp[i], "false");
			temp[0][0] = "true";
		}
	
		
		
				
		System.out.println(findPath(arr, b, c, 0, 0, 0));
			
		
		
	}
	
	public static int findPath(int[][] arr, int b, int c, int y, int x, int order){
		
		// 크기 제
		if(y < 0 || y > b-1)
			return 0;
		if(x < 0 || x > c-1)
			return 0;
		
		// 갈 수 있는 공간이거나 가야하는 곳이
		if(arr[y][x] == -1 || arr[y][x] == order){
			
			System.out.println("(" + y + ","+ x + ") : " + order);
			
			if(order == b*c - 1){
				return 1;
			}
			
			int old = arr[y][x];
			arr[y][x] = order;
			
			int result = 0;
			
			result = findPath(arr, b, c, y + 1, x, order + 1) +
					findPath(arr, b, c, y - 1, x, order + 1) +
					findPath(arr, b, c, y, x + 1, order + 1) +
					findPath(arr, b, c, y, x - 1, order + 1);
			
			arr[y][x] = old;
			
			return result;
			
		}
		else
			return 0;

	}
	
	
}
