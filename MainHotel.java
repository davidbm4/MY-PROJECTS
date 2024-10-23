package POO.Hotel;

import java.util.Scanner;

public class MainHotel {
    public static void main(String[] args) {

        String continua = "Si";

        backend HO = new backend();
        
        while (continua.equalsIgnoreCase("Si")) 
        {
            Scanner sc = new Scanner(System.in);
            HO.entrada_Datos();
            HO.cuartos();
            HO.Comidas();
            HO.Valneto();
            HO.Salida();
            System.out.println("¿Desea ingresar mas clientes? \nSi \nNo");
            continua=sc.next();
        }
        HO.Salida2();
        HO.salidas3();
    }
}
