package com.heo.subs.subscribe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class SubcsribeTest {

    @Test
    void countDateTest(){
        Netflix netflix = new Netflix(15000L, 1,
                LocalDate.of(2021,11,22));

        Long count = netflix.countEndDate();
        Long expect = 30L;

        Assertions.assertEquals(expect, count);
    }
}
