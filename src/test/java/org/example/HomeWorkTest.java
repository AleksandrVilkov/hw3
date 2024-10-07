package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class HomeWorkTest {
    @Test
    void test() {
        var hw = new HomeWork();
        var result1 = hw.findMaxSubstring("abcddcba");
        assertEquals("abcd", result1);

        var result2 = hw.findMaxSubstring("abcddcbaX");
        assertEquals("dcbaX", result2);

        var result3 = hw.findMaxSubstring("rrrrTTTrrr");
        assertEquals("rT", result3);

        var result4 = hw.findMaxSubstring("qwertyu");
        assertEquals("qwertyu", result4);

        var result5 = hw.findMaxSubstring("wwwwwwwfgh");
        assertEquals("wfgh", result5);

        var result6 = hw.findMaxSubstring("qwertyq");
        assertEquals("qwerty", result6);
    }
}