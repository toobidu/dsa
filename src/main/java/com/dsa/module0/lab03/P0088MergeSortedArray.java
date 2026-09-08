package com.dsa.module0.lab03;

import java.util.Arrays;

/**
 * LC 88 — MergeSortedArray (Easy)
 * <a href="https://leetcode.com/problems/merge-sorted-array/">...</a>
 * <p>
 * Giới hạn: 20 phút. Hẹn giờ TRƯỚC khi đọc đề.
 * <p>
 * Điền ba dòng này TRƯỚC khi gõ dòng code đầu tiên:
 * Ràng buộc và biên : nums1.length == m + n; nums2.length == n; 0 <= m, n <= 200; 1 <= m + n <= 200; -10^9 <= nums1[i], nums2[j] <= 10^9
 * Brute force + Big-O: sao chép trc tiếp tất cả các phần tử của nums 2 vào phần đuôi đệm rồi sắp xếp lại; O(m+n)log(m+n)
 * Hướng tối ưu       :
 * Điền sau khi pass:
 * bruteForce Time: O((m+n)log(m+n))  Space: O(1)
 * optimal    Time: O(m+n)            Space: O(1)
 * Vì sao cách tối ưu đúng: Duyệt 3 con trỏ từ đuôi mảng (lùi dần) giúp đặt ngay phần tử lớn nhất vào đúng vị trí cuối cùng trong vùng đệm của nums1 mà không làm ghi đè hay mất mát bất kỳ dữ liệu hợp lệ nào phía trước.
 */
public class P0088MergeSortedArray {

    public void bruteForce(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++){
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }


    public void optimal(int[] nums1, int m, int[] nums2, int n) {
        int lastIndexNums1ByInt = m - 1;
        int lastIndexNums2ByInt = n - 1;
        int lastIndexNums1 = m + n - 1;
        while(lastIndexNums1ByInt >= 0 && lastIndexNums2ByInt >= 0){
            if (nums1[lastIndexNums1ByInt] > nums2[lastIndexNums2ByInt]){
                nums1[lastIndexNums1] = nums1[lastIndexNums1ByInt];
                lastIndexNums1ByInt--;
            }else{
                nums1[lastIndexNums1] = nums2[lastIndexNums2ByInt];
                lastIndexNums2ByInt--;
            }
            lastIndexNums1--;
        }

        while (lastIndexNums2ByInt >= 0){
            nums1[lastIndexNums1] = nums2[lastIndexNums2ByInt];
            lastIndexNums2ByInt--;
            lastIndexNums1--;
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        optimal(nums1, m, nums2, n);
    }
}