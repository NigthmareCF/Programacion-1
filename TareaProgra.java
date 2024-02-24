import java.util.Scanner;

public class TareaProgra {
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        String Nombre;
        int Numero1;
        int Numero2;
        int Numero3;

        System.out.println("Ingrese su Nombre: ");
	Nombre = variable.nextLine();

        System.out.println("Ingrese numero 1:");
        Numero1 = variable.nextInt();

        System.out.println("Ingrese numero 2:");
        Numero2 = variable.nextInt();

        System.out.println("Ingrese numero 3:");
        Numero3 = variable.nextInt();
        
        System.out.println("Datos Ingresados:");

        System.out.println("El numero 1 es :"+ Numero1);

        System.out.println("El numero 2 es :"+ Numero2);

        System.out.println("El numero 3 es :"+ Numero3);

        System.out.println("El numero 1 es :"+ Nombre);
	
	

    }
}