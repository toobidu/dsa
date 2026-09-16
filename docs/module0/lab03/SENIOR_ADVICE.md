# SENIOR_ADVICE — Lab 0.3

## 1. Tư duy In-Place và hướng duyệt mảng

- **Muốn duyệt từ phải qua trái, hãy viết vòng lặp lùi tự nhiên:**
  * Sai lầm thường thấy: Viết `for (int i = 0; i < N; i++)` rồi lấy index `N - 1 - i`. Việc này làm não bị phân đôi ngữ cảnh (vòng lặp thì tiến, dữ liệu thì lùi), dẫn đến nhầm lẫn điều kiện dừng, `return` sớm, hoặc off-by-one.
  * Chuẩn mực: `for (int i = N - 1; i >= 0; i--)`. Mọi thứ đồng nhất từ ngữ nghĩa đến thao tác.
- **Kỹ thuật duyệt từ cuối về đầu để tránh ghi đè (Overwrite):**
  * Trong các bài toán merge mảng hoặc sửa mảng tại chỗ có độ dài thay đổi, nếu duyệt từ đầu (`index 0`), bạn sẽ ghi đè lên các phần tử chưa kịp xử lý và buộc phải dùng thêm mảng phụ `O(N)` bộ nhớ.
  * Bằng cách duyệt từ cuối về đầu, bạn tận dụng được vùng trống ở đuôi mảng để ghi kết quả mà không làm hỏng dữ liệu gốc.

## 2. Bẫy tràn số (Integer Overflow) khi đề bài cho mảng số

- Đề bài cho mảng `digits` biểu diễn một số nguyên: nếu thấy ràng buộc `digits.length <= 100` (hoặc lớn hơn 10), **tuyệt đối không chuyển mảng thành `int` hoặc `long`**.
- Đây là dấu hiệu nhận diện của dạng toán **Big Integer Simulation (Mô phỏng phép toán số lớn)**: thao tác trực tiếp trên từng chữ số từ hàng đơn vị sang hàng cao nhất.

## 3. Bản chất khởi tạo mảng trong Java

- Trong Java, khi gọi `new int[size]`, JVM tự động khởi tạo tất cả các phần tử với giá trị `0`.
- Khi xử lý trường hợp tràn chữ số (như `99 + 1 = 100`), bạn chỉ cần cấp phát `new int[digits.length + 1]`, gán duy nhất `result[0] = 1`, không cần vòng lặp copy các số `0` còn lại.

## 4. Lựa chọn Collection chuẩn xác

- Không bao giờ dùng `java.util.LinkedList` trong LeetCode. Cần Stack hoặc Deque hãy luôn dùng `ArrayDeque`.
- Khi key là các số nguyên nhỏ hoặc chỉ số có giới hạn (ví dụ đếm 26 chữ cái tiếng Anh), luôn dùng `int[26]` hoặc `int[N]` thay vì `HashMap<Integer, Integer>`. Tránh hoàn toàn overhead của boxing/unboxing và tính toán hash.
