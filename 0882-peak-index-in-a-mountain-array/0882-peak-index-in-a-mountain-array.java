class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int maxi = 0;
        for(int i = 0;i<arr.length;i++){
        if(arr[i]>arr[maxi]){
            maxi = i;
        }
        }
        return maxi;
    }
}