public class Principal {

    public static void main(String[] args) {

        //MATRIZ DAS CIDADES
        int[][] matriz = {
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
        };
        
        
        Quadrado[][] grade = new Quadrado[26][26];
        for (int i = 0; i < grade.length; i++) {
            for (int j = 0; j < grade[i].length; j++) {
                grade[i][j] = new Quadrado(i, j);
                grade[i][j].setCustoG(matriz[i][j]);
            }
        }

        //configura grade
        Quadrado origem = grade[0][0];
        Quadrado destino = grade[25][25];

        AEstrela aStar = new AEstrela(grade, origem, destino);

        long tempo1 = System.nanoTime();
        boolean pesquisaOk = aStar.iniciarPesquisa();
        long tempo2 = System.nanoTime();
        System.out.println("Tempo de pesquisa: " + (tempo2 - tempo1) + "ns");

        /*if (pesquisaOk) {
            System.out.println("Caminho:");
            System.out.println("X\tY");

            //lista caminho encontrado
            for (int i = 0; i < aStar.getListaCaminho().size(); i++) {
                System.out.println(aStar.getListaCaminho().get(i).getX()
                        + "\t" + aStar.getListaCaminho().get(i).getY());
            }
        } else {
            System.out.println("Caminho nao foi encontrado.");
        }*/

        //imprime em forma de matriz
        for (int i = 0; i < grade.length; i++) {
            System.out.println("");
            for (int j = 0; j < grade[i].length; j++) {
                if (origem.getX() == j && origem.getY() == i) {
                    System.out.print("[O]");
                } else if (destino.getX() == j && destino.getY() == i) {
                    System.out.print("[D]");
                } else {
                    boolean isCaminho = false;
                    for (int k = 0; k < aStar.getListaCaminho().size(); k++) {
                        if (aStar.getListaCaminho().get(k).getX() == j && aStar.getListaCaminho().get(k).getY() == i) {
                            System.out.print("[*]");
                            isCaminho = true;
                            break;
                        }
                    }
                    boolean isBloqueio = false;
                    for (int k = 0; k < aStar.getListaBloqueios().size(); k++) {
                        if (aStar.getListaBloqueios().get(k).getX() == j && aStar.getListaBloqueios().get(k).getY() == i) {
                            System.out.print("[X]");
                            isBloqueio = true;
                            break;
                        }
                    }
                    if (!isCaminho && !isBloqueio) {
                        System.out.print("[ ]");
                    }
                }

            }
        }
        System.out.println("");
    }
}
