import java.util.Scanner;

public class unitconverter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the unit you want to convert from:");
        System.out.println("A - feet to meters");
        System.out.println("B - pounds to kilograms");
        System.out.println("C - fahrenheit to celcius");

        String initialunit = scanner.nextLine().toUpperCase();
        System.out.println("Enter the quantity to be converted: ");
        double quantity = scanner.nextDouble();
        
        conversion(initialunit, quantity);
        scanner.close();
    }

    public static double conversion(String initialunit, double quantity) {
        switch (initialunit) {
            case "A":
                System.out.println(Math.round((quantity * 0.3048)) + " meters");
                break;
            case "B":
                System.out.println(Math.round((quantity * 0.453592)) + " Kg");
                break;
            case "C":
                System.out.println(Math.round(((quantity - 32)) * 5 / 9) + " Celcius");
                break;
        }
        return -1; 
    }

}

