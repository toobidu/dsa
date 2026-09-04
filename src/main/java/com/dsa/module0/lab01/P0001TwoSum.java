package com.dsa.module0.lab01;

import java.util.HashMap;
import java.util.Map;

/**
 * LC 1 — Two Sum (Easy)
 * https://leetcode.com/problems/two-sum/
 * <p>
 * Giới hạn: 20 phút. Hẹn giờ TRƯỚC khi đọc đề.
 * <p>
 * Bài này bắt buộc viết CẢ HAI cách, theo đúng thứ tự, không được nhảy thẳng vào cách 2.
 * Lý do: trong phỏng vấn thật, nêu brute force trước là bước bị bỏ nhiều nhất
 * và bị trừ điểm nhiều nhất. Tập từ bài đầu tiên.
 * <p>
 * Điền ba dòng này TRƯỚC khi gõ dòng code đầu tiên:
 * Ràng buộc và biên : Kích thước mảng: 2 <= nums.length <= 10^4, Giá trị phần tử: -10^9 <= nums[i] <= 10^9 (có cả số âm, số 0, số dương), target: -10^9 <= target <= 10^9, Đề bài cam kết luôn có duy nhất một cặp nghiệm hợp lệ và không được dùng một phần tử hai lần (i ≠ j), Các biên cần test: Mảng nhỏ nhất (2 phần tử [3, 3]), có số âm [-3, 4, 3, 90] với target = 0
 * Brute force + Big-O: 2 vòng for, duyệt từng vị trí của mảng
 * Hướng tối ưu       : dùng 1 vòng for, sử dụng HashMap ( cặp key-value để tìm key vị trí index trong mảng)
 * <p>
 * Điền sau khi pass:
 * bruteForce  Time O(n^2)  Space O(1)
 * optimal     Time O(n)  Space O(n)
 * Vì sao cách 2 đúng: Đặt giá trị vào HashMap, tìm giá trị bù với mục tiêu (target - num)
 */
public class P0001TwoSum {

    /**
     * Cách 1 — thử mọi cặp. Viết cách này trước, chạy pass, rồi mới viết cách 2.
     */
    public int[] bruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target) return new int[] {i, j};
            }
        }
        return new int[] {};
    }

    /**
     * Cách 2 — một lượt duyệt. Đừng đọc gợi ý ở đâu cả, tự nghĩ đủ 20 phút.
     */
    public int[] optimal(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int result = target - nums[i];
            if(map.containsKey(result)) return new int[] {map.get(result), i};
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
