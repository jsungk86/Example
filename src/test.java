
public class test {

	public static void main(String[] args) {
		
		char[] a = {'a','b','c','d'};
		
		test a1 = new test();
		
		a1.combination(a, 0, 4, 3);
		
		
	}

	public void combination(char[] arr, int depth, int n, int k){
		
		if(depth == k){
			
			for(int i = 0; i < k; i++){
				System.out.print(arr[i]);
			}
			System.out.println();
		}
			
		for(int i = depth; i < k; i++){
			
			this.swap(arr, depth, i);
			this.combination(arr, depth + 1, n, k-1);
			this.swap(arr, depth, i);
				
		}
		
	}
	
	public void swap(char[] arr,int i, int j){
		
		char temp = arr[i];
		
		arr[i] = arr[j];
		
		arr[j] = temp;

	}
	
}
