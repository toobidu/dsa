# GUIDE — DSA & Interview Engineering

Giáo trình đầy đủ. `AGENTS.md` là luật chơi, `PROGRESS.md` là vị trí hiện tại, `REVIEW_QUEUE.md` là nợ ôn. File này là bản đồ.

---

## 0. NHÃN ĐÚNG CỦA LỘ TRÌNH NÀY

Đây **không phải** "zero to master DSA". Không ai master DSA trong một năm, và phỏng vấn cũng không đòi hỏi điều đó.

Đây là lộ trình đưa một backend engineer từ **gần như chưa có nền thuật toán** tới mức:

- Giải được **phần lớn bài Medium trong 25 phút**, tự lực, code chạy đúng ngay lần đầu hoặc gần đầu.
- **Nhận ra pattern** trong một đề chưa từng gặp, thay vì nhớ lời giải của những đề đã gặp.
- **Trình bày được** trong lúc code: nêu brute force, nêu độ phức tạp, tự tìm test biên, nói ra suy nghĩ.
- Giải được Hard **quen thuộc** (Hard trong danh sách này), không phải mọi Hard.

Ba thứ nó không làm được, nói thẳng từ đầu:

| Không làm được | Vì sao |
| --- | --- |
| Đảm bảo đậu phỏng vấn | Vòng thuật toán chỉ là một phần. Còn system design, behavioral, hồ sơ, và may mắn về đề. |
| Thay thế system design | Big tech từ senior trở lên có vòng riêng. Đó là giáo trình khác. |
| Biến bạn thành competitive programmer | Codeforces Div. 1 cần thứ khác hẳn. Không cần cho phỏng vấn. |

**Thước đo duy nhất của giáo trình này:** tỷ lệ bài **giải lại được từ trang trắng** sau 21 ngày. Không phải số bài đã submit.

---

## 1. NGƯỜI HỌC VÀ MÔI TRƯỜNG

### 1.1 Nền tảng

| Mục | Trạng thái |
| --- | --- |
| Java | Thạo. Backend engineer. Không cần dạy cú pháp |
| DSA | Gần như từ đầu. Dưới 20 bài LeetCode |
| Python | Đang học từ đầu ở project khác. **Không dùng ở đây trước Module 9** |
| Mục tiêu | Phỏng vấn thuật toán ở công ty tech và big tech |
| Cường độ | Cao, nhưng ràng buộc bởi khả năng ghi nhớ. Xem mục 2 |

### 1.2 Môi trường đã kiểm chứng

| Thành phần | Phiên bản |
| --- | --- |
| Java | 21.0.10 LTS (Oracle) |
| Maven | 3.9.14 |
| Git | 2.55.0 |
| JUnit | 5.11 (khai báo trong `pom.xml`) |
| Hệ điều hành | Windows 11 |

Chạy toàn bộ test: `mvn -q test`
Chạy test của một Lab: `mvn -q test -Dtest="com.dsa.module1.lab11.*"`

### 1.3 Ràng buộc quyết định thiết kế giáo trình

1. **Người học đi làm full-time.** Buổi học phải vừa một khoảng 60–120 phút, không cần ngồi cả ngày mới có kết quả.
2. **Cường độ cao nhưng không được nhồi.** Đây là ràng buộc do người học nêu ra, và nó là ràng buộc đúng — xem mục 2.
3. **Đang học Python song song.** Không mở mặt trận thứ hai trước Module 9.
4. **Nền systems mạnh, nền toán rời rạc yếu.** Đường tắt duy nhất: nối mọi khái niệm mới về thứ đã biết trong Java và trong hệ thống.

---

## 2. CƠ CHẾ GHI NHỚ — TRÁI TIM CỦA GIÁO TRÌNH

Phần lớn người luyện LeetCode thất bại không phải vì làm ít bài. Họ làm 300 bài rồi vào phỏng vấn và tắc ở một bài Medium mà **họ đã từng giải hai tháng trước**. Nguyên nhân luôn giống nhau: họ luyện theo cách tạo ra cảm giác thành thạo mà không tạo ra trí nhớ bền.

Giáo trình này ép bốn cơ chế, cả bốn đều làm việc học **khó chịu hơn** trong ngắn hạn và **bền hơn nhiều** trong dài hạn.

### 2.1 Truy xuất chủ động thay vì đọc lại

Đọc lời giải hay xem video giải bài cho cảm giác hiểu rất mạnh, vì mọi thứ đang ở trước mắt và trôi chảy. Cảm giác đó không phải trí nhớ. Trí nhớ chỉ hình thành khi não **tự kéo thông tin ra** mà không có gợi ý.

Hệ quả trong giáo trình:

- Bí thì phải vật lộn đủ 20 phút trước khi được gợi ý bậc 1.
- Đọc lời giải xong phải **đóng lại và gõ lại từ trí nhớ ngay**, không copy.
- Bài ôn không được gợi ý một chữ nào.

### 2.2 Giãn cách tăng dần

Ôn lại đúng lúc sắp quên thì mỗi lần củng cố mạnh nhất. Lịch: 1 ngày → 3 ngày → 7 ngày → 21 ngày → 60 ngày. Fail thì tụt 2 cấp.

Toàn bộ lịch nằm ở `REVIEW_QUEUE.md`. **Nợ ôn luôn trả trước bài mới.** Không có ngoại lệ, kể cả khi đang hứng.

