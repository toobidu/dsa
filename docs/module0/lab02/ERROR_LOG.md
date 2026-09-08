# ERROR_LOG — Lab 0.2

Mỗi bài fail ghi một dòng. Fail nghĩa là: bí quá 5 phút không nhớ hướng, hoặc phải mở lời giải, hoặc quá giới hạn thời gian.

Loại lỗi — chọn đúng một, vì mỗi loại chữa khác nhau:

| Loại | Nghĩa |
| --- | --- |
| L1 | Không nhận ra pattern — đọc đề xong không biết bắt đầu từ đâu |
| L2 | Nhận ra pattern nhưng không nhớ template |
| L3 | Sai chi tiết biên — off-by-one, điều kiện vòng lặp |
| L4 | Chọn sai cấu trúc dữ liệu |
| L5 | Đúng thuật toán nhưng TLE |
| L6 | Lỗi API Java |
| L7 | Hiểu sai đề |

| Ngày | Bài | Loại | Chuyện gì xảy ra | Đã chữa thế nào |
| --- | --- | --- | --- | --- |
| 2026-09-06 | LC 121 (ôn vòng 1) | L2 | `optimal` viết lại thiếu nhánh `else left = right`, nên con trỏ mua không bao giờ dịch. Trả 0 với mọi input, kể cả ví dụ mẫu | Chạy tay `[7,1,5,3,6,4]`, thấy `left` đứng yên ở index 0. Thêm lại nhánh `else` |
| 2026-09-06 | LC 217 (ôn vòng 1) | L3 | `bySorting` lặp `i < nums.length` rồi đọc `nums[i + 1]` → `ArrayIndexOutOfBoundsException` ở mọi test | Đổi điều kiện thành `i < nums.length - 1` |
| 2026-09-06 | LC 217 (ôn vòng 1) | L6 | `bySorting` gọi `Arrays.sort(nums)` thẳng lên tham số, sửa luôn mảng của caller | `nums.clone()` trước khi sort |
