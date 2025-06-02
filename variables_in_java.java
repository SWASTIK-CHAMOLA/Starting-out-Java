//Primitive = simple value stored directly in memory (stack) eg --> int, double, char, boolean
//Reference = memory address (stack) that points to the (heap) eg --> string, array, obj
/* STEPS TO CREATE VARIABLE
1. declaration
2. assignment
* */

public class variables_in_java {
    public static void main(String[] args){
        int age = 18;
        System.out.println(age);
        System.out.println("the age of viewer is " + age);
        double price = 19.9;
        System.out.println("stores decimal values " + price);
        char grade = 'A';
        System.out.println("grade scored is "+ grade);
        boolean isRain = false;
        boolean isOnline = true;
        System.out.println(isRain);
        System.out.println(isOnline);

        if (isOnline){
            System.out.println("He is online(if true)");
        }
        if (isRain){
            System.out.println("it is raining");
        }
        else {
            System.out.println("It is not raining(if false)");
        }

    }


}