### 2.3 Trộn bài thay vì cày một mạch

Cày 20 bài sliding window liên tiếp thì tới bài thứ ba, người học không còn **chọn** thuật toán nữa — đã biết trước đáp án thuộc loại nào. Việc duy nhất còn lại là điền chi tiết.

Nhưng trong phỏng vấn, khó khăn thật nằm ở chính bước đã bị bỏ qua đó: **đọc một đề lạ và quyết định nó thuộc loại gì**. Kỹ năng đó chỉ luyện được khi bài trộn lẫn và không ai nói trước.

Tỷ lệ bắt buộc mỗi buổi: 40% bài ôn (pattern cũ, ngẫu nhiên) + 60% bài mới.

### 2.4 Thất bại trước khi được dạy

Mỗi Lab bắt đầu bằng một **bài mồi** mà người học chưa có công cụ để giải. Vật lộn 20 phút rồi mới được dạy pattern. Lúc đó pattern rơi vào một cái khuôn não đã tự đào sẵn, và bám hơn hẳn so với khi được dạy trước rồi mới làm bài.

Đây là lý do khuôn Lab đặt "tự vật lộn" (20%) **trước** "dạy pattern" (15%), không phải sau.

### 2.5 Nhịp buổi học

| Mốc | Việc |
| --- | --- |
| 0–15 phút | Trả nợ ôn: 1–3 bài từ queue, trang trắng, hẹn giờ |
| 15–35 phút | Bài mồi của Lab mới, tự vật lộn, không tra cứu |
| 35–50 phút | Được dạy pattern và template |
| 50–100 phút | Cày bài, trộn cũ và mới |
| 100–110 phút | Viết template bằng chữ của mình, cập nhật queue và error log |

**Nghỉ ít nhất 10 phút sau mỗi 50 phút. Không học quá 2 giờ liên tục.** Nhồi thêm giờ sau mốc đó làm tăng số bài đã đọc chứ không tăng số bài nhớ được — và giáo trình này chỉ đếm cái thứ hai.

### 2.6 Ngưỡng cảnh báo

Ba dấu hiệu nghĩa là đang đi quá nhanh, phải giảm bài mới:

| Dấu hiệu | Ý nghĩa |
| --- | --- |
| Queue vượt 25 bài tới hạn | Nạp nhanh hơn tốc độ giữ lại được |
| Tỷ lệ 🔴 fail khi ôn vượt 30% | Bài trước đó chưa thật sự hiểu, chỉ mới thuộc |
| Cùng một loại lỗi L1–L7 lặp lại 5 lần trong tuần | Có lỗ hổng cụ thể, phải chữa đúng loại đó chứ không phải cày thêm |

---

## 3. NGUYÊN TẮC GIẢNG DẠY VÀ KHUÔN LAB

### 3.1 Khuôn một Lab

| Phần | Tỷ trọng |
| --- | --- |
| Trả nợ ôn — trang trắng, không gợi ý | 15% |
| Tự vật lộn bài mồi **trước khi được dạy** | 20% |
| Dạy pattern và template | 15% |
| Cày bài, trộn theo tỷ lệ 40/60 | 40% |
| Chốt: viết template bằng chữ của mình, nạp queue | 10% |

Lý thuyết đúng 15%. Đây là giáo trình thực hành nặng, và tỷ lệ này là ràng buộc cứng.

### 3.2 Luật một bài

Chi tiết ở `AGENTS.md` mục 2.4. Tóm tắt: nhắc lại đề → nói brute force và Big-O → hẹn giờ 45 phút → gợi ý theo bậc sau phút 20 → quá 45 phút mới được đọc lời giải, và phải gõ lại từ trí nhớ ngay.

### 3.3 Ba mức chấm

🟢 pass gọn · 🟡 pass chật vật · 🔴 fail. Không có mức thứ tư, và không tự nới chuẩn.

### 3.4 Bảy loại lỗi

L1 không nhận ra pattern · L2 quên template · L3 sai biên · L4 sai cấu trúc dữ liệu · L5 TLE · L6 lỗi API Java · L7 hiểu sai đề.

Mỗi loại có cách chữa khác nhau, xem `AGENTS.md` mục 2.5. Ghi vào `ERROR_LOG.md` mỗi lần fail. Thống kê tháng cho biết phải luyện gì.

---

## 4. QUY ƯỚC MÃ NGUỒN VÀ QUY TRÌNH

### 4.1 Cấu trúc thư mục

```
dsa/
  AGENTS.md          luật chơi cho agent
  GUIDE.md           file này
  PROGRESS.md        đang ở đâu
  REVIEW_QUEUE.md    nợ ôn, lịch giãn cách
  pom.xml
  tools/
    new-problem.ps1  sinh khung bài + khung test
  src/main/java/com/dsa/moduleN/labNN/
  src/test/java/com/dsa/moduleN/labNN/
  docs/moduleN/labNN/
    TEMPLATE.md
    ERROR_LOG.md
    SENIOR_ADVICE.md
```

### 4.2 Quy ước đặt tên

- Package: `com.dsa.module1.lab13` — chữ thường, không gạch ngang.
- Class: `P0003LongestSubstringWithoutRepeating` — chữ `P`, số bài 4 chữ số, rồi tên rút gọn.
- Test: cùng tên cộng hậu tố `Test`.

### 4.3 Sinh khung bài

