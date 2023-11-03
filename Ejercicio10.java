package ejercicosJava;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {

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

        // Genera un array con 5 palabras aleatorias del diccionario en español.
        String[] randomWord = makeRandomWords(dictionary, 5);

        // Cuenta las respuestas correctas e incorrectas del usuario.
        int rightAnswer = 0;
        int wrongAnswer = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe la traducción al inglés de las siguientes palabras:");

        for (String wordSpanish : randomWord) {
            System.out.print("Traducción de '" + wordSpanish + "': ");
            String userResponse = sc.nextLine();

            String translated = dictionary.get(wordSpanish);
            if (userResponse.equalsIgnoreCase(translated)) {
                System.out.println("¡Correcto!");
                rightAnswer++;
            } else {
                System.out.println("Incorrecto. La traducción correcta es '" + translated + "'.");
                wrongAnswer++;
            }
        }

        System.out.println("!Bien hecho¡");
        System.out.println("Respuestas correctas: " + rightAnswer);
        System.out.println("Respuestas incorrectas: " + wrongAnswer);

        
        sc.close();
    }

    // Método para generar palabras aleatorias del diccionario en español.
    private static String[] makeRandomWords(HashMap<String, String> dictionary, int cant) {
        String[] words = dictionary.keySet().toArray(new String[0]);
        Random random = new Random();
        String[] randomWord = new String[cant];

        for (int i = 0; i < cant; i++) {
            randomWord[i] = words[random.nextInt(words.length)];
        }

        return randomWord;

	}

}
