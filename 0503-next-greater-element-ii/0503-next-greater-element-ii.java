class Solution {

    public int[] nextGreaterElements(int[] nums) {

        ArrayList<Integer> ans = nextLargerElement(nums);

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
    public ArrayList<Integer> nextLargerElement(int[] arr) {

        int n = arr.length;
        Stack<Integer> s1 = new Stack<>();
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        
        for (int i = 2 * n - 1; i >= 0; i--) {

            int index = i % n;

            while (!s1.isEmpty() && s1.peek() <= arr[index]) {
                s1.pop();
            }

            if (i < n) {
                if (!s1.isEmpty()) {
                    ans[index] = s1.peek();
                }
            }

            s1.push(arr[index]);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int num : ans) {
            list.add(num);
        }

        return list;
    }
}