```
powershell -File tools\new-problem.ps1 -Module 1 -Lab 13 -Id 3 -Name LongestSubstringWithoutRepeating
```

Sinh sẵn class rỗng và test rỗng có `@Disabled` để `mvn test` không đỏ oan. Xóa `@Disabled` khi bắt đầu làm.

### 4.4 Luật test

Mỗi bài **ít nhất 3 test**, trong đó bắt buộc có ít nhất một test biên. Danh sách biên phải nghĩ tới mỗi lần:

| Loại biên | Ví dụ |
| --- | --- |
| Rỗng | mảng độ dài 0, chuỗi rỗng, cây `null` |
| Một phần tử | `[5]`, cây chỉ có gốc |
| Toàn phần tử giống nhau | `[2,2,2,2]` |
| Đã sắp xếp sẵn / sắp xếp ngược | `[1,2,3]` và `[3,2,1]` |
| Số âm và số 0 | quan trọng với prefix sum, DP, greedy |
| Tràn `int` | `Integer.MAX_VALUE`, tổng hai số lớn |
| `N` lớn nhất theo ràng buộc đề | để bắt L5 (TLE) |

**Test phải viết trước khi code xong**, không phải viết sau để hợp thức hóa.

### 4.5 Viết lại khi ôn

Ghi đè file cũ. Không tạo `Solution2`, `SolutionV3`. Lịch sử nằm ở `REVIEW_QUEUE.md` (kết quả từng lần) và git (code từng lần).

---

## 5. BẢN ĐỒ 11 MODULE

| Module | Nội dung | Tuần | Tỷ trọng trong đề phỏng vấn |
| --- | --- | --- | --- |
| M0 | Nền tảng và cỗ máy luyện tập | 2 | — |
| M1 | Array, Two Pointers, Sliding Window, Prefix Sum | 3 | Rất cao |
| M2 | Hashing, Sorting, Binary Search | 3 | Rất cao |
| M3 | Linked List, Stack, Queue, Monotonic Stack | 2.5 | Cao |
| M4 | Tree, BST, Trie, Heap | 3 | Rất cao |
| M5 | Graph | 3 | Cao |
| M6 | Backtracking | 2 | Trung bình |
| M7 | **Dynamic Programming — module dài nhất** | 5 | Cao, và là chỗ rớt nhiều nhất |
| M8 | Greedy, Bit, Math, Design | 2 | Trung bình |
| M9 | Chuyển sang Python | 2 | — |
| M10 | Phỏng vấn thật, mock, contest | 4+ | — |

Tổng khoảng **31–32 tuần** ở nhịp 10–15 giờ mỗi tuần. Nhịp cao hơn rút ngắn được M1–M6, nhưng **không rút ngắn được M7** — DP cần thời gian ngủ giữa các buổi để đọng lại, đó là ràng buộc sinh học chứ không phải ràng buộc thời lượng.

**Ba thứ tự không đảo được:**

1. M0 trước tất cả. Không có cỗ máy đo thì không biết đang tiến hay giậm chân.
2. M4 và M6 trước M7. DP là đệ quy có nhớ; chưa viết được đệ quy trên cây từ trí nhớ thì học DP chỉ là học thuộc từng bài.
3. M1–M8 trước M9. Đổi ngôn ngữ khi thuật toán chưa vững thì mất khả năng chẩn đoán mình đang bí vì cái gì.

---

## 6. CHI TIẾT TỪNG MODULE

Mỗi Lab liệt kê bài theo thứ tự làm. **Bài in đậm là bài mồi** — làm trước khi được dạy pattern. `(H)` là Hard.

---

### MODULE 0 — Nền tảng và cỗ máy luyện tập

*2 tuần · 6 Lab · Mục tiêu: dựng xong quy trình, giải tự lực 10 bài Easy*

| Lab | Nội dung | Bài |
| --- | --- | --- |
| 0.1 | Dựng project, chạy JUnit đầu tiên, chạy đủ một vòng "luật một bài" | **LC 1 Two Sum** — bắt buộc viết cả `O(N²)` rồi mới tới `O(N)` |
| 0.2 | Big-O thực chiến: đo thật `O(N²)` với `O(N log N)` với `O(N)` ở `N` = 10⁴, 10⁵, 10⁶. Dự đoán trước khi chạy | LC 121, LC 217 |
| 0.3 | Collection cho DSA: `int[]`, `ArrayList`, `HashMap`, `HashSet`, `ArrayDeque`, `PriorityQueue`, `StringBuilder` — bảng chi phí mục 7 | LC 344, LC 66, LC 88 |
| 0.4 | 14 cái bẫy Java trên LeetCode, mục 7.2 | LC 7 Reverse Integer, LC 9 |
| 0.5 | Đệ quy: đọc call stack, chuyển đệ quy sang lặp và ngược lại | LC 509, LC 206 (cả hai cách), LC 21 |
| 0.6 | Khuôn phỏng vấn 45 phút, mục 8. Nạp 10 bài đầu vào `REVIEW_QUEUE.md` | Ôn lại toàn bộ M0 từ trang trắng |

**Đầu ra M0:** harness test chạy được, review queue đang chạy, error log có dữ liệu thật, giải tự lực 10 bài Easy.

---

### MODULE 1 — Array, Two Pointers, Sliding Window, Prefix Sum

