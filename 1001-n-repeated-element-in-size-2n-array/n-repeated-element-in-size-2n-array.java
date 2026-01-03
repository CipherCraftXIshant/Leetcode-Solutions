class Solution {
    public int repeatedNTimes(int[] nums) {

        // Arrays.sort(nums);

        // for(int i=0;i<nums.length;i++){
        //     for(int j = i+1 ; j<nums.length;j++){
        //         if(nums[i] == nums[j]){
        //             return nums[i];
        //         }
        //     }
        // }
        // return 0;

        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return nums[i];
            }else{
                set.add(nums[i]);
            }
        }
        return 0;
    }
}