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
public class ProxyAdapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Servicio a = new Servicio();
        System.out.println(a.mensaje("Profe daza"));
        ObjetoEspecifico b = new ObjetoEspecifico();
        System.out.println(b.metodo());
    }
    
}
