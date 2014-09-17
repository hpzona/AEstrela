package si_aestrela;


public class Principal {

    public static void main(String[] args) {

        //initialize the graph base on the Romania map
        Nodo n1 = new Nodo("Arad", 366);
        Nodo n2 = new Nodo("Zerind", 374);
        Nodo n3 = new Nodo("Oradea", 380);
        Nodo n4 = new Nodo("Sibiu", 253);
        Nodo n5 = new Nodo("Fagaras", 178);
        Nodo n6 = new Nodo("Rimnicu Vilcea", 193);
        Nodo n7 = new Nodo("Pitesti", 98);
        Nodo n8 = new Nodo("Timisoara", 329);
        Nodo n9 = new Nodo("Lugoj", 244);
        Nodo n10 = new Nodo("Mehadia", 241);
        Nodo n11 = new Nodo("Drobeta", 242);
        Nodo n12 = new Nodo("Craiova", 160);
        Nodo n13 = new Nodo("Bucharest", 0);
        Nodo n14 = new Nodo("Giurgiu", 77);
//initialize the edges

//Arad
        n1.setAdjacentes(new Borda[]{
            new Borda(n2, 75),
            new Borda(n4, 140),
            new Borda(n8, 118)
        });
//Zerind
        n2.setAdjacentes(new Borda[]{
            new Borda(n1, 75),
            new Borda(n3, 71)
        });

//Oradea
        n3.setAdjacentes(new Borda[]{
            new Borda(n2, 71),
            new Borda(n4, 151)
        });

//Sibiu
        n4.setAdjacentes(new Borda[]{
            new Borda(n1, 140),
            new Borda(n5, 99),
            new Borda(n3, 151),
            new Borda(n6, 80),});

//Fagaras
        n5.setAdjacentes(new Borda[]{
            new Borda(n4, 99),
            //178
            new Borda(n13, 211)
        });
//Rimnicu Vilcea
        n6.setAdjacentes(new Borda[]{
            new Borda(n4, 80),
            new Borda(n7, 97),
            new Borda(n12, 146)
        });
//Pitesti
        n7.setAdjacentes(new Borda[]{
            new Borda(n6, 97),
            new Borda(n13, 101),
            new Borda(n12, 138)
        });
//Timisoara
        n8.setAdjacentes(new Borda[]{
            new Borda(n1, 118),
            new Borda(n9, 111)
        });
//Lugoj
        n9.setAdjacentes(new Borda[]{
            new Borda(n8, 111),
            new Borda(n10, 70)
        });

//Mehadia
        n10.setAdjacentes(new Borda[]{
            new Borda(n9, 70),
            new Borda(n11, 75)
        });
//Drobeta
        n11.setAdjacentes(new Borda[]{
            new Borda(n10, 75),
            new Borda(n12, 120)
        });

//Craiova
        n12.setAdjacentes(new Borda[]{
            new Borda(n11, 120),
            new Borda(n6, 146),
            new Borda(n7, 138)
        });

//Bucharest
        n13.setAdjacentes(new Borda[]{
            new Borda(n7, 101),
            new Borda(n14, 90),
            new Borda(n5, 211)
        });
//Giurgiu
        n14.setAdjacentes(new Borda[]{
            new Borda(n13, 90)
        });

        BuscaAEstrela.buscar(n1, n13);
        System.out.println("Fim da Busca");

    }

//MATRIZ DAS CIDADES
/*        int[][] matriz = {
     {0, 70, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
     {70, 0, 80, 140, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
     {20, 80, 0, 100, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
     {0, 140, 100, 0, 120, 190, 50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
     {0, 0, 100, 120, 0, 70, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
     {0, 0, 0, 190, 70, 0, 220, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
     {0, 0, 0, 50, 0, 220, 0, 60, 0, 0, 0, 0, 0, 0, 0, 40, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
     {0, 0, 0, 0, 0, 0, 60, 0, 0, 0, 0, 0, 0, 0, 0, 40, 30, 45, 0, 0, 0, 0, 0, 0, 0, 0, 0},
     {0, 10, 0, 0, 0, 0, 0, 0, 0, 50, 70, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
     {0, 0, 0, 0, 0, 0, 0, 0, 50, 0, 0, 0, 0, 0, 85, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
     {0, 0, 0, 0, 0, 0, 0, 0, 70, 0, 0, 80, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 80, 0, 130, 70, 85, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 130, 0, 80, 0, 0, 135, 0, 0, 0, 140, 0, 0, 0, 0, 0, 0},
     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 70, 80, 0, 80, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
     {0, 0, 0, 0, 0, 0, 0, 0, 0, 85, 0, 85, 0, 80, 0, 90, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
     {0, 0, 0, 0, 0, 0, 40, 40, 0, 110, 0, 0, 0, 0, 90, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
     {0, 0, 0, 0, 0, 0, 0, 30, 0, 0, 0, 0, 135, 0, 0, 0, 0, 15, 0, 80, 0, 0, 0, 0, 0, 0, 0},
     {0, 0, 0, 0, 0, 0, 0, 45, 0, 0, 0, 0, 0, 0, 0, 0, 15, 0, 110, 0, 0, 0, 0, 0, 0, 0, 0},
     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 0, 40, 0, 0, 0, 70, 0, 65, 0},
     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 80, 0, 40, 0, 80, 0, 0, 0, 0, 0, 0},
     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 140, 0, 0, 0, 0, 0, 0, 80, 0, 25, 0, 0, 0, 0, 0},
     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 25, 0, 27, 35, 0, 0, 0},
     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 27, 0, 0, 40, 0, 0},
     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 70, 0, 0, 35, 0, 0, 15, 8, 0},
     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 40, 15, 0, 0, 35},
     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 65, 0, 0, 0, 0, 8, 0, 0, 17},
     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 35, 17, 0}
     };*/
    
}
