class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>() ;
        int ans = 0;
        for(int num : nums){
            if(set.contains(num)){
                set.remove(num);
            }else{
                set.add(num);
            }
        } 
        ArrayList<Integer> list = new ArrayList<>(set);
        return list.get(0);
    }
}