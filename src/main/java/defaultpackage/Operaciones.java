/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultpackage;

/**
 *
 * @author Heiby
 */
public class Operaciones {
    private double cantidad;
    private double total;
    private int monedaOrigen, monedaDestino;

    public Operaciones(){
        
    }
    
    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getMonedaOrigen() {
        return monedaOrigen;
    }

    public void setMonedaOrigen(int monedaOrigen) {
        this.monedaOrigen = monedaOrigen;
    }

    public int getMonedaDestino() {
        return monedaDestino;
    }

    public void setMonedaDestino(int monedaDestino) {
        this.monedaDestino = monedaDestino;
    }
    
    public double convertir(){
        if(monedaOrigen==0&&monedaDestino==1){
            total= cantidad*0.040;
        }else if(monedaOrigen==0&&monedaDestino==2){
            total= cantidad*0.034;
        }else if(monedaOrigen==1&&monedaDestino==0){
            total= cantidad*24.66;
        }else if(monedaOrigen==1&&monedaDestino==2){
            total= cantidad*0.85;
        }else if(monedaOrigen==2&&monedaDestino==0){
            total= cantidad*29.39;
        }else if(monedaOrigen==2&&monedaDestino==1){
            total= cantidad*1.18;
        }else{
            total=this.cantidad;
        }
                
        return total;
    }
}
