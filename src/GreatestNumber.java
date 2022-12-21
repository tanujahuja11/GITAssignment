
import java.util.Scanner;

public class GreatestNumber {

    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        float first = sc.nextFloat();
        System.out.println("Enter Second number");
        float second = sc.nextFloat();
        System.out.println("Enter Third number");
        float third = sc.nextFloat();

        if(first >= second && first >= third)
        {
            System.out.println("Greatest number is :"+first);
        }
        else if(second >= first && second >= third)
        {
            System.out.println("Greatest number is :"+second);
        }
        else{
            System.out.println("Greatest number is : "+third);
        }





    }



}
