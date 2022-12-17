package multithreads.creation;

public class ThreadCreation3 {

    //Task4: anonymous class kullanarak thread oluşturunuz.
    //       lambda expression kullanarak thread oluşturunuz.

    public static void main(String[] args) {

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("Tweety");
                String name = Thread.currentThread().getName();
                for (int i = 1; i <101 ; i++) {
                    System.out.println(name+" : kaciyorum...");
                }
            }
        });

        Thread thread2=new Thread(()->{
            Thread.currentThread().setName("Slyvester");
            String name = Thread.currentThread().getName();
            for (int i = 1; i <101 ; i++) {
                System.out.println(name+" : yakalayacagim...");
            }
        });
        thread1.start();
        thread2.start();





    }





}
