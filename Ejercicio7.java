package ejercicosJava;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese un día de la semana: ");
	        String dia = scanner.nextLine().toLowerCase(); 

	        int selecccion = 0;

	        switch (dia) {
	            case "lunes":
	                selecccion = 0;
	                break;
	            case "martes":
	                selecccion = 1;
	                break;
	            case "miercoles":
	                selecccion = 2;
	                break;
	            case "jueves":
	                selecccion = 3;
	                break;
	            case "viernes":
	                selecccion = 4;
	                break;
	            case "sabado":
	                selecccion = 5;
	                break;
	            case "domingo":
	                selecccion = 6;
	                break;
	            default:
	                System.out.println("El día introducido no es correcto.");
	                scanner.close();
	                return; // 
	        }

	        System.out.println("A continuación introduzca la hora y luego los minutos)");
	        System.out.print("Hora: ");
	        int horas = scanner.nextInt();
	        System.out.print("Minutos: ");
	        int minutos = scanner.nextInt();

	        int minutosTotales = (4 * 24 * 60) + (15 * 60);
	        int minutosActuales = (selecccion * 24 * 60) + (horas * 60) + minutos;

	        if (minutosActuales > minutosTotales) {
	            System.out.println("¡Ya es fin de semana!");
	        } else {
	            System.out.println("Faltan " + (minutosTotales - minutosActuales) + " minutos para llegar al fin de semana.");
	        }

	        scanner.close();

	}

}
