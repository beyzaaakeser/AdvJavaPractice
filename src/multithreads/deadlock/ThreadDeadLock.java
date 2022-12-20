package multithreads.deadlock;

public class ThreadDeadLock {


    // Runa basinca durmuyor onun cozumunu WithoutDeadLock ile yaptik


/*
Ölümcül kilitlenme, iki veya daha fazla işlemin karşılıklı olarak birbirlerinin kilitlediği kaynaklara
erişmek istemesiyle oluşur.
Her iki işlem de sürekli birbirlerini beklediği için sistem kaynakları olumsuz yönde etkilenir.
Özellikle sunucunun işlemci değeri boşuna harcanmış olur.
Bu da, sunucunun performansını olumsuz yönde etkiler ve sunucuyu cevap veremez duruma bile getirebilir.
 */

/*
senaryo: tom ve jerry
tom: silgi kullanıyor, kaleme ihtiyacı  var ama kalemi köpek kullanıyor
jerry: cetveli kullanıyor, silgiye ihtiyacı  var ama silgiyi tom kullanıyor
dog: kalemi kullanıyor cetvele ihtiyacı  var ama cetveli jerry kullanıyor
 */

    public static void main(String[] args) {
        String kalem = "kalem";
        String cetvel = "cetvel";
        String silgi = "silgi";
        Thread t1 = new Thread(new SyncThread(kalem,cetvel),"Dog");
        Thread t2 = new Thread(new SyncThread(silgi,kalem),"Tom");
        Thread t3 = new Thread(new SyncThread(cetvel,silgi),"Jerry");
        t1.start();
        t2.start();
        t3.start();
    }
}


class SyncThread implements Runnable{

    private String obj1;
    private String obj2;

    public SyncThread(String obj1, String obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+" "+obj1+"i istiyor. ");
        synchronized (obj1){// baska thread bu objeye ulasamasin ben kullanicam demek bu
            System.out.println(name+" "+obj1+"i aldi. ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name+" "+obj2+"i istiyor. ");
            synchronized (obj2){// baska thread bu objeye ulasamasin ben kullanicam demek bu
                System.out.println(name+" "+obj2+"i aldi. ");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(name+" "+obj2+" i birakti. ");
        }
            System.out.println(name+" "+obj1+"i birakti. ");
            System.out.println(name+" calismayi tamamladi. ");
    }
  }
}