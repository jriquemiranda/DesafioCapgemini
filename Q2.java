/**
 *
 * @author Henrique Miranda
 */

public class Q2 {

    public static void getParesDifere(int[] nums, int dif) {
        
        int cont = 0;
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] - nums[j] == dif || nums[j] - nums[i] == dif ) {
                    cont++;
                }
            }
        }
        
        System.out.println(cont);
        
    }
    
    public static void main(String args[]) {
        
        int[] n = {1,5,3,4,2};
        int x = 2;
        
        getParesDifere(n,x);
        
    }
}
