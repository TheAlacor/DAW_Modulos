import java.util.Arrays;
import java.util.Scanner;

public class Burbuja
{
    public static void main(String[] args)
    {
        int[] arrayNum = {4,7,9,1,-3,6,2};


        // Array sin ordenar

        System.out.print("Array sin ordenar\n");
        System.out.println(Arrays.toString(arrayNum));
        System.out.println();
        // Array en proceso 
        burbuja(arrayNum);

        System.out.println("Ordenado");
        System.out.println(Arrays.toString(arrayNum));
            
    }

    public static int[] burbuja(int [] arrayNum)
    {
        Scanner sc = new Scanner(System.in);
        int num;
        int[] vector; 

        for(int i=1;i < arrayNum.length;i++)
        {
            for (int j=0;j < arrayNum.length - 1; j++)
            {
                if(arrayNum[j] > arrayNum[j+1])
                {
                    num = arrayNum[j];
                    arrayNum[j] = arrayNum[j+1];
                    arrayNum[j+1] = num;
                    System.out.println(Arrays.toString(arrayNum));
                    sc.nextLine();
                }

            }

        }
        return vector = arrayNum;
    }

}