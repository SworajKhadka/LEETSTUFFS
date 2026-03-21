class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length<3) return false;
        int n = arr.length;
        int i = 0;

        // 1. Climb up: move forward as long as it's strictly increasing
        while (i+1<n && arr[i] < arr[i + 1]) {
            i++;
        }
        //value of i is 4 over here
        //since this is supposed to be the peak, so it cannot be 0 or last element
        if(i==0 || i==n-1){
            return false;
        }

        while(i+1<n && arr[i]>arr[i+1]){
            i++;
        }
    return i==n-1;
    }
}