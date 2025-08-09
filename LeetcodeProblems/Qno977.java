//Qno977. Squares of a sorted array
package LeetcodeProblems;

public class Qno977 {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        int res[] =sortedSquares(arr);
        
        for(int num:res){
            System.out.print(num+" ");
        }
                
    }
    public static int[] sortedSquares(int[] nums) {
        int sq[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sq[i] = nums[i]*nums[i];
        }
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(sq[j]>sq[j+1]){
                    int temp = sq[j];
                    sq[j] = sq[j+1];
                    sq[j+1]=temp;
                }
                
            }
        }
        return sq;
    }
}
