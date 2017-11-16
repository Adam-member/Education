import java.util.Arrays;
import java.util.ArrayList;

public class Array {
	
	
	
	
	
	public static void main (String args[]){
		ArrayList<Double> Double = new ArrayList<Double>();
		Double.add(49.5);
		Double.add(79.5);
		Double.remove(0);
		
		
		
		
		
		
		
		
		
		
		StringPublish();
		
		
		double[][] GPAs = new double[11][11];
		
		GPAs[0][0] = 1;
		GPAs[0][1] = 1;
		
		
		
		
	 
		int x1 = 0;
		int y1 = 0;
		for(int x = 0; x < 10; x++){
			GPAs[x1][y1] = x+1;
			x1 = x;
		}
			for(int y = 0; y < 10; y++){
				GPAs[x1][y1] = y +.1;
				y1 = y;
				
				
			}
			
		
		
		
		System.out.println(GPAs[5][4]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		double[] doubleArray = new double[3];
		double[] doubleArray2 = {12, 15, 42, 18, 9};
		if(doubleArray2[3] == 18){
			
		}
	}
	public static void StringPublish(){
	String[] Hello = {"I want to go right", "I wish to go right", "My heart leads me in the right direction", "Right"};
	
	String Joanna = "I want to go right";
	if(Joanna.equals(Hello[0])){
		System.out.println("Hello");
		
		if(Arrays.asList(Hello).contains(Joanna)){
			System.out.println("HI");
		}
	}
	}
	

}
