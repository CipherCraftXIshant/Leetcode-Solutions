class Solution {
     int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        // If do not find pivot it means arr is not rotated
        if(pivot == -1){
            return binarySearch(nums, target, 0, nums.length-1);
        }
        // if pivot is found we have 2 asc sorted arrays
        if(nums[pivot] == target){
            return pivot;
        }
        if(target>=nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }
        else{
            return binarySearch(nums, target, pivot+1, nums.length-1);
        }
    }

     int binarySearch(int[] arr,int target, int start , int end){
                while(start<=end){
                    int mid = start + (end-start)/2;
                if(arr[mid] == target){
                    return mid ;
                }
                if(arr[mid]>target){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            return -1;
        }
        

     int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end = mid-1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}