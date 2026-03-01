import java.util.Scanner;
public class OperationMenu
{
    public static void main(String[]args)
    {
        //variables and object
        Scanner sc = new Scanner(System.in);
        int num1,num2,suma,resta,multiplicacion,division;
        String option;

        //Problem resolution
        do { 
            System.out.println("------MENÚ------");
            System.out.println("----------------");
            System.out.println("- SUMA : 1");
            System.out.println("- RESTA : 2");
            System.out.println("- MULTIPLICACIÓN : 3");
            System.out.println("- DIVISIÓN : 4");
            System.out.println("- SALIR : S");
            System.out.println("----------------");

            System.out.println("Choose an option: ");
            option = sc.nextLine();

            switch (option){
                case "1":
                    System.out.println("Write one number: ");
                    num1 = sc.nextInt();
                    System.out.println("Write other number: ");
                    num2 = sc.nextInt();

                    System.out.println("Suma: ");
                    suma = num1 + num2;
                    System.out.println(suma);
                break;
                case "2":
                    System.out.println("Write one number: ");
                    num1 = sc.nextInt();
                    System.out.println("Write other number: ");
                    num2 = sc.nextInt();

                    System.out.println("Resta: ");
                    resta = num1 - num2;
                    System.out.println(resta);
                break;
                case "3":
                    System.out.println("Write one number: ");
                    num1 = sc.nextInt();
                    System.out.println("Write other number: ");
                    num2 = sc.nextInt();

                    System.out.println("Multiplicación: ");
                    multiplicacion = num1 * num2;
                    System.out.println(multiplicacion);
                break;
                case "4":
                    System.out.println("Write one number: ");
                    num1 = sc.nextInt();
                    System.out.println("Write other number: ");
                    num2 = sc.nextInt();

                    System.out.println("División: ");
                    division = num1 / num2;
                    System.out.println(division);
                break;
                case "S":
                break;
                default:
                    System.out.println("The option was incorrect");
            }
        } while (!option.equals("S"));

        System.out.println("You close the program");
    }
}