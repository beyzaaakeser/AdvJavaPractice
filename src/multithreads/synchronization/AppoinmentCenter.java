package multithreads.synchronization;

import java.time.LocalDate;

public class AppoinmentCenter {

    private LocalDate day=LocalDate.now();//19.12.22

    public synchronized LocalDate getAppoinment() {

        day=day.plusDays(1);

        return day;
    }



}
