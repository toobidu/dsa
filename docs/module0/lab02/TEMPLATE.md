# TEMPLATE — Lab 0.2

## Pattern của Lab này

**Big-O thực chiến & Kiểm tra trùng lặp / Cực trị trên mảng**
Đo đạc và đối chiếu 3 mức độ phức tạp cốt lõi: `O(N^2)` (Brute Force duyệt cặp), `O(N log N)` (Sắp xếp gom cụm), và `O(N)` (Bảng băm HashSet hoặc Con trỏ trượt Two Pointers).

## Dấu hiệu nhận ra trong một đề lạ

- **Nhận diện Big-O từ ràng buộc `N`:**
  - `N <= 10^4`: `O(N^2)` có thể vừa khít 1 giây.
  - `N = 10^5`: Bắt buộc phải là `O(N log N)` hoặc `O(N)`. Mọi giải pháp `O(N^2)` đều dính lỗi L5 (TLE).
  - `N >= 10^6`: Bắt buộc phải tối ưu tới `O(N)`.
- **Dấu hiệu bài toán:**
  - Kiểm tra xem có phần tử xuất hiện lặp lại không → Ưu tiên `HashSet` `O(N)` hoặc `Sorting` `O(N log N)`.
  - Tìm cặp chỉ số `i < j` tối đa hóa hiệu số `prices[j] - prices[i]` → Two Pointers / Sliding Window `O(N)`.

## Khung code

### 1. Kiểm tra trùng lặp bằng `HashSet` (LC 217)
```java
public boolean containsDuplicate(int[] nums) {
    Set<Integer> seen = new HashSet<>();
    for (int num : nums) {
        // add trả về false nếu phần tử đã tồn tại
        if (!seen.add(num)) {
            return true;
        }
    }
    return false;
}
```

### 2. Cửa sổ trượt tìm chênh lệch lớn nhất (LC 121)
```java
public int maxProfit(int[] prices) {
    int left = 0; // Đáy mua thấp nhất
    int right = 1; // Ngày bán
    int maxProfit = 0;
    
    while (right < prices.length) {
        if (prices[right] > prices[left]) {
            maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
        } else {
            left = right; // Đã tìm thấy đáy mới thấp hơn
        }
        right++;
    }
    return maxProfit;
}
```

## Ba chỗ dễ sai

1. **Lai tạp giữa Sorting và Brute Force:** Sau khi gọi `Arrays.sort(nums)` thì các phần tử bằng nhau đã đứng kề nhau, chỉ cần duyệt 1 vòng for `nums[i] == nums[i + 1]`. Không bao giờ duyệt thêm vòng for thứ 2 sau khi đã sort.
2. **Nhầm lẫn `O(log N)` và `O(N log N)`:** Thuật toán sắp xếp mảng `N` phần tử tốn tối thiểu `O(N log N)` thời gian so sánh, không phải `O(log N)`.
3. **Bẫy Anti-Quicksort:** `Arrays.sort(int[])` trong Java có thể bị test case xấu ép về `O(N^2)`. Khi cần đảm bảo chắc chắn `O(N log N)` trong mọi trường hợp xấu nhất, nên box sang `Integer[]` (TimSort) hoặc shuffle mảng.

## Độ phức tạp

- **HashSet (LC 217):** Time `O(N)`, Space `O(N)`.
- **Sorting (LC 217):** Time `O(N log N)`, Space `O(1)` in-place.
- **Sliding Window (LC 121):** Time `O(N)`, Space `O(1)`.
