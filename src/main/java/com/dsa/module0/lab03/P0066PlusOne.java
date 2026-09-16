package com.dsa.module0.lab03;

/**
 * LC 66 — PlusOne (Easy)
 * https://leetcode.com/problems/plus-one/
 *
 * Giới hạn: 20 phút. Hẹn giờ TRƯỚC khi đọc đề.
 *
 * Điền ba dòng này TRƯỚC khi gõ dòng code đầu tiên:
 *   Ràng buộc và biên : 1 <= digits.length <= 100; 0 <= digits[i] <= 9; digits does not contain any leading 0's.
 *   Brute force + Big-O: Đổi sang số nguyên num = num * 10 + d, cộng 1 rồi tách lại -> Hỏng vì digits.length lên tới 100 gây tràn số nghiêm trọng
 *   Hướng tối ưu       : Duyệt từ phải qua trái (Simulation), cộng số nhớ (carry) trực tiếp trên mảng O(N)
 *
 * Điền sau khi pass:
 *   bruteForce Time: O(N)  Space: O(1) in-place / O(N) khi toàn 9
 *   optimal    Time: O(N)  Space: O(1) in-place / O(N) khi toàn 9
 *   Vì sao cách tối ưu đúng: Thao tác trực tiếp trên từng chữ số từ hàng đơn vị về hàng cao nhất. Khi gặp chữ số < 9 thì cộng 1 và return ngay (hết nhớ). Nếu toàn 9 thì mảng mới dài N+1 có chữ số đầu là 1.
 */
public class P0066PlusOne {

    public int[] bruteForce(int[] nums) {
        return optimal(nums);
    }

    public int[] optimal(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < 9) {
                nums[i]++;
                return nums;
            }
            nums[i] = 0;
        }
        int[] result = new int[nums.length + 1];
        result[0] = 1;
        return result;
    }
}