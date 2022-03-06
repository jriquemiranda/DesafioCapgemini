/**
 *
 * @author Henrique Miranda
 */

import java.util.Arrays;

public class Q1 {

    public static void getMediana(int[] nums) {
        
        Arrays.sort(nums);
        
        int mediana = 0;
        int verifpar = nums.length % 2;
        
        if (verifpar == 0) {
            System.out.println("Informe uma lista de números com um número ímpar de elementos");
        } else {
            mediana = nums[nums.length / 2];
            System.out.println(mediana);
        }
        
    }
    
    public static void main(String args[]) {
        
        int[] arr = {9,2,1,4,6};
        
        getMediana(arr);
        
    }
}
