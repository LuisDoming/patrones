/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2arquitectura.transporte;

/**
 *
 * @author copad
 */
public class Auto extends Transporte{
    private String nombre;
    private int costo;
    private float velocidad;
    public Auto(){
        nombre="Auto";
        costo=30;
        velocidad=40;
    }
    @Override
    public String getVehiculo() {
        return nombre;
    }

    @Override
    public int getCosto() {
         return costo;
    }

    @Override
    public float getVelocidadPromedio() {
        return velocidad;
    }
}
