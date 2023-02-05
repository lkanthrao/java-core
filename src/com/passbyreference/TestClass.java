package com.passbyreference;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        //Read input from stdin and provide input before running

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] split = line.split("  ");
        int maxNumber = Integer.parseInt(split[1]);
        int minNumber = Integer.parseInt(split[0]);
        int sumInclusiveMinMax = minNumber + maxNumber;
        int totalSum = sumInclusiveMinMax;
        
      outer:  for(int i=minNumber+1; i<maxNumber;i++)
        {
        	for(int j=2;j<i/2;i++){
        		if(i%j==0){
        			continue outer;	
        		}
        	}
        	System.out.println(i);
        	totalSum = totalSum + i;
        }
		
        System.out.println(totalSum);
    }
}
