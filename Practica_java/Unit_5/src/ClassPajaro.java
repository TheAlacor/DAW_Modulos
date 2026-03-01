public class ClassPajaro{
	//atributos
	private String nombre;
	private int posX;
	private int posY;
	private static int numObjectPajaro=0;

	//Metodos

	//Constructor
	public ClassPajaro(){}
		numObjectPajaro++;
	
	public ClassPajaro(String nombre,int posX,int posY){
		this.nombre = nombre;
		this.posX = posX;
		this.posY = posY;
		numObjectPajaro++;
	}	
	
	//metodo para static consult number
	public static int getNumberObjectPajaro(){
		return numObjectPajaro;
	}
	
	//metodo volar()
	public double volar(int posX,int posY){
		double d = Math.sqrt(Math.pow(posX - this.posX, 2) + Math.pow(posY - this.posY,2));
		return d;
		
	}

	//metodo toString()
	public String toString(){
		String cadena = String.format("Nombre=%s\nPosX=%d\nPosY=%d",nombre,posX,posY);
		return cadena;
	}
	
	//metodo set
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	//metodo main
	public static void main(String[]args){
		ClassPajaro pajaro1 = new ClassPajaro();
		
		ClassPajaro pajaro2 = new ClassPajaro("Fifi",5,8);
		System.out.println(pajaro1);
		System.out.println(pajaro2);
		
		//volar
		System.out.println("pajaro 1 con una distancia de: " + pajaro1.volar(5,5));
		
		System.out.println("pajaro 2 con una distancia de: " + pajaro2.volar(5,5));
		
		pajaro1.nombre = "Perico";
		System.out.println(pajaro1);
		
	}
}

