class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {

        HashSet<Integer> set = new HashSet<>();

        int ans=0;

        for(int x:nums) {
            set.add(x);

            if(set.contains(x-diff) && set.contains(x-2*diff))
                ans++;
        }
        return ans;
    }
}