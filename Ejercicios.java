package tema4_condicionales;

public class Ejercicios {

	public static void main(String[] args) {
		
		//Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
		// Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
		
		int numeroIf = 2;
		
		if(numeroIf > 0) {
			System.out.println("El numero " + numeroIf + " es positivo");
		}else if (numeroIf < 0) {
			System.out.println("El numero " + numeroIf + " es negativo");
		}else if (numeroIf == 0) {
			System.out.println("El numero es 0");
		}
		
		
		//Crea un bucle While, este bucle tendrá que tener como condición que la variable 
		//numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
		// - Incrementar el valor de la variable en uno cada vez que se ejecute.
		// - Mostrarlo por pantalla cada vez que se ejecute.
		System.out.println("");
		
		int numeroWhile = 1;
		
		while (numeroWhile < 3) {
			System.out.println(numeroWhile);
			numeroWhile++;
			
		}
		
		//Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo 
		//se debe ejecutar una vez.
		System.out.println("");
		do {
			
			System.out.println(numeroWhile);
			numeroWhile++;
			
		} while (numeroWhile < 3);
		
		//Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su 
		//condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor 
		//cada vez que se ejecute y deberá mostrarse por pantalla.
		System.out.println("");
		int numeroFor = 0;
		
		for(int i=0; numeroFor <= 3; i++) {
			System.out.println(numeroFor);
			numeroFor++;
		}
		
		//Por último, para el Switch, deberás crear la variable estacion, y distintos case para las 
		//cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar 
		//un mensaje por consola informando de la estación en la que está. También habrá que poner un 
		// default para cuando el valor de la variable no sea una estación.
		System.out.println("");
		String estacion = "Verano";
		
		switch (estacion) {
		case "Primavera" :
			System.out.println("La estacion es primavera ");
			break;
		case "Verano" :
			System.out.println("La estacion es verano ");
			break;
		case "Otonho" :
			System.out.println("La estacion es otonho ");
			break;
		case "Invierno" :
			System.out.println("La estacion es primavera ");
			break;

		default:
			System.out.println("no es una estacion");
			break;
		}
		
	}

}
