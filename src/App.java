import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        String palabraSecreta = "felicidad";
        byte intentos = 0;
        int rondas = 10;
        boolean adivinado = false;
        
        char [] letraAdivinada = new char[palabraSecreta.length()];

        for (int i = 0; i < letraAdivinada.length; i++){
            letraAdivinada[i] = '_';
        }
        
        while (!adivinado && intentos < rondas) {
            System.out.println("palabra a Adivinar" + String.valueOf(letraAdivinada) + "(" + palabraSecreta.length() + " letras)");
            System.out.println("Introduce una letra por favor");
            
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta =  false;

            for (int e = 0; e < palabraSecreta.length(); e++){
                if (palabraSecreta.charAt(e) == letra) {
                    letraAdivinada[e] = letra;
                    letraCorrecta = true;
                }
            }
            if (!letraCorrecta){
                intentos ++;
                System.out.println("Incorrecto te quedan "+ (rondas - intentos) + " intentos");
            }
            if (String.valueOf(letraAdivinada).equals(palabraSecreta)){
                adivinado = true;
                System.out.println("********************************************************************************************");
                System.out.println("Felicidades has adivinado la palabra secreta: " + palabraSecreta);
                System.out.println("********************************************************************************************");
            }
        }
        
        if(!adivinado){
            System.out.println("Has perdido!!");
        }

        scanner.close();

    }
}
