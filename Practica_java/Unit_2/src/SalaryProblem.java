import java.util.Scanner;

public class SalaryProblem
{
    private static final byte EXTRA_PERCENTAGE = 10;
    private static final byte SOLDS_PER_MONTH = 3;

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        double baseSalary = 0;
        double commisionSalary = 0;
        double totalSalary = 0;

        //setting base salary and commisions

        System.out.print("Set the base salary for the employee: ");

        baseSalary = input.nextDouble();
        commisionSalary = SOLDS_PER_MONTH * baseSalary * EXTRA_PERCENTAGE / 100;

        // Computing total salary

        totalSalary = baseSalary + commisionSalary;
        System.out.printf("\nCommision: %.2f$, \nTotal salary: %.2f$.", commisionSalary, totalSalary);

    }
    

    
}