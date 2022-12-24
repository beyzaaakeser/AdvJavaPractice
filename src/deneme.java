public class deneme <T> {
/*
Encapsulation hakkında;
Encapsulation nesneler için bir koruma kalkanı görevi görür ve nesneler ile ilgili
anlamsızlıkları ve oluşabilecek hataları önlememizi sağlar.
Örneğin elimizde kitap isimli bir class ve sayfa sayını kullanıcıdan aldığımız bir constructor var.
 Kullanıcı sayfa sayısına negatif bir değer girebilir. Peki bu durumu nasıl engelleyeceğiz?
 Constructor içerisine ekleyeceğimiz bir if statement ile sayı negatif ise onu sıfıra veya
farklı bir sayıya çevirebiliriz.
Fakat böyle yaptık diyelim, bu değişkeni daha sonra, yani obje oluşturduktan sonra yeniden
negatif bir sayıya çevirmek mümkün olacaktır. Zira değişkenimiz public’tir. Bu durumu önlemek
için değişkeni private yapabiliriz. Böylelikle, obje oluşturulduktan sonra bu değişkene müdahale
etmek mümkün olmayacaktır.
Fakat burada da ikinci bir problem ortaya çıkmaktadır. Şöyle ki, bu değişken private olduğu
için farklı class’lardan ona erişmek mümkün olmayacaktır. Yani kitap objesi üzerinden sayfa
sayısını görmek mümkün olmayacaktır.
İşte burada encapsulation işlemi devreye giriyor. Oluşturacağımız getter ve setter metodlar
ile bu değerin görüntülenmesini ve daha da önemlisi değiştirilmesi konusunda dikkat edilmesi
gereken şartları belirleyebiliriz. Ve obje üzerinde oluşabilecek anlamsızlıklar ve problemler
 hakkında hiç bir açık kapı bırakmamış oluruz.
Bu, kullanıcı objeyi oluşturduktan sonra bile, sayfa sayısını negatif yapmaya çalıştığında
gereken müdahaleyi yapabileceğimiz anlamına geliyor.
 */

    public static void main(String[] args) {


        String[] stdList={"Rafael","Donatello","Leonardo","Michelangelo"};
        Double[] pointList={95.5,70.0,65.6,58.0};
        Character[] gradeList={'A','B','C','B'};

        //1-tüm listeleri yazdır
        printArray(stdList);
        printArray(pointList);
        printArray(gradeList);



    }

    public static <T> void printArray(T[] array){
        for (int i=0; i< array.length ; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }

}