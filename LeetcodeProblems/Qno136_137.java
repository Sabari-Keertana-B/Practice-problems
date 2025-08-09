//136. Single Number
//137. Single Number II
package LeetcodeProblems;

public class Qno136_137 {
    public static void main(String[] args) {
        int nums[] = {0,1,0,1,0,1,99};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        int num =0;

        for(int i=0;i<nums.length;i++){
            if(visited[i]) continue;
            int count = 1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                    visited[j]=true;
                }
            }
            if(count==1){
                num = nums[i];
                break;
            }
        }
        return num;
    }
}
