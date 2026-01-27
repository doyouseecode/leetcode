class Solution {
    public int[] shuffle(int[] arr, int n) {
        int[] res = new int[arr.length];
        int k = 0;
        for(int i = 0; i < n; i++){
            res[k] = arr[i];
            res[k+1] = arr[i+n];
            k+=2;
        }
        return res;
    }
}