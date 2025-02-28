package com.health.app;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author chethan.c
 *
 * Class contains methods that allows to verify if an array contains
 * two numbers that add upto an expected sum.
 *
 */
public class SumVerifier {
	
	/**
	 * Function verify whether an array of int contains a pair of elements
	 * that add upto the sum in a single pass.
	 * 
	 * This function takes each element then checks the required value to 
	 * add upto the expected sum against a hashmap ( Hashmap would start out 
	 * as an empty hashmap for the first element in the array ). If the value doesn't exist 
	 * in the hashmap , it adds the element to the hashmap as key and do the same for the 
	 * next elements until a match is found in the hashmap.
	 * 
	 * @param arr - An array of int to verify.
	 * @param sum - Method check if any two pairs in the array returns this sum. 
	 * @return - true if the list contains a pair that add up to the sum
	 */
	public static boolean verifySumExistInSinglePass(int[] arr,int sum ) {
		if(arr == null || arr.length<2) {
			return false;
		}
		Map<Integer,Boolean> checkerMap = new HashMap<Integer,Boolean>();
		for (int i = 0; i < arr.length; i++) {
			if( !checkerMap.containsKey(sum - arr[i])) {
				checkerMap.put(arr[i], true);
			}else {
				return true;
			}
		}
		return false;
	}
	
	
	/**
	 * Function verify whether an array of int contains a pair of elements
	 * that add upto the sum in a single pass.
	 * 
	 * This function picks one index elements then add each of the
	 * other elements in the array to the index element and return at the 
	 * first encounter when the value adds upto the expected sum.
	 * 
	 * @param arr - An array of int to verify.
	 * @param sum - Method check if any two pairs in the array returns this sum. 
	 * @return - true if the list contains a pair that add up to the sum
	 */
	public static boolean verifySumExistInTwoPass(int[] arr,int sum ) {
		if(arr == null || arr.length<2) {
			return false;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i != j && arr[i] + arr[j] == sum) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	public static boolean verifySumExistRecursion(int[] arr,int sum ) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i != j && arr[i] + arr[j] == sum) {
					return true;
				}
			}
		}
		return false;
	}


}
