import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    double gasTank = 0.0;
    double fuelEff = 0.0;
    double galPrice = 0.0;
    double travelCost = 0.0;
    double milesGo = 0.0;
    boolean done1 = false;
    boolean done2 = false;
    boolean done3 = false;


        do {
            System.out.println("Enter the number of gallons your tank can hold: ");
            if(in.hasNextDouble()){
                gasTank = in.nextDouble();
                in.nextLine();
                done1 = true;
            }else {
                System.out.println("Invalid input. Please enter a valid number.");
                in.nextLine();
            }
        }while(!done1);

        do {
            System.out.println("Enter your machine's fuel efficiency in miles per gallon: ");
            if(in.hasNextDouble()){
                fuelEff = in.nextDouble();
                in.nextLine();
                done2 = true;
            }else {
                System.out.println("Invalid input. Please enter a valid number.");
                in.nextLine();
            }
        }while(!done2);

        do {
            System.out.println("Enter the current price of a gallon of gas: ");
            if(in.hasNextDouble()){
                galPrice = in.nextDouble();
                in.nextLine();
                done3 = true;
            }else {
                System.out.println("Invalid input. Please enter a valid number.");
                in.nextLine();
            }
        }while(!done3);

        travelCost = (100/fuelEff) * galPrice;
        milesGo = gasTank * fuelEff;
        String travelCostDisplay = String.format("%5.2f", travelCost);
        String milesGoDisplay = String.format("%5.1f", milesGo);

        System.out.println("It would cost " + travelCostDisplay + " to go 100 miles in your machine.");
        System.out.println("Your machine can go " + milesGo + " miles on a full tank of gas.");



    }
}