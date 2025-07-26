//26.Remove Duplicates from Sorted Array
package LeetcodeProblems;
public class Qno026 {

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
        System.out.println(removeDuplicates2(arr));
    }
    
    public static int removeDuplicates(int[] nums) {
        int j=0; // points to the last unique element

        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                nums[++j] = nums[i]; // Move new unique element next to previous unique
            }
        }
        return ++j;
    }
    
    public static int removeDuplicates2(int[] nums) {
        int k = 1; 

        for (int i = 1; i < nums.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < k; j++) {
                if (nums[i] == nums[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
