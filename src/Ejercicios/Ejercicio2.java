/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author UNSAdA
 */
public class Ejercicio2 {
    public Ejercicio2() {
        double precio = 1;
        String nombre;
        double sumaDePrecios = 0;
        
        double precioDeProductoMasCaro = 0;
        String nombreDelProductoMasCaro = "";
        
        double precioDelProductoMasBarato = 0;
        String nombreDelProductoMasBarato = "";
        
        int cantidadDeProductos = 0;
        int cuantosCuestanMasDe5000 = 0;
        
        int terminanCon99 = 0;
        
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.print("Ingrese el nombre del producto: ");
            nombre = in.next();

            if(nombre.length() == 0) {
                break;
            }
            
            System.out.print("Ingrese el precio del producto: ");
            precio = in.nextInt();

            if(precio == 0) {
                break;
            }
            
            // Producto mas caro
            if(precio > precioDeProductoMasCaro) {
                precioDeProductoMasCaro = precio;
                nombreDelProductoMasCaro = nombre;
            }
            
            // Mas barato
            if(precio < precioDelProductoMasBarato){
                precioDelProductoMasBarato = precio;
                nombreDelProductoMasBarato = nombre;
            }
            
            if(precio > 5000) {
                cuantosCuestanMasDe5000++;
            }
            
            // Cuantos terminan con 99
            int ultimoDigito = (int) (precio % 10);
            int anteUltimoDigito = (int) ((precio / 10) % 10);
            if(ultimoDigito == 9 && anteUltimoDigito == 9) {
                terminanCon99++;
            }
            
            sumaDePrecios += precio;
            cantidadDeProductos++;
        }
        
        System.out.println("Producto mas caro: " + nombreDelProductoMasCaro);
        System.out.println("Producto mas barato: " + nombreDelProductoMasBarato);
        System.out.println("Precio promedio: " + sumaDePrecios / cantidadDeProductos);
        System.out.println("Productos que cuestan mas de 5000: " + cuantosCuestanMasDe5000);
        System.out.println("Porcentaje de productos que terminan en 99: " + (terminanCon99 * 100) / cantidadDeProductos);

        in.close();
    }
}
