import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] numeros = new int[2];

        for(int i = 0; i < nums.length; i++){
            for(int y = i+1; y < nums.length ; y++){
                if((nums[i] + nums[y] == target) && i != y ){

                    numeros[0] = i;
                    numeros[1] = y;
                    return numeros;
                }
                
            } 
            
        }

        return null;
    }
}