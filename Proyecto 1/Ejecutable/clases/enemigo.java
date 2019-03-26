/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoMover;
abstract public class enemigo  extends persona{
    protected final char CUADRO = (char)182;
    protected static final String ANSI_RED = "\u001B[31m";
    protected static final String ANSI_WHITE = "\u001B[37m";
    protected static final String ANSI_YELLOW = "\u001B[33m";
    protected static final String ANSI_BLUE = "\u001B[34m";
    protected static final String ANSI_GREEN="\u001B[42m";
   

 
        protected String nombreEnemigo;

    public enemigo(String nombrePersona, int cantidadVida) {
        super(nombrePersona, cantidadVida);
    }

    public String getNombreEnemigo() {
        return nombreEnemigo;
    }

    public void setNombreEnemigo(String nombreEnemigo) {
        this.nombreEnemigo = nombreEnemigo;
    }

    @Override
    public String getNombrePersona() {
        return nombrePersona;
    }

    @Override
    public int getCantidadVida() {
        return cantidadVida;
    }
    
    

  String getLine1(){
          return getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+"  "+getCuadroColor();
    }

    String getLine2(){
        return getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+"  "+getCuadroColor();
    }

  
    abstract String getCuadroColor();


}