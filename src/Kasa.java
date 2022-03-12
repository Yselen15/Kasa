import java.util.Scanner;

public class Kasa {
    public static void main(String[] args){
        float Armut, Elma, Domates, Muz, Patlican, Total;

        Scanner inp = new Scanner(System.in);

        System.out.println("Kaç kilo armut ? :");
        Armut = inp.nextFloat();

        System.out.println("Kaç kilo Elma ? :");
        Elma = inp.nextFloat();

        System.out.println("Kaç kilo Domates ? :");
        Domates = inp.nextFloat();

        System.out.println("Kaç kilo Muz ? :");
        Muz = inp.nextFloat();

        System.out.println("Kaç kilo Patlican ? :");
        Patlican = inp.nextFloat();

       Total = (Armut * 2.14f) + (Elma * 3.67f) + (Domates * 1.11f) + (Muz * 0.95f) + (Patlican * 5f);

       System.out.println("Tutar" +Total+ "TL");

    }
}
