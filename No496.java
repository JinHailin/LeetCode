public class No496 {
    public static void main(String [] args){
        int []a=Solution.nextGreaterElement(new int[]{4,1,2},new int[]{1,3,4,2});
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
}
class Solution {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int []a=new int[nums1.length];
        int index=0;
        for(int i=0;i<nums1.length;i++){
            int temp=0;
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==nums1[i]) {
                    temp = 1;
                }

                if((nums2[j]>nums1[i])&&(temp==1)) {
                    a[index++] = nums2[j];
                    temp=0;
                }
            }
            if(temp==1)
                a[index++]=-1;
        }
        return a;
    }
}
