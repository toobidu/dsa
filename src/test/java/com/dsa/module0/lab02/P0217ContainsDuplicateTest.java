package com.dsa.module0.lab02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class P0217ContainsDuplicateTest {

    private final P0217ContainsDuplicate s = new P0217ContainsDuplicate();

    @Test
    void mauDeBai() {
        // Ví dụ 1: số 1 xuất hiện ở vị trí 0 và 3 -> true
        int[] nums1 = {1, 2, 3, 1};
        assertTrue(s.bruteForce(nums1));
        assertTrue(s.bySorting(nums1));
        assertTrue(s.optimal(nums1));

        // Ví dụ 2: mọi phần tử đều phân biệt -> false
        int[] nums2 = {1, 2, 3, 4};
        assertFalse(s.bruteForce(nums2));
        assertFalse(s.bySorting(nums2));
        assertFalse(s.optimal(nums2));

        // Ví dụ 3: nhiều phần tử trùng lặp lặp đi lặp lại -> true
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        assertTrue(s.bruteForce(nums3));
        assertTrue(s.bySorting(nums3));
        assertTrue(s.optimal(nums3));
    }

    /**
     * Test biên: mảng 1 phần tử và mảng 2 phần tử.
     */
    @Test
    void bienKichThuocNho() {
        // Mảng 1 phần tử: không thể có phần tử trùng lặp
        assertFalse(s.bruteForce(new int[]{42}));
        assertFalse(s.bySorting(new int[]{42}));
        assertFalse(s.optimal(new int[]{42}));

        // Mảng 2 phần tử khác nhau
        assertFalse(s.bruteForce(new int[]{1, 2}));
        assertFalse(s.bySorting(new int[]{1, 2}));
        assertFalse(s.optimal(new int[]{1, 2}));

        // Mảng 2 phần tử trùng nhau
        assertTrue(s.bruteForce(new int[]{7, 7}));
        assertTrue(s.bySorting(new int[]{7, 7}));
        assertTrue(s.optimal(new int[]{7, 7}));
    }

    /**
     * Test biên: số âm và giá trị lớn (biên -10^9 và 10^9).
     */
    @Test
    void bienSoAmVaGiaTriLon() {
        // Toàn số âm không trùng
        int[] negativeNoDup = {-5, -1, -9, -20};
        assertFalse(s.bruteForce(negativeNoDup));
        assertFalse(s.bySorting(negativeNoDup));
        assertFalse(s.optimal(negativeNoDup));

        // Số cực trị biên -10^9 và 10^9 trùng nhau
        int[] extremeDup = {-1_000_000_000, 1_000_000_000, -1_000_000_000};
        assertTrue(s.bruteForce(extremeDup));
        assertTrue(s.bySorting(extremeDup));
        assertTrue(s.optimal(extremeDup));
    }

    /**
     * Differential testing: Cả 3 cách giải (Brute force, Sorting, HashSet) phải luôn cho kết quả đồng nhất.
     */
    @Test
    void baCachPhaiKhopNhau() {
        int[] testCase1 = {10, 20, 30, 40, 50, 60, 30};
        boolean resBrute = s.bruteForce(testCase1);
        boolean resSort = s.bySorting(testCase1);
        boolean resOptimal = s.optimal(testCase1);

        assertEquals(resBrute, resSort);
        assertEquals(resSort, resOptimal);
        assertTrue(resOptimal);

        int[] testCase2 = {100, -200, 300, -400, 500};
        assertEquals(s.bruteForce(testCase2), s.optimal(testCase2));
        assertEquals(s.bySorting(testCase2), s.optimal(testCase2));
        assertFalse(s.optimal(testCase2));
    }
}