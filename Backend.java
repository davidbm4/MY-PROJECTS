package POO.TAREA;

import java.util.Scanner;

public class Backend {

    Scanner sc = new Scanner(System.in);
    String nombreE = "";
    int cantidad_horas, valor_hora = 20000, subsidioT = 25000;
    double subtHoras = 0, subtSeguro = 0, valor_neto = 0;
    float seguroM = 0.08F;

    public void ingresarDatos() 
    {
        System.out.println("===CONTROL DE PAGOS===");
        System.out.println("El valor por hora trabajada es de: $20,000, y el valor del seguro medico es del 8%");
        System.out.print("Ingrese el nombre del empleado: ");
        nombreE = sc.nextLine();
        System.out.print("Ingrese la cantidad de horas laboradas: ");
        cantidad_horas = sc.nextInt();
    }

    public void operaciones() 
    {
        subtHoras = cantidad_horas * valor_hora;
        subtSeguro = subtHoras * seguroM;
        valor_neto = (subtHoras - subtSeguro) + subsidioT;
    }

    public void mostarDatos() 
    {
        System.out.println("===XYZ LTDA===");
        System.out.println("Señor/a: "+nombreE);
        System.out.println("Sus horas trabajadas son: "+cantidad_horas);
        System.out.println("El valor de su salario es: $"+subtHoras);
        System.out.println("El valor de su seguro es de: $"+Math.ceil(subtSeguro));
        System.out.println("El valor del subsidio de transporte es de: $"+subsidioT);
        System.out.println("El valor neto a pagar es de: $"+Math.ceil(valor_neto)); 
    }
}
