# TEMPLATE — Lab 0.3: Collection cho DSA & Kỹ thuật mảng tại chỗ

## 1. Bảng chi phí thao tác Java Collection (Cốt lõi)

| Cấu trúc | Thêm | Xóa | Tìm kiếm | Truy cập index | Bẫy thường gặp |
| --- | --- | --- | --- | --- | --- |
| `int[]` | — | — | `O(N)` | `O(1)` | Không boxing, nhanh nhất. Luôn ưu tiên khi biết trước kích thước mảng |
| `ArrayList` | `O(1)` amortized | `O(N)` | `O(N)` | `O(1)` | Xóa phần tử ở giữa tốn `O(N)` vì phải dồn mảng |
| `ArrayDeque` | `O(1)` hai đầu | `O(1)` hai đầu | `O(N)` | — | Dùng làm cả Stack lẫn Queue. **Tuyệt đối không dùng `LinkedList`** |
| `HashMap` / `HashSet` | `O(1)` avg | `O(1)` avg | `O(1)` avg | — | Tốn bộ nhớ và chi phí boxing nếu key là số nguyên. Nếu biên nhỏ/biết trước: dùng `int[]` |
| `PriorityQueue` | `O(log N)` | `O(log N)` (poll) | `O(N)` | — | `remove(Object)` tốn `O(N)` — nguyên nhân gây TLE kinh điển |
| `StringBuilder` | `O(1)` amortized | — | — | `O(1)` | Tuyệt đối không cộng `String` (`+`) trong vòng lặp vì sẽ thành `O(N²)` |

---

## 2. Template: Duyệt mảng ngược xử lý số nhớ (Simulation / Carry Handling)

Áp dụng cho các bài toán cộng số lớn, phép tính số học trên mảng/chuỗi:

```java
public int[] plusOne(int[] digits) {
    // Duyệt từ hàng đơn vị lùi về hàng cao nhất
    for (int i = digits.length - 1; i >= 0; i--) {
        if (digits[i] < 9) {
            digits[i]++;
            return digits; // Hết số nhớ -> trả về ngay
        }
        digits[i] = 0; // Gặp 9 biến thành 0, để vòng lặp tự động mang số nhớ 1 sang trái
    }

    // Trường hợp toàn bộ là 9 (ví dụ [9, 9] -> [1, 0, 0])
    int[] result = new int[digits.length + 1];
    result[0] = 1;
    return result;
}
```

---

## 3. Template: Two Pointers đối đầu (In-place Swap)

Áp dụng cho đảo ngược mảng, kiểm tra palindrome:

```java
public void reverse(char[] s) {
    int left = 0;
    int right = s.length - 1;
    while (left < right) {
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        left++;
        right--;
    }
}
```

---

## 4. Template: Three Pointers duyệt từ cuối về đầu (Merge In-place)

Áp dụng khi mảng đích đã chừa sẵn khoảng trống ở cuối (tránh bị ghi đè dữ liệu chưa xử lý):

```java
public void merge(int[] nums1, int m, int[] nums2, int n) {
    int p1 = m - 1;
    int p2 = n - 1;
    int p = m + n - 1;

    while (p2 >= 0) {
        if (p1 >= 0 && nums1[p1] > nums2[p2]) {
            nums1[p] = nums1[p1];
            p1--;
        } else {
            nums1[p] = nums2[p2];
            p2--;
        }
        p--;
    }
}
```
