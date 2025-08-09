//Qno88. Merge Sorted Array
package LeetcodeProblems;

public class Qno088 {
    public static void main(String[] args) {
        int arr1[] ={1,0};
        int m = 1;
        int arr2[] = {0};
        int n = 0;
        merge(arr1,m,arr2,n);
                
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m + n];

        for (int i = 0; i < m; i++) {
            res[i] = nums1[i];
        }

        for (int i = 0; i < n; i++) {
            res[i + m] = nums2[i];
        }

        for (int i = 0; i < res.length - 1; i++) {
            for (int j = 0; j < res.length - 1 - i; j++) {
                if (res[j] > res[j + 1]) {
                    int temp = res[j];
                    res[j] = res[j + 1];
                    res[j + 1] = temp; 
                }
            }
        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
