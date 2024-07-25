package Java;
import java.util.Scanner;
public class Temperature_Convertor {
	 static double celsiusToFahrenheit(double celsius) {
	    return (celsius * 9/5) + 32;
	}
	 static double fahrenheitToCelsius(double fahrenheit) {
	    return (fahrenheit - 32) * 5/9;
	}
	 static double celsiusToKelvin(double celsius) {
	    return celsius + 273.15;
	}
	 static double kelvinToCelsius(double kelvin) {
	    return kelvin - 273.15;
	}
	 static double fahrenheitToKelvin(double fahrenheit) {
	    return (fahrenheit - 32) * 5/9 + 273.15;
	}
	 static double kelvinToFahrenheit(double kelvin) {
	    return (kelvin - 273.15) * 9/5 + 32;
	}
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Temperature Convertor ");
			System.out.println("Choose its type");
			System.out.println("1. 	Celsius to Farhenheit");
			System.out.println("2.  fahrenheitToCelsius ");
			System.out.println("3.  celsiusToKelvin");
			System.out.println("4.  kelvinToCelsius");
			System.out.println("5.  fahrenheitToKelvin");
			System.out.println("6.  kelvinToFahrenheit");
            int choice = sc.nextInt();
            if (choice == 7) {
                System.out.println("Exiting the program.");
                break;
            }
            System.out.print("Enter the temperature value: ");
            double temperature = sc.nextDouble();
            
            switch (choice) {
                case 1:
                    System.out.printf("Result: %.2f Fahrenheit\n", celsiusToFahrenheit(temperature));
                    break;
                case 2:
                    System.out.printf("Result: %.2f Celsius\n", fahrenheitToCelsius(temperature));
                    break;
                case 3:
                    System.out.printf("Result: %.2f Kelvin\n", celsiusToKelvin(temperature));
                    break;
                case 4:
                    System.out.printf("Result: %.2f Celsius\n", kelvinToCelsius(temperature));
                    break;
                case 5:
                    System.out.printf("Result: %.2f Kelvin\n", fahrenheitToKelvin(temperature));
                    break;
                case 6:
                    System.out.printf("Result: %.2f Fahrenheit\n", kelvinToFahrenheit(temperature));
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
		}
    }
