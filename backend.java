package POO.Hotel;

import java.util.Scanner;

public class backend {

    String nomcomp = "HOTEL LA ULTIMA NOCHE", nomCliente, TipodeCua, Comida="", Llave = "S";
    int suite = 120000, doble = 100000, sencilla = 90000, canNoches, valor_Comida = 25000;
    float porSuit = 0.02F, porSuit2 = 0.03F, porDoble = 0.04F, porDoble2 = 0.05F, porSenci = 0.06F, porSenci2 = 0.07F;
    double valNeto = 0, valBasico = 0, descuento = 0, subt_Comida = 0, ccs = 0, ccd = 0, ccse = 0, aps = 0, apd = 0, apse = 0, ccm4 = 0, atplata = 0, totcli = 0;

    public void entrada_Datos() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("===CONTROL DE CLIENTES===");
        System.out.print("Ingrese nombre del cliente: ");
        nomCliente = sc.nextLine();
        System.out.println( "Ingrese la habitacion a la cual desea ingresar: \nSencilla = $90.000 \nDoble = $100.000 \nSuite = $120.000");
        TipodeCua = sc.next();
        System.out.print("Ingrese la cantidad de noches: ");
        canNoches = sc.nextInt();
        System.out.println("¿Desea incluir comida en su estadia? (tiene un costo de $25.000): \nSi \nNo");
        Comida = sc.next();
    }

    public void cuartos() 
    {
        if (TipodeCua.equalsIgnoreCase("Suite")) 
        {
            valBasico = suite * canNoches;
            if (canNoches >= 1 && canNoches <= 4) 
            {
                descuento = valBasico * porSuit;
            } 
            else if (canNoches >= 5) 
            {
                descuento = valBasico * porSuit2;
                ccm4++;
            } 
            else 
            {
                System.out.println("Error ingrese un numero de noches valido (suites)");
                Llave = "N";
            }
            if (canNoches>0) 
            {    
                ccs++;
                aps += valBasico;
            }
            else 
            {
                System.out.println("Error ingrese un numero positivo");
                Llave = "N";
            }
        } // final suite
        else if (TipodeCua.equalsIgnoreCase("Doble")) 
        {
            valBasico = doble * canNoches;
            if (canNoches >= 1 && canNoches <= 4) 
            {
                descuento = valBasico * porDoble;
            } 
            else if (canNoches >= 5) 
            {
                descuento = valBasico * porDoble2;
                ccm4++;
            } 
            else 
            {
                System.out.println("Error ingrese un numero de noches valido (doble)");
                Llave = "N";
            }
            if (canNoches >0) 
            {
                ccd++;
                apd += valBasico;
            }
            else 
            {
                System.out.println("Error ingrese un numero positivo");
                Llave = "N";
            }
        } // final doble
        else if (TipodeCua.equalsIgnoreCase("Sencilla")) 
        {
            valBasico = sencilla * canNoches;
            if (canNoches >= 1 && canNoches <= 4) 
            {
                descuento = valBasico * porSenci;
            } 
            else if (canNoches >= 5) 
            {
                descuento = valBasico * porSenci2;
                ccm4++;
            } 
            else 
            {
                System.out.println("Error ingrese un numero valido de noches (sencilla)");
                Llave = "N";
            }
            if (canNoches >0) 
            {    
                ccse++;
                apse += valBasico;
            }
            else 
            {
                System.out.println("Error ingrese un numero positivo");
                Llave = "N";
            }
        } // final sencilla
        else 
        {
            System.out.println("Error tipo de cuarto");
            System.exit(0);
        }
    }// final cuartos

    public void Comidas() 
    {
            if (Comida.equalsIgnoreCase("Si")) 
            {
                subt_Comida = valor_Comida * canNoches;
            }
            
    }// final comidas

    public void Valneto() 
    {
        valNeto = valBasico + subt_Comida - descuento;
    }// final Valneto

    public void Salida() 
    {
        if (Llave.equalsIgnoreCase("S")) 
        {
            System.out.println("\n=====FACTURA FINAL=====");
            System.out.println("" + nomcomp);
            System.out.println("\nCliente: " + nomCliente);
            System.out.println("Habitacion: " + TipodeCua);
            System.out.println("Noches: " + canNoches);
            System.out.println("Comida: " + Comida);
            System.out.println("\nValor base: $" + valBasico);
            System.out.println("Descuento: $" + Math.round(descuento));
            System.out.println("Valor comida: $" + subt_Comida);
            System.out.println("-------------------------------");
            System.out.println("El valor neto a pagar es de: $" + Math.ceil(valNeto));
        }
    }// final salida

    public void Salida2() 
    {
        System.out.println("\n=====FACTURA GERENTE=====");
        System.out.println("" + nomcomp);
        System.out.println("\nClientes de suite: " + Math.round(ccs));
        System.out.println("Clientes de doble: " + Math.round(ccd));
        System.out.println("Clientes de sencilla: " + Math.round(ccse));
        System.out.println("-------------------------------");
        System.out.println("Plata de suite: $" + Math.round(aps));
        System.out.println("Plata de doble: $" + Math.round(apd));
        System.out.println("Plata de sencilla: $" + Math.round(apse));
    }// final salida2

    public void salidas3() 
    {
        atplata = aps + apd + apse;
        totcli = ccs + ccd + ccse;
        System.out.println("Clientes totales: " + totcli + " \ncon un total de plata de: " + atplata);
    }
}
