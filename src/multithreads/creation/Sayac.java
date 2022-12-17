package multithreads.creation;

public class Sayac extends Thread{

    private String name;

    public Sayac(String name) {
        this.name = name;
    } // constructor yapmamizin sebebi threadlere siim vermek istedik o yuzden

    @Override
    public void run() {
        System.out.println(this.name+" basladi");
        for (int i = 1; i <101 ; i++) {
            System.out.println(this.name+" - " + i);
        }
        System.out.println(this.name+" bitirdi");

    }
}
