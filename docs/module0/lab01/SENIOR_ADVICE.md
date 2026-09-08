# SENIOR_ADVICE — Lab 0.1

## Bẫy đã gặp trong Lab này và Production Trap

### 1. Chi phí ngầm của Boxed Types (`HashMap<Integer, Integer>`)
- Trong Java, `HashMap<Integer, Integer>` tiêu tốn bộ nhớ gấp nhiều lần so với primitive `int[]`. Mỗi entry trong `HashMap` bao gồm:
  - Header của Object `Node` (~16 bytes).
  - Hai con trỏ reference `key` và `value` (8 + 8 bytes trên 64-bit JVM không Compressed OOPs, hoặc 4 + 4 bytes có Compressed OOPs).
  - Hash value `int` (4 bytes), padding, cộng thêm hai `Integer` objects được box nếu giá trị nằm ngoài cache `-128` đến `127` (mỗi `Integer` thêm ~16-24 bytes).
  → Tổng cộng mỗi entry có thể tốn từ 32 đến 48 bytes, trong khi một cặp `int` thô chỉ tốn 8 bytes.
- **Lời khuyên Senior:** Trên LeetCode với `N = 10^4`, `HashMap` chạy tốt. Nhưng trong hệ thống high-throughput production (như order book, realtime metrics), việc tạo hàng triệu entry `Integer` sẽ gây áp lực GC kinh hoàng. Khi đó hãy nghĩ tới thư viện primitive collections chuyên dụng: `fastutil`, `Trove`, hoặc `Agrona` (`Int2IntHashMap`).

### 2. Chi phí Rehash khi không cấp phát dung lượng ban đầu (`initialCapacity`)
- Mặc định `HashMap` khởi tạo dung lượng `16` với load factor `0.75`. Khi số lượng phần tử vượt ngưỡng `12`, map sẽ tăng gấp đôi kích thước (16 → 32 → 64 → ...) và rehash lại toàn bộ bucket.
- Với `N = 10^4`, map phải rehash khoảng 10 lần.
- **Lời khuyên Senior:** Nếu đã biết trước kích thước mảng `N`, hãy định nghĩa trước dung lượng:
  ```java
  int capacity = (int) Math.ceil(nums.length / 0.75f);
  Map<Integer, Integer> map = new HashMap<>(capacity);
  ```

### 3. Nguy cơ tràn số (Integer Overflow) khi tính `target - nums[i]`
- Ràng buộc đề bài LC 1: `-10^9 <= nums[i], target <= 10^9`.
- Khoảng giá trị `int` của Java từ `-2^31` (-2,147,483,648) tới `2^31 - 1` (2,147,483,647).
- Phép trừ `target - nums[i]` có thể chạm tới `10^9 - (-10^9) = 2 * 10^9`, vừa vặn nằm trong giới hạn `int`.
- **Lời khuyên Senior:** Luôn đặt câu hỏi cho interviewer: *"Các giá trị trong mảng và target có bao giờ vượt qua phạm vi 32-bit có dấu không?"*. Nếu có khả năng tràn, phép tính phải ép sang kiểu `long` trước: `long complement = (long) target - nums[i];`.

---

## Biến thể của pattern hay bị hỏi tiếp

1. **Two Sum II — Input Array Is Sorted (LC 167):**
   - Đề bài cho mảng ĐÃ SẮP XẾP.
   - Bẫy: Nếu dùng lại `HashMap` (Time `O(N)`, Space `O(N)`), bạn sẽ bị trừ điểm vì lãng phí dữ kiện "đã sắp xếp". Lời giải chuẩn mực là **Two Pointers** (con trỏ trái, con trỏ phải co dần), đưa Space về `O(1)`.
2. **3Sum (LC 15) / 4Sum (LC 18):**
   - Đưa về bài toán Two Sum lồng bên trong vòng lặp. Thường kết hợp Sort trước rồi chạy Two Pointers để dễ dàng bỏ qua các phần tử trùng lặp (duplicate elimination), tránh việc phải nhét vào `Set` gây tốn bộ nhớ.
3. **Subarray Sum Equals K (LC 560):**
   - Biến thể nâng cao kết hợp giữa Two Sum và Prefix Sum: `prefixSum[j] - prefixSum[i] = k` tương đương `prefixSum[i] = prefixSum[j] - k`. Sử dụng `HashMap` để đếm số lần xuất hiện của các prefix sum đã gặp.

---

## Checklist trước khi vào Lab kế (Lab 0.2)

- [x] Đã thuộc lòng phản xạ: Nêu Brute Force + Big-O trước khi nói hướng Optimal.
- [x] Đã hiểu rõ lý do vì sao `HashMap` là cấu trúc tra cứu `O(1)` trung bình nhưng đánh đổi bộ nhớ và chi phí overhead.
- [ ] Tự viết lại template của Lab này vào [TEMPLATE.md](file:///c:/Users/toobidu/Desktop/code/personal/dsa/docs/module0/lab01/TEMPLATE.md) bằng từ ngữ của chính bạn (không copy).
