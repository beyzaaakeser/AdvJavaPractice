package multithreads.creation;

public class Counter implements Runnable {

    private String harf;

    public Counter(String harf) {
        this.harf = harf;
    }

    @Override
    public void run() {
        System.out.println(this.harf + " basladi" );
        for (char i = 'a'; i <='z' ; i++) {
            System.out.println(this.harf +" - "+ i);
        }
        System.out.println(this.harf + " bitirdi" );
    }
}
