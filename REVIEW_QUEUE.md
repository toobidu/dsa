# REVIEW_QUEUE — nợ ôn và lịch giãn cách

**Agent: đọc file này ngay sau `PROGRESS.md`, trước khi giao bất cứ bài mới nào.**

Bài trong file này là **bài kiểm tra**, không phải bài học. Cấm gợi ý, cấm nhắc pattern, cấm nói bài này thuộc chủ đề gì. Vi phạm là hỏng phép đo, mà phép đo là thứ duy nhất cho biết người học có thật sự nhớ hay chỉ đang thấy quen mắt.

Cập nhật lần cuối: 2026-09-09

---

## LUẬT

### Cách ôn một bài

1. Mở file **mới**. Không mở code cũ, không mở note, không mở `TEMPLATE.md`.
2. Hẹn giờ theo cột `Giới hạn`.
3. Viết lại từ đầu, chạy test cũ.
4. Chấm theo ba mức bên dưới, cập nhật bảng, xong.

### Ba mức chấm

| Mức | Điều kiện | Xử lý |
| --- | --- | --- |
| 🟢 Pass gọn | Xong trong giới hạn, không tra cứu, không sửa quá 2 lần | Lên 1 cấp |
| 🟡 Pass chật vật | Pass nhưng quá giờ, hoặc phải liếc template, hoặc sửa hơn 2 lần lỗi biên | Giữ nguyên cấp, hẹn lại theo cấp hiện tại |
| 🔴 Fail | Bí quá 5 phút không nhớ hướng, hoặc phải mở lời giải | **Tụt 2 cấp** (không dưới 0), ghi loại lỗi L1–L7 vào `ERROR_LOG.md` |

### Lịch giãn cách

| Cấp | Hẹn ôn sau |
| --- | --- |
| 0 → 1 | 1 ngày |
| 1 → 2 | 3 ngày |
| 2 → 3 | 7 ngày |
| 3 → 4 | 21 ngày |
| 4 → 5 | 60 ngày |
| 5 | Thuộc — rút khỏi bảng, chuyển xuống mục "Đã thuộc" |

### Giới hạn thời gian theo độ khó

| Độ khó | Lần đầu | Khi ôn |
| --- | --- | --- |
| Easy | 20 phút | 10 phút |
| Medium | 45 phút | 25 phút |
| Hard | 60 phút | 40 phút |

### Ba luật cứng

1. **Nợ ôn trả trước bài mới.** Mỗi buổi, mọi bài có `Hẹn ôn` sớm hơn hoặc bằng hôm nay đều phải làm xong trước khi mở Lab mới.
2. **Queue vượt 25 bài tới hạn → cấm nạp bài mới hôm đó.** Chỉ ôn. Queue phình to là dấu hiệu nhồi nhanh hơn khả năng giữ lại, phải chậm lại chứ không phải cố hơn.
3. **Thứ tự ôn phải ngẫu nhiên**, không nhóm theo pattern. Agent xáo trước khi giao, và không nói bài nào thuộc chủ đề nào.

---

## TỚI HẠN HÔM NAY (2026-09-13)

*Không còn bài nào nợ ôn. Toàn bộ 5 bài tới hạn hôm nay đã được trả nợ trọn vẹn!*

*Đã trả nợ hôm nay: LC 1 Two Sum 🟢 (lên Cấp 2) · LC 121 Best Time to Buy and Sell Stock 🟢 (lên Cấp 2) · LC 344 Reverse String 🟢 (lên Cấp 1) · LC 217 Contains Duplicate 🟢 (lên Cấp 2) · LC 88 Merge Sorted Array 🟢 (lên Cấp 2) — tất cả hẹn tiếp 2026-09-16.*

---

## ĐANG TRONG QUEUE

Sắp theo `Hẹn ôn` tăng dần. Cột `Lịch sử` ghi kết quả các lần ôn theo thứ tự, ví dụ `🟢🟡🔴🟢`.

| Bài | Chủ đề | Độ khó | Cấp | Giải lần đầu | Ôn gần nhất | Hẹn ôn | Lịch sử |
| --- | --- | --- | --- | --- | --- | --- | --- |
| LC 344 Reverse String | Two Pointers | Easy | 1 | 2026-09-09 | 2026-09-13 | 2026-09-16 | 🟢🟢 |
| LC 88 Merge Sorted Array | Array / Two Pointers | Easy | 2 | 2026-09-07 | 2026-09-13 | 2026-09-16 | 🟢🟢🟢 |
| LC 1 Two Sum | Hashing / Array | Easy | 2 | 2026-09-04 | 2026-09-13 | 2026-09-16 | 🟢🟢 |
| LC 121 Best Time to Buy and Sell Stock | Array / Two Pointers | Easy | 2 | 2026-09-04 | 2026-09-13 | 2026-09-16 | 🟡🟢🟢 |
| LC 217 Contains Duplicate | Hashing / Sorting | Easy | 2 | 2026-09-04 | 2026-09-13 | 2026-09-16 | 🟡🟡🟢🟢 |

---

## ĐÃ THUỘC (cấp 5)

Vẫn nên quay lại mỗi 3 tháng một lần. Không xóa khỏi file.

| Bài | Chủ đề | Ngày đạt cấp 5 | Số lần fail trên đường đi |
| --- | --- | --- | --- |
| — | — | — | — |

---

## BÀI ĐANG CÓ VẤN ĐỀ

Bài fail từ 2 lần trở lên hoặc có dấu hiệu kẹt. Đây là danh sách quan trọng nhất file — nó chỉ đúng chỗ đang hổng.

| Bài | Số lần fail | Loại lỗi lặp lại | Đã chữa thế nào |
| --- | --- | --- | --- |
| LC 217 Contains Duplicate | 0 fail (2 lần 🟡, 1 lần 🟢) | L3 (chỉ số vòng lặp) + L6 (dùng nhầm mảng gốc thay vì clone) | Đã giải quyết ở vòng 3 (2026-09-09, pass < 3 phút, lên Cấp 1) |

**Quy tắc:** một bài fail 3 lần thì dừng ôn nó, quay lại học lại **pattern** của nó từ Lab gốc. Ôn lần thứ tư một bài chưa hiểu chỉ là học thuộc lời giải, và học thuộc lời giải thì gặp bài lạ vẫn tắc.

---

## THỐNG KÊ LOẠI LỖI THEO TUẦN

Nguồn: các `ERROR_LOG.md` trong `docs/`. Cột nào cao nhất thì tuần sau luyện đúng cái đó, theo cách chữa ở `AGENTS.md` mục 2.5.

| Tuần | L1 pattern | L2 template | L3 biên | L4 cấu trúc | L5 TLE | L6 API Java | L7 đọc đề |
| --- | --- | --- | --- | --- | --- | --- | --- |
| 2026-08-31 → 09-06 | 0 | 1 | 1 | 0 | 0 | 1 | 0 |
| 2026-09-07 → 09-13 | 0 | 0 | 1 | 0 | 0 | 1 | 0 |
