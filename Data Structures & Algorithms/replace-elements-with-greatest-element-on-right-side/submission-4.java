class Solution {
    public int[] replaceElements(int[] arr) {
        int maxSoFar = -1;
        for (int i = arr.length -1; i >= 0; i--) {
            int cur = arr[i];
            arr[i] = maxSoFar;
            if (cur > maxSoFar) {
                maxSoFar = cur;
            }
        }
        arr[arr.length - 1] = -1;
        return arr;
    }
}