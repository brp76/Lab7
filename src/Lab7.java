import java.util.*;

public class Lab7 {
	// Global variables
	public static int numRutP = 0, numRutM = 0, resizeP = 0, resizeM = 0;
	
    public static void printArray(int[] arr, int numItems) {
	    System.out.print("[ ");
	    for (int j=0; j < (arr.length - 1); j++) {
	        if (j >= numItems) {
	        	System.out.print("*, ");
	        } else {
	        	System.out.print(arr[j] + ", ");
	        }
	    }
	
	    if ((arr.length -1) >= numItems) {
	        System.out.println("* ]");
	    } else {
	        System.out.println(arr[arr.length - 1] + " ]");
	    }
    }
    
    public static int[] fillArrayP(int [] arr, int numItems, int location) {
    	for (int j = location; j < (numItems + location); j++ ) {
    		if (numRutP == arr.length) { // If there are more rutabagas than size of array, resize
    		    arr = resizeP(arr);
    		}
    		arr[j] = numItems; // Fill array with rutabagas for that many times
    		numRutP ++;
    	}
    	return arr;
    }
    
    public static int[] fillArrayM(int [] arr, int numItems, int location) {
    	for (int j = location; j < (numItems + location); j++ ) {
    		if (numRutM == arr.length) { // If there are more rutabagas than size of array, resize
    		    arr = resizeM(arr);
    		}
    		arr[j] = numItems; // Fill array with rutabagas for that many times
    		numRutM ++;
    	}
    	return arr;
    }
    
    public static int[] resizeP(int [] oldArray) {
    	int oldLength = oldArray.length;
    	int newLength = oldLength + 2; // Add 2 locations for array
    	int [] newArray = new int[newLength];
    	
    	for (int j = 0; j < oldLength; j++) { // Fill new array with old data
    		newArray[j] = oldArray[j];
    	}
    	System.out.printf("\tResized Pangloss's Garden to %d!\n", newLength);
    	resizeP ++;
    	return newArray;
    }
    
    public static int[] resizeM(int [] oldArray) {
    	int oldLength = oldArray.length;
    	int newLength = oldLength * 2; // Multiply array size by 2
    	int [] newArray = new int[newLength];
    	
    	for (int j = 0; j < oldLength; j++) { // Fill in data
    		newArray[j] = oldArray[j];
    	}
    	System.out.printf("\tResized Martin's Garden to %d!\n", newLength);
    	resizeM ++;
    	return newArray;
    }
    
	public static void main(String[] args) {
		int [] arrMartin = new int[5];
		int [] arrPangloss = new int[5];
		int numItems = 0, seasons = 40, rutabaga = 0;
		Random r = new Random();
		
		for (int i = 0; i < seasons; i ++) {
			numItems += rutabaga; // Useful for finding location in fillArray functions
			rutabaga = r.nextInt(5); // Random # between 0 and 4
			
			System.out.println("Season: " + (i+1) + ", " + rutabaga + " rutabaga(s)");
			
			arrPangloss = fillArrayP(arrPangloss, rutabaga, numItems);
			arrMartin = fillArrayM(arrMartin, rutabaga, numItems);
			
		}
		System.out.printf("\nPangloss's Garden Size: %d, Resized %d times.\n", arrPangloss.length, resizeP);
		printArray(arrPangloss,numRutP);
		System.out.printf("Martin's Garden Size: %d, Resized %d times.\n", arrMartin.length, resizeM);
		printArray(arrMartin,numRutM);
	}		
}


