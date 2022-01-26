class Solution_2 {
    // Solution using a set to avoid duplicates.
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        if(nums.length < 3) return new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length - 2 ; ++i){
            int j = i + 1;
            int k = nums.length - 1;
            int sum = 0;
            while(j < k){
                sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    res.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                } else {
                    if(sum > 0) k--;
                    else j++;
                }
            }
        }
        return new ArrayList<>(res);
    }
}