import java.io.BufferedReader;
import java.io.InputStreamReader;

/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/

class TestClass {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int sizeOfArray = Integer.parseInt(line);
        String elements = br.readLine();
        String[] arrayElements = elements.split(" ");
        boolean noTriplet = false;
        
        for(int i = 0;i<sizeOfArray;i++)
        	for(int j=i+1;j<sizeOfArray;j++)
        		for(int k = j+1; k<sizeOfArray;k++)
        			if(Integer.parseInt(arrayElements[j])<Integer.parseInt(arrayElements[k]) && 
        					Integer.parseInt(arrayElements[i])<Integer.parseInt(arrayElements[j])){
        				noTriplet = true;
        				System.out.println(i + " " + j + " " + k);
        			}
        			
        			if(!noTriplet)
        				System.out.println(-1);	
    }
}
