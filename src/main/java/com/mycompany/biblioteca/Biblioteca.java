/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;
import java.util.ArrayList;

/**
 *
 * @author fgfed
 */
public class Biblioteca {
    
    
    private ArrayList<MaterialBiblioteca> listaMateriales;

    public Biblioteca() {
        this.listaMateriales = new ArrayList<>();
    }

  
    public void agregarMaterial(MaterialBiblioteca m) {
        listaMateriales.add(m);
        System.out.println("SISTEMA: '" + m.getTitulo() + "' agregado correctamente.");
    }

  
    public void listarMateriales() {
        if (listaMateriales.isEmpty()) {
            System.out.println("SISTEMA: No hay materiales registrados.");
        } else {
            System.out.println("\n--- LISTA DE MATERIALES ---");
            for (MaterialBiblioteca m : listaMateriales) {
                System.out.println(m.toString()); // Llama al toString() de Libro (Polimorfismo)
            }
        }
    }

    
    public MaterialBiblioteca buscarPorTitulo(String titulo) {
        for (MaterialBiblioteca m : listaMateriales) {
            if (m.getTitulo().equalsIgnoreCase(titulo)) {
                return m;
            }
        }
        return null;
    }

    
    public void prestarMaterial(String titulo) {
        MaterialBiblioteca m = buscarPorTitulo(titulo);
        if (m != null) {
            m.prestar(); 
        } else {
            System.out.println("SISTEMA: Error. El material '" + titulo + "' no existe.");
        }
    }

    
    public void devolverMaterial(String titulo) {
        MaterialBiblioteca m = buscarPorTitulo(titulo);
        if (m != null) {
            m.devolver();
        } else {
            System.out.println("SISTEMA: Error. El material '" + titulo + "' no existe.");
        }
    }
}
