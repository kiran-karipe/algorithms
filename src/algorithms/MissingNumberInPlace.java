package algorithms;

public class MissingNumberInPlace {
	 public int getDifferentNumber(int[] arr) {
		    // your code goes here
		    int temp = 0;
		    
		    for(int i=0; i<arr.length; i++) {
		      temp = arr[i];
		      while(temp < arr.length && arr[temp] != temp) {
		        int temp1 = temp;
		        int temp2 = arr[temp];
		        temp = temp2;
		        arr[temp1] = temp1; 
		      }
		    }
		    
		    for(int i=0; i<arr.length; i++) {
		      if(arr[i] != i) {
		        return i;
		      }
		    }
				
				return arr.length;
		  }

		  public static void main(String[] args) {
			MissingNumberInPlace s = new MissingNumberInPlace();
		    int[] arr = {4,3,2,1};
		    System.out.println(s.getDifferentNumber(arr));
		  }
}
