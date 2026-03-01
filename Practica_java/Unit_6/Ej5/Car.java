import java.util.Scanner;

public class Car
{
	// Attributes

	private String brand = "";
	private String model = "";

	private int year = 0;

	// Constructors


	public Car() {}

	public Car(String brand, String model, int year)
	{
		this.setBrand(brand);
		this.setModel(model);
		this.setYear(year);
	}

	public Car(Car car)
	{
		this.setBrand(car.getBrand());
		this.setModel(car.getModel());
		this.setYear(car.getYear());
	}

	// Getters and setters

	public String getBrand()
	{
		return this.brand;
	}
    
	public void setBrand(String brand)
	{
		this.brand = brand;
	}

	public String getModel()
	{
		return this.model;
	}

	public void setModel(String model)
	{
		this.model = model;
	}


	public int getYear()
	{
		return this.year;
	}



	public void setYear(int year)
	{
		this.year = year;
	}

	public String toString(){
		return String.format("Marca: %s\nModelo: %s\nAño: %d\n",brand,model,year);
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String brand;
		boolean encontrado = false;
		int i;

		// array con coches
		Car coche1 = new Car("Seal","Ibiza",2000);
		Car coche2 = new Car("Citroen","C4",2006);
		Car coche3 = new Car("Ebro","S700",2025);

		// Car [] coches = {new Car("Seal","Ibiza",2000), new Car("Citroen","C4",2006),
		// new Car("Ebro","S700",2025)};

		Car [] coches = {coche1,coche2,coche3};
		brand = sc.nextLine();

	}

	public static int buscarCoche(Car[] arrayCoches,String brand){
		int posicion =-1;
		boolean encontrado = false;

		for(int i=0;i<arrayCoches.length && posicion ==-1;i++){
			if(brand.equalsIgnoreCase(arrayCoches[i].getBrand())){
				encontrado = true;
			}
			
		}
		return posicion;
	}
}
