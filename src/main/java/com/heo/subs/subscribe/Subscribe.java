package com.heo.subs.subscribe;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public interface Subscribe {
    void changePrice(int price);

    default int countEndDate(LocalDate now, LocalDate endDate){
        Long count = ChronoUnit.DAYS.between(now, endDate);

        return count.intValue();
    }
}
