/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopatrones;

/**
 *
 * @author ldoar
 */
public abstract class ICliente {
    private String transporte;
    private String paquete;
    private double distancia;
    
    public abstract void ejecutar();
    public abstract void calcularResultado();
}
