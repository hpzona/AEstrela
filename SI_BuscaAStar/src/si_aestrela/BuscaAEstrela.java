/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package si_aestrela;

import java.util.PriorityQueue;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

public class BuscaAEstrela {

    /*    public static List<Nodo> printPath(Nodo target) {
     List<Nodo> path = new ArrayList<Nodo>();
     for (Nodo node = target; node != null; node = node.getPai()) {
     path.add(node);
     }

     Collections.reverse(path);

     return path;
     }*/
    public static void buscar(Nodo origem, Nodo destino) {

        Set<Nodo> visitado = new HashSet<Nodo>();

        //Deixa a lista organizada
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
        fila.add(origem);
        boolean encontrou = false;

        while ((!fila.isEmpty()) && (!encontrou)) {

//Primeiro da fila = Com menor custo F
            Nodo atual = fila.poll();
            System.out.print(atual.getValor() + " >>> ");
            visitado.add(atual);

            if (atual.getValor().equals(destino.getValor())) {
                encontrou = true;
            }

//Percorre todos os adjacentes
            for (Borda e : atual.getAdjacentes()) {
                Nodo adj = e.getAlvo();
                double custoAtual = e.getCusto();
                double novoG = atual.getValorG() + custoAtual;
                double novoF = novoG + adj.getValorH();

                //E se ele não for visitado e nova conta do F é menor que o calculo antigo ou ele não está na fila
                if (!((visitado.contains(adj))
                        && (novoF >= adj.getValorF())) && (((!fila.contains(adj))
                        || (novoF < adj.getValorF())))) {

                    adj.setPai(atual);
                    adj.setValorG(novoG);
                    adj.setValorF(novoF);

                    if (fila.contains(adj)) {
                        fila.remove(adj);
                    }

                    fila.add(adj);

                }

            }

        }

    }
}
