package crema;

import java.util.Scanner;

public class Crema {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombre = "", nombre_crema = "", respuesta = "";
        int puntaje = 0, cc = 0, acPonds = 0, acCero = 0;

        System.out.println("===Bienvenido al centro comercial Palmetto===");

        while (!respuesta.equalsIgnoreCase("No")) {

            System.out.print("Ingrese su nombre: ");
            nombre = sc.next();
            System.out.println("Ingrese la crema que desea evaluar: \n- Ponds \n- Cero");
            nombre_crema = sc.next();
            System.out.print("Ingrese el puntaje que le da al producto de 1 a 5: ");
            puntaje = sc.nextInt();
            if (puntaje < 1 || puntaje > 5) {
                System.out.println("El puntaje no es valido debe ser entre 1 a 5");
                continue;
            } else {

                switch (nombre_crema.toLowerCase()) {
                    case "ponds":
                        cc = cc + 1;
                        acPonds = acPonds + puntaje;
                        System.out.println("Señor/a " + nombre + " La crema que escogio es: " + nombre_crema
                                + " \nEl puntaje que le dio es: " + puntaje);
                        break;
                    case "cero":
                        cc = cc + 1;
                        acCero = acCero + puntaje;
                        System.out.println("Señor/a " + nombre + " La crema que escogio es: " + nombre_crema
                                + " \nEl puntaje que le dio es: " + puntaje);
                        break;
                    default:
                        System.out.println("Error ingrese un tipo de crema valido");
                        break;
                }// final switch
                System.out.println("¿Desea realizar esta encuesta a más personas? \n- si \n- no");
                respuesta = sc.next();

            } // final else
        } // final while

        System.out.println("===RESULTADOS ENCUESTAS===");
        System.out.println("La cantidad de personas que hizo la encuesta fue: " + cc);
        System.out.println("Puntaje de la crema ponds: " + acPonds);
        System.out.println("Puntaje de la crema cero: " + acCero);

        if (acPonds > acCero) {
            System.out.println("La crema ganadora es: Ponds");
        } else if (acPonds < acCero) {
            System.out.println("La crema ganadora es: Cero");
        } else {
            System.out.println("Empate, mismo puntaje");
        }

    }
}
