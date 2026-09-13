# PROGRESS — người học đang ở đâu

**Agent: đọc file này TRƯỚC khi trả lời bất cứ câu hỏi nào về lộ trình.**
Đây là nguồn sự thật duy nhất. Không suy đoán vị trí từ lịch sử hội thoại — hội thoại có thể bị cắt, file này thì không.
**Sau mỗi Lab, cập nhật file này và `REVIEW_QUEUE.md`.**

Cập nhật lần cuối: 2026-09-13

---

## VỊ TRÍ HIỆN TẠI

- **Module:** 0 — Nền tảng và cỗ máy luyện tập
- **Lab:** 0.3 — Collection cho DSA và bảng chi phí thao tác
- **Trạng thái:** 🟡 **ĐÃ XONG BÀI MỒI LC 88, LC 344 — ĐANG TRẢ NỢ ÔN & CHUẨN BỊ HỌC BẢNG CHI PHÍ, LC 66**

Lab 0.1 và 0.2 xong trọn vẹn.

**Đang dở dang — dừng ở đây nếu hội thoại bị cắt:**

| Mục | Trạng thái |
| --- | --- |
| Bài mồi LC 88 Merge Sorted Array | ✓ Đã hoàn thành (pass 7/7 test: 1 mẫu, 6 biên; Three Pointers O(m+n), O(1) space) |
| LC 344 Reverse String | ✓ Đã hoàn thành (pass 6/6 test: Two Pointers O(N) time, O(1) space) |
| Trả nợ Review Queue (2026-09-13) | ✓ Đã trả sạch 5/5 bài (LC 1 🟢, LC 121 🟢, LC 344 🟢, LC 217 🟢, LC 88 🟢) |
| Dạy bảng chi phí thao tác & LC 66 Plus One | 🟡 Đang ở đây |
| `docs/module0/lab03/` (TEMPLATE, ERROR_LOG, SENIOR_ADVICE) | Chưa tạo |

**Việc kế tiếp của agent:** Dạy bảng chi phí thao tác Collection Java → Sinh khung & Giao bài LC 66 Plus One.

---

## ĐÃ HOÀN THÀNH

| Module | Lab | Ngày | Kết quả |
| --- | --- | --- | --- |
| 0 | 0.1 | 2026-09-04 | 🟢 Pass gọn (LC 1 Two Sum: tự viết bruteForce O(N²) và optimal O(N), pass 4/4 test) |
| 0 | 0.2 | 2026-09-04 | 🟢 Pass gọn (LC 121, LC 217: tự viết optimal, đối chiếu 3 mức Big-O, benchmark JVM) |
| — | Ôn vòng 1 | 2026-09-06 | LC 1 🟢 · LC 121 🟡 · LC 217 🟡 — chi tiết ở `REVIEW_QUEUE.md` |
| — | Ôn vòng 2 | 2026-09-07 | LC 121 🟢 (lên cấp 1) · LC 217 🟡 (giữ cấp 0) — chi tiết ở `REVIEW_QUEUE.md` |
| — | Ôn vòng 3 | 2026-09-09 | LC 217 🟢 (lên cấp 1) · LC 88 🟢 (lên cấp 1) — chi tiết ở `REVIEW_QUEUE.md` |
| — | Ôn vòng 4 | 2026-09-13 | LC 1 🟢 (lên Cấp 2) · LC 121 🟢 (lên Cấp 2) · LC 344 🟢 (lên Cấp 1) · LC 217 🟢 (lên Cấp 2) · LC 88 🟢 (lên Cấp 2) — chi tiết ở `REVIEW_QUEUE.md` |

---

## NHẬT KÝ BUỔI HỌC

Ghi ngay sau mỗi buổi, không đợi cuối Lab. Người học không commit code thường xuyên, nên đây là lịch sử duy nhất.

