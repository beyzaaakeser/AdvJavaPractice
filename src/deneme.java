public class deneme <T> {


    public static void main(String[] args) {

        System.out.println("Generic yapilar");
        sum(25);
    }

    public static void sum(int t){
        if(t>0){
            System.out.print(t + " ");
            t=t-1;
            sum(t);
        }



    }

}
