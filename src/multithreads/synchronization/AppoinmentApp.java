package multithreads.synchronization;

public class AppoinmentApp {

    //Multithreading programlamada birden fazla Thread aynı anda ortak bir kaynağa erişmeye çalışırsa
//istenmeyen sonuçlar oluşacaktır. Bu durumda threadlere sırayla erişim vermek gerekecektir.
// Bir thread kaynağı kullanıyorken diğerleri onu beklemelidirler. Bu "synchronized" keywordü ile sağlanır.

    /*
    Task: Bir randevu oluşturma uygulaması tasarlayınız.(AppoinmentCenter)
          Uygulama herbir talep için bir gün sonrasına tarih
          vermelidir.
    */
    public static void main(String[] args) {

        String[] users = {"Tolstoy", "VictorHugo", "Belzac", "Dostoyevski", "JohnSteinbeck"};
        AppoinmentCenter appoinmentCenter = new AppoinmentCenter();

        for (String user : users) {

            //anonymous class -> isimsiz thread yaptık
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    Thread.currentThread().setName(users[0]);
                    String name = Thread.currentThread().getName();
                    System.out.format("Sayın %-16s, Randevu tarihiniz: %10s %n", name, appoinmentCenter.getAppoinment());
                }
            });
            thread.start();

        }


    }
}