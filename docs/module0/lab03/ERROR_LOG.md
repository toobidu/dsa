# ERROR_LOG — Lab 0.3

Mỗi bài fail ghi một dòng. Fail nghĩa là: bí quá 5 phút không nhớ hướng, hoặc phải mở lời giải, hoặc quá giới hạn thời gian, hoặc sai logic biên.

Loại lỗi:
- L1: Không nhận ra pattern
- L2: Nhận ra pattern nhưng không nhớ template
- L3: Sai chi tiết biên — off-by-one, điều kiện vòng lặp, chiều duyệt
- L4: Chọn sai cấu trúc dữ liệu
- L5: Đúng thuật toán nhưng TLE
- L6: Lỗi API Java
- L7: Hiểu sai đề

| Ngày | Bài | Loại | Chuyện gì xảy ra | Đã chữa thế nào |
| --- | --- | --- | --- | --- |
| 2026-09-06 | LC 88 (Bài mồi) | L7 | Tưởng trả về mảng mới, không đọc kỹ ràng buộc sửa tại chỗ (in-place) của `nums1` | Đọc kỹ mục ràng buộc và chữ ký hàm `void` |
| 2026-09-06 | LC 88 (Bài mồi) | L3 | Đếm `m` phần tử đầu thành chỉ số `0..m` thay vì `0..m-1` | Chốt quy ước 0-based: `m` phần tử thì chỉ số từ `0` đến `m - 1` |
| 2026-09-14 | LC 66 | L3 | Duyệt từ phải qua trái nhưng lại dùng `for (int i = 0; i < nums.length; i++)` rồi truy cập `nums[nums.length - 1 - i]`, dẫn đến rối logic và `return` sớm ở cả hai nhánh `if` và `else` | Duyệt lùi tự nhiên: `for (int i = nums.length - 1; i >= 0; i--)`. Chỉ `return` khi gặp chữ số `< 9` (hết số nhớ) |
| 2026-09-14 | LC 66 | L6 | Tạo mảng mới `new int[nums.length + 1]` nhưng quên gán `result[0] = 1`, khiến kết quả trả về toàn số `0` | Nhớ quy tắc Java khởi tạo mảng `int[]` mặc định toàn `0`. Khi mảng tràn (toàn số 9), chỉ cần đặt `result[0] = 1` |
