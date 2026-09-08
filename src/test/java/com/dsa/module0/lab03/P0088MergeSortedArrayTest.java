package com.dsa.module0.lab03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P0088MergeSortedArrayTest {

    private final P0088MergeSortedArray s = new P0088MergeSortedArray();

    /**
     * Test này chép nguyên ví dụ 1 trong đề — không có gì phải nghĩ, nên tôi viết hộ.
     * Chú ý cách kiểm tra: merge trả về void, nên phải soi lại chính nums1 sau khi gọi.
     */
    @Test
    void mauDeBai() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        s.optimal(nums1, 3, nums2, 3);

        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    /**
     * Hai test dưới đây bạn tự viết. Đây là phần có giá trị nhất của bài,
     * và cũng là 15 điểm rubric "tự tìm ra bug bằng chạy tay" trong phỏng vấn thật.
     * <p>
     * Danh sách biên phải cân nhắc, xem GUIDE.md mục 4.4:
     * rỗng · một phần tử · toàn phần tử giống nhau · đã sắp xếp sẵn / ngược · số âm và số 0 · N lớn nhất.
     * <p>
     * Riêng LC 88 có hai biên đặc thù mà rất nhiều lời giải chết ở đó — đọc kỹ ràng buộc
     * của m và n trong đề rồi tự tìm ra chúng.
     */
    @Test
    void bien1_nBangKhong() {
        // Ví dụ 2: n = 0, nums2 không có phần tử nào cần merge, nums1 giữ nguyên
        int[] nums1 = {1};
        int[] nums2 = {};
        s.optimal(nums1, 1, nums2, 0);
        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    void bien2_mBangKhong() {
        // Ví dụ 3: m = 0, nums1 ban đầu chỉ có số 0 đệm, chép toàn bộ nums2 sang
        int[] nums1 = {0};
        int[] nums2 = {1};
        s.optimal(nums1, 0, nums2, 1);
        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    void bienSoAmVaSoKhong() {
        // Mảng có chứa số âm và số 0
        int[] nums1 = {-5, -2, 0, 0, 0};
        int[] nums2 = {-3, 0, 4};
        s.optimal(nums1, 2, nums2, 3);
        assertArrayEquals(new int[]{-5, -3, -2, 0, 4}, nums1);
    }

    @Test
    void bienPhanTuTrungNhau() {
        // Toàn bộ phần tử 2 bên đều giống nhau
        int[] nums1 = {2, 2, 2, 0, 0, 0};
        int[] nums2 = {2, 2, 2};
        s.optimal(nums1, 3, nums2, 3);
        assertArrayEquals(new int[]{2, 2, 2, 2, 2, 2}, nums1);
    }

    @Test
    void bienNums2NhoHonToanBoNums1() {
        // nums2 nhỏ hơn toàn bộ nums1: kiểm tra vòng lặp vét nums2
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int[] nums2 = {1, 2, 3};
        s.optimal(nums1, 3, nums2, 3);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, nums1);
    }

    @Test
    void bienNums1NhoHonToanBoNums2() {
        // nums1 nhỏ hơn toàn bộ nums2: nums1 giữ nguyên vị trí, nums2 điền vào đuôi
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {4, 5, 6};
        s.optimal(nums1, 3, nums2, 3);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, nums1);
    }
}

