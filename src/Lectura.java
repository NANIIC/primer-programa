import java.sql.SQLOutput;
import java.util.Scanner;

public class Lectura {
    //Interacción con el usuario
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un nombre de tu película favorita");
        String pelicula = teclado.nextLine(); //para que lea string
        System.out.println("Ahhora escribe la fecha de lanzamiento");
        int fechaDeLanzamiento = teclado.nextInt(); //para que lea entero
        System.out.println("Por último dinos que nota le das a esta peli");
        double nota = teclado.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota
        );
    }
}
