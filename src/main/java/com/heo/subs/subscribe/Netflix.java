package com.heo.subs.subscribe;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Netflix implements Subscribe{
    private Long price;
    private LocalDate startDate;
    private LocalDate endDate;
    private Period period;

    public Netflix(Long price, int period
            , LocalDate startDate){
        this.price = price;
        this.startDate = startDate;
        this.endDate = startDate.plusMonths(Period.ofMonths(period).getMonths());
    }

    @Override
    public Long countEndDate() {
        return ChronoUnit.DAYS.between(LocalDate.now(), endDate);
    }

    @Override
    public void changePrice(Long price) {
        this.price = price;
    }
}
