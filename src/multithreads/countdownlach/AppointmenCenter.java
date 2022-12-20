package multithreads.countdownlach;

import java.time.LocalDate;

public class AppointmenCenter {

    private LocalDate day=LocalDate.now();
    public synchronized LocalDate getAppointmentDate() {
        day= day.plusDays(1);
        return day;
    }


}
