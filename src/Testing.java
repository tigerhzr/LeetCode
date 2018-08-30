/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tiger
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Questions q1= new Questions();
        int[] array = new int[]{1,7,2,12};
        int[] answer = q1.returnIndex(array, 9);
        System.out.println(arrayToString(answer));
        
        
        
        
        
    }
    
    public static String arrayToString(int[] array)
    {
        String returnS = "";
        for(int i=0; i<array.length;i++)
        {
            returnS += array[i]+ " ";
        }
        return returnS;
    }
    
}
