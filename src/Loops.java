import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0; //la iniciamos para poder asignarle el valor despues

        for (int i = 0; i < 3; i++) { //cuando ponemos for, se puede completar con fori y solo espera el mayor
            System.out.println("Escribe la nota que le darías a la película Matrix");
            nota = teclado.nextDouble();
            mediaEvaluaciones = mediaEvaluaciones + nota;
        }
        System.out.println("La media de evaluaciones para Matrix es: " +mediaEvaluaciones / 3);
    }
}
