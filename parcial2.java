package Practicas;

import java.util.Scanner;

public class parcial2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nomb_cliente = "", jornada = "", OP = "S";
        int valor_juegos = 8000, cantidad_entradas = 0, compra = 0, valor_entrada = 0, sub1 = 0, cd = 0, cn = 0;
        double if1 = 0, ad = 0, an = 0;
        float descuento1 = 0.03F, descuento2 = 0.02F, descuentoN1 = 0.04F;

        while (OP.equalsIgnoreCase("S"))

        {

            System.out.println("===BALNEARIO LAS BRISAS===");
            System.out.println("CONTROL DE VENTAS");
            System.out.print("Digite el nombre del cliente: ");
            nomb_cliente = sc.next();
            System.out.println("Digite la jornada en la que se encuentra: \nDiurno \nNocturno");
            jornada = sc.next();
            System.out.println("El valor a la entrada de los juegos tiene un costo de $8,000");
            System.out.print("Digite la cantidad de boletas que desea adquirir: ");
            cantidad_entradas = sc.nextInt();

            compra = cantidad_entradas * valor_juegos;

            if (compra <= 50000) {
                if (jornada.equalsIgnoreCase("Diurno"))

                {
                    cd++;
                    valor_entrada = 8000;
                    sub1 = (valor_entrada * cantidad_entradas) + compra;
                    if1 = sub1 - (sub1 * descuento1);
                    ad += if1;

                }
                else if (jornada.equalsIgnoreCase("Nocturno")) {
                    cn++;
                    valor_entrada = 7000;
                    sub1 = (valor_entrada * cantidad_entradas) + compra;
                    if1 = sub1 - (sub1 * descuentoN1);
                    an += if1;
                } 
            }
            if (compra > 50000) {
                if (jornada.equalsIgnoreCase("Diurno")) {
                    cd++;
                    valor_entrada = 6000;
                    sub1 = (valor_entrada * cantidad_entradas) + compra;
                    if1 = sub1 - (sub1 * descuento2);
                    ad += if1;
                }
                else if (jornada.equalsIgnoreCase("Nocturno")) {
                    cn++;
                    valor_entrada = 5000;
                    sub1 = (valor_entrada * cantidad_entradas) + compra;
                    if1 = sub1 - (sub1 * descuento1);
                    an += if1;
                } 
            } 

            System.out.println("Señor/a " + nomb_cliente + "\nLa jornada la cual escogio es: " + jornada
                    + "\nEl valor total de la entrada a los juegos es de: " + compra
                    + "\nEl valor de sus entradas es de: " + valor_entrada + "\nEl valor total a pagar es de: " + if1);
            System.out.println("Desea ingresar mas personas (s/n): ");
            OP = sc.next();

        } // final while

        System.out.println("La cantidad de personas que ingresaron en diurno es: "+cd);
        System.out.println("La cantidad de personas que ingresaron en nocturno es: "+cn);
        System.out.println("La cantidad de dinero que ingreso a diurno es: "+ad);
        System.out.println("La cantidad de dinero que ingreso a nocturno es: "+an);
        System.out.println("El total del dinero es de: "+(ad+an));
        
    }
}
