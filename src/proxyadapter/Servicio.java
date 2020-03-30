/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxyadapter;

/**
 *
 * @author Juan
 */
public class Servicio implements Proxy{
    public String mensaje (String usuario){
        return "Bienvenido " + usuario + " patron proxy implementado :D";
    }
}
