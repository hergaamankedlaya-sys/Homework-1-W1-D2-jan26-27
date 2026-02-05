public class MergeSortedArrays {
    /**
     * Merges two sorted arrays into one sorted array.
     * Assumption: both input arrays are already sorted in ascending order.
     */
    public static int[] merge(int[] a, int[] b) {

        int[] result = new int[a.length + b.length];

        int i = 0; // pointer for array a
        int j = 0; // pointer for array b
        int k = 0; // pointer for result array

        // Compare elements from both arrays and add smaller one
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                result[k] = a[i];
                i++;
            } else {
                result[k] = b[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from array a (if any)
        while (i < a.length) {
            result[k] = a[i];
            i++;
            k++;
        }

        // Copy remaining elements from array b (if any)
        while (j < b.length) {
            result[k] = b[j];
            j++;
            k++;
        }

        return result;
    }
}
