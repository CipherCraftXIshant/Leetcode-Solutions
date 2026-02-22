class Solution {
    public int[] singleNumber(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] arr = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int x : nums){
            if(map.get(x)==1){
                ans.add(x);
            }
        }
        for(int i=0;i<ans.size();i++){
            arr[i] = ans.get(i);
        }
        return arr;
    }
}