package si_aestrela;

import java.text.NumberFormat;

public class Principal {

    public static void main(String[] args) {

        double tempototal = 0.0;
        double memoriatotal = 0.0;

        double tempoinicial = System.currentTimeMillis();

        Nodo n1 = new Nodo("Florianopolis", 160.24);
        Nodo n2 = new Nodo("Itajai", 155.94);
        Nodo n3 = new Nodo("Palhoca", 156.48);
        Nodo n4 = new Nodo("Bom Retiro", 132);
        Nodo n5 = new Nodo("Laguna", 157.67);
        Nodo n6 = new Nodo("Ararangua", 141.56);
        Nodo n7 = new Nodo("Lages", 106.77);
        Nodo n8 = new Nodo("Campos Novos", 77.49);
        Nodo n9 = new Nodo("Navegantes", 156.66);
        Nodo n10 = new Nodo("Blumenau", 143.67);
        Nodo n11 = new Nodo("Joinville", 152.82);
        Nodo n12 = new Nodo("Mafra", 125.42);
        Nodo n13 = new Nodo("Porto Uniao", 86.32);
        Nodo n14 = new Nodo("Canoinhas", 106.98);
        Nodo n15 = new Nodo("Monte Castelo", 109.71);
        Nodo n16 = new Nodo("Ponte Alta", 103.56);
        Nodo n17 = new Nodo("Herval Doeste", 68.53);
        Nodo n18 = new Nodo("Capinzal", 65.22);
        Nodo n19 = new Nodo("Chapeco", 34.05);
        Nodo n20 = new Nodo("Xanxere", 41.51);
        Nodo n21 = new Nodo("Sao Lourenco", 36.62);
        Nodo n22 = new Nodo("Campo Ere", 30.79);
        Nodo n23 = new Nodo("Dionisio Cerqueira", 28.06);
        Nodo n24 = new Nodo("Maravilha", 20.80);
        Nodo n25 = new Nodo("Sao Miguel do Oeste", 14.97);
        Nodo n26 = new Nodo("Irai", 14.30);
        Nodo n27 = new Nodo("Itapiranga", 0);
//initialize the edges

//Florianópolis
        n1.setAdjacentes(new Borda[]{
            new Borda(n2, 70), //Itajai
            new Borda(n3, 20), //Palhoca
        });

//Itajai
        n2.setAdjacentes(new Borda[]{
            new Borda(n1, 70), //Florianópolis
            new Borda(n3, 80), //Palhoca
            new Borda(n4, 140), //Bom Retiro
            new Borda(n9, 10) //Navegantes
        });

//Palhoca
        n3.setAdjacentes(new Borda[]{
            new Borda(n1, 20), //Florianópolis  
            new Borda(n2, 80), //Itajai
            new Borda(n4, 100), //Bom Retiro
            new Borda(n5, 100) //Laguna
        });

//Bom Retiro
        n4.setAdjacentes(new Borda[]{
            new Borda(n2, 140), //Itajai
            new Borda(n3, 100), //Palhoca
            new Borda(n5, 120), //Laguna
            new Borda(n6, 190), //Ararangua
            new Borda(n7, 50) //Lages
        });

//Laguna
        n5.setAdjacentes(new Borda[]{
            new Borda(n3, 100), //Palhoca
            new Borda(n4, 120), //Bom Retiro
            new Borda(n6, 70) //Ararangua
        });

//Ararangua
        n6.setAdjacentes(new Borda[]{
            new Borda(n5, 70), //Laguna
            new Borda(n4, 190), //Bom Retiro
            new Borda(n7, 220) //Lages
        });

//Lages
        n7.setAdjacentes(new Borda[]{
            new Borda(n4, 50), //Bom Retiro
            new Borda(n6, 220), //Ararangua
            new Borda(n8, 60), //Campos Novos
            new Borda(n16, 40) //Ponte Alta
        });

//Campos Novos
        n8.setAdjacentes(new Borda[]{
            new Borda(n7, 60), //Lages
            new Borda(n16, 40), //Ponte Alta
            new Borda(n17, 30), //Herval Doeste
            new Borda(n18, 45) //Capinzal
        });

//Navegantes
        n9.setAdjacentes(new Borda[]{
            new Borda(n2, 10), //Itajai
            new Borda(n10, 50), //Blumenau
            new Borda(n11, 70) //Joinville
        });

//Blumenau
        n10.setAdjacentes(new Borda[]{
            new Borda(n9, 50), //Navegantes
            new Borda(n15, 85), //Monte Castelo
            new Borda(n16, 110) //Ponte Alta
        });

//Joinville
        n11.setAdjacentes(new Borda[]{
            new Borda(n9, 70), //Navegantes
            new Borda(n12, 80), //Mafra
        });

//Mafra
        n12.setAdjacentes(new Borda[]{
            new Borda(n11, 80), //Joinville
            new Borda(n13, 130), //Porto Uniao
            new Borda(n14, 70), //Canoinhas
            new Borda(n15, 85), //Monte Castelo
        });

//Porto Uniao
        n13.setAdjacentes(new Borda[]{
            new Borda(n12, 130), //Mafra
            new Borda(n14, 80), //Canoinhas
            new Borda(n17, 135), //Herval Doeste
            new Borda(n21, 140) //Sao Lourenco
        });

//Canoinhas
        n14.setAdjacentes(new Borda[]{
            new Borda(n12, 70), //Mafra
            new Borda(n13, 80), //Porto Uniao
            new Borda(n15, 80) //Monte Castelo
        });

//Monte Castelo
        n15.setAdjacentes(new Borda[]{
            new Borda(n12, 85), //Mafra
            new Borda(n14, 80), //Canoinhas
            new Borda(n16, 90), //Ponte Alta
            new Borda(n10, 85) //Blumenau
        });

//Ponte Alta
        n16.setAdjacentes(new Borda[]{
            new Borda(n7, 40), //Lages
            new Borda(n8, 40), //Campos Novos
            new Borda(n10, 110), //Blumenau
            new Borda(n15, 90) //Monte Castelo
        });

//Herval Doeste
        n17.setAdjacentes(new Borda[]{
            new Borda(n8, 30), //Campos Novos
            new Borda(n13, 135), //Porto Uniao
            new Borda(n18, 15), //Capinzal
            new Borda(n20, 80) //Xanxere
        });

//Capinzal
        n18.setAdjacentes(new Borda[]{
            new Borda(n8, 45), //Campos Novos
            new Borda(n17, 15), //Herval Doeste
            new Borda(n19, 110) //Chapeco
        });

//Chapeco
        n19.setAdjacentes(new Borda[]{
            new Borda(n18, 110), //Capinzal
            new Borda(n20, 40), //Xanxere
            new Borda(n24, 70), //Maravilha
            new Borda(n26, 65) //Irai
        });

//Xanxere
        n20.setAdjacentes(new Borda[]{
            new Borda(n19, 40), //Chapeco
            new Borda(n17, 80), //Herval Doeste
            new Borda(n21, 80) //Sao Lourenco
        });

//Sao Lourenco
        n21.setAdjacentes(new Borda[]{
            new Borda(n13, 140), //Porto Uniao
            new Borda(n20, 80), //Xanxere
            new Borda(n22, 25) //Campo Ere
        });

//Campo Ere
        n22.setAdjacentes(new Borda[]{
            new Borda(n21, 25), //Sao Lourenco
            new Borda(n23, 27), //Dionisio Cerqueira
            new Borda(n24, 35) //Maravilha
        });

//Dionisio Cerqueira
        n23.setAdjacentes(new Borda[]{
            new Borda(n22, 27), //Campo Ere
            new Borda(n25, 40) //Sao Miguel do Oeste
        });

//Maravilha
        n24.setAdjacentes(new Borda[]{
            new Borda(n19, 70),//Chapeco
            new Borda(n22, 35), //Campo Ere
            new Borda(n25, 15), //Sao Miguel do Oeste
            new Borda(n26, 8) //Irai
        });

//Sao Miguel do Oeste
        n25.setAdjacentes(new Borda[]{
            new Borda(n23, 40), //Dionisio Cerqueira
            new Borda(n24, 15), //Maravilha
            new Borda(n27, 35) //Itapiranga
        });

//Irai
        n26.setAdjacentes(new Borda[]{
            new Borda(n19, 65),//Chapeco
            new Borda(n24, 8), //Maravilha
            new Borda(n27, 17) //Itapiranga
        });

//Itapiranga
        n27.setAdjacentes(new Borda[]{
            new Borda(n25, 35), //Sao Miguel do Oeste
            new Borda(n26, 17) //Irai
        });

        System.out.println("Caminho Percorrido: ");
        BuscaAEstrela.buscar(n1, n27);

        double tempofinal = System.currentTimeMillis();
        tempototal = (tempofinal - tempoinicial);
        System.out.println("\nTempo de Execução: " + tempototal + " milisegundos");

        Runtime runtime = Runtime.getRuntime();
        NumberFormat format = NumberFormat.getInstance();
        memoriatotal = runtime.totalMemory();
        System.out.println("\nMemória Alocada: " + format.format(memoriatotal / 1024));

    }
}