*3 tuần · 6 Lab · Nhóm pattern xuất hiện nhiều nhất trong vòng phỏng vấn đầu tiên*

| Lab | Pattern | Bài |
| --- | --- | --- |
| 1.1 | Two pointers đối đầu | **LC 125**, LC 167, LC 11, LC 15 3Sum, LC 16, LC 42 Trapping Rain Water (H) |
| 1.2 | Two pointers cùng chiều, sửa tại chỗ | **LC 26**, LC 27, LC 283, LC 80, LC 905 |
| 1.3 | Sliding window cửa sổ cố định | **LC 643**, LC 567, LC 438, LC 1456 |
| 1.4 | Sliding window co giãn — pattern quan trọng nhất Module 1 | **LC 3**, LC 209, LC 424, LC 904, LC 1004, LC 76 (H) |
| 1.5 | Prefix sum và difference array | **LC 303**, LC 724, LC 560, LC 238, LC 1094, LC 523 |
| 1.6 | Ma trận và mô phỏng | **LC 54**, LC 48, LC 73, LC 36, LC 289 |

**Dấu hiệu nhận pattern:** "dãy con liên tiếp" → sliding window. "Mảng đã sắp xếp, tìm cặp" → two pointers. "Tổng của đoạn `[i..j]`, hỏi nhiều lần" → prefix sum.

---

### MODULE 2 — Hashing, Sorting, Binary Search

*3 tuần · 6 Lab*

| Lab | Pattern | Bài |
| --- | --- | --- |
| 2.1 | HashMap và HashSet | **LC 217**, LC 242, LC 49, LC 383, LC 1, LC 128 |
| 2.2 | Đếm tần suất và top-K | **LC 347**, LC 692, LC 451, LC 169, LC 1207 |
| 2.3 | Tự viết merge sort và quick sort, hiểu stability | **LC 912**, LC 75, LC 88, LC 148, LC 179 |
| 2.4 | Comparator tùy biến và bài toán khoảng | **LC 56**, LC 57, LC 435, LC 452, LC 1288 |
| 2.5 | Binary search trên mảng — chốt **một** quy ước và dùng mãi | **LC 704**, LC 35, LC 34, LC 74, LC 162, LC 153, LC 33 |
| 2.6 | **Binary search trên đáp án** — pattern bị bỏ sót nhiều nhất | **LC 875**, LC 1011, LC 1482, LC 410 (H), LC 4 (H) |

**Về Lab 2.5:** phải chốt một quy ước biên duy nhất (đề nghị: nửa khoảng `[l, r)`, `while (l < r)`, `mid = l + (r - l) / 2`) và không bao giờ đổi. Phần lớn lỗi L3 đời sau đến từ việc mỗi lần viết một kiểu.

**Về Lab 2.6:** dấu hiệu nhận ra là đề hỏi "giá trị nhỏ nhất sao cho khả thi" hoặc "lớn nhất sao cho khả thi", và có hàm kiểm tra khả thi đơn điệu. Đây là pattern hay ra ở Amazon và Google.

---

### MODULE 3 — Linked List, Stack, Queue, Monotonic Stack

*2.5 tuần · 6 Lab*

| Lab | Pattern | Bài |
| --- | --- | --- |
| 3.1 | Linked list cơ bản, kỹ thuật dummy node | **LC 206**, LC 21, LC 83, LC 203, LC 2, LC 328 |
| 3.2 | Fast và slow pointer | **LC 141**, LC 876, LC 142, LC 19, LC 234, LC 143 |
| 3.3 | Linked list khó và design | **LC 92**, LC 25 (H), LC 138, LC 146 LRU Cache, LC 23 (H) |
| 3.4 | Stack | **LC 20**, LC 155, LC 150, LC 71, LC 394, LC 227 |
| 3.5 | Monotonic stack | **LC 739**, LC 496, LC 503, LC 901, LC 84 (H), LC 85 (H) |
| 3.6 | Queue, deque, và design đơn giản | **LC 232**, LC 225, LC 622, LC 239 |

**Về LC 146 LRU Cache:** bài được hỏi nhiều nhất trong toàn bộ danh sách này. Phải viết được từ trang trắng trong 20 phút, bằng `HashMap` cộng doubly linked list tự viết — **không dùng `LinkedHashMap`**, vì người phỏng vấn muốn thấy cấu trúc bên trong.

**Về monotonic stack:** dấu hiệu là "phần tử lớn hơn tiếp theo", "phần tử nhỏ hơn gần nhất bên trái", hoặc bài diện tích hình chữ nhật trong histogram.

---

### MODULE 4 — Tree, BST, Trie, Heap

*3 tuần · 7 Lab · Nhóm ra đề nhiều nhất ở vòng onsite*

| Lab | Pattern | Bài |
| --- | --- | --- |
| 4.1 | DFS: preorder, inorder, postorder — cả đệ quy và lặp bằng stack | **LC 94**, LC 144, LC 145, LC 104, LC 226, LC 100, LC 101 |
| 4.2 | BFS theo tầng | **LC 102**, LC 107, LC 103, LC 199, LC 515, LC 111 |
| 4.3 | Đệ quy trả về thông tin lên trên (postorder gộp kết quả) | **LC 543**, LC 110, LC 112, LC 437, LC 236, LC 124 (H) |
| 4.4 | BST và tính chất inorder tăng dần | **LC 700**, LC 701, LC 450, LC 98, LC 230, LC 235, LC 108 |
| 4.5 | Dựng lại cây và serialize | **LC 105**, LC 106, LC 572, LC 297 (H) |
| 4.6 | Trie | **LC 208**, LC 211, LC 648, LC 212 (H) |
| 4.7 | Heap và PriorityQueue | **LC 1046**, LC 215, LC 703, LC 973, LC 621, LC 295 (H) |

