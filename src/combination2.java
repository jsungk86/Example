
public class combination2 {

	public static void main(String[] args) {
		
		char[] arr = new char[3];
		char[] test = {'a','b','c','d','e'};
		
		System.out.println(combination2(arr, 5, 3, 0, test, 0));
		
	}

	public static int combination2(char[] arr, int n, int k, int target, char[] dataArr, int total){
		
		for(int i=0; i < n; i++){
		
			if(target == k){
				return total += print(arr);
			}
			
			arr[target] = dataArr[i];
			
			combination2(arr, n, k, target+1,dataArr, total);
			
			
		}		
		
		return total;
		
	}
	
	public static int print(char[] arr){
		
		for(int i =0; i < arr.length; i++){
			
			System.out.print(arr[i]);
			
		}
		System.out.println();
		
		return 1;
	}
}
