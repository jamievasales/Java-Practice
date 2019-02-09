import java.util.*;

public class Euclid {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Euclid euclidian = new Euclid();
        int num1,num2;
        System.out.println("Please enter two numbers: Biggest to smallest respectively \nPlease hit enter after each number");
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();
        keyboard.close();
        System.out.println("the greatest common divisor is " + Integer.toString(euclidian.euclid(num1,num2)));
    }


        public int euclid(int num1, int num2) {
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