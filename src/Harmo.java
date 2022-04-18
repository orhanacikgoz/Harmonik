import java.util.Scanner;


public class Harmo {
    public static void main(String[] args) {
        double a, toplam=0;

        System.out.println("Bir sayi girin: ");
        Scanner inp=new Scanner(System.in);
        a=inp.nextDouble();


        for (double i=1; i<=a; i++){
            toplam=toplam +(1.0/i);

        }
        System.out.println(toplam);







    }
}
