import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        double totalEvaluaciones = 0;

        while (nota != -1){ //CONDICION operador relacional diferente !=
            System.out.println("Escribe la nota que le darías a la película Matrix");
            nota = teclado.nextDouble();

            if (nota != -1) {
                mediaEvaluaciones += nota; //MediaEvaluaciones + nota es con "+="
                totalEvaluaciones++; //El valor de ella misma mas 1 número es con ++
            }
        }
        System.out.println("La media de evaluaciones para Matrix es: " +mediaEvaluaciones / 3);

    }
}
