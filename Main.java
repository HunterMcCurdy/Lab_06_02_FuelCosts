import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // declare variables
        int numOfGallons = 0;
        int priceOfGas = 0;
        int fuelEfficiency = 0;
        int distance = 0;
        String trashOne = "";
        String trashTwo = "";
        String trashThree = "";
        Scanner in = new Scanner(System.in);
        // ask and check for the variables
        System.out.println("How much does a gallon of gas cost?");
        if(in.hasNextInt())
        {
            priceOfGas = in.nextInt();
        }
        else
        {
            trashOne = in.nextLine();
            System.out.println("You entered an incorrect variable: " + trashOne);
            // ends program
            System.exit(0);
        }
        System.out.println("How many gallons of gas can your car hold?");
        if(in.hasNextInt())
        {
            numOfGallons = in.nextInt();
        }
        else
        {
            trashTwo = in.nextLine();
            System.out.println("You entered an incorrect variable: " + trashTwo);
            // ends program
            System.exit(0);
        }
        System.out.println("How many miles can you travel with 1 gallon of gas?");
        if(in.hasNextDouble())
        {
            fuelEfficiency = in.nextInt();
            // calculate and print distance and cost
            priceOfGas = priceOfGas * 100;
            distance = fuelEfficiency * numOfGallons;
            System.out.println("Per 100 miles it will cost " + priceOfGas + ". With a full tank you can travel " + distance + " miles.");
        }
        else
        {
            trashThree = in.nextLine();
            System.out.println("You entered an incorrect variable: " + trashThree);
            // ends program
            System.exit(0);
        }


    }
}