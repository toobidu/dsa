package com.dsa.module0.lab02;

/**
 * LC 121 — BestTimeToBuyAndSellStock (Easy)
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * <p>
 * Giới hạn: 20 phút. Hẹn giờ TRƯỚC khi đọc đề.
 * <p>
 * Điền ba dòng này TRƯỚC khi gõ dòng code đầu tiên:
 * Ràng buộc và biên : 1 <= prices.length <= 10^5; 0 <= prices[i] <= 10^4. Biên: mảng 1 phần tử (profit = 0), mảng giảm dần liên tục (profit = 0), giá bằng nhau toàn bộ (profit = 0), đáy xuất hiện ở ngày cuối cùng.
 * Brute force + Big-O: 2 vòng for thử mọi cặp (i, j) với i < j, tính prices[j] - prices[i]. Time O(N^2), Space O(1). Với N = 10^5 thì N^2 = 10^10 phép tính, chắc chắn bị TLE (Time Limit Exceeded).
 * Hướng tối ưu       : Two Pointers / Sliding Window (hoặc Greedy). Duyệt 1 lượt, left giữ ngày mua có giá thấp nhất, right là ngày bán. Time O(N), Space O(1).
 * <p>
 * Điền sau khi pass:
 * bruteForce  Time O(N^2)  Space O(1)
 * optimal     Time O(N)    Space O(1)
 * Vì sao cách 2 đúng: Khi gặp prices[right] < prices[left], ta cập nhật left = right vì đáy mới này thấp hơn đáy cũ. Bất kỳ ngày bán k nào trong tương lai (k > right) kết hợp với đáy mới prices[right] đều cho lợi nhuận cao hơn kết hợp với đáy cũ prices[left] (do prices[k] - prices[right] > prices[k] - prices[left]). Do đó, việc bỏ qua các vị trí mua cũ là hoàn toàn an toàn và không bao giờ bỏ sót nghiệm tối ưu.
 */
public class P0121BestTimeToBuyAndSellStock {

    public int bruteForce(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int sub = prices[j] - prices[i];
                if (sub > maxProfit) {
                    maxProfit = sub;
                }
            }
//            return maxProfit;
        }
        return maxProfit;
    }

    public int optimal(int[] prices) {
        int left = 0;
        int right = 1;
        int maxProfit = 0;
        while (right < prices.length) {
            if (prices[right] > prices[left]) {
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(profit, maxProfit);
            } else {
                left = right;
            }
            right++;
        }
        return maxProfit;
    }
}