| Ngày | Đã làm | Kết quả |
| --- | --- | --- |
| 2026-09-04 | Dựng project, Lab 0.1 (LC 1), Lab 0.2 (LC 121, LC 217), benchmark Big-O | Cả 3 bài pass, nạp vào queue cấp 0 |
| 2026-09-06 | Ôn vòng 1 cả 3 bài từ trang trắng | LC 1 🟢 pass 4/4 ngay lần đầu. LC 121 🟡 `optimal` thiếu nhánh `else left = right` (L2). LC 217 🟡 off-by-one trong `bySorting` (L3) + `Arrays.sort` sửa mảng caller (L6). Sửa xong 12/12 xanh |
| 2026-09-06 | Mở Lab 0.3, sinh khung LC 88 | Đang chờ code người học |
| 2026-09-06 | LC 88 — người học bí ở khâu đọc đề, chưa gõ code | Mắc L7 (tưởng trả về mảng mới, không thấy ràng buộc ghi tại chỗ) và L3 lần 2 (đếm `m` phần tử đầu thành chỉ số 0..m). Đã giảng: chỉ số 0-based, quy ước `i < k`, và các ràng buộc của đề. **Chưa dạy thuật toán merge.** Đã viết hộ test mẫu theo ví dụ đề, 2 test biên người học tự viết |
| 2026-09-07 | Ôn vòng 2: LC 121 và LC 217 từ trang trắng | LC 121 🟢 pass 4/4 dưới 3 phút. LC 217 🟡 nộp lần 1 fail 4/4 do j=0 (L3) và kiểm tra nhầm nums thay vì numsClone (L6); tự debug bằng mắt sửa xong 4/4 test xanh |
| 2026-09-07 | Bài mồi LC 88 Merge Sorted Array | 🟢 Pass gọn 7/7 test. Tự viết optimal duyệt ngược Three Pointers O(m+n) time, O(1) space. Nạp queue cấp 0 |
| 2026-09-09 | Ôn vòng 3: LC 217 Contains Duplicate từ trang trắng | 🟢 Pass gọn dưới 3 phút (pass 4/4 test cả 3 cách: bruteForce O(N²), bySorting O(N log N), optimal O(N)). Sửa dứt điểm L3/L6. Lên Cấp 1 (hẹn 2026-09-12). Lịch sử: 🟡🟡🟢 |
| 2026-09-09 | Ôn vòng 3: LC 88 Merge Sorted Array từ trang trắng | 🟢 Pass gọn 7/7 test. Lên Cấp 1 (hẹn 2026-09-12). Lịch sử: 🟢🟢 |
| 2026-09-09 | Bài mới LC 344 Reverse String (Lab 0.3) | 🟢 Tự viết bruteForce O(N) và optimal Two Pointers O(N) time, O(1) space. Pass trọn vẹn 6/6 test mẫu và biên. Nạp queue Cấp 0 (hẹn 2026-09-10) |
| 2026-09-13 | Ôn vòng 4: LC 1 Two Sum từ trang trắng | 🟢 Pass gọn 4/4 test cả bruteForce và optimal (< 8 phút). Lên Cấp 2 (hẹn 2026-09-16). Lịch sử: 🟢🟢 |
| 2026-09-13 | Ôn vòng 4: LC 121 Best Time to Buy and Sell Stock từ trang trắng | 🟢 Pass gọn 4/4 test với Two Pointers / Sliding Window. Lên Cấp 2 (hẹn 2026-09-16). Lịch sử: 🟡🟢🟢 |
| 2026-09-13 | Ôn vòng 4: LC 344 Reverse String từ trang trắng | 🟢 Pass gọn 6/6 test Two Pointers in-place (< 8 phút). Lên Cấp 1 (hẹn 2026-09-16). Lịch sử: 🟢🟢 |
| 2026-09-13 | Ôn vòng 4: LC 217 Contains Duplicate từ trang trắng | 🟢 Pass gọn 4/4 test cả 3 cách: bruteForce, bySorting (đúng clone), optimal (HashSet). Lên Cấp 2 (hẹn 2026-09-16). Lịch sử: 🟡🟡🟢🟢 |
| 2026-09-13 | Ôn vòng 4: LC 88 Merge Sorted Array từ trang trắng | 🟢 Pass gọn 7/7 test Three Pointers ngược (< 8 phút). Lên Cấp 2 (hẹn 2026-09-16). Lịch sử: 🟢🟢🟢 |


