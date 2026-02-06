class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int k = nums1.length;
        int m = nums2.length;
        int i=0;
        int j=0;
        int l = 0;
        int[] result = new int[k+m];
        while(i<k && j<m){
            if(nums1[i]<nums2[j]){
                result[l++] = nums1[i++];
            }else{
                result[l++] = nums2[j++];
            }
        }
        while(i<k){
            result[l++] = nums1[i++];
        }
        while(j<m){
            result[l++] = nums2[j++];
        }

        int n = result.length;
        if(n%2!=0){
            return result[n/2];
        }else{
            return ( result[n/2 -1] + result[n/2]) / 2.0;
        }
    }
}