class Solution 
{
    public double findMedianSortedArrays(int[] num1, int[] num2) 
    {
        int len1 = num1.length;
        int len2 = num2.length;
        int[] mergedArr = new int[len1 + len2];

        int i = 0, j = 0, k = 0;

        while (i < len1 && j < len2) {
            if (num1[i] <= num2[j]) {
                mergedArr[k++] = num1[i++];
            } else {
                mergedArr[k++] = num2[j++];
            }
        }

        while (i < len1) {
            mergedArr[k++] = num1[i++];
        }

        while (j < len2) {
            mergedArr[k++] = num2[j++];
        }

        int newLen = mergedArr.length;
        double ans = -1;

        if (newLen % 2 == 0) {
            int mid = newLen / 2;
            double res = (double) (mergedArr[mid - 1] + mergedArr[mid]) / 2;
            ans = res;
        } else {
            int mid = newLen / 2;
            ans = mergedArr[mid];
        }

        return ans;
    }
}