**Về Lab 4.3:** đây là Lab quan trọng nhất Module 4 và là cầu nối sang Module 7. Ý tưởng: mỗi node trả về một gói thông tin cho cha nó, cha gộp lại rồi trả tiếp lên. Nắm được cái này thì `LC 124` và toàn bộ tree DP về sau trở nên hiển nhiên.

**Về Lab 4.4:** mọi bài BST đều quy về một câu — **duyệt inorder của BST là dãy tăng dần**. Bài nào cũng thử áp câu đó vào trước khi nghĩ cách khác.

---

### MODULE 5 — Graph

*3 tuần · 6 Lab*

| Lab | Pattern | Bài |
| --- | --- | --- |
| 5.1 | DFS và BFS trên lưới — lưới là đồ thị trá hình | **LC 200**, LC 695, LC 733, LC 130, LC 994, LC 542, LC 1091, LC 417 |
| 5.2 | Biểu diễn đồ thị tổng quát, adjacency list | **LC 133**, LC 547, LC 841, LC 802, LC 1971 |
| 5.3 | Topological sort — Kahn và DFS | **LC 207**, LC 210, LC 310, LC 2115 |
| 5.4 | Union-Find với path compression và union by rank | **LC 684**, LC 547 (làm lại bằng DSU), LC 721, LC 990, LC 1319 |
| 5.5 | Đường đi ngắn nhất có trọng số: Dijkstra, Bellman-Ford | **LC 743**, LC 787, LC 1631, LC 778 (H) |
| 5.6 | Cây khung nhỏ nhất: Kruskal và Prim | **LC 1584**, LC 1135 nếu có premium |

**Về Lab 5.1:** phần lớn bài graph trong phỏng vấn được ngụy trang thành bài lưới. Dấu hiệu: "vùng liên thông", "lan ra bốn hướng", "số bước ít nhất trên lưới" (thì là BFS, không phải DFS).

**Về BFS với DFS:** BFS cho đường đi ngắn nhất khi mọi cạnh trọng số bằng nhau. DFS cho câu hỏi liên thông, chu trình, thứ tự. Chọn sai là lỗi L4 và rất hay gặp.

---

### MODULE 6 — Backtracking

*2 tuần · 4 Lab*

| Lab | Pattern | Bài |
| --- | --- | --- |
| 6.1 | Sinh tập con và tổ hợp — một template dùng cho cả nhóm | **LC 78**, LC 90, LC 77, LC 39, LC 40, LC 216 |
| 6.2 | Hoán vị và xử lý phần tử trùng | **LC 46**, LC 47, LC 31 |
| 6.3 | Backtracking trên chuỗi và lưới | **LC 17**, LC 22, LC 131, LC 93, LC 79 |
| 6.4 | Cắt tỉa — thứ phân biệt chạy được với TLE | **LC 51** N-Queens (H), LC 37 (H), LC 698, LC 473 |

**Trọng tâm Module 6:** cả module chỉ có **một** template — chọn, đệ quy, bỏ chọn. Phần khó không phải template mà là hai câu hỏi: điều kiện dừng là gì, và **bỏ qua nhánh nào để không lặp** (xử lý trùng ở LC 40 và LC 47 là chỗ rớt kinh điển).

---

### MODULE 7 — Dynamic Programming

*5 tuần · 8 Lab · Module dài nhất, và là chỗ rớt phỏng vấn nhiều nhất*

Cách tiếp cận của giáo trình này: **luôn đi từ đệ quy trần → thêm memo → chuyển bottom-up → tối ưu bộ nhớ.** Không bao giờ bắt đầu bằng việc viết thẳng bảng `dp`. Học DP bằng cách nhớ công thức `dp` là cách chắc chắn tắc khi gặp đề lạ.

| Lab | Pattern | Bài |
| --- | --- | --- |
| 7.1 | Bốn bước: đệ quy → memo → bottom-up → tối ưu bộ nhớ | **LC 509**, LC 70, LC 746 |
| 7.2 | DP một chiều trên dãy | **LC 198**, LC 213, LC 337, LC 91, LC 139, LC 322, LC 279 |
| 7.3 | DP trên dãy con | **LC 53** Kadane, LC 152, LC 300 LIS, LC 673, LC 1143 |
| 7.4 | Knapsack — 0/1 và không giới hạn | **LC 416**, LC 494, LC 518, LC 474, LC 1049 |
| 7.5 | DP hai chiều trên lưới | **LC 62**, LC 63, LC 64, LC 120, LC 221, LC 931 |
| 7.6 | DP trên hai chuỗi | **LC 1143** (lại), LC 72 Edit Distance, LC 5, LC 516, LC 647, LC 115, LC 10 (H), LC 44 (H) |
| 7.7 | DP trạng thái — nhóm mua bán cổ phiếu, làm liền một mạch | **LC 121**, LC 122, LC 309, LC 714, LC 123 (H), LC 188 (H) |
| 7.8 | DP khoảng và DP bitmask | **LC 312** (H), LC 1547 (H), LC 486, LC 847 (H), LC 1349 (H) |

