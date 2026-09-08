package com.dsa.module0.lab03;

/**
 * LC 344 — ReverseString (Easy)
 * https://leetcode.com/problems/reverse-string/
 * <p>
 * Giới hạn: 20 phút. Hẹn giờ TRƯỚC khi đọc đề.
 * <p>
 * Điền ba dòng này TRƯỚC khi gõ dòng code đầu tiên:
 * Ràng buộc và biên :
 * Brute force + Big-O:
 * Hướng tối ưu       :
 * <p>
 * Điền sau khi pass:
 * bruteForce Time: O(?)  Space: O(?)
 * optimal    Time: O(?)  Space: O(?)
 * Vì sao cách tối ưu đúng:
 */
public class P0344ReverseString {

    public void bruteForce(char[] s) {
        int n = s.length;
        char[] temp = new char[n];

        for (int i = 0; i < n; i++) {
            temp[i] = s[n - 1 - i];
        }
        for (int i = 0; i < n; i++) {
            s[i] = temp[i];
        }
    }

    public void optimal(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}