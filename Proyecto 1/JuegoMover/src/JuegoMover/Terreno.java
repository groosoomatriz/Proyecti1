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
public class Terreno {

    private String tipoTerreo;

    //Constructor
    public Terreno() {
    }

    public Terreno(String tipoTerreo) {
        this.tipoTerreo = tipoTerreo;
    }

    public String getTipoTerreo() {
        return tipoTerreo;
    }

    public void setTipoTerreo(String tipoTerreo) {
        this.tipoTerreo = tipoTerreo;
    }
}
