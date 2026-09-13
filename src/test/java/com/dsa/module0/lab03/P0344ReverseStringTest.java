package com.dsa.module0.lab03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class P0344ReverseStringTest {

    private final P0344ReverseString s = new P0344ReverseString();

    @Test
    void mauDeBai() {
        // Ví dụ 1: "hello" -> "olleh"
        char[] input1 = {'h', 'e', 'l', 'l', 'o'};
        s.optimal(input1);
        assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, input1);

        // Ví dụ 2: "Hannah" -> "hannaH"
        char[] input2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        s.optimal(input2);
        assertArrayEquals(new char[]{'h', 'a', 'n', 'n', 'a', 'H'}, input2);
    }

    /**
     * Test biên 1: Mảng kích thước tối thiểu theo đề bài (1 phần tử).
     * Mảng 1 ký tự khi đảo ngược không thay đổi.
     */
    @Test
    void bien1_motPhanTu() {
        char[] input = {'x'};
        s.optimal(input);
        assertArrayEquals(new char[]{'x'}, input);
    }

    /**
     * Test biên 2: Mảng 2 phần tử (độ dài chẵn nhỏ nhất có hoán đổi).
     */
    @Test
    void bien2_haiPhanTu() {
        char[] input = {'a', 'b'};
        s.optimal(input);
        assertArrayEquals(new char[]{'b', 'a'}, input);
    }

    /**
     * Test biên: Phân biệt độ dài lẻ (có phần tử chính giữa giữ nguyên)
     * và độ dài chẵn (tất cả các cặp đều đổi chỗ).
     */
    @Test
    void bienDoDaiLeVaChan() {
        // Độ dài lẻ (3 phần tử)
        char[] odd = {'1', '2', '3'};
        s.optimal(odd);
        assertArrayEquals(new char[]{'3', '2', '1'}, odd);

        // Độ dài chẵn (4 phần tử)
        char[] even = {'A', 'B', 'C', 'D'};
        s.optimal(even);
        assertArrayEquals(new char[]{'D', 'C', 'B', 'A'}, even);
    }

    /**
     * Test biên: Toàn bộ ký tự giống nhau hoặc đối xứng sẵn (palindrome).
     */
    @Test
    void bienDoiXungVaGiongNhau() {
        char[] same = {'k', 'k', 'k', 'k', 'k'};
        s.optimal(same);
        assertArrayEquals(new char[]{'k', 'k', 'k', 'k', 'k'}, same);

        char[] palindrome = {'r', 'a', 'c', 'e', 'c', 'a', 'r'};
        s.optimal(palindrome);
        assertArrayEquals(new char[]{'r', 'a', 'c', 'e', 'c', 'a', 'r'}, palindrome);
    }

    /**
     * Differential testing: Cả bruteForce và optimal đều phải cho kết quả giống nhau.
     */
    @Test
    void soSanhBruteForceVaOptimal() {
        char[] testBrute = {'p', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'i', 'n', 'g'};
        char[] testOptimal = testBrute.clone();

        s.bruteForce(testBrute);
        s.optimal(testOptimal);

        assertArrayEquals(testBrute, testOptimal);
    }
}