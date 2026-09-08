# TEMPLATE — Lab 0.1

## Pattern của Lab này

**Tra cứu phần bù bằng bảng băm (One-pass HashMap / Complement Lookup)**
Chuyển phép toán hai biến `A + B = Target` thành tìm kiếm một biến đã lưu trong quá khứ: `Target - B`.

## Dấu hiệu nhận ra trong một đề lạ

- Đề yêu cầu tìm một **cặp phần tử (pair)** thỏa mãn mối quan hệ toán học: tổng bằng `target` (`nums[i] + nums[j] == target`), hiệu bằng `k`, hoặc kiểm tra phần tử trùng lặp (`nums[i] == nums[j]`).
- Đề bài yêu cầu trả về **chỉ số (indices)** của mảng ban đầu (ngăn cản việc sắp xếp mảng tại chỗ vì sort làm mất chỉ số gốc).
- Mảng đầu vào **chưa được sắp xếp** (nếu đã sắp xếp thì ưu tiên dùng Two Pointers để đạt bộ nhớ `O(1)`).

## Khung code

```java
public int[] solve(int[] nums, int target) {
    // Map lưu: Key = giá trị phần tử (để tìm kiếm O(1)), Value = chỉ số index
    Map<Integer, Integer> map = new HashMap<>();
    
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        
        // Kiểm tra xem phần bù đã xuất hiện trước đó chưa
        if (map.containsKey(complement)) {
            return new int[] { map.get(complement), i };
        }
        
        // Chỉ đưa vào map sau khi đã kiểm tra (tránh tự dùng lại chính mình)
        map.put(nums[i], i);
    }
    
    return new int[] {};
}
```

## Ba chỗ dễ sai

1. **`map.put()` trước khi `containsKey()`**: Nếu ghi vào map trước, khi gặp trường hợp `target = 2 * nums[i]` (ví dụ `target = 6`, phần tử `3`), thuật toán sẽ tự bắt chính nó (vi phạm điều kiện `i ≠ j`), hoặc làm mất index của phần tử trùng lặp đứng trước (như test biên `[3, 3]`).
2. **Nhầm lẫn giữa Key và Value**: Key phải là giá trị phần tử (`nums[i]`) để tra cứu `O(1)`, Value là index (`i`). Nếu đảo ngược sẽ không tra cứu được phần bù.
3. **Tràn số nguyên (Integer Overflow)**: Khi miền giá trị lớn (ví dụ `target` dương lớn và `nums[i]` âm lớn), phép trừ `target - nums[i]` có thể tràn kiểu `int`. Trong thực tế cần ép kiểu `long`.

## Độ phức tạp

- Time: `O(N)` — duyệt mảng đúng 1 lượt; mỗi lần tra cứu và thêm vào HashMap tốn `O(1)` trung bình (amortized).
- Space: `O(N)` — trường hợp xấu nhất không tìm thấy cặp cho tới cuối mảng, map sẽ lưu `N` phần tử.
