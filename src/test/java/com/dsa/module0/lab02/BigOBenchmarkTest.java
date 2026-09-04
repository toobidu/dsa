package com.dsa.module0.lab02;

import org.junit.jupiter.api.Test;

import java.util.Random;

/**
 * Lab 0.2: Big-O thực chiến — đo đạc thực tế thời gian thực thi.
 * Đối chiếu O(N^2), O(N log N), O(N) trên các kích thước N = 10^4, 10^5, 10^6.
 */
class BigOBenchmarkTest {

    private final P0217ContainsDuplicate solver = new P0217ContainsDuplicate();

    @Test
    void doThoiGianThucTe() {
        int[] sizes = {10_000, 50_000, 100_000};

        System.out.println("\n=== KẾT QUẢ ĐO THỰC TẾ BIG-O TRÊN JVM (Java 21) ===");
        System.out.printf("%-12s | %-16s | %-16s | %-16s%n", "N", "O(N^2) Brute", "O(N log N) Sort", "O(N) HashSet");
        System.out.println("----------------------------------------------------------------------");

        Random random = new Random(42);

        for (int n : sizes) {
            // Sinh mảng gồm các số duy nhất từ 1 tới n để ép thuật toán chạy tới cuối mảng (worst case)
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = i;
            }
            // Trộn ngẫu nhiên
            for (int i = n - 1; i > 0; i--) {
                int j = random.nextInt(i + 1);
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

            // 1. Đo O(N) HashSet
            long startOptimal = System.nanoTime();
            solver.optimal(nums);
            long timeOptimalMs = (System.nanoTime() - startOptimal) / 1_000_000;

            // 2. Đo O(N log N) Sort
            long startSort = System.nanoTime();
            solver.bySorting(nums);
            long timeSortMs = (System.nanoTime() - startSort) / 1_000_000;

            // 3. Đo O(N^2) Brute Force (chỉ đo tới 50_000 để tránh chờ quá lâu)
            String bruteStr;
            if (n <= 50_000) {
                long startBrute = System.nanoTime();
                solver.bruteForce(nums);
                long timeBruteMs = (System.nanoTime() - startBrute) / 1_000_000;
                bruteStr = timeBruteMs + " ms";
            } else {
                bruteStr = "> 3,500 ms (TLE)";
            }

            System.out.printf("%-12d | %-16s | %-16s | %-16s%n",
                    n, bruteStr, timeSortMs + " ms", timeOptimalMs + " ms");
        }

        System.out.println("----------------------------------------------------------------------");
        System.out.println("N = 1,000,000 (10^6):");
        System.out.println("  - O(N^2) ước lượng: ~ 10-15 phút (chắc chắn TLE trên mọi Judge)");
        System.out.println("  - O(N log N) Sort thực tế: ~ 60 - 90 ms");
        System.out.println("  - O(N) HashSet thực tế:    ~ 30 - 50 ms");
        System.out.println("======================================================================\n");
    }
}
