/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoMover;

/**
 *
 * @author DELL
 */
public class persona {

    protected String nombrePersona;
    protected int cantidadVida;

    public persona(String nombrePersona, int cantidadVida) {
        this.nombrePersona = nombrePersona;
        this.cantidadVida = cantidadVida;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public void setCantidadVida(int cantidadVida) {
        this.cantidadVida = cantidadVida;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public int getCantidadVida() {
        return cantidadVida;
    }
    
 }

