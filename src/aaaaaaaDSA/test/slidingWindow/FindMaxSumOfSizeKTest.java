package aaaaaaaDSA.test.slidingWindow;


import aaaaaaaDSA.slidingWindow.FindMaxSumOfSizeK;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindMaxSumOfSizeKTest {

    private FindMaxSumOfSizeK findMaxSumOfSizeK;

    @BeforeEach
    void setUp(){
        findMaxSumOfSizeK = new FindMaxSumOfSizeK();
    }

    @Test
    void givenValidArray_whenMaxSumCalled_thenReturnCorrectSum(){
        int [] arr = {2, 4, 7, 1, 9, 3, 6};
        assertEquals(18,findMaxSumOfSizeK.findMaxSum(arr,3));
    }

    

        // ── Happy path ─────────────────────────────────────────────

        @Test
        void givenValidArray_whenMaxSumCalled_thenReturnsCorrectSum() {
            int[] arr = {2, 4, 7, 1, 9, 3, 6};
            assertEquals(18, findMaxSumOfSizeK.findMaxSum(arr, 3));
        }

        @Test
        void givenWindowEqualToArrayLength_whenMaxSumCalled_thenReturnsTotalSum() {
            int[] arr = {2, 4, 7};
            assertEquals(13, findMaxSumOfSizeK.findMaxSum(arr, 3));
        }

        @Test
        void givenWindowSizeOne_whenMaxSumCalled_thenReturnsLargestElement() {
            int[] arr = {2, 4, 7, 1, 9, 3, 6};
            assertEquals(9, findMaxSumOfSizeK.findMaxSum(arr, 1));
        }

        @Test
        void givenMaxSumWindowAtStart_whenCalled_thenReturnsCorrectly() {
            int[] arr = {9, 8, 7, 1, 2, 3, 4};
            assertEquals(24, findMaxSumOfSizeK.findMaxSum(arr, 3));
        }

        @Test
        void givenAllElementsSame_whenMaxSumCalled_thenReturnsKTimesValue() {
            int[] arr = {5, 5, 5, 5, 5, 5, 5};
            assertEquals(15, findMaxSumOfSizeK.findMaxSum(arr, 3));
        }

        // ── Exception cases ────────────────────────────────────────

        @Test
        void givenNullArray_whenMaxSumCalled_thenThrowsIllegalArgumentException() {
            assertThrows(IllegalArgumentException.class,
                    () -> findMaxSumOfSizeK.findMaxSum(null, 3));
        }

        @Test
        void givenEmptyArray_whenMaxSumCalled_thenThrowsIllegalArgumentException() {
            assertThrows(IllegalArgumentException.class,
                    () -> findMaxSumOfSizeK.findMaxSum(new int[]{}, 1));
        }

        @Test
        void givenNegativeWindowSize_whenMaxSumCalled_thenThrowsIllegalArgumentException() {
            int[] arr = {2, 4, 7};
            assertThrows(IllegalArgumentException.class,
                    () -> findMaxSumOfSizeK.findMaxSum(arr, -1));
        }

        @Test
        void givenZeroWindowSize_whenMaxSumCalled_thenThrowsIllegalArgumentException() {
            int[] arr = {2, 4, 7};
            assertThrows(IllegalArgumentException.class,
                    () -> findMaxSumOfSizeK.findMaxSum(arr, 0));
        }

        @Test
        void givenWindowSizeExceedsArrayLength_whenMaxSumCalled_thenThrowsIllegalArgumentException() {
            int[] arr = {2, 4, 7};
            assertThrows(IllegalArgumentException.class,
                    () -> findMaxSumOfSizeK.findMaxSum(arr, 5));
        }

        // ── Boundary ───────────────────────────────────────────────

        @Test
        void givenSingleElementArray_whenWindowSizeOne_thenReturnsThatElement() {
            int[] arr = {42};
            assertEquals(42, findMaxSumOfSizeK.findMaxSum(arr, 1));
        }

        @Test
        void givenMaxSumWindowAtEnd_whenCalled_thenReturnsCorrectly() {
            int[] arr = {1, 2, 3, 4, 9, 8, 7};
            assertEquals(24, findMaxSumOfSizeK.findMaxSum(arr, 3));
        }
    }

