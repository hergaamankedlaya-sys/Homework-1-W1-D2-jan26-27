import static org.junit.Assert.*;
import org.junit.Test;
/**
 * Test class for MergeSortedArrays.
 * Each test checks a different scenario for merging sorted arrays.
 */
public class MergeSortedArraysTest {
    /**
     * Tests merging two normal, non-empty sorted arrays.
     */
    @Test
    public void testMergeNormalArrays() {
        // Input arrays (both already sorted)
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6};

        // Expected result after merging
        int[] expected = {1, 2, 3, 4, 5, 6};

        // Call the merge method
        int[] actual = MergeSortedArrays.merge(a, b);

        // Verify that actual output matches expected output
        assertArrayEquals(expected, actual);
    }
    /**
     * Tests merging arrays that contain duplicate values.
     * Confirms duplicates are preserved and order is correct.
     */
    @Test
    public void testMergeWithDuplicates() {
        // Input arrays with duplicate elements
        int[] a = {1, 2, 2};
        int[] b = {2, 3};

        // Expected merged array including all duplicates
        int[] expected = {1, 2, 2, 2, 3};

        // Perform merge
        int[] actual = MergeSortedArrays.merge(a, b);

        // Check that duplicates appear in correct sorted order
        assertArrayEquals(expected, actual);
    }
    /**
     * Tests merging when the first array is empty.
     * Result should be the same as the second array.
     */
    @Test
    public void testMergeWithEmptyArray() {
        // First array is empty
        int[] a = {};

        // Second array has elements
        int[] b = {1, 2, 3};

        // Expected output is just the non-empty array
        int[] expected = {1, 2, 3};

        // Merge arrays
        int[] actual = MergeSortedArrays.merge(a, b);

        // Verify result
        assertArrayEquals(expected, actual);
    }
    /**
     * Tests merging when both input arrays are empty.
     * Result should also be an empty array.
     */
    @Test
    public void testMergeBothEmpty() {
        // Both arrays are empty
        int[] a = {};
        int[] b = {};

        // Expected result is an empty array
        int[] expected = {};

        // Merge empty arrays
        int[] actual = MergeSortedArrays.merge(a, b);

        // Confirm the result is empty
        assertArrayEquals(expected, actual);
    }
}