**Về Lab 7.7:** sáu bài mua bán cổ phiếu là **một** bài với sáu ràng buộc khác nhau. Làm liền một mạch để thấy cấu trúc chung — đây là ngoại lệ duy nhất của luật trộn bài ở mục 2.3, và nó có lý do: mục tiêu ở đây chính là nhìn ra bộ khung chung.

**Về nhịp Module 7:** tối đa 3 bài DP mới mỗi buổi. DP là chỗ duy nhất trong giáo trình mà cày nhiều hơn cho kết quả **kém hơn** — cần khoảng cách giữa các buổi để cấu trúc đọng lại.

---

### MODULE 8 — Greedy, Bit, Math, Design

*2 tuần · 5 Lab*

| Lab | Pattern | Bài |
| --- | --- | --- |
| 8.1 | Greedy và nghĩa vụ chứng minh | **LC 55**, LC 45, LC 134, LC 763, LC 621, LC 1005 |
| 8.2 | Bit manipulation | **LC 136**, LC 191, LC 190, LC 338, LC 137, LC 260, LC 371 |
| 8.3 | Math và số học | **LC 7**, LC 9, LC 66, LC 50, LC 69, LC 172, LC 204 |
| 8.4 | Design — hay ra ở vòng onsite | **LC 380**, LC 705, LC 706, LC 355, LC 460 (H) |
| 8.5 | Ngẫu nhiên và lấy mẫu | **LC 528**, LC 384, LC 398 |

**Về Lab 8.1:** greedy là pattern nguy hiểm nhất, vì lời giải sai vẫn pass hết test mẫu. Luật của giáo trình: **không được nộp lời giải greedy nếu chưa nói được vì sao chọn tham lam ở mỗi bước là an toàn**, hoặc chưa tìm được phản ví dụ cho cách khác. Cảm giác "chắc là đúng" không tính.

---

### MODULE 9 — Chuyển sang Python

*2 tuần · 4 Lab · Chỉ bắt đầu khi Module 8 đã xong*

Đến đây thuật toán đã nằm trong đầu, việc còn lại chỉ là đổi ngôn ngữ diễn đạt. Chuyển ở giai đoạn này mất 2 tuần; chuyển ở Module 1 sẽ mất cả lộ trình.

| Lab | Nội dung |
| --- | --- |
| 9.1 | Bảng dịch: `ArrayList` → `list`, `HashMap` → `dict`, `HashSet` → `set`, `ArrayDeque` → `collections.deque`, `PriorityQueue` → `heapq`, `StringBuilder` → `''.join`, `Comparator` → `key=`, `Arrays.binarySearch` → `bisect`, memo → `functools.lru_cache` |
| 9.2 | Viết lại 30 bài đã ở cấp 4–5 bằng Python, **không mở code Java** |
| 9.3 | Bẫy Python trên LeetCode: `heapq` chỉ có min-heap (đảo dấu để thành max-heap), `sys.setrecursionlimit`, `//` làm tròn xuống với số âm, tham số mặc định mutable, slice tạo bản sao tốn `O(N)`, `list` không phải mảng cố định |
| 9.4 | Chọn ngôn ngữ cho ngày phỏng vấn, và luyện đúng ngôn ngữ đó từ đây |

**Cách chọn:** Python nếu bài nặng chuỗi, hash, và cần gõ nhanh. Java nếu bài nặng cấu trúc dữ liệu tự cài (LRU, Trie, DSU) hoặc cần chắc chắn về kiểu. Chọn xong thì **không đổi nữa** trước ngày phỏng vấn.

---

### MODULE 10 — Phỏng vấn thật

*4 tuần, sau đó lặp lại vô hạn cho tới ngày phỏng vấn*

| Lab | Nội dung |
| --- | --- |
| 10.1 | Khuôn 45 phút, mục 8. Luyện tới khi thành phản xạ |
| 10.2 | Nghĩ thành lời — ghi âm 5 bài, tự nghe lại, đếm số khoảng lặng quá 30 giây |
| 10.3 | Mock với agent: agent ra một bài **không nói chủ đề**, không gợi ý, chấm theo rubric mục 8.2 |
| 10.4 | LeetCode Weekly Contest, mỗi tuần một lần, không bỏ. Đây là bài kiểm tra duy nhất mô phỏng đúng áp lực thời gian |
| 10.5 | Hard theo chủ đề — mỗi tuần 2 bài Hard, chọn từ chủ đề đang yếu nhất theo `ERROR_LOG.md` |
| 10.6 | Chuẩn bị theo công ty, mục 8.3 |

**Điều kiện coi như sẵn sàng phỏng vấn:**

- Trên 80% bài trong queue đạt cấp 4 trở lên.
- 5 mock liên tiếp đạt trên 75 điểm rubric.
- Giải được bài Medium lạ trong 25 phút, có nói thành lời, trên 3 lần liên tiếp.

---

## 7. JAVA CHO PHỎNG VẤN

### 7.1 Bảng chi phí thao tác — thuộc lòng, dùng để chẩn đoán lỗi L4 và L5

