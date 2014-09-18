/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package si_aestrela;

class Nodo {

    private final String valor;
    private double valorG;
    private double valorH;
    private double valorF = 0;
    private Nodo pai;
    private Borda[] adjacentes;

    public Nodo(String valor, double valorH) {
        this.valor = valor;
        this.valorH = valorH;
    }

    public String getValor() {
        return valor;
    }

    public double getValorG() {
        return valorG;
    }

    public void setValorG(double valorG) {
        this.valorG = valorG;
    }

    public double getValorF() {
        return valorF;
    }

    public void setValorF(double valorF) {
        this.valorF = valorF;
    }

    public Nodo getPai() {
        return pai;
    }

    public void setPai(Nodo pai) {
        this.pai = pai;
    }

    public Borda[] getAdjacentes() {
        return adjacentes;
    }

    public void setAdjacentes(Borda[] adjacentes) {
        this.adjacentes = adjacentes;
    }

    double getValorH() {
        return this.valorH;
    }

    void setValorH(double custo) {
        this.valorH = custo;
    }

    public Borda getAdj(Nodo a) {
        for (Borda b : adjacentes) {
            if (a.getValor().equalsIgnoreCase(b.getAlvo().getValor())) {
                return b;
            }
        }
        return null;
    }

}
