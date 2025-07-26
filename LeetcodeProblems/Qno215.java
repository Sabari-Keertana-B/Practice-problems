//Qno215. 
package LeetcodeProblems;
public class Qno215 {

    public static void main(String[] args) {
        int[] arr = {6,5,3,7,10};
        int k = 3;
        System.out.println(findKthLargest(arr,k));
    }
    public static int findKthLargest(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums[k-1];
    }
}
