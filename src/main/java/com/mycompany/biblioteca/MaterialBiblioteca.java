package com.mycompany.biblioteca;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fgfed
 */
public abstract class MaterialBiblioteca implements Prestable {
    
    private String titulo;
    private int anio;
    protected boolean prestado; 

    public MaterialBiblioteca(String titulo, int anio) {
        this.titulo = titulo;
        this.anio = anio;
        this.prestado = false;
    }

    
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }

    public boolean isPrestado() { return prestado; }
   

    @Override
    public String toString() {
        return "Título: " + titulo + " | Año: " + anio + " | Prestado: " + (prestado ? "Sí" : "No");
    }
    
}
