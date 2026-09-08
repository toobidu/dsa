# SENIOR_ADVICE — Lab 0.2

## Bẫy đã gặp trong Lab này và Production Trap

### 1. Bẫy Anti-Quicksort với `Arrays.sort(int[])` trong Java
- Trong Java, `Arrays.sort(int[])` sử dụng thuật toán **Dual-Pivot Quicksort** của Vladimir Yaroslavskiy. Thuật toán này có độ phức tạp trung bình cực nhanh là `O(N log N)`, nhưng trong trường hợp xấu nhất (worst case), nó có thể thoái hóa về **`O(N²)`**.
- Trên các nền tảng phỏng vấn như LeetCode / Codeforces, người ra đề thường chủ động tạo các test case "anti-quicksort" được thiết kế đặc biệt để ép `Arrays.sort(int[])` về `O(N²)`, gây TLE vô lý.
- **Lời khuyên Senior:**
  - Nếu bắt buộc dùng Sort và sợ anti-quicksort: Hoặc shuffle ngẫu nhiên mảng trước khi sort, hoặc box sang `Integer[]` rồi dùng `Arrays.sort(Integer[])` vì với Object, Java sử dụng **TimSort** (đảm bảo chắc chắn `O(N log N)` trong mọi trường hợp).

### 2. Sự đánh đổi giữa Time và Space: Sorting vs HashSet
- **Cách Sorting:** Time `O(N log N)`, Space `O(1)`. Nhưng có side-effect: nó làm biến dạng mảng gốc ban đầu (nếu không clone mảng, các luồng khác đọc mảng sẽ thấy mảng bị xáo trộn vị trí).
- **Cách HashSet:** Time `O(N)`, Space `O(N)`. Nhanh hơn gấp nhiều lần về lý thuyết, nhưng tốn bộ nhớ heap cho các node `Integer` và bảng băm.
- **Lời khuyên Senior:** Trong hệ thống nhúng, vi điều khiển hoặc các service Java bị giới hạn RAM nghiêm ngặt (low-memory container), giải pháp `O(N log N)` với `O(1)` Space tại chỗ (in-place) lại là giải pháp kiến trúc được ưu tiên hơn `HashSet`. Luôn hỏi người phỏng vấn: *"Hệ thống ưu tiên tốc độ tối đa hay tối ưu dung lượng RAM?"*.

### 3. Ước lượng thời gian chạy từ ràng buộc `N` (Mental Benchmark)
- Bảng quy tắc bất thành văn khi đọc đề phỏng vấn:
  | Giá trị `N` | Giới hạn Big-O tối đa được phép dùng |
  | --- | --- |
  | `N <= 10` - 12 | `O(N!)`, `O(2^N * N)` (Backtracking, Brute Force đệ quy) |
  | `N <= 20` | `O(2^N)` (Bitmask DP, Subset) |
  | `N <= 100` | `O(N^4)` |
  | `N <= 500` | `O(N^3)` (Floyd-Warshall, Matrix Multiplication) |
  | `N <= 5,000` | `O(N^2)` (Two Pointers trâu, DP 2 chiều) |
  | `N <= 10^5` | `O(N log N)` hoặc `O(N)` (Sorting, Binary Search, Heap, Map/Set) |
  | `N <= 10^6` | `O(N)` (Sliding Window, Two Pointers, Monotonic Stack) |
  | `N >= 10^9` | `O(log N)` hoặc `O(1)` (Binary Search trên đáp án, Toán học) |

---

## Biến thể của pattern hay bị hỏi tiếp

1. **Contains Duplicate II (LC 219):**
   - Tìm hai chỉ số `i`, `j` sao cho `nums[i] == nums[j]` và khoảng cách `abs(i - j) <= k`.
   - Giải pháp: Kết hợp `HashSet` với cửa sổ trượt (Sliding Window) kích thước `k`. Chỉ giữ tối đa `k` phần tử trong Set.
2. **Contains Duplicate III (LC 220):**
   - Thêm điều kiện giá trị chênh lệch: `abs(nums[i] - nums[j]) <= valueDiff` và `abs(i - j) <= indexDiff`.
   - Giải pháp: Sử dụng `TreeSet` (Red-Black Tree, `O(log K)`) kết hợp hàm `ceiling()` hoặc `floor()` để tìm phần tử gần nhất trong khoảng giá trị.
3. **Best Time to Buy and Sell Stock II (LC 122):**
   - Được mua và bán nhiều lần.
   - Giải pháp: Greedy (cứ ngày mai giá tăng hơn hôm nay là mua hôm nay, bán ngày mai).

---

## Checklist trước khi vào Lab kế (Lab 0.3)

- [x] Nắm rõ quy tắc `10^8` ops/sec của CPU và bảng tra `N` ra Big-O.
- [x] Hiểu sự khác biệt thực tế giữa `O(N²)` (chạy hàng giây) và `O(N log N)` / `O(N)` (chạy vài mili-giây).
- [ ] Điền [TEMPLATE.md](file:///c:/Users/toobidu/Desktop/code/personal/dsa/docs/module0/lab02/TEMPLATE.md) cho Lab 0.2.
