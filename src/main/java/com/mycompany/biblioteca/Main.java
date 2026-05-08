/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;
import java.util.Scanner;
/**
 *
 * @author fgfed
 */
public class Main {

    public static void main(String[] args) {
        // Instanciamos el Scanner para leer consola y la Biblioteca para gestionar datos
        Scanner sc = new Scanner(System.in);
        Biblioteca miBiblioteca = new Biblioteca();
        int opcion = 0;

        do {
            System.out.println("\n========================================");
            System.out.println("   SISTEMA DE GESTIÓN DE BIBLIOTECA");
            System.out.println("========================================");
            System.out.println("1) Agregar libro");
            System.out.println("2) Listar materiales");
            System.out.println("3) Buscar por título");
            System.out.println("4) Prestar material");
            System.out.println("5) Devolver material");
            System.out.println("6) Salir");
            System.out.print("Seleccione una opción: ");

            try {
                
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.println("\n--- NUEVO LIBRO ---");
                        System.out.print("Ingrese título: ");
                        String titulo = sc.nextLine();
                        System.out.print("Ingrese año de publicación: ");
                        int anio = Integer.parseInt(sc.nextLine());
                        System.out.print("Ingrese autor: ");
                        String autor = sc.nextLine();
                        
                        
                        miBiblioteca.agregarMaterial(new Libro(titulo, anio, autor));
                        break;

                    case 2:
                        miBiblioteca.listarMateriales();
                        break;

                    case 3:
                        System.out.print("\nIngrese el título a buscar: ");
                        String busqueda = sc.nextLine();
                        MaterialBiblioteca encontrado = miBiblioteca.buscarPorTitulo(busqueda);
                        if (encontrado != null) {
                            System.out.println("Resultado: " + encontrado.toString());
                        } else {
                            System.out.println("No se encontró ningún material con ese título.");
                        }
                        break;

                    case 4:
                        System.out.print("\nTítulo del material a prestar: ");
                        miBiblioteca.prestarMaterial(sc.nextLine());
                        break;

                    case 5:
                        System.out.print("\nTítulo del material a devolver: ");
                        miBiblioteca.devolverMaterial(sc.nextLine());
                        break;

                    case 6:
                        System.out.println("Cerrando el sistema... ¡Hasta luego!");
                        break;

                    default:
                        System.out.println("Opción no válida. Intente entre 1 y 6.");
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Por favor, ingrese un número válido.");
                opcion = 0; // Reiniciamos opción para que no se salga del bucle
            }

        } while (opcion != 6);

        sc.close();
    }
    }

