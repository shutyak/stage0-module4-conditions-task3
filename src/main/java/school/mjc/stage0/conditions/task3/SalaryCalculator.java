package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
//        Basic Salary <= 10000: taxes - 15%. 10000 < Basic Salary <= 20000: taxes - 18% Basic Salary > 20000 : taxes - 20% Basic salary < 0 -> "wrong input!"
        if (salary<0) System.out.println("wrong input!");
        else if (salary<=10000) {
            System.out.println(salary*.85);
        } else if (salary<=20000) {
            System.out.println(salary*.82);
        } else System.out.println(salary*.80);
    }
}
