//169. Majority Element
package LeetcodeProblems;

public class Qno169 {
    public static void main(String[] args) {
        int num[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(num));
    }
    public static int majorityElement(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        int num=0;
        for(int i=0;i<nums.length;i++){
            if(visited[i]) continue;
            int count=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                    visited[j] = true;
                }
            }
            if(count>nums.length/2){
                num = nums[i];
                break;
            }
        }
        return num;
    }
}
