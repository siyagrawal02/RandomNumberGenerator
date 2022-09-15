import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {
    public static void main(String[] args) {

        //creating the scanner class object for taking the user input
        Scanner object=new Scanner(System.in);
        Random randomObject=new Random();

        //using try catch to avoid exception caused by unsuccessful conversion of string to int, long, float or double
        try{

            System.out.println("Enter lower limit for integer: ");
            int intLowerLimit=object.nextInt();
            System.out.println("Enter upper limit for integer: ");
            int intUpperLimit=object.nextInt();
    
            System.out.println("Enter lower limit for long: ");
            long longLowerLimit=object.nextLong();
            System.out.println("Enter upper limit for long: ");
            long longUpperLimit=object.nextLong();

            System.out.println("Enter lower limit for double: ");
            double doubleLowerLimit=object.nextDouble();
            System.out.println("Enter upper limit for double: ");
            double doubleUpperLimit=object.nextDouble();

            object.close();

            System.out.println("Random int number is: "+ randomObject.ints(intLowerLimit,intUpperLimit+1).findFirst().getAsInt());
            System.out.println("Random long number is: "+ randomObject.longs(longLowerLimit,longUpperLimit+1).findFirst().getAsLong());
            System.out.println("Random double number is: "+ randomObject.doubles(doubleLowerLimit,doubleUpperLimit).findFirst().getAsDouble());
            
        }
        catch(Exception e){
            System.out.println("Invalid input!!!!!!!!!!!");
        }
    }
}
