/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.controlo;

import agenda.modelo.Cor;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author DGTALE
 */
@Named(value = "corCDIBean")
@RequestScoped
public class CorCDIBean {

   Cor cor;
   @PostConstruct
   public void inicializar(){
    cor = new Cor();
   }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }
   
   public String mostraCor(){
   return "Cor escolhida"+getCor().getNomeCor();
   }
}
