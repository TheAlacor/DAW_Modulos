public class PruebaPajaro{
	//metodo main de ClassPajaro
	public static void main(String[]args){
		ClassPajaro pajaro1 = new ClassPajaro();
		
		ClassPajaro pajaro2 = new ClassPajaro("Fifi",5,8);
		System.out.println(pajaro1);
		System.out.println(pajaro2);
		
		//volar
		System.out.println("pajaro 1 con una distancia de: " + pajaro1.volar(5,5));
		
		System.out.println("pajaro 2 con una distancia de: " + pajaro2.volar(5,5));
		
		pajaro1.setNombre("Perico");
		System.out.println(pajaro1);
		
		//COnsultar el numero de pajaros
		System.out.println("Se han creado: " + Pajaro.getNumobjectPajaro());
		
	}
}

// javac *.java all from folder despues ejecutar el archivo que tenga el main