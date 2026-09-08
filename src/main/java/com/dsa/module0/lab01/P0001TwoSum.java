package com.dsa.module0.lab01;

import java.util.HashMap;
import java.util.Map;

/**
 * LC 1 — Two Sum (Easy)
 * <a href="https://leetcode.com/problems/two-sum/">...</a>
 * <p>
 * ÔN LẦN 1 — cấp 0 → 1. Giới hạn 10 phút. Hẹn giờ TRƯỚC khi đọc đề.
 * <p>
 * Điền TRƯỚC khi gõ dòng code đầu tiên:
 * Ràng buộc và biên : 2 <= nums.length <= 10^4; -109 <= nums[i] <= 10^9; -10^9 <= target <= 10^9; chỉ có 1 đáp án đúng duy nhất
 * Brute force + Big-O: 2 vòng for, duyệt từng vị trí của mảng, On^2
 * Hướng tối ưu       : 1 vòng for, sử dụng HashMap (K,V) để tìm key - là index của mảng
 * <p>
 * Điền sau khi pass:
 * bruteForce  Time O(n^2)  Space O(1)
 * optimal     Time O(n)  Space O(n)
 * Vì sao cách 2 đúng: Đặt giá trị vào HashMap, tìm giá trị bù với mục tiêu (target - num)
 */
public class P0001TwoSum {

    public int[] bruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return new int[]{};
    }

    public int[] optimal(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            if (map.containsKey(result)) return new int[]{map.get(result), i};
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
