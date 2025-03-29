class Solution {
    public int singleNumber(int[] nums) {
        int single=0;
        for (int i=0;i<nums.length;i++) {
            single = single^nums[i];
        }

        return single;
    }
}
class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for (int num:nums) {
            xor = xor^num;
        }
        int twoscomp = xor & (-xor);
        int xor2=0;
        for (int num:nums) {
            if ((num & twoscomp) != 0 ){
                xor2 = xor2^num;
            }
        }

        return new int[]{xor2, xor^xor2};
    }
}
