package LeedCode_01_TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Given nums = [2, 7, 11, 15], target = 9,

//Because nums[0] + nums[1] = 2 + 7 = 9,

//return [0,1].

public class TwoSum {
	
//Method 1
	public static int[] twoSum(int[] nums, int target ) {
		
		 int[] ans = new int[2];
		 
		 for(int i = 0; i <  nums.length; i++) {
			 
			 for(int j = (i+1); j < nums.length; j++) {
				 if(nums[i] + nums[j] == target) {
					 ans[0] = i ;
					 ans[1] = j ;
				 }
			 }
		 }	
		return ans;
	}
	
	
	public static int[] twoSum2(int[] nums, int target) {
		
		Map<Integer , Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0 ; i < nums.length ; i++) {
			map.put( nums[i] , i);
		}
		
		for(int i = 0 ; i < nums.length ; i++) {
			
			int sub = target - nums[i];
			
			if(map.containsKey(sub) && map.get(sub) != i) {
				return new int[] {i, map.get(sub)};
			}
		}
		 throw new IllegalAccessError("ERROR");
	}
	
	public static int[] twoSum3 (int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0 ; i < nums.length ; i++) {
			int sub = target - nums[i];
		 if(map.containsKey(sub)) {
			 return new int[] {i, map.get(sub)};
		 }
		 
		 map.put(i, nums[i]);
		}
		
		throw new IllegalAccessError("ERROR");
	}
	
	
	public static void main(String[] args) {
		
		int[] one= { 1, 4, 5, 7,6};
		int target = 10;
		String arrtostring = Arrays.toString(twoSum(one,target));
		String arrtostring2 = Arrays.toString(twoSum2(one,target));
		String arrtostring3= Arrays.toString(twoSum3(one,target));
		System.out.println(arrtostring);
		System.out.println(arrtostring2);
		System.out.println(arrtostring3);
		
		
	}

}
