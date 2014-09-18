/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package si_aestrela;

import java.util.AbstractQueue;
import java.util.PriorityQueue;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BuscaAEstrela {

    /*    public static List<Nodo> printPath(Nodo target) {
     List<Nodo> path = new ArrayList<Nodo>();
     for (Nodo node = target; node != null; node = node.getPai()) {
     path.add(node);
     }

     Collections.reverse(path);

     return path;
     }*/
    public static List<Nodo> buscar(Nodo origem, Nodo destino) {

        Set<Nodo> visitado = new HashSet<Nodo>();
        ArrayList<Nodo> abertas = new ArrayList<>();
        ArrayList<Nodo> fechadas = new ArrayList<>();
        PriorityQueue<Nodo> fila = new PriorityQueue<Nodo>(20,
                new Comparator<Nodo>() {
                    public int compare(Nodo i, Nodo j) {
                        if (i.getValorF() > j.getValorF()) {
                            return 1;
                        } else if (i.getValorF() < j.getValorF()) {
                            return -1;
                        } else {
                            return 0;
                        }
                    }

                }
        );

        origem.setValorG(0);
        abertas.add(origem);
        fila.add(origem);
        boolean encontrou = false;
        Nodo encontrado = null;

        while ((!fila.isEmpty()) && (!encontrou)) {

//Primeiro da fila = Com menor custo F
            Nodo atual = fila.poll();
            abertas.remove(atual);

            if (atual.getValor().equals(destino.getValor())) {
                encontrou = true;
                encontrado = atual;
            }

            fechadas.add(atual);

//Percorre todos os adjacentes
            for (Borda e : atual.getAdjacentes()) {

                int index = fechadas.indexOf(e.getAlvo());

                if (index < 0) {
                    double g = atual.getValorG() + e.getCusto();
                    double f = g + e.getAlvo().getValorH();
                    
                    index = abertas.indexOf(e.getAlvo());
                    Nodo aux;
                    if (index < 0){
                        aux = e.getAlvo();
                        aux.setValorG(g);
                        aux.setValorF(f);
                        aux.setPai(atual);
                        fila.add(aux);
                    } else if (g < abertas.get(index).getValorG()) {
                        aux = e.getAlvo();
                        aux.setPai(atual);
                        aux.setValorG(g);
                        aux.setValorF(f);
                        aux.setValorH(e.getCusto());
                    }
                }
            }
        }

        if (encontrou) {
            Stack<Nodo> pilha = new Stack<Nodo>();
            List<Nodo> lista = new ArrayList<Nodo>();
            

            pilha.push(encontrado);
            Nodo anterior = encontrado.getPai();

            while (anterior != null) {
                pilha.push(anterior);
                anterior = anterior.getPai();
            }

            while (pilha.size() > 0) {
                System.out.print(pilha.peek().getValor() + ">>>>");
                lista.add(pilha.pop());
            }

            System.out.println("TOTAL = " + lista.get(lista.size()-1).getValorF());
            return lista;
        }
        return null;
    }
}

/*double custoAtual = e.getCusto();
 double novoG = atual.getValorG() + custoAtual;
 double novoF = novoG + adj.getValorH();

 //E se ele não for visitado e nova conta do F é menor que o calculo antigo ou ele não está na fila
 if ((visitado.contains(adj) || fila.contains(adj))
 && novoF >= adj.getValorF()) {                 adj.setValorG(novoG);
 adj.setValorF(novoF);
 } else if (!fila.contains(adj)
 || novoF < adj.getValorF()) {

 adj.setPai(atual);
 adj.setValorG(novoG);
 adj.setValorF(novoF);
 total += e.getCusto();

 if (fila.contains(adj)) {
 fila.remove(adj);
 }

 fila.add(adj);

 }


 }
 }

 System.out.println("TOTAL = " + total);
 }

 }*/
