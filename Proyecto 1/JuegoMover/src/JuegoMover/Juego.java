package JuegoMover;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    Scanner lee = new Scanner(System.in);

    Casilla[][] tablero;

    public Juego() {

        tablero = new Casilla[8][8];
        iniciarTablero();

    }

    public void jugar() {
        mensaje();
    }

    public void mensaje() {
        int menu;

        System.out.println("BIENVENIDO A ESTE JUEGO ");
        System.out.println("le ofrecemos  3 escenarios ");
        System.out.println("1   Primer escenario");
        System.out.println("2   Segundo Escenario");
        System.out.println("3   Tercer Escenario");
        System.out.println("4 Crear un nuevo Escenario");
        System.out.println("5   Salir");
        menu = lee.nextInt();

        do {
            switch (menu) {

                case 1:

                    System.out.println("Este escenario cuenta cuenta con lo siguiente ");
                    System.out.println("El color rojo   son los volcanes ");
                    System.out.println("El color azul  es  agua ");
                    System.out.println("El resto es camino normal ");

                    pintaTablero();
                    manejador();
                    break;

                case 2:
                    iniciarTablero2();
                    manejador();

                    break;

                case 3:

                    break;

                case 4:
                   crearNuevoTablero();
                    manejador();
                    break;

                case 5:
                    System.exit(0);
                    break;

            }

        } while (menu == 4);

    }

    public void crearNuevoTablero() {
        String vehiculo = "#";
        int posColumna = 0;
        int posFila = 0;
        int posFilaSiguiente, posColumSiguiente;
        Terreno matriz[][];//creamos nuestra matriz 
        Terreno terrenoAlmacenado = new Terreno("tierra"); //creamos una variable para que se quede guardada  la posicion anterios antes de coloar alfo ai .
        int numFilas, numColumnas;

        //comenzamos  a armar nuestro escenario pregunadole al usuario el numero de cada columna y fila 
        System.out.println("Ingrese el numero de filas");
        numFilas = lee.nextInt();
        System.out.println("Ingrese el numero de columnas");
        numColumnas = lee.nextInt();
        matriz = new Terreno[numFilas][numColumnas];
        for (int i = 0; i < numFilas; i++) {//condicionamos nuestro for para que no se pase de lo establecido 
            for (int j = 0; j < numColumnas; j++) {
                System.out.println(" El tanque es () ");
                System.out.println(" El avion  es  (^)");
                System.out.println(" Agua (-)");
                System.out.println(" Tierra (~)");
                System.out.println("Volcanes (⌂)");
                System.out.println("Ingrese la informacion en " + i + ", " + j);
                String tipoTerreno = lee.next();
                Terreno terreno1 = new Terreno(tipoTerreno);
                matriz[i][j] = terreno1;
            }
        }
        System.out.println();
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                System.out.print(matriz[i][j].getTipoTerreo() + " " + "\t");
            }
            System.out.println();
        }
        // le Indicamos al usuario en donde se encuentra para que pueda movilizarse 
        System.out.println("Ud. se encuentra en 0,0\n");
        int contador = 0;
        while (contador == 0) {
            System.out.println("Ingrese hacia donde se quiere mover");
            String tecla = lee.next();
            switch (tecla) {

                case "w":
                    if (posFila == 0) {
                        System.out.println("No se puede mover hacia arriba");
                    } else {
                        matriz[posFila][posColumna] = terrenoAlmacenado;
                        posFilaSiguiente = posFila - 1;
                        terrenoAlmacenado.setTipoTerreo(matriz[posFilaSiguiente][posColumna].getTipoTerreo());
                        posFila--;
                        System.out.println("Ahora esta en " + posFila + ", " + posColumna);
                        Terreno cambioTerreno = new Terreno(vehiculo);
                        matriz[posFila][posColumna] = cambioTerreno;
                        System.out.println();

                        for (int i = 0; i < numFilas; i++) {
                            for (int j = 0; j < numColumnas; j++) {
                                System.out.print(matriz[i][j].getTipoTerreo() + " " + "\t");
                            }
                            System.out.println();
                        }
                    }
                    break;
                case "s":
                    if (posFila == numFilas - 1) {
                        System.out.println("No se puede mover hacia abajo");
                    } else {
                        matriz[posFila][posColumna] = terrenoAlmacenado;
                        posFilaSiguiente = posFila + 1;
                        terrenoAlmacenado.setTipoTerreo(matriz[posFilaSiguiente][posColumna].getTipoTerreo());
                        posFila++;
                        System.out.println("Ahora esta en " + posFila + ", " + posColumna);
                        Terreno cambioTerreno = new Terreno(vehiculo);
                        matriz[posFila][posColumna] = cambioTerreno;
                        System.out.println();
                        for (int i = 0; i < numFilas; i++) {
                            for (int j = 0; j < numColumnas; j++) {
                                System.out.print(matriz[i][j].getTipoTerreo() + " " + "\t");
                            }
                            System.out.println();
                        }
                    }
                    break;
                case "a":
                    if (posColumna == 0) {
                        System.out.println("No se puede mover hacia la izquierda");
                    } else {
                        matriz[posFila][posColumna] = terrenoAlmacenado;
                        posColumSiguiente = posColumna - 1;
                        terrenoAlmacenado.setTipoTerreo(matriz[posFila][posColumSiguiente].getTipoTerreo());
                        posColumna--;
                        System.out.println("Ahora esta en " + posFila + ", " + posColumna);
                        Terreno cambioTerreno = new Terreno(vehiculo);
                        matriz[posFila][posColumna] = cambioTerreno;
                        System.out.println();
                        for (int i = 0; i < numFilas; i++) {
                            for (int j = 0; j < numColumnas; j++) {
                                System.out.print(matriz[i][j].getTipoTerreo() + " " + "\t");
                            }
                            System.out.println();
                        }
                    }
                    break;
                case "d":
                    if (posColumna == numColumnas - 1) {
                        System.out.println("No se puede mover hacia la derecha");
                    } else {
                        matriz[posFila][posColumna] = terrenoAlmacenado;
                        posColumSiguiente = posColumna + 1;
                        terrenoAlmacenado.setTipoTerreo(matriz[posFila][posColumSiguiente].getTipoTerreo());
                        posColumna++;
                        System.out.println("Ahora esta en " + posFila + ", " + posColumna);
                        Terreno cambioTerreno = new Terreno(vehiculo);
                        matriz[posFila][posColumna] = cambioTerreno;
                        System.out.println();
                        for (int i = 0; i < numFilas; i++) {
                            for (int j = 0; j < numColumnas; j++) {
                                System.out.print(matriz[i][j].getTipoTerreo() + " " + "\t");
                            }
                            System.out.println();
                        }
                    }
                    break;
            }
        }

    }
    

    public void iniciarTablero() {//comenzamos a armar nuestro primer escenario 
        boolean blanco = true;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                tablero[i][j] = new CasillaBlanca();// diseñamos  a l gusto de nosotros y lo  condicionamos en que lugares pueden haver agua o en donde puedan estar los volcanes 
                if (i == 0 || i == 6) {
                    tablero[i][j] = new CasillaTierra();
                }

                if (i == 1 || i == 5) {
                    tablero[i][j] = new CasillaAgua();
                }
                if (i == 2 || i == 4) {
                    tablero[i][j] = new CasillaNegra();
                }

            }

        }

    }
    
    public void iniciarTablero2(){
        
         boolean blanco = true;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                tablero[i][j] = new CasillaBlanca();
                if (i == 4 || i == 4) {
                    tablero[i][j] = new CasillaTierra();
                }

                if (i == 5 || i == 5) {
                    tablero[i][j] = new CasillaAgua();
                }
                if (i == 3 || i == 3) {
                    tablero[i][j] = new CasillaNegra();
                }

            }

        }
        
    }

    public void pintaTablero() {//imprimimos nuestro escenario 
        String linea1 = "\t";
        String linea2 = "\t";
        String linea3 = "\t";
        String linea4 = "\t";

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                linea1 = linea1 + tablero[i][j].getLine1();
                linea2 += tablero[i][j].getLine2();

                if (j == 7) {
                    linea2 += "  " + i + "    ";
                }
                if (i == 7) {
                    linea4 += "   " + j + "    ";
                }
            }
            System.out.println(linea1 + "");
            System.out.println(linea2 + " ");
            System.out.println(linea3 + " ");
            linea1 = "\t";
            linea2 = "\t";
            linea3 = "\t";
        }
        System.out.println(linea4 + "  ");

    }

    public void manejador() {

        inicioJuego();

    }
      // Declaramos variables para niestro combate algunas ya inicializados con un valor respectivo 
    String menuInicio = "0";
    String nombreUsuario = null;
    int medicina = 15;
    String nombreEnemigo;
    usuario miUsuario = new usuario(nombreUsuario, 100);

    ArrayList<enemigo> listaEnemigos = new ArrayList<>();

    void inicioJuego() {

        System.out.println("Digite un Nombre de ususario");// le pedimos un nombre al usuario 
        nombreUsuario = lee.next();

        while (menuInicio != "e") {

            System.out.println("a   Tomar medicina ");
            System.out.println("b   Atacar ");
            System.out.println("c   Ver vida oponentes ");
            System.out.println("d   Ver muestra Vida");
            System.out.println("f   Agregar enemigo");
            System.out.println("e     Rendirse r");
            menuInicio = lee.next();
            switch (menuInicio) {

                case "a":

                    añadirVida();
                    break;

                case "b":
                    System.out.println("Ingrese del nombre que quiera atacar ");
                    nombreEnemigo = lee.next();
                    atacamos(nombreEnemigo);
                    break;

                case "c":
                    mostrarVidaEnemigos();

                    break;

                case "d":
                    System.out.println("ahora tienes de vida " + miUsuario.getCantidadVida());
                    break;

                case "e":
                    System.exit(0);

                    break;

                case "f":
                    agregarEnemigos();
                    break;
                default:
                    break;
            }

        }

    }

    public void agregarEnemigos() {//agregaamos a nuestro enemigos aqui 
        String nombreEnemigo;
        int vidaEnemigo;

        System.out.println("ingrese el nombre del Enemigo ");
        nombreEnemigo = lee.next();
        System.out.println("ingrese cantidad de vida inicial ");
        vidaEnemigo = lee.nextInt();

        enemigo nuevoEnemigo = new enemigo(nombreEnemigo, vidaEnemigo) {
            @Override
            String getCuadroColor() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        listaEnemigos.add(nuevoEnemigo);//vamos agregandoa  nuestros enemigos en un lista 

    }

    public void añadirVida() {
        int vidaFinal;
        vidaFinal = medicina + miUsuario.getCantidadVida();//  vamos a saber cual es su vida final 
        miUsuario.setCantidadVida(vidaFinal);

    }

    public void atacamos(String enemigos) {// aqui solo le descontamos la vida en 10 a el enemigo si coinciden con el nombre y imprimimos la nueva vida del enemigo 
        

        for (int i = 0; i < listaEnemigos.size(); i++) {

            if (enemigos.equals(listaEnemigos.get(i).getNombrePersona())) {
                int nuevaVida = listaEnemigos.get(i).getCantidadVida() - 10;
                listaEnemigos.get(i).setCantidadVida(nuevaVida);
                
            }
        }

    }

    public void mostrarVidaEnemigos() {
        for (int i = 0; i < listaEnemigos.size(); i++) {
            System.out.println("el enemigo" + listaEnemigos.get(i).getNombreEnemigo() + "tiene vida " + listaEnemigos.get(i).getCantidadVida());

        }

    }

}
