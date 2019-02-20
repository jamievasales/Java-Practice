import java.util.*;

/*
    Simple implementation of an interface:

    Reminder: unless abstract a class that implements
    an interface MUST overide all the methods of the 
    interface. Otherwise, create an abstract class or 
    extend the interface
    
*/

public class implements1 {
    public interface Vehicle {
        public void accelerates();
        public void turns();
        public void start();
        public String vehicleType="";
    }
    
    public class Car implements Vehicle {
        private boolean radioStatus = false;
        public String vehicleType = "Car";
        public void start() {
            System.out.println("The " + vehicleType + " has been started");
        }
        Car() {
            start();
        }
        public void accelerates() {
            System.out.println("We are now accelerating");
        }
    
        public void turns() {
            System.out.println("We are now turning");
        }
    
        public void toggleRadio() {
            radioStatus ^= true;
            String radioStat = (radioStatus==true)?"on":"off";
            System.out.println("The radio is now " + radioStat);
        }
    }

    public static void main(String[] args) {
        try
    {
        implements1 obj = new implements1(); //So we can run non-static objects/ functions
        obj.run (args);
    }
    catch (Exception e)
    {
        e.printStackTrace ();
    }
    }

    public void run (String[] args) throws Exception

    {
        Car theCar = new Car();
        theCar.accelerates();
        theCar.turns();
        theCar.toggleRadio();
        theCar.toggleRadio();
    }
    

    
}