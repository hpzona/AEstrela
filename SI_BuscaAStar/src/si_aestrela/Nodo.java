/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package si_aestrela;

public class Nodo {

    private int custoG = 0;
    private int custoH = 9999;
    private int x = 0;
    private int y = 0;
    private Nodo pai = null;

    public Nodo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getCustoF() {
        return custoG + custoH;
    }

    public int getCustoG() {
        return custoG;
    }

    public void setCustoG(int custoG) {
        this.custoG = custoG;
    }

    public int getCustoH() {
        return custoH;
    }

    public void setCustoH(int custoH) {
        this.custoH = custoH;
    }

    public int getX() {
        return x;
    }

    public void setPosicaoX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setPosicaoY(int y) {
        this.y = y;
    }

    public Nodo getPai() {
        return pai;
    }

    public void setPai(Nodo pai) {
        this.pai = pai;
    }

    @Override
    public boolean equals(Object obj) {
        return (((Nodo) obj).getX() == x && ((Nodo) obj).getY() == y);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.x;
        hash = 97 * hash + this.y;
        return hash;
    }
}
