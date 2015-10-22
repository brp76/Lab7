
public class Lab7 {
    public static void printArray(int[] arr, int numItems) {
	    System.out.print("[ ");
	    for (int j=0; j < (arr.length - 1); j++) {
	        if (j >= numItems) {
	        	System.out.print("***, ");
	        } else {
	        	System.out.print(arr[j] + ", ");
	        }
	    }
	
	    if ((arr.length -1) >= numItems) {
	        System.out.println("*** ]");
	    } else {
	        System.out.println(arr[arr.length - 1] + " ]");
	    }
    }
    
	public static void main(String[] args) {
		int [] arr = new int[10];
		int numItems = 0, seasons = 10;
		for (int i = 0; i < seasons; i ++){
			System.out.println("Season: " + (i+1));
			arr[i]=i;
			printArray(arr,i);
		}
		
	}

}
