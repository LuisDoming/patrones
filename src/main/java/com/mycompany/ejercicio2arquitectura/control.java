/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2arquitectura;

/**
 *
 * @author copad
 */
public class control {
    String servicio;
    String tamano;
    float distancia;
    NumServicio s=null;
    NumTamano t=null;
    NumTransporte transporte=null;
    int costoTrasporte,costoServicio,costoTamano,costoDistancia,costoTotal;
    float tiempoLlegada=0;
    
    control(paquete paquete){
        this.servicio=paquete.getServicio();
        this.tamano=paquete.getTamano();
        this.distancia=paquete.getDistancia();
    }
    
    public NumServicio tipoServicio(){
        
        String express="express",estandar="estandar";
        if(express.equals(servicio.toLowerCase())){
           s=NumServicio.Express;
           costoServicio=50;
        }else if(estandar.equals(servicio.toLowerCase())){
           s=NumServicio.Estandar;
           costoServicio=30;
        }
        return s;
    }
    public NumTamano tamano(){
        String sobre="sobre",pequeño="pequeño",mediano="mediano",grande="grande";
        if(sobre.equals(tamano.toLowerCase())){
            t=NumTamano.sobre;
            costoTamano=5;
        }
        if(pequeño.equals(tamano.toLowerCase())){
            t=NumTamano.pequeño;
            costoTamano=10;
        }
        if(mediano.equals(tamano.toLowerCase())){
            t=NumTamano.mediano;
            costoTamano=20;
        }
        if(grande.equals(tamano.toLowerCase())){
            t=NumTamano.grande;
            costoTamano=50;
        }
        return t;
    }
    public void imprimir(){
        System.out.println("servicio "+s+" tamaño "+t+" transporte "+transporte+" costo "+costoTotal+" tiempo estimado "+tiempoLlegada+" minutos");
    }
    public void transporte(){
        tipoServicio();
        tamano();
        if (distancia <= 1 && (t == NumTamano.sobre || t == NumTamano.pequeño)) {
            if (s == NumServicio.Express) {
                transporte = NumTransporte.DRON;
            } else if (s == NumServicio.Estandar) {
                transporte = NumTransporte.BICICLETA;
            }

        }
        if (distancia > 1 && (t == NumTamano.sobre || t == NumTamano.pequeño)) {
            if (s == NumServicio.Estandar) {
                transporte = NumTransporte.BICICLETA;
            } else if (s == NumServicio.Express) {
                transporte = NumTransporte.MOTOCICLETA;
            }

        }
        if (distancia < 5 && t == NumTamano.mediano) {
            if (s == NumServicio.Estandar) {
                transporte = NumTransporte.BICICLETA;
            }
            if (s == NumServicio.Express) {
                transporte = NumTransporte.MOTOCICLETA;
            }
        }
        if(t==NumTamano.mediano&&distancia>=5){
            transporte=NumTransporte.MOTOCICLETA;
        }
        if (t == NumTamano.grande) {
            transporte = NumTransporte.AUTO;
        }

        
    }
    public void calcularCosto(){
        int [] costoT={20,5,15,30};
        if(transporte!=null){
        costoTrasporte=costoT[transporte.ordinal()];
        }
        if(distancia>10){
            costoDistancia=(int)distancia;
            costoDistancia=(costoDistancia-10)*5;
        }
        costoTotal=costoTrasporte+costoServicio+costoTamano+costoDistancia;
        calcularTiempo();
        imprimir();
    }
    
    public void calcularTiempo(){
        float [] velocidad={60,20,45,40};
        float d=distancia;
        float v=velocidad[transporte.ordinal()];
        
        
        tiempoLlegada=(distancia/v)*60;
        
    }
    
}
