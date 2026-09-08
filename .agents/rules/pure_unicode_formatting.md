# Quy Tắc Định Dạng Phản Hồi: Pure Unicode & Không Sử Dụng LaTeX

## 1. Nghiêm Cấm Tuyệt Đối Cú Pháp LaTeX
- TUYỆT ĐỐI KHÔNG sử dụng bất kỳ cú pháp toán học LaTeX nào có chứa dấu đô la `$...$` hoặc `$$...$$` trong toàn bộ câu trả lời, phản hồi, giải thích và tài liệu Markdown.
- KHÔNG dùng: `$\rightarrow$`, `$\ge$`, `$\le$`, `$\approx$`, `$\times$`, `\text{...}`, `\frac{...}{...}`.

## 2. Bắt Buộc Sử Dụng 100% Ký Tự Unicode Trực Tiếp
- Mọi ký hiệu toán học, mũi tên, so sánh, bảng biểu PHẢI dùng trực tiếp ký tự Unicode sạch:
  - Mũi tên: `→`, `←`, `↔`, `⇒`, `►`
  - So sánh & Toán tử: `>=`, `<=`, `≠`, `≈`, `×`, `*`, `±`, `~`
  - Dấu tích & Trạng thái: `✓`, `✅`, `❌`, `⚠️`, `🏆`, `👉`, `•`
  - Trạng thái chấm bài: `🟢` pass gọn, `🟡` pass chật vật, `🔴` fail
  - Biến số và độ phức tạp Big-O: Viết `O(1)`, `O(N)`, `O(log N)`, `O(N log N)`, `O(2^N)`, `N * Q`, `N = 100`, `N = 1,000,000`.

## 3. Không Vẽ Khung ASCII
- Không dùng khung vẽ tay bằng `+---+` hay `|`. Khung vẽ tay vỡ layout trên màn hình hẹp và không sửa được.
- Dùng bảng và danh sách Markdown thường.
