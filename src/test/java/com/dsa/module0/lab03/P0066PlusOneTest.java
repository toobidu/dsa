package com.dsa.module0.lab03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class P0066PlusOneTest {

    private final P0066PlusOne s = new P0066PlusOne();

    @Test
    void mauDeBai() {
        // Ví dụ 1: [1, 2, 3] + 1 = [1, 2, 4]
        assertArrayEquals(new int[]{1, 2, 4}, s.bruteForce(new int[]{1, 2, 3}));

        // Ví dụ 2: [4, 3, 2, 1] + 1 = [4, 3, 2, 2]
        assertArrayEquals(new int[]{4, 3, 2, 2}, s.bruteForce(new int[]{4, 3, 2, 1}));

        // Ví dụ 3: [9] + 1 = [1, 0]
        assertArrayEquals(new int[]{1, 0}, s.bruteForce(new int[]{9}));
    }

    /**
     * Test biên 1: Chữ số 9 ở cuối nhưng chưa tràn toàn bộ mảng (có nhớ ở hàng đơn vị/chục).
     */
    @Test
    void bien1_coNhoNhungKhongTangKichThuoc() {
        // [1, 2, 9] -> [1, 3, 0]
        assertArrayEquals(new int[]{1, 3, 0}, s.bruteForce(new int[]{1, 2, 9}));

        // [1, 9, 9] -> [2, 0, 0]
        assertArrayEquals(new int[]{2, 0, 0}, s.bruteForce(new int[]{1, 9, 9}));
    }

    /**
     * Test biên 2: Toàn bộ chữ số là 9 -> bắt buộc tăng độ dài mảng lên 1 đơn vị.
     */
    @Test
    void bien2_toanSo9TangKichThuoc() {
        // [9, 9] -> [1, 0, 0]
        assertArrayEquals(new int[]{1, 0, 0}, s.bruteForce(new int[]{9, 9}));

        // [9, 9, 9] -> [1, 0, 0, 0]
        assertArrayEquals(new int[]{1, 0, 0, 0}, s.bruteForce(new int[]{9, 9, 9}));
    }

    /**
     * Test biên 3: Mảng 1 phần tử không phải là 9.
     */
    @Test
    void bien3_motPhanTuDonGian() {
        assertArrayEquals(new int[]{1}, s.bruteForce(new int[]{0}));
        assertArrayEquals(new int[]{7}, s.bruteForce(new int[]{6}));
    }

    /**
     * Test optimal độc lập và đối chiếu với bruteForce.
     */
    @Test
    void kiemTraOptimal() {
        assertArrayEquals(new int[]{1, 2, 4}, s.optimal(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 3, 0}, s.optimal(new int[]{1, 2, 9}));
        assertArrayEquals(new int[]{1, 0, 0}, s.optimal(new int[]{9, 9}));
        assertArrayEquals(new int[]{1, 0}, s.optimal(new int[]{9}));
    }
}