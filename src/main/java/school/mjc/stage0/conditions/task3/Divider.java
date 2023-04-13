package school.mjc.stage0.conditions.task3;

public class Divider {
    public void isDividableBy5And11(int number) {
//        argument is divisible by 5 and 11 or not by using if-else(print "Dividable" if so otherwise "Non-dividable" and if 0 -> "cannot divide by zero"):
        if (number==0) System.out.println("cannot divide by zero");
        else if (number%55==0) {
            System.out.println("Dividable");
        }else System.out.println("Non-dividable");
    }
}
