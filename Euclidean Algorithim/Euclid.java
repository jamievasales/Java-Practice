import java.util.*;

public class Euclid {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //Euclid euclidian = new Euclid();
        int num1=0,num2=0;
        System.out.println("Please enter two numbers: Please hit enter after each number");
        try {
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();
        }
        catch(Exception e) { //Exit gracefully with useful feedback
            System.out.println("Please enter two integers. Please check input before submitting");
            System.exit(0);
        }
        keyboard.close();
        System.out.println("the greatest common divisor is " + Integer.toString(euclid(num1,num2)));
    }


        public static int euclid(int num1, int num2) {
            if(num2==1)
            return 1;
            else if(num1%num2==0) {
                return num2;
            }
            else {
                return euclid(num2,num1%num2);
            }
        }
}