package com.heo.subs.subscribe;

import lombok.Data;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

@Data
public class Netflix implements Subscribe{
    private int price;
    private LocalDate startDate;
    private LocalDate endDate;
    private Period period;

    public Netflix(int price, Period period
            , LocalDate startDate
            , LocalDate endDate){
        this.price = price;
        this.period = period;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public void changePrice(int price) {
        System.out.println("endDate == " + endDate);
        System.out.println("getDay == " + period.getDays());
        System.out.println("getMon == " + period.getMonths());
        endDate = startDate.plusMonths(period.getMonths());
        System.out.println("update endDate == " + endDate);
    }
}
