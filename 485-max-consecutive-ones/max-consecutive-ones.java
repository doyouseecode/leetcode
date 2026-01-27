class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int countMax = 0, count = 0;

        for (int j : arr) {
            if (j == 1) {
                count++;
            } else {
                if (countMax < count) {
                    countMax = count;
                }
                count = 0;
            }
        }
        if (countMax < count) {
            countMax = count;
        }
        return countMax;
    }
}