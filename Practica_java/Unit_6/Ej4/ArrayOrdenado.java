import java.util.Arrays;

public class ArrayOrdenado
{
    public static void main(String[] args)
    {
        int[] array = {1,2,3,4,5};

        System.out.println("Sin ordenar: " + Arrays.toString(array));

        Arrays.sort(array);

        System.out.println("Ordenado: " + Arrays.toString(array));
    }
}