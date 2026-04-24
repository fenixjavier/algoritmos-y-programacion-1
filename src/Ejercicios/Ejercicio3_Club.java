package Ejercicios;

import java.util.Scanner;

/**
 * Un club quiere saber cierta información sobre sus afiliados por lo tanto
 * requiere un programa que lea desde el teclado la siguiente información:
 * nombre, apellido, edad, año de afiliación y número de socio.
 *
 * Se desea saber:
 *
 * a) El nombre del socio más viejo y su edad.
 *
 * b) La cantidad de socios afiliados.
 *
 * c) La cantidad de socios que se afiliaron en el año 2005.
 *
 * d) El porcentaje de socios entre 15 y 20 años.
 *
 * El primer socio se agrega sin ninguna pregunta, pero a partir del segundo se
 * debe preguntar por pantalla "¿Desea agregar un socio más? (s/n)", dependiendo
 * de la respuesta, se lee un socio más o se muestran los resultados.
 *
 * @author UNSAdA
 */
public class Ejercicio3_Club {

    public Ejercicio3_Club() {
        String nombre, apellido;
        int edad, ingreso, numSocio;

        // a)
        String nombreMasViejo = "";
        int edadMasViejo = 0;

        int cantAfiliados = 0;
        int cantAfiliados2005 = 0;
        int sociosEntre15y20 = 0;

        char exit;
        Scanner in = new Scanner(System.in);
        while (true) {
            // Pedir información al usuario
            System.out.println("¿Desea agregar un socio más? (s/n)");
            exit = in.next().charAt(0);
            if (exit == 's') {
                break;
            }

            System.out.println("Ingrese el nombre del socio: ");
            nombre = in.nextLine();

            System.out.println("Ingrese el apellido del socio: ");
            apellido = in.nextLine();

            System.out.println("Ingrese la edad del socio: ");
            edad = in.nextInt();

            System.out.println("Ingrese el año de afiliación del socio: ");
            ingreso = in.nextInt();

            System.out.println("Ingrese su número de socio: ");
            numSocio = in.nextInt();

            // El nombre del socio más viejo y su edad
            if (edad > edadMasViejo) {
                edadMasViejo = edad;
                nombreMasViejo = nombre;
            }

            if (ingreso == 2005) {
                cantAfiliados2005++;
            }

            if (edad >= 15 && edad <= 20) {
                sociosEntre15y20++;
            }

            cantAfiliados++;
        }

        System.out.println("El socio más viejo es: " + nombreMasViejo);
        System.out.println("Su edad es: " + edadMasViejo);

        System.out.println("Cantidad de socios afiliados: " + cantAfiliados);

        System.out.println("Cantidad de socios afiliados en 2005: " + cantAfiliados2005);

        System.out.println("Socios entre 15 y 20 años: " + sociosEntre15y20);

        in.close();
    }
}
