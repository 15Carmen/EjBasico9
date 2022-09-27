package ejbasico9;

import java.util.Scanner;

public class EjBasico9 {
    public static void main(String[] args) {

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner (System.in);

        //Declaramos las variables peseta y euro
        double euro = 0.006; //Inicializamos la variable euro porque 1 peseta=0.006€
        double peseta;

        /**
         * Le pedimos al ususario que introduzca la cantidad de pesetas que desea convertir
         */
        System.out.println("Introduzca el número de pesetas que desee convertir a euro: ");
        peseta=sc.nextDouble();

        //Calculamos el nuevo valor en euros multiplicando la cantidad introducida por 0.006
        euro=euro*peseta;

        //Mostramos por pantalla las variables
        System.out.println(peseta+" pesetas equivalen a "+euro+" euros");

    }
}
