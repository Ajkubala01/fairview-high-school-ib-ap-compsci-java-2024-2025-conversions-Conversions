import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Adam Kubala
 * @version 8/20/2025
 */ //
public class Conversions
{
    public static void main(String[] args)
    {
        boolean running = true;
        while (running == true){
        
        
        Scanner keyboard = new Scanner(System.in);

        for (int j = 0; j < 4; ++j){
        System.out.println("");
        }
        
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println("7. Millimeters to Inches");
        System.out.println("8. Inches to Millimeters");
        System.out.println("9. Feet to Kilometers");
        System.out.println("10. Kilometers to Feet");
        System.out.println("11. Exit");
        //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
        //You can add even more if you would like.

        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the endline and be ready for more input

        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit");
        }
        if (selection == 2)
        {
            System.out.println("Enter Fahrenheit: ");
            double fahrenheit = keyboard.nextDouble();
            keyboard.nextLine();
            double celsius = (fahrenheit - 32) * (5.0 / 9.0);
            System.out.println(fahrenheit + " degrees Fahrenheit is " + celsius + " degrees Celsuis");
        }
        if (selection == 3)
        {
            System.out.println("Enter Feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = feet / 3.281;
            System.out.println(feet + " Feet is " + meters + " Meters");
        }
        if (selection == 4)
        {
            System.out.println("Enter Meters: ");
            double meters = keyboard.nextDouble();
            keyboard.nextLine();
            double feet = meters * 3.281;
            System.out.println(meters + " Meters is " + feet + " Feet");
        }
        if (selection == 5)
        {
            System.out.println("Enter Ounces: ");
            double ounces = keyboard.nextDouble();
            keyboard.nextLine();
            double milliliters = ounces * 29.574;
            System.out.println(ounces + " Ounces is " + milliliters + " Milliliters");
        }
        if (selection == 6)
        {
            System.out.println("Enter Milliliters: ");
            double milliliters = keyboard.nextDouble();
            keyboard.nextLine();
            double ounces = milliliters / 29.574;
            System.out.println(milliliters + " Milliliters is " + ounces + " Ounces");
        }
        if (selection == 7)
        {
            System.out.println("Enter Millimeters: ");
            double millimeters = keyboard.nextDouble();
            keyboard.nextLine();
            double inches = millimeters / 25.4;
            System.out.println(millimeters + " Millimeters is " + inches + " Inches");
        }
        if (selection == 8)
        {
            System.out.println("Enter Inches: ");
            double inches = keyboard.nextDouble();
            keyboard.nextLine();
            double millimeters = inches * 25.4;
            System.out.println(inches + " Inches is " + millimeters + " Millimeters");
        }
        if (selection == 9)
        {
            System.out.println("Enter Feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double kilometers = feet / 3280.84;
            System.out.println(feet + " Feet is " + kilometers + " Kilometers");
        }
        if (selection == 10)
        {
            System.out.println("Enter Kilometers: ");
            double kilometers = keyboard.nextDouble();
            keyboard.nextLine();
            double feet = kilometers * 3280.84;
            System.out.println(kilometers + " Kilometers is " + feet + " Feet");
        }
        if (selection == 11)
        {
            running = false;
        }
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
        
        //add more if statements here.
    }
}