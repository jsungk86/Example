
public class combination {

	public static void main(String[] args) {
		
		String[] arr = new String[3];
		String[] test = {"a","b","c","d","e"};
		
		combination(arr, 0, 5, 3, 0, test);
		
		
	}
	
	public static void combination(String[] arr, int index, int total, int choise, int target, String[] testData){
		

		if(choise == 0){
			print(arr, index);
			return;
		}
		else if(target == total)
			return;
		
		arr[index] = testData[target];
		combination(arr, index + 1, total, choise - 1, target + 1, testData);
		combination(arr, index , total, choise, target + 1, testData);	
		
	}

	public static void print(String[] arr, int index){
		
		for(int i =0; i < index; i++){
			
			System.out.print(arr[i]);
			
		}
		System.out.println();	
	}
	
	
}
