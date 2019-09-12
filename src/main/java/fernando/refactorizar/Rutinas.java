/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fernando.refactorizar;

/**
 *
 * @author Matias Villarreal
 */
public class Rutinas {

    /*
    *  Devuelve una opcion (enum Opciones) segun el indice op
    */
    public static Opciones getOpcion(int op) {
        Opciones opcion;
        switch(op) {
            case 1:
                opcion = Opciones.PIEDRA;
                break;
            case 2:
                opcion = Opciones.PAPEL;
                break;
            case 3:
                opcion = Opciones.TIJERA;
                break;
            default:
                //Elijo un valor por default por su falla el random.
                opcion = Opciones.PIEDRA;
        }
        return opcion;
    }
    
    
    /*
    *  Devuelve una opcion (enum Opciones) de manera
    *  aleatoria.
    */
    public static Opciones getOpcionRandom() {
        Opciones opcion;
        int i = (int)(Math.random() * 3);
        switch(i) {
            case 0:
                opcion = Opciones.PIEDRA;
                break;
            case 1:
                opcion = Opciones.PAPEL;
                break;
            case 2:
                opcion = Opciones.TIJERA;
                break;
            default:
                //Elijo un valor por default por su falla el random.
                opcion = Opciones.PIEDRA;
        }
        return opcion;
    }
    
    /*
    *  Evalua los valores de op1 y op2 (enum Opciones) y determina si
    *  op1 GANA, EMPATA o PIERDE.
    */
    public static Resultados getResultado(Opciones op1, Opciones op2){
        Resultados resultado;
        if(op1.equals(op2)){
            resultado = Resultados.EMPATA;
        }else{
            switch (op1){
                case PAPEL:
                    resultado = (op2.equals(Opciones.PIEDRA))?Resultados.GANA:Resultados.PIERDE;
                    break;
                case TIJERA:
                    resultado = (op2.equals(Opciones.PAPEL))?Resultados.GANA:Resultados.PIERDE;
                    break;
                case PIEDRA:
                    resultado = (op2.equals(Opciones.TIJERA))?Resultados.GANA:Resultados.PIERDE;
                    break;
                default:
                    //Devuelvo por defecto este valor, por si falla el switch
                    resultado = Resultados.EMPATA;
                    break;
            }
        }
        return resultado;
    }
    
}
