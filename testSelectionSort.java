package FinalExam;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class testSelectionSort {
    @Test
    public void test() {
        testPositive();
        testNegative();
        testMixed();
    }

    public void testPositive() {
        int[] arr = {8, 9, 7, 10, 2};
        SelectionSort sorter = new SelectionSort();
        sorter.selectionSort(arr); // fix: call selectionSort instead of basicSelectionSort
        int[] expectedArr = {2, 7, 8, 9, 10};
        assertArrayEquals(expectedArr, arr);
    }

    public void testNegative() {
        int[] arr = {-5, -10, -3, -1, -8};
        SelectionSort sorter = new SelectionSort();
        sorter.selectionSort(arr); // fix: call selectionSort instead of basicSelectionSort
        int[] expectedArr = {-10, -8, -5, -3, -1};
        assertArrayEquals(expectedArr, arr);
    }

    public void testMixed() {
        int[] arr = {-5, 10, 0, -1, 3};
        SelectionSort sorter = new SelectionSort();
        sorter.selectionSort(arr); // fix: call selectionSort instead of basicSelectionSort
        int[] expectedArr = {-5, -1, 0, 3, 10};
        assertArrayEquals(expectedArr, arr);
    }
}
