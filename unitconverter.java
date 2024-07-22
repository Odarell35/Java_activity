import java.util.Scanner;

public class unitconverter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the unit you want to convert from:");
        System.out.println("A - feet");
        System.out.println("B - pounds");
        System.out.println("C - fahrenheit");

        String initialunit = scanner.nextLine().toUpperCase();

        System.out.println("Enter the unit you want to convert to: ");
        System.out.println("A - Meter");
        System.out.println("B -   Kilograms");
        System.out.println("C - To Celsius");
        String finalunit = scanner.nextLine().toUpperCase();

        System.out.println("Enter the quantity to be converted: ");
        double quantity = scanner.nextDouble();

        double result = conversion(initialunit, finalunit, quantity);

        if (result != -1) {
            System.out.printf("Converted value: %.2f %s%n", result, initialunit);
        } else {
            System.out.println("Invalid conversion units provided.");
        }

        scanner.close();
    }

    public static double conversion(String initialunit, String finalunit, double quantity) {
        switch (initialunit) {
            case "A":
                if (finalunit.equals("meters")) {
                    return feetToMeters(quantity);
                }
                break;
            case "B":
                if (finalunit.equals("kgs")) {
                    return poundsToKgs(quantity);
                }
                break;
            case "C":
                if (finalunit.equals("C")) {
                    return fahrenheitToCelsius(quantity);
                }
                break;
        }
        return -1; 
    }

    public static double feetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static double poundsToKgs(double pounds) {
        return pounds * 0.453592;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}