| Cấu trúc | Thêm | Xóa | Tìm | Truy cập theo chỉ số | Ghi chú |
| --- | --- | --- | --- | --- | --- |
| `int[]` | — | — | `O(N)` | `O(1)` | Nhanh nhất, không boxing. Ưu tiên khi biết trước kích thước |
| `ArrayList` | `O(1)` khấu hao | `O(N)` | `O(N)` | `O(1)` | Xóa giữa mảng tốn `O(N)`, hay bị quên |
| `HashMap` / `HashSet` | `O(1)` | `O(1)` | `O(1)` | — | Trung bình. Boxing với key số nguyên |
| `TreeMap` / `TreeSet` | `O(log N)` | `O(log N)` | `O(log N)` | — | Có `floorKey`, `ceilingKey`, `higherKey` — cực hữu ích cho bài khoảng |
| `ArrayDeque` | `O(1)` hai đầu | `O(1)` hai đầu | `O(N)` | — | Dùng làm cả stack lẫn queue. **Luôn thay cho `LinkedList`** |
| `PriorityQueue` | `O(log N)` | `O(log N)` lấy đỉnh | `O(N)` tìm bất kỳ | — | `remove(Object)` tốn `O(N)`, đây là bẫy TLE |
| `StringBuilder` | `O(1)` khấu hao | — | — | `O(1)` | Nối `String` trong vòng lặp là `O(N²)` |

### 7.2 Mười bốn cái bẫy Java trên LeetCode

| # | Bẫy | Chữa |
| --- | --- | --- |
| 1 | `Arrays.sort(int[])` bị test anti-quicksort ép về `O(N²)` | Box sang `Integer[]`, hoặc shuffle ngẫu nhiên trước khi sort |
| 2 | Nối `String` trong vòng lặp | `StringBuilder` |
| 3 | `==` so sánh `Integer` ngoài khoảng cache −128..127 | Luôn `.equals()`, hoặc unbox về `int` |
| 4 | Tràn `int` khi tính `(l + r) / 2` | `l + (r - l) / 2` |
| 5 | Tràn `int` khi cộng tổng mảng | Dùng `long` cho biến tổng |
| 6 | `list.remove(int)` xóa theo chỉ số, `list.remove(Object)` xóa theo giá trị | Với `List<Integer>` phải ép rõ: `remove(Integer.valueOf(x))` |
| 7 | `%` với số âm trong Java cho kết quả âm | `((a % m) + m) % m` |
| 8 | Sửa collection trong lúc dùng for-each | Dùng `Iterator.remove()` hoặc lặp bằng chỉ số ngược |
| 9 | `HashMap<Integer,Integer>` cho key là chỉ số nhỏ | `int[]` — nhanh hơn hàng chục lần |
| 10 | `PriorityQueue.remove(Object)` trong vòng lặp | Dùng lazy deletion, hoặc `TreeMap` |
| 11 | Quên `char` là số: `s.charAt(i) - 'a'` | Đây là cách đếm chữ cái chuẩn, dùng `int[26]` |
| 12 | `Arrays.asList()` trả về list cố định kích thước | `new ArrayList<>(Arrays.asList(...))` |
| 13 | Chia sẻ mảng `List<Integer> path` khi backtracking mà quên copy | `new ArrayList<>(path)` khi thêm vào kết quả |
| 14 | Đệ quy sâu tràn stack với `N` lớn | Chuyển sang lặp có stack tường minh; Java mặc định khoảng 10⁴ khung |

### 7.3 Template phải viết được từ trí nhớ trong 3 phút

Đến hết Module 8, bảy template sau phải gõ ra được không cần nghĩ. Ôn chúng ở tần suất cao hơn bài thường.

1. Binary search (một quy ước biên duy nhất)
2. Binary search trên đáp án
3. Sliding window co giãn
4. DFS và BFS trên lưới
5. Backtracking (chọn, đệ quy, bỏ chọn)
6. Topological sort bằng Kahn
7. Union-Find có path compression

---

## 8. KHUÔN PHỎNG VẤN 45 PHÚT

### 8.1 Phân bổ thời gian

| Mốc | Việc | Sai lầm phổ biến |
| --- | --- | --- |
| 0–5 phút | Nhắc lại đề, hỏi ràng buộc, hỏi biên, xin ví dụ | Nhảy vào code ngay. Trừ điểm nặng nhất |
| 5–15 phút | Nêu brute force và Big-O của nó, rồi nêu hướng tối ưu, **chốt với người phỏng vấn trước khi gõ** | Code ngay hướng tối ưu mà không nói brute force |
| 15–35 phút | Code, vừa code vừa nói | Im lặng gõ 10 phút |
| 35–40 phút | Chạy tay một ví dụ nhỏ, tự tìm lỗi biên | Nói "xong rồi" rồi chờ người phỏng vấn tìm bug hộ |
| 40–45 phút | Nói độ phức tạp cuối, nêu hướng tối ưu thêm, hỏi lại | Bỏ trống |

### 8.2 Rubric chấm mock — đạt là từ 75 điểm

| Tiêu chí | Điểm |
| --- | --- |
| Làm rõ đề và hỏi ràng buộc trước khi code | 10 |
| Nêu được brute force cùng Big-O của nó | 15 |
| Đi tới lời giải tối ưu, hoặc gần tối ưu và nhận ra khoảng cách | 25 |
| Code chạy đúng, xử lý được biên | 25 |
| Tự tìm ra bug bằng chạy tay, không chờ nhắc | 15 |
| Nói liên tục, không im lặng quá 30 giây | 10 |

