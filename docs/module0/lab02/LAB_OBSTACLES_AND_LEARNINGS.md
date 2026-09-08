# LAB_OBSTACLES_AND_LEARNINGS — Lab 0.2

## 1. Vướng mắc và lỗi sai của học viên trong Lab 0.2
- **Lẫn lộn giữa Brute Force và Sorting (L4 / L5):**
  - Trong bài LC 217, học viên gọi `Arrays.sort(nums)` rồi sau đó lại duyệt 2 vòng `for` lồng nhau. Đây là lỗi kinh điển khi chưa tách bạch rõ mục đích của từng thuật toán: một khi mảng đã được sắp xếp tăng dần thì các phần tử trùng nhau buộc phải nằm kề nhau, do đó chỉ cần 1 vòng `for` so sánh `nums[i] == nums[i + 1]`.
- **Nhầm lẫn ký hiệu và bản chất Big-O:**
  - Ghi nhận `O(log N)` cho Sorting thay vì `O(N log N)`. Cần phân biệt rõ: `O(log N)` là cây nhị phân hoặc Binary Search (mỗi bước chia đôi không gian tìm kiếm); còn Sort một tập `N` phần tử thì tối thiểu phải tốn `O(N log N)`.
  - Chưa định lượng được `N = 10^5` thì `O(N²)` sẽ tốn bao nhiêu phép tính dẫn đến dính TLE (Time Limit Exceeded).

## 2. Điểm sáng và kỹ năng đạt được
- **Cách viết idiom Java rất sạch:** Sử dụng `if (!seen.add(num)) return true;` với `HashSet` thay vì `contains()` rồi `add()`. Tối ưu được 1 lần băm và tra cứu.
- **Tự phát hiện sự bất nhất:** Tự quan sát thấy comment ở `P0121` và `P0217` thiếu các mục đo đạc Big-O so với `P0001`, từ đó giúp chuẩn hóa lại template sinh bài của toàn bộ workspace.
- **Nắm bắt trực giác Two Pointers / Sliding Window:** Tự cài đặt thuật toán cửa sổ trượt trong LC 121 với `left` (đáy giá mua) và `right` (ngày bán), cập nhật `left = right` khi tìm thấy đáy mới.

## 3. Bài học thực chiến rút ra
- **Quy tắc ngón tay cái (Rule of Thumb) về Big-O trên Online Judge:**
  - 1 giây CPU tương đương `~10^8` phép tính.
  - `N <= 10^4`: Thuật toán `O(N²)` (`~10^8`) có thể mấp mé pass.
  - `N = 10^5`: Bắt buộc thuật toán phải đạt `O(N log N)` hoặc `O(N)`. `O(N²)` chắc chắn TLE (chạy mất 3.5 - 10 giây).
  - `N = 10^6`: Chỉ chấp nhận `O(N)` hoặc `O(N log N)`.
- **Differential Testing 3 cách:** Kỹ thuật đối sánh cả 3 cách giải (`bruteForce`, `bySorting`, `optimal`) trong cùng một unit test giúp củng cố niềm tin tuyệt đối vào tính đúng đắn của code.
