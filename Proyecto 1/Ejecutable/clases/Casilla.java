package JuegoMover;

abstract public class Casilla {
    protected final char CUADRO = (char)182;
    protected static final String ANSI_RED = "\u001B[31m";
    protected static final String ANSI_WHITE = "\u001B[37m";
    protected static final String ANSI_YELLOW = "\u001B[33m";
    protected static final String ANSI_BLUE = "\u001B[34m";
    protected static final String ANSI_GREEN="\u001B[42m";
   

    Casilla(){
      
    }

   





    String getLine1(){
          return getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+"  "+getCuadroColor();
    }

    String getLine2(){
        return getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+"  "+getCuadroColor();
    }

  
    abstract String getCuadroColor();


}
