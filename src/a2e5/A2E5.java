import java.util.Scanner;

public class A2E5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //definir variables 
        int Mujeres = 0;
        int Hombres = 0;
        int Genero;
        int NumeroPersonas;
        int Edad;

        //pedir cuantas personas seran ingresadas
        System.out.print("Cuantos Personas ingresaran? ");
        NumeroPersonas = scanner.nextInt();

        //ingresar en un ciclo que pida los datos de cada persona
        for (int i = 0; i < NumeroPersonas; i++) {

            System.out.print("Ingrese si es Hombre 1 y Mujer 2: ");
            Genero = scanner.nextInt();
            System.out.print("Ingrese la edad: ");
            Edad = scanner.nextInt();

            //clasificar a las personas que cumplen con las condiciones 
            if (Edad < 18 && Genero == 1) {

                Hombres++;
            }
            if (Edad >= 18 && Genero == 2) {

                Mujeres++;

            }

        }

        System.out.println("Hay " + Hombres + " Hombres menores de edad.");
        System.out.println("Hay " + Mujeres + " Mujeres mayores de edad.");
    }

}
