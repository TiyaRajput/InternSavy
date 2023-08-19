import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("=====================");

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("3. Celcius to kelvin");
            System.out.println("4. Kelvin to Celcius ");
            System.out.println("5. Kelvin to Fahrenheit");
            System.out.println("6. Fahrenheit to Kelvin");
            System.out.println("7. Exit");
            int choice;
            do{
            System.out.println("Enter your choice ");  
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                double celsius = (fahrenheit - 32) * 5/9;
                System.out.println("Temperature in Celsius: " + celsius);
            } else if (choice == 2) {
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
            }else if(choice == 3){
                System.out.println("Enter temperature in celcius : ");
                double celsius = scanner.nextDouble();
                double kelvin = (celsius + 273.15);
                System.out.println("Temprature in kelvin : " + kelvin); 
            }else if(choice == 4){
                System.out.println("Enter temperature in kelvin : ");
                double kelvin = scanner.nextDouble();
                double celsius = (kelvin - 273.15);
                System.out.println("Temprature in kelvin" + celsius);
            }else if(choice == 5){
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                double kelvin = (fahrenheit - 32) * 5/9 + 273.15;
                System.out.println("Temprature in kelvin : " + kelvin); 
            }else if(choice == 6){
                System.out.println("Enter temperature in kelvin : ");
                double kelvin = scanner.nextDouble();
                double fahrenheit = (kelvin - 273.15) * 9/5 + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
            }
            else if (choice == 7) {
                System.out.println("Exiting the program.");
                break;
            } else {
                System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
        while(choice !=7);
        //scanner.close();
    }
}
}