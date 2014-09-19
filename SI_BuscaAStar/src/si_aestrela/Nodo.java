/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package si_aestrela;

class Nodo {

    private final String nome;
    private double valorG;
    private double valorH;
    private double valorF = 0;
    private Nodo anterior;
    private Borda[] adjacentes;

    public Nodo(String valor, double valorH) {
        this.nome = valor;
        this.valorH = valorH;
    }

    public String getNome() {
        return nome;
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

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo pai) {
        this.anterior = pai;
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
            if (a.getNome().equalsIgnoreCase(b.getCidade().getNome())) {
                return b;
            }
        }
        return null;
    }

}
