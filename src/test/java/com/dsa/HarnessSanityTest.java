package com.dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Chỉ để xác nhận Maven + JUnit 5 + Java 21 chạy được.
 * Không xóa: đây là thứ phân biệt "code sai" với "môi trường hỏng" khi mvn test đỏ.
 */
class HarnessSanityTest {

    @Test
    void junitChay() {
        assertEquals(4, 2 + 2);
    }

    @Test
    void java21Chay() {
        // switch expression — cú pháp chỉ biên dịch được từ Java 14 trở lên
        int x = 3;
        String s = switch (x) {
            case 3 -> "ok";
            default -> "sai";
        };
        assertEquals("ok", s);
    }
}
