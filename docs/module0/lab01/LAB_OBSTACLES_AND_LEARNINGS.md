# LAB_OBSTACLES_AND_LEARNINGS — Lab 0.1

## 1. Vướng mắc và lỗi sai của học viên
- **Thói quen dựa vào AI khi viết test:** Học viên có xu hướng muốn agent viết hộ test file (`P0001TwoSumTest.java`) thay vì chủ động viết trước khi code. Đây là thói quen cần bỏ vì trong phỏng vấn kỹ thuật, việc tự liệt kê test cases và edge cases là tiêu chí đánh giá trực tiếp khả năng bao quát bài toán.
- **Tâm lý muốn nhảy thẳng vào tối ưu:** Dù học viên đã tự code cả hai cách, nhưng xu hướng tự nhiên của kỹ sư là muốn bỏ qua Brute Force để viết ngay HashMap. Cần tiếp tục duy trì kỷ luật "nêu Brute Force trước".

## 2. Điểm mạnh được ghi nhận
- **Nền tảng Java tốt:** Nắm chắc cấu trúc `Map`, `HashMap` và cú pháp Java 21. Tự tay hoàn thiện cả `bruteForce` và `optimal` sạch sẽ, không lỗi cú pháp.
- **Xử lý biên tự nhiên:** Trong phương thức `optimal`, học viên gọi `map.containsKey(result)` trước khi `map.put(nums[i], i)`. Điều này giúp tự động vượt qua test case biên có 2 phần tử trùng giá trị (`nums = [3, 3]`) mà không bị ghi đè dữ liệu.
- **Xác định đúng Big-O:** Nhận diện chính xác `O(N²)` Time / `O(1)` Space cho Brute Force và `O(N)` Time / `O(N)` Space cho HashMap.

## 3. Bài học rút ra
- **Quy trình "Luật một bài":** Phải đi đủ 6 bước: Đọc hiểu ràng buộc → Nêu Brute Force + Big-O → Viết test trước / test biên → Code giải pháp → Chạy kiểm thử → Giải thích vì sao đúng và khi nào cách giải bị hỏng.
- **Kỹ thuật Differential Testing:** Viết test đối sánh giữa `bruteForce` và `optimal` trên cùng một tập dữ liệu (`haiCachPhaiKhopNhau`) là cách rẻ nhất và tin cậy nhất để tự kiểm chứng thuật toán tối ưu.
- **Ý thức về không gian giá trị (Value Domain):** Đề bài cho `-10^9 <= nums[i] <= 10^9`, khoảng cách giá trị lên tới `2 * 10^9`. Việc dùng mảng trực tiếp `int[]` để đánh dấu sẽ lập tức gây OutOfMemoryError (`~8 GB`), do đó `HashMap` là cấu trúc bắt buộc dù có chi phí overhead.
