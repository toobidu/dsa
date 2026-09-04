package com.dsa.module0.lab01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class P0001TwoSumTest {

    private final P0001TwoSum s = new P0001TwoSum();

    @Test
    void mauDeBai() {
        assertArrayEquals(new int[]{0, 1}, s.bruteForce(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{0, 1}, s.optimal(new int[]{2, 7, 11, 15}, 9));

        assertArrayEquals(new int[]{1, 2}, s.bruteForce(new int[]{3, 2, 4}, 6));
        assertArrayEquals(new int[]{1, 2}, s.optimal(new int[]{3, 2, 4}, 6));
    }

    /**
     * Test biên. Nghĩ đủ trước khi viết:
     * mảng chỉ 2 phần tử, có số âm, có số 0, hai phần tử bằng nhau (nums = [3,3]),
     * và target lớn tới mức tổng tràn int.
     */
    @Test
    void bienHaiPhanTuBangNhau() {
        int[] nums = {3, 3};
        int target = 6;
        assertArrayEquals(new int[]{0, 1}, s.bruteForce(nums, target));
        assertArrayEquals(new int[]{0, 1}, s.optimal(nums, target));
    }

    @Test
    void bienCoSoAm() {
        int[] nums = {-3, 4, 3, 90};
        int target = 0;
        assertArrayEquals(new int[]{0, 2}, s.bruteForce(nums, target));
        assertArrayEquals(new int[]{0, 2}, s.optimal(nums, target));

        int[] nums2 = {-1, -2, -3, -4, -5};
        int target2 = -8;
        assertArrayEquals(new int[]{2, 4}, s.bruteForce(nums2, target2));
        assertArrayEquals(new int[]{2, 4}, s.optimal(nums2, target2));
    }

    /** Hai cách phải cho cùng kết quả trên input ngẫu nhiên — cách rẻ nhất để bắt lỗi cách 2. */
    @Test
    void haiCachPhaiKhopNhau() {
        int[] nums = {15, -4, 23, 8, 12, 99, -10};
        int target = -14; // -4 (idx 1) + -10 (idx 6) = -14
        int[] resBrute = s.bruteForce(nums, target);
        int[] resOptimal = s.optimal(nums, target);
        assertArrayEquals(resBrute, resOptimal);
        assertArrayEquals(new int[]{1, 6}, resOptimal);
    }
}
