/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeakElement(mountainArr);
        int firsttry = orderAgnosticsBS(mountainArr , target , 0 , peak);
        if(firsttry != -1){
            return firsttry;
        }
        else{
            return orderAgnosticsBS(mountainArr , target , peak + 1 , mountainArr.length() - 1);
        }
    }
    // int search (int[]arr,int target){
    //     int peak = findPeakElement(arr);
    //     int firsttry = orderAgnosticsBS(arr , target , 0 , peak);
    //     if(firsttry != -1){
    //         return firsttry;
    //     }
    //     else{
    //         return orderAgnosticsBS(arr , target , peak + 1 , arr.length - 1);
    //     }
    // }

    static int orderAgnosticsBS(MountainArray arr, int target,int start , int end){

        // to find whether ascendin or descending
        boolean isAsc = arr.get(start) < arr.get(end);

        while(start<=end){
            int mid = start + (end - start)/2;
            int midval = arr.get(mid);
            if(midval == target){
                return mid;
            }
            if(isAsc){
                if(target<midval){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(target>midval){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }    

    public int findPeakElement(MountainArray arr) {
        int start = 0;
        int end = arr.length() - 1;
        while(start<end){
            int mid = start + (end - start)/2;
            if(arr.get(mid)>arr.get(mid+1)){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
}