Dưới 75 thì mock đó tính là fail, ghi vào `ERROR_LOG.md` như một bài fail bình thường. Agent **không được nới điểm cho dễ chịu** — điểm nới là điểm vô dụng.

### 8.3 Khác biệt giữa các công ty

| Công ty | Phong cách đề | Chuẩn bị thêm |
| --- | --- | --- |
| Google | Nghiêng graph, DP, bài mở có nhiều tầng hỏi tiếp | M5 và M7 phải rất chắc. Luyện nói to |
| Meta | Tốc độ cao, 2 bài trong 45 phút, Medium quen thuộc | Luyện tốc độ: Medium trong 15 phút |
| Amazon | Nghiêng thực dụng: BFS, heap, binary search trên đáp án, và LP behavioral | M2.6, M4.7, M5.1. Chuẩn bị riêng phần Leadership Principles |
| ByteDance / TikTok | Sát competitive programming, hay có Hard | M7.8, contest hàng tuần |
| Microsoft | Nghiêng thiết kế cấu trúc dữ liệu, linked list, tree | M3 và M4 |
| Startup / công ty tech vừa | Thường Easy tới Medium, nặng phần code sạch | M1 tới M4 là đủ. Chú trọng đặt tên và tách hàm |

---

## 9. TÀI NGUYÊN, THEO ĐÚNG THỨ TỰ DÙNG

| Khi nào | Tài nguyên | Dùng thế nào |
| --- | --- | --- |
| M0 | **Big-O cheat sheet** (bigocheatsheet.com) | In ra dán bàn, không học thuộc |
| M0 tới M8 | **NeetCode 150** (neetcode.io) | Dùng làm **danh sách đối chiếu**, không phải nguồn học. Xem video **chỉ sau khi** đã quá 45 phút |
| M1 tới M8 | **LeetCode Explore Cards** theo từng chủ đề | Miễn phí, có bài xếp theo độ khó tăng dần |
| M2, M7 | **CS 61B (Berkeley)** hoặc **MIT 6.006** trên YouTube | Chỉ xem chương đang học, không xem tuần tự cả khóa |
| M7 | **Errichto — Dynamic Programming** (YouTube) | Loạt video DP dễ hiểu nhất hiện có |
| M5, M7 | **CP-Algorithms** (cp-algorithms.com) | Tra cứu cài đặt chuẩn, không đọc từ đầu tới cuối |
| Tra cứu | **Java API docs** | Đọc kỹ `Deque`, `NavigableMap`, `PriorityQueue` |
| M10 | **LeetCode Weekly Contest** | Mỗi tuần một lần, không bỏ |
| M10 | **Pramp** hoặc **interviewing.io** | Mock với người thật, khác hẳn mock với agent |
| Bổ trợ | **Grokking Algorithms** (Aditya Bhargava) | Đọc khi cần trực giác hình ảnh, không phải để làm bài tập |

**Không dùng:** danh sách "top 500 bài phải làm", và các khóa hứa "học DSA trong 30 ngày". Cái đầu tạo ảo giác tiến độ, cái sau bỏ qua toàn bộ phần ôn tập.

---

## 10. THEO DÕI TIẾN ĐỘ

Hai con số duy nhất đáng theo dõi, cập nhật hàng tuần vào `PROGRESS.md`:

1. **Tỷ lệ giữ lại** — số bài đạt cấp 4 trở lên chia cho tổng số bài đã nạp vào queue. Mục tiêu trên 80%.
2. **Phân bố loại lỗi L1–L7 trong tuần** — cho biết tuần sau phải luyện gì.

Số bài đã submit, streak trên LeetCode, và xếp hạng đều là chỉ số rác. Không ghi.

---

## 11. CHẾ ĐỘ GẤP — khi có lịch phỏng vấn dưới 8 tuần

Chỉ dùng khi có lịch thật. Cắt như sau, theo đúng thứ tự ưu tiên:

| Giữ nguyên | Cắt |
| --- | --- |
| M1.1, M1.4, M1.5 | M1.6 ma trận |
| M2.1, M2.5, M2.6 | M2.3 tự viết sort |
| M3.1, M3.2, M3.4, LC 146 | M3.5 monotonic stack (trừ LC 739) |
| M4 toàn bộ trừ 4.6 | M4.6 Trie |
| M5.1, M5.3 | M5.5, M5.6 |
| M7.1 tới M7.5 | M7.6, M7.7, M7.8 |
| M10 toàn bộ | M6.4, M8, M9 |

**Không được cắt:** cơ chế ôn ở mục 2, và Module 10. Bỏ ôn trong chế độ gấp là cách chắc chắn nhất để vào phòng phỏng vấn và quên bài đã giải tuần trước.

---

## 12. SAU GIÁO TRÌNH

Xong Module 10 không phải là kết thúc. Giữ ba việc chạy nền, mỗi tuần khoảng 3 giờ:

- Contest hàng tuần — giữ phản xạ dưới áp lực.
- Queue ôn tiếp tục chạy — bài ở cấp 5 vẫn nên quay lại mỗi 3 tháng.
- Mỗi tháng một bài Hard hoàn toàn lạ, tự lực, không giới hạn thời gian.

Nếu mục tiêu là big tech từ senior trở lên, việc kế tiếp là **system design**, không phải thêm 200 bài LeetCode. Đó là một giáo trình khác và nên có workspace riêng.
