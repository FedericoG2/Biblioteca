/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author fgfed
 */
public class Libro extends MaterialBiblioteca {
    
    private String autor;

    public Libro(String titulo, int anio, String autor) {
        
        super(titulo, anio); 
        this.autor = autor;
    }


    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

   
    @Override
    public void prestar() {
        if (!prestado) { 
            prestado = true;
            System.out.println("LOG: El libro '" + getTitulo() + "' ha sido entregado.");
        } else {
            System.out.println("ALERTA: El libro '" + getTitulo() + "' ya está ocupado.");
        }
    }

    @Override
    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println("LOG: Gracias por devolver el libro '" + getTitulo() + "'.");
        } else {
            System.out.println("ALERTA: Este libro ya estaba en la biblioteca.");
        }
    }

   
    @Override
    public String toString() {
        return super.toString() + " | Autor: " + autor;
    }
}
