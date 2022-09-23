import java.util.Scanner;

public class NestedSwitch {

    public static void main(String[] args) throws Exception {
    System.out.println("Please inter a valid id:");
     Scanner in = new Scanner(System.in);
     int empID = in.nextInt();
     String departement = in.next();

     switch(empID){
        case 1 -> System.out.println("this is Sara NAIFAR");
        case 2 -> System.out.println("this is Childish Gambino ");
        case 3 -> {
            System.out.println("the empID is 3");
            switch(departement){
                case "IT" -> System.out.println(" this is IT departement");
                case "Management" -> System.out.println("this is management departement");
                default -> System.out.println("please inter name of departement");
            }
        }
        default -> System.out.println("this employee doesnt exist!");
     }



    }
    
}
