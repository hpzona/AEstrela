/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package si_aestrela;

public class Borda {

    public final double custo;
    public final Nodo alvo;

    public Borda(Nodo alvo, double custo) {
        this.alvo = alvo;
        this.custo = custo;
    }

    public double getCusto() {
        return custo;
    }

    public Nodo getAlvo() {
       return alvo;
    }
    
    
}
