import com.vehicles.Motocicleta;

public class Main
{
    public static void main(String[] args)
    {
        
            Motocicleta moto1 = new Motocicleta();
            Motocicleta moto2 = new Motocicleta(20, 80, "4444 XZL");

            moto1.setCaballos(10);
            moto1.setVelocidadPunta(65);
            
        try{
            moto1.setRegistro("1234XYZ");

            moto1.MostrarMatricula();
            moto2.MostrarMatricula();

        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }
    }
}