## MODULE 0 — Nền tảng và cỗ máy luyện tập (2 tuần, 6 Lab)

| Lab | Nội dung | Trạng thái |
| --- | --- | --- |
| 0.1 | Dựng project, JUnit, một vòng "luật một bài" đầy đủ | ✓ Hoàn thành |
| 0.2 | Big-O thực chiến — đo thật, dự đoán trước khi chạy | ✓ Hoàn thành |
| 0.3 | Collection cho DSA và bảng chi phí thao tác | ⛔ Đang ở đây |
| 0.4 | 14 cái bẫy Java trên LeetCode | — |
| 0.5 | Đệ quy: đọc call stack, đệ quy và lặp | — |
| 0.6 | Khuôn phỏng vấn 45 phút, nạp 10 bài đầu vào queue | — |

**Đầu ra M0:** harness chạy được, review queue đang chạy, error log có dữ liệu thật, giải tự lực 10 bài Easy.

---

## CHƯA LÀM

| Module | Nội dung | Tuần |
| --- | --- | --- |
| 1 | Array, Two Pointers, Sliding Window, Prefix Sum | 3 |
| 2 | Hashing, Sorting, Binary Search | 3 |
| 3 | Linked List, Stack, Queue, Monotonic Stack | 2.5 |
| 4 | Tree, BST, Trie, Heap | 3 |
| 5 | Graph | 3 |
| 6 | Backtracking | 2 |
| 7 | **Dynamic Programming — dài nhất, rớt nhiều nhất** | 5 |
| 8 | Greedy, Bit, Math, Design | 2 |
| 9 | Chuyển sang Python | 2 |
| 10 | Phỏng vấn thật, mock, contest | 4+ |

**Ba thứ tự không đảo được:**

- M0 trước tất cả. Không có cỗ máy đo thì không biết đang tiến hay giậm chân.
- M4 và M6 trước M7. DP là đệ quy có nhớ.
- M1 tới M8 trước M9. Không đổi ngôn ngữ khi thuật toán chưa vững.

Xem `AGENTS.md` mục 4 nếu người học đòi nhảy cóc.

---

## CHỈ SỐ THEO DÕI

Cập nhật mỗi Chủ nhật. Hai con số này là thước đo duy nhất — số bài đã submit không ghi vào đây.

| Tuần | Tỷ lệ giữ lại (cấp ≥ 4 / tổng queue) | Loại lỗi nhiều nhất trong tuần | Ghi chú |
| --- | --- | --- | --- |
| — | — | — | Chưa có dữ liệu |

Mục tiêu tỷ lệ giữ lại: **trên 80%**.

---

## NỢ KỸ THUẬT

- [x] `pom.xml` với JUnit 5, Java 21
- [x] `tools\new-problem.ps1`
- [x] Đã chạy `mvn test` xác nhận harness sống và pass 4/4 test (2026-09-04)
- [x] Đã khởi tạo Git repository (branch `main`)
- [ ] Chưa có tài khoản LeetCode gắn với lộ trình này (cần từ M10 để dự contest)
- [ ] Chưa chốt quy ước biên cho binary search (bắt buộc chốt ở Lab 2.5, dùng mãi về sau)
- [ ] **`.gitignore` dòng 6 có `**.md` → toàn bộ tài liệu không được git theo dõi.** `PROGRESS.md`, `REVIEW_QUEUE.md`, `ERROR_LOG.md`, `TEMPLATE.md` đều nằm ngoài repo. Mất máy là mất sạch lịch ôn và nhật ký lỗi. Đang chờ người học quyết có bỏ dòng đó không

---

## MÔI TRƯỜNG ĐÃ KIỂM CHỨNG

Xác nhận ngày 2026-09-04:

| Thành phần | Trạng thái |
| --- | --- |
| Java 21.0.10 LTS (Oracle) | ✓ |
| Maven 3.9.14 | ✓ |
| Git 2.55.0 | ✓ |
| JUnit 5.11 | ✓ hoạt động tốt, 4/4 test pass |
