import java.util.Scanner;

public class unitconverter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the unit you want to convert from (feet, pounds, fahrenheit): ");
        String initialunit = scanner.nextLine().toLowerCase();

        System.out.println("Enter the unit you want to convert to (meters, kgs, celsius): ");
        String finalunit = scanner.nextLine().toLowerCase();

        System.out.println("Enter the quantity to be converted: ");
        double quantity = scanner.nextDouble();

        double result = convert(initialunit, finalunit, quantity);

        if (result != -1) {
            System.out.printf("Converted value: %.2f %s%n", result, initialunit);
        } else {
            System.out.println("Invalid conversion units provided.");
        }

        scanner.close();
    }

    public static double convert(String initialunit, String finalunit, double quantity) {
        switch (initialunit) {
            case "feet":
                if (finalunit.equals("meters")) {
                    return feetToMeters(quantity);
                }
                break;
            case "pounds":
                if (finalunit.equals("kgs")) {
                    return poundsToKgs(quantity);
                }
                break;
            case "fahrenheit":
                if (finalunit.equals("celsius")) {
                    return fahrenheitToCelsius(quantity);
                }
                break;
        }
        return -1; // Invalid conversion
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

