package com.dsa.module0.lab02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P0121BestTimeToBuyAndSellStockTest {

    private final P0121BestTimeToBuyAndSellStock s = new P0121BestTimeToBuyAndSellStock();

    @Test
    void mauDeBai() {
        // Ví dụ 1: mua ngày 2 (giá 1), bán ngày 5 (giá 6), lãi = 5
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        assertEquals(5, s.bruteForce(prices1));
        assertEquals(5, s.optimal(prices1));

        // Ví dụ 2: giá giảm dần liên tục, không có ngày nào có lãi, trả về 0
        int[] prices2 = {7, 6, 4, 3, 1};
        assertEquals(0, s.bruteForce(prices2));
        assertEquals(0, s.optimal(prices2));
    }

    /**
     * Test biên: mảng 1 phần tử và mảng 2 phần tử.
     */
    @Test
    void bienMotPhanTuVaMangNho() {
        // Mảng 1 phần tử: không thể vừa mua vừa bán trong tương lai
        assertEquals(0, s.bruteForce(new int[]{5}));
        assertEquals(0, s.optimal(new int[]{5}));

        // Mảng 2 phần tử tăng dần
        assertEquals(2, s.bruteForce(new int[]{2, 4}));
        assertEquals(2, s.optimal(new int[]{2, 4}));

        // Mảng 2 phần tử giảm dần
        assertEquals(0, s.bruteForce(new int[]{4, 2}));
        assertEquals(0, s.optimal(new int[]{4, 2}));
    }

    /**
     * Test biên: toàn bộ giá bằng nhau và đáy xuất hiện ở ngày cuối cùng.
     */
    @Test
    void bienGiaKhongDoiVaDayOCuoi() {
        // Giá bằng nhau toàn bộ
        int[] flat = {3, 3, 3, 3};
        assertEquals(0, s.bruteForce(flat));
        assertEquals(0, s.optimal(flat));

        // Đáy giá thấp nhất (1) xuất hiện ở ngày cuối cùng -> không thể mua ở đáy này để bán
        // Lợi nhuận lớn nhất vẫn là mua ở 3 và bán ở 8 -> lãi 5
        int[] valleyAtEnd = {3, 8, 1};
        assertEquals(5, s.bruteForce(valleyAtEnd));
        assertEquals(5, s.optimal(valleyAtEnd));
    }

    /**
     * Differential testing: Hai cách phải cho cùng kết quả trên mảng dao động phức tạp.
     */
    @Test
    void haiCachPhaiKhopNhau() {
        int[] prices = {9, 2, 4, 3, 8, 1, 6, 7};
        int resBrute = s.bruteForce(prices);
        int resOptimal = s.optimal(prices);
        assertEquals(resBrute, resOptimal);
        assertEquals(6, resOptimal); // mua 2 bán 8 (lãi 6), hoặc mua 1 bán 7 (lãi 6)
    }
}