package com.dsa.module0.lab02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * LC 217 — ContainsDuplicate (Easy)
 * https://leetcode.com/problems/contains-duplicate/
 * <p>
 * Giới hạn: 20 phút. Hẹn giờ TRƯỚC khi đọc đề.
 * <p>
 * Điền ba dòng này TRƯỚC khi gõ dòng code đầu tiên:
 * Ràng buộc và biên : 1 <= nums.length <= 10^5; -10^9 <= nums[i] <= 10^9. Biên: mảng 1 phần tử (luôn false), mảng 2 phần tử trùng/khác nhau, mảng toàn số âm, mảng toàn số giống nhau, giá trị chạm mốc cực trị -10^9 và 10^9.
 * Brute force + Big-O: 2 vòng for thử mọi cặp (i, j) với i < j. Time O(N^2), Space O(1). Với N = 10^5 thì N^2 = 10^10 phép tính, chắc chắn bị TLE.
 * Hướng tối ưu       : Dùng HashSet lưu các phần tử đã gặp, duyệt 1 lượt. Time O(N), Space O(N). (Ngoài ra có cách Sorting: Arrays.sort() rồi so sánh cặp liền kề: Time O(N log N), Space O(1)).
 * <p>
 * Điền sau khi pass:
 * bruteForce Time: O(N^2)      Space: O(1)
 * optimal    Time: O(N)        Space: O(N)
 * Vì sao cách tối ưu đúng: HashSet tổ chức theo bảng băm (Hash Table) với thời gian thêm và tra cứu trung bình amortized O(1). Khi duyệt qua mảng, hàm set.add(x) sẽ trả về false nếu phần tử x đã tồn tại trong tập hợp. Điều này đảm bảo phát hiện phần tử trùng lặp ngay ở lần xuất hiện thứ hai chỉ sau đúng một lượt duyệt qua mảng.
 */
public class P0217ContainsDuplicate {

    public boolean bruteForce(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) return true;
            }
        }
        return false;
    }

    public boolean bySorting(int[] nums) {
        int[] numsClone = nums.clone();
        Arrays.sort(numsClone);
        for (int i = 0; i < numsClone.length - 1; i++) {
            if (numsClone[i] == numsClone[i + 1]) return true;
        }
        return false;
    }

    public boolean optimal(int[] nums) {
        Set<Integer> map = new HashSet<>();
        for (int num : nums) {
            if (!map.add(num)) return true;
        }
        return false;
    }
}

