import java.util.*;
public class Questions {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i =0; i<=n;i++){
            if (isArmestrong(i)){
                System.out.println( i  );
            }
            
        }

    }

    static boolean isArmestrong(int n){
        int original = n ;
        int sum = 0;
        while(n>0){
            int reminder =  n % 10;
            n=n/10;
            sum+= reminder*reminder*reminder;
            
        }
        return sum == original;
    }
}
