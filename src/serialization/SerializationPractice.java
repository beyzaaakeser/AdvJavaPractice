package serialization;

import java.io.*;

public class SerializationPractice {

    // TASK :
    // Book tipinde nesneler uretip bu nesneleri books.txt dosyasina kaydedin ve
    // daha sonra bu dosyadan nesneleri okuyun

    public static void main(String[] args) {
        // writeObject();
            readObject();

    }


    public static void writeObject(){
        Book book1 = new Book("Sefiller","Victor Hugo",1945);
        Book book2 = new Book("Suc ve Ceza","Dostoyevski",1955);
        Book book3 = new Book("Savas ve Baris","Tolstoy",1940);

        try {
            // nesneleri yazdiracagimiz dosyayi yazdirmak icin
            FileOutputStream fos = new FileOutputStream("books.txt");

            // nesneleri yazdirmak icin
            ObjectOutputStream write = new ObjectOutputStream(fos);
            write.writeObject(book1);
            write.writeObject(book2);
            write.writeObject(book3);

            write.close();
            fos.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    public static void readObject(){


        try {
            // nesneleri okuyacagimiz dosyayi okur
            FileInputStream fis = new FileInputStream("books.txt");
            // nesneleri okumak icin
            ObjectInputStream read = new ObjectInputStream(fis);
            Book book1 = (Book) read.readObject();
            Book book2 = (Book) read.readObject();
            Book book3 = (Book) read.readObject();

            System.out.println(book1);
            System.out.println(book2);
            System.out.println(book3);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


}
