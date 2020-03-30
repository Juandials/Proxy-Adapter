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
public class ObjetoEspecifico extends Objeto{
private ObjetoAdaptado a;
    @Override
    public String metodo() {
        this.a = new ObjetoAdaptado();
        a.metodoAdaptado();
        return a.metodoAdaptado();
    }
    
}
