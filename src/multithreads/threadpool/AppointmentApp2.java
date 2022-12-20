package multithreads.threadpool;

/*
Thread yaratmak cidden maliyetli bir olaydır. Her Thread için sistemde belli bir kaynak ayrılır.
Bu kaynaklar CPU, Hafıza gibi önemli olanlardır. Uygulamamız çalışırken belli miktarda bir Thread
ile sınırlandırmak isteyebiliriz.

Bu nedenle Thread havuzu oluşturup bu havuzu önceden oluşturulmuş ve kullanıma hazır Thread nesneleri
ile doldururuz. Böylece, performans kazanımı ve sistem kaynaklarının verimli kullanımını sağlayabiliriz.

Task: Bir randevu oluşturma uygulaması tasarlayınız.(AppoinmentCenter)
      Uygulama herbir talep için bir gün sonrasına tarih
      vermelidir. 5 kişi için randevu alınmak isteniyor.
      Thread havuzu oluşturup işleri 3 threade yaptırınız.
*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AppointmentApp2 {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3); // 3 threadlik havuz olusturduk
        String[] users = {"Tolstoy","Balzac","VictorHugo","C.Dickens","Dostoyevski"};
        AppointmentCenter2 appointmentCenter = new AppointmentCenter2();
        for (String user: users){
            MyThread thread = new MyThread(appointmentCenter);
            service.execute(thread); // execute methodu hazir nesnelerin havuza atilmasini sagliyor.
        }
        service.shutdown();
    }
}


class MyThread extends Thread{
    private AppointmentCenter2 appointmentCenter;

    public MyThread(AppointmentCenter2 appointmentCenter) {
        this.appointmentCenter = appointmentCenter;
    }

    @Override
    public void run() {
       String tname=Thread.currentThread().getName();
        System.out.println(" ++ "+tname+" isleme basladi");
        System.out.println("Randevu tarihiniz: "+ appointmentCenter.getAppointmentDate());
        System.out.println(" -- "+tname+" bitti");
    }
}
