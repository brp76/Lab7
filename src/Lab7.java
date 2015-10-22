import java.util.*;

public class Lab7 {
	public static int numRutP = 0, numRutM = 0;
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
    		arr[j] = numItems;
    		numRutP ++;
    	}
    	return arr;
    }
    public static int[] fillArrayM(int [] arr, int numItems, int location) {
    	for (int j = location; j < (numItems + location); j++ ) {
    		arr[j] = numItems;
    		numRutM ++;
    	}
    	return arr;
    }
    
	public static void main(String[] args) {
		int [] arrMartin = new int[10];
		int [] arrPangloss = new int[10];
		int numItems = 0, seasons = 3, rutabaga = 0;
		Random r = new Random();
		
		for (int j = 0; j < seasons; j ++) {
			numItems += rutabaga;
			rutabaga = r.nextInt(5);
			System.out.println("Season: " + (j+1) + ", " + rutabaga + " rutabaga(s)");
			arrPangloss = fillArrayP(arrPangloss, rutabaga, numItems);
			arrMartin = fillArrayM(arrMartin, rutabaga, numItems);
			System.out.print("Pangloss: \t");
			printArray(arrPangloss,numRutP);
			System.out.print("Martin: \t");
			printArray(arrMartin,numRutM);
		}
	}		
}


