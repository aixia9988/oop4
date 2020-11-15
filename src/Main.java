import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hur många vavor du har köpt: ");
        int amount = 0;
        amount = Integer.parseInt(scanner.next());  // Sting to int

        System.out.print("Total kostnad för dessa vavor: ");
        double cost = 0;
        cost = Double.parseDouble(scanner.next());   // sting to double

        ShopOffer offer = new ShopOffer(amount, cost);
        offer.calculate();     // ring upp caclculate metod

        System.out.println("Ordern är " + offer.getOffInPercents() + "% off, den riktiga kostnaden blir: " + offer.getActualPaid());


    }

}

