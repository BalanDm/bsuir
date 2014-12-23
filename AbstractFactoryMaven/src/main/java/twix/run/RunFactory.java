package twix.run;
import twix.factory.TypeOfFactory;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by L650 on 17.10.14.
 */
public class RunFactory {
    public static void main(String args[]){
        int randomNumber,choice;
        boolean repeat=true;
        Scanner in=new Scanner(System.in);
        TypeOfFactory type;
        System.out.println("Hello this is Twix's shop!");
        while(repeat){
            System.out.println("\n1)Order Twix.");
            System.out.println("2)Exit.\n");
            System.out.println("Make a choice: ");
            choice=in.nextInt();
            switch(choice)
            {
                case 1:
                    CreateTwix twix=new CreateTwix();
                    Random rand= new Random();
                    randomNumber=rand.nextInt(2);
                    if(randomNumber==1){
                        type=TypeOfFactory.right;
                        twix.Create(type);
                    }
                    else if(randomNumber==0){
                        type=TypeOfFactory.left;
                        twix.Create(type);
                    }
                break;
                case 2:
                    repeat=false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Input Err!");
            }
        }
        }
}
