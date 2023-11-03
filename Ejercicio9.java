package ejercicosJava;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio9 {
	
    public static void main(String[] args) {
    	
        HashMap<String, String> dictionary = new HashMap<String, String>();
        
        dictionary.put("aguacate", "avocado");
        dictionary.put("cama", "bed");
        dictionary.put("computadora", "computer");
        dictionary.put("fresa", "strawberry");
        dictionary.put("lapiz", "pencil");
        dictionary.put("llave", "key");
        dictionary.put("luz", "light");
        dictionary.put("mesa", "table");
        dictionary.put("papel", "paper");
        dictionary.put("puerta", "door");
        dictionary.put("puente", "bridge");
        dictionary.put("regalo", "gift");
        dictionary.put("reloj", "watch");
        dictionary.put("roca", "rock");
        dictionary.put("silla", "chair");
        dictionary.put("sombrilla", "umbrella");
        dictionary.put("television", "television");
        dictionary.put("tren", "train");
        dictionary.put("ventana", "window");
        dictionary.put("zapatos", "shoes");

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una palabra en español: ");
        
        String wordSpanish = sc.nextLine();

        String translated = dictionary.get(wordSpanish);

        if (dictionary.containsKey(wordSpanish)) {
            System.out.println("La traducción al inglés de " + wordSpanish + " es: " + translated);
        } else {
            System.out.println("La palabra no se encuentra en el diccionario.");
        }
        
        sc.close();
    }
}
