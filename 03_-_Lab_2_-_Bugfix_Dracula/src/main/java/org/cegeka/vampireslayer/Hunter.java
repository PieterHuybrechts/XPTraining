package org.cegeka.vampireslayer;

import java.util.Calendar;
import java.util.Date;

public class Hunter {
    public boolean canHunt(Date huntingTime) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(huntingTime);
        int huntingHour = calendar.get(Calendar.HOUR_OF_DAY);
        return huntingHour > 0 && huntingHour < 6;
    }
}
