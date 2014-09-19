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

            if (atual.getNome().equals(destino.getNome())) {
                encontrou = true;
                encontrado = atual;
            }

            fechadas.add(atual);

//Percorre todos os adjacentes
            for (Borda e : atual.getAdjacentes()) {

                int index = fechadas.indexOf(e.getCidade());

                if (index < 0) {
                    double g = atual.getValorG() + e.getCusto();
                    double f = g + e.getCidade().getValorH();
                    
                    index = abertas.indexOf(e.getCidade());
                    Nodo aux;
                    if (index < 0){
                        aux = e.getCidade();
                        aux.setValorG(g);
                        aux.setValorF(f);
                        aux.setAnterior(atual);
                        fila.add(aux);
                    } else if (g < abertas.get(index).getValorG()) {
                        aux = e.getCidade();
                        aux.setAnterior(atual);
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
            Nodo anterior = encontrado.getAnterior();

            while (anterior != null) {
                pilha.push(anterior);
                anterior = anterior.getAnterior();
            }

            while (pilha.size() > 1) {
                System.out.print(pilha.peek().getNome() + " >>>> ");
                lista.add(pilha.pop());
            }
            System.out.print(pilha.peek().getNome());
            lista.add(pilha.pop());

            System.out.println("\n\nDistancia Total: " + lista.get(lista.size()-1).getValorF());
            return lista;
        }
        return null;
    }
}
