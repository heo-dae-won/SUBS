package com.heo.subs.subscribe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.Period;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("테스트를 위한 테스트")
@SpringBootTest
public class SubcsribeTest {

    @DisplayName("현재일로부터 종료일까지 남은일수 계산")
    @Test
    void countDateTest(){
        int price = 1;
        Period period = Period.ofMonths(1);
        LocalDate startDate = LocalDate.of(2021,11,23);
        LocalDate endDate = LocalDate.of(2021,11,24);
        LocalDate now = LocalDate.of(2021, 11,23);

        Netflix netflix =
                new Netflix(price, period, startDate, endDate);

        int count = netflix.countEndDate(now, endDate);
        int expect = 1;

        assertEquals(expect, count);

        Netflix netflix2 =
                new Netflix(price, period, startDate,endDate);

        now = LocalDate.of(2021, 11,24);

        int count2 = netflix2.countEndDate(now, endDate);
        int expect2 = 0;

        assertEquals(expect2, count2);
    }

    // @Disabled --> 미완성 테스트에 작성하기
    @Test
    @DisplayName("새로운 종료일 계산하기")
    void endDateUpdate(){
        Netflix netflix =
                new Netflix(15000, Period.ofMonths(1), LocalDate.of(2021,11,22), null);

        netflix.changePrice(0);
    }

    @Test
    //@DisplayName("2 + 1 = 3일 것인가?")
    void two_Plus_One(){
        int num1 = 2;
        int num2 = 1;
        int result = num1 + num2;
        int expected = 3;
        assertEquals(expected, result);
    }


}
