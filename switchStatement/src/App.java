import java.util.Scanner;

public class App {
     public static void main(String[] args) throws Exception {

         Scanner in = new Scanner(System.in);

        /*****************************Program 1-Display shape of fruit***********/


        /*****************************OLD SYNTAX OF SWITCH  ****************/
        //String fruit = in.next();
        // switch(fruit) {
        //     case "Banana": 
        //         System.out.println("yellow fruit");
        //         break;
        //     case "Apple": 
        //         System.out.println("Green fruit");
        //         break;
        //     case "Orange":
        //         System.out.println("Orange fruit");
        //         break;
        //     default:
        //         System.out.println("no fruit on the basket!");
        // }

        /*****************************NEW SYNTAX OF SWITCH  ****************/
        //   switch(fruit) {

        //     case "Manga" -> System.out.println("meduim fruit");
        //     case "Watermelon" -> System.out.println("big watermelon");
        //     case "Grapes" -> System.out.println("small fruit");
        //     default -> System.out.println("no fruit on the basket!");

        //   }
        
        /*****************************Program 2-Display Day Name***********/

          int day = in.nextInt();

        //   switch(day) {
        //     case 1 -> System.out.println(" this is Monday ");
        //     case 2 -> System.out.println(" this is Tuesday ");
        //     case 3 -> System.out.println(" this is Thursday ");
        //     case 4 -> System.out.println(" this is Wednesday ");
        //     case 5 -> System.out.println(" this is Friday ");
        //     case 6 -> System.out.println(" this is Saturday ");
        //     case 7 -> System.out.println(" this is Sunday ");
        //     case 0 -> System.out.println(" Please type another number ");
        //   }

        /*****************************Program 3-Display Weekdays & weekend***********/

        switch(day) {
            case 1, 2, 3, 4, 5 -> System.out.println("this is a regular weekday");
            case 6,7 -> System.out.println("this is the weekend YAY !");
        }

     }
}
 