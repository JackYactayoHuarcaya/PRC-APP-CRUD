package com.example.prcappcrud.domain;

import java.util.UUID;

public class Producto {
    UUID id;
    float precio;
    String nombre;
    public Producto(float precio,String nombre){
        this.precio=precio;
        this.nombre=nombre;
        this.id = UUID.randomUUID();
    }
    public float getPrecio(){
        return  this.precio;
    }
    public String getNombre(){
        return  this.nombre;
    }
    public UUID getId() {return  this.id;}
}
