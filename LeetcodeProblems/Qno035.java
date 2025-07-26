//Qno35. Search Insert Position
package LeetcodeProblems;
public class Qno035 {

    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 7;
        System.out.println(searchInsert(arr,target));
    }
    public static int searchInsert(int[] nums, int target) {
        int index =0;
        boolean found = false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                index = i;
                found = true;
                break;
            }
        }
        if(!found){
            if(nums[nums.length-1]<target){
                index = nums.length;
            }
            else if(nums[0]>target){
                index = 0;
            }
            else{
                for(int i=0;i<nums.length-1;i++){
                    if(nums[i]<=target && target<=nums[i+1]){
                        index = i+1;
                        break;
                    }
                }
            }
        }
        return index;
    }
    
}
