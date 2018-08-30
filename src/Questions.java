/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tiger
 */
public class Questions {
    /**    
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
       You may assume that each input would have exactly one solution, and you may not use the same element twice.
Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/
    
public int[] returnIndex(int[] Array, int target)
{
    int result[];
    for(int i=0; i<Array.length; i++)
    {
        int remain = target - Array[i] ;
        for(int j =i+1; j< Array.length; j++)
        {
            while(Array[j] == remain){ 
            return result = new int[]{i,j};
            
            }
        }
        
    }
    //return result;
    throw new IllegalArgumentException("No two sum finded"); 
}

}
    

    



    
    
    

