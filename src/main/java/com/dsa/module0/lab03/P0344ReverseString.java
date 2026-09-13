package com.dsa.module0.lab03;

/**
 * LC 344 — ReverseString (Easy)
 * <a href="https://leetcode.com/problems/reverse-string/">...</a>
 * <p>
 * Giới hạn: 20 phút. Hẹn giờ TRƯỚC khi đọc đề.
 * <p>
 * Điền ba dòng này TRƯỚC khi gõ dòng code đầu tiên:
 * Ràng buộc và biên : 1 <= s.length <= 10^5; s[i] là ký tự ASCII in được; phải sửa mảng tại chỗ (in-place) với O(1) extra memory. Biên: mảng 1 phần tử (không đổi), mảng 2 phần tử, mảng độ dài lẻ (phần tử chính giữa giữ nguyên), mảng độ dài chẵn, toàn ký tự giống nhau.
 * Brute force + Big-O: Tạo mảng tạm temp kích thước N, duyệt ngược sao chép s sang temp rồi chép ngược lại s. Time O(N), Space O(N) (vi phạm ràng buộc O(1) bộ nhớ phụ của đề).
 * Hướng tối ưu       : Kỹ thuật Two Pointers hai đầu: con trỏ left = 0, right = n - 1. Hoán đổi s[left] và s[right], rồi co dần vào tâm (left++, right--) cho đến khi left >= right. Time O(N), Space O(1).
 * <p>
 * Điền sau khi pass:
 * bruteForce Time: O(N)  Space: O(N)
 * optimal    Time: O(N)  Space: O(1)
 * Vì sao cách tối ưu đúng: Đảo ngược mảng là hoán đổi các cặp phần tử đối xứng qua tâm. Dùng hai con trỏ duyệt đồng thời từ hai đầu về giữa giúp mỗi cặp được tráo đúng 1 lần trong N/2 bước lặp (Time O(N)), chỉ tốn một biến tạm char để swap tại chỗ (Space O(1)).
 */
public class P0344ReverseString {

    public void bruteForce(char[] s) {
        int n = s.length;
        char[] temp = new char[n];
        for (int i = 0; i < s.length; i++) {
            temp[i] = s[n - 1 - i];
        }

        for (int i = 0; i < temp.length; i++) {
            s[i] = temp[i];
        }
    }

    public void optimal(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            right--;
            left++;

        }
    }
}