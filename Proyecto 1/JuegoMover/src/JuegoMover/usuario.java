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
public class usuario extends persona {

    /**
     *
     * @author DELL
     */
    public usuario(String nombrePersona, int cantidadVida) {
        super(nombrePersona, cantidadVida);
    }

    @Override
    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    @Override
    public void setCantidadVida(int cantidadVida) {
        this.cantidadVida = cantidadVida;
    }

    @Override
    public String getNombrePersona() {
        return nombrePersona;
    }

    @Override
    public int getCantidadVida() {
        return cantidadVida;
    }

}
