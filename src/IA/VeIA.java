package IA;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class VeIA {
    
    private Vertex vertex[] = new Vertex[5477];
    private Vertex mapa_vitoria[] = new Vertex[5477];
    private Vertex mapa_derrota[] = new Vertex[5477];
    private Vertex mapa_prox_jogada[] = new Vertex[5477];

    private char meuCaractere;
    private char opCaractere;

    private int i, c_vitorias = 0, c_jogadas = 0, c_derrotas = 0;
    private int grau;

    public VeIA() throws IOException{
        int i = 0;
        String linha;
        String caminho = "data/grafo.csv";
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(caminho), "UTF-8"));
        /* carrega todos os estados */
        while((linha = br.readLine()) != null) { 
            vertex[i] = new Vertex(linha.split(";")[0], Integer.parseInt(linha.split(";")[1].split("\\.")[1]));
            i++;
        }
        br.close();
    }
    /**
     * O metodo jogue retorna um inteiro representado a posicao que a IA jogou
     * @param label o estado atual do jogo em forma de string - ex '........O','X........'
     * @param numJogadas o numero da jogada ou de caracteres na board, no caso do ex do label - 1
     * @return retorna a jogada entre 0 e 8, ou -1 caso exista algum erro
     */
    public int jogue(String label, int numJogadas){
        if(numJogadas == 0){
            c_vitorias = 0;
            c_jogadas = 0;
            this.meuCaractere = 'O';
            this.opCaractere = 'X';

            for(i = 0; i < 5477; i++){
                grau = vertex[i].matches(label);
                if(grau >= 0 && vertex[i].vencedorO == true){
                    mapa_vitoria[c_vitorias] = new Vertex(vertex[i].label, vertex[i].numJogadas);
                    c_vitorias++;
                }
                else if(grau >= 0 && vertex[i].vencedorX == true){
                    mapa_derrota[c_derrotas] = new Vertex(vertex[i].label, vertex[i].numJogadas);
                    c_derrotas++;
                }
            }

            for(i = 0; i < 5477; i++){
                grau = vertex[i].matches(label);
                if(grau == numJogadas && vertex[i].numJogadas == numJogadas+1){
                    mapa_prox_jogada[c_jogadas] = new Vertex(vertex[i].label, vertex[i].numJogadas);
                    c_jogadas++;
                }
            }

            //*verifica se o proximo estado e o de vitoria*/
            for(i = 0; i < c_jogadas; i++){
                for(int c = 0; c < c_vitorias; c++){
                    grau = mapa_prox_jogada[i].matches(mapa_vitoria[c].label);
                    if(grau == numJogadas && mapa_vitoria[c].numJogadas == numJogadas+1){
                        for(int z = 0; z < 9; z++){
                            if((label.charAt(z) == meuCaractere ^ mapa_vitoria[c].label.charAt(z) == meuCaractere) && (mapa_vitoria[c].label.charAt(z) != '.')){
                                return z;
                            }
                        }
                    }
                }
            }

            //*verifica se o oponente vence nas proximos estado*/
            for(i = 0; i < c_jogadas; i++){
                for(int c = 0; c < c_derrotas; c++){
                    grau = mapa_prox_jogada[i].matches(mapa_derrota[c].label);
                    if(grau == numJogadas+1 && mapa_derrota[c].numJogadas == numJogadas+2){
                        //mapa_prox_jogada[i].printMatriz();
                        //System.out.println();
                        //mapa_derrota[c].printMatriz();
                        //System.out.println();
                        //"X...O..O."
                        //"XOX.O..O."
                        //System.out.println(mapa_derrota[c].label);
                        for(int z = 0; z < 9; z++){
                            if(label.charAt(z) == '.' && mapa_derrota[c].label.charAt(z) == opCaractere){
                                return z;
                            }
                        }
                    }
                }
            }
            // jogagada com maior peso em cenario trivial
            for(i = 0; i < c_jogadas; i++){
                if(mapa_prox_jogada[i].label.charAt(4) == meuCaractere && label.charAt(4) != meuCaractere){
                    return 4;
                }
            }
            // jogada com peso medio em cenario trivial
            for(i = 0; i < c_jogadas; i++){
                for(int c = 0; c < 9; c++){
                    if(c%2 == 0 && mapa_prox_jogada[i].label.charAt(c) == meuCaractere && label.charAt(c) != meuCaractere){
                        return c;
                    }
                }
            }
            // jogada com peso baixo em cenario trivial
            for(i = 0; i < c_jogadas; i++){
                for(int c = 0; c < 9; c++){
                    if(c%2 != 0 && mapa_prox_jogada[i].label.charAt(c) == meuCaractere && label.charAt(c) != meuCaractere){
                        return c;
                    }
                }
            }

        }
        else if(numJogadas == 1){
            c_vitorias = 0;
            c_jogadas = 0;
            this.meuCaractere = 'X';
            this.opCaractere = 'O';

            for(i = 0; i < 5477; i++){
                grau = vertex[i].matches(label);
                if(grau >= 0 && vertex[i].vencedorX == true){
                    mapa_vitoria[c_vitorias] = new Vertex(vertex[i].label, vertex[i].numJogadas);
                    c_vitorias++;
                }else if(grau >= 0 && vertex[i].vencedorO == true){
                    mapa_derrota[c_derrotas] = new Vertex(vertex[i].label, vertex[i].numJogadas);
                    c_derrotas++;
                }
            }

            for(i = 0; i < 5477; i++){
                grau = vertex[i].matches(label);
                if(grau == numJogadas && vertex[i].numJogadas == numJogadas+1){
                    mapa_prox_jogada[c_jogadas] = new Vertex(vertex[i].label, vertex[i].numJogadas);
                    c_jogadas++;
                }
            }
            
            for(i = 0; i < c_jogadas; i++){
                // peso maior no meio
                if(mapa_prox_jogada[i].label.charAt(4) == meuCaractere)
                    return 4;
            }
            // peso medio nas bordas
            for(i = 0; i < c_jogadas; i++){
                for(int c = 0; c < 9; c++){
                    if(c%2 == 0 && mapa_prox_jogada[i].label.charAt(c) == meuCaractere)
                        return c;
                }
            }
            // peso baixo nos tracados
            for(i = 0; i < c_jogadas; i++){
                for(int c = 0; c < 9; c++){
                    if(c%2 != 0 && mapa_prox_jogada[i].label.charAt(c) == meuCaractere)
                        return c;
                }
            }
        }else{
            /*jogada para o X */
            if(numJogadas%2 != 0){
                c_jogadas = 0;
                
                for(i = 0; i < 5477; i++){
                    grau = vertex[i].matches(label);
                    if(grau == numJogadas && vertex[i].numJogadas == numJogadas+1){
                        mapa_prox_jogada[c_jogadas] = new Vertex(vertex[i].label, vertex[i].numJogadas);
                        c_jogadas++;
                    }
                }
                //*verifica se o proximo estado e o de vitoria*/
                for(i = 0; i < c_jogadas; i++){
                    for(int c = 0; c < c_vitorias; c++){
                        grau = mapa_prox_jogada[i].matches(mapa_vitoria[c].label);
                        if(grau == numJogadas && mapa_vitoria[c].numJogadas == numJogadas){
                            for(int z = 0; z < 9; z++){
                                if((label.charAt(z) == meuCaractere ^ mapa_vitoria[c].label.charAt(z) == meuCaractere) && (mapa_vitoria[c].label.charAt(z) != '.')){
                                    return z;
                                }
                            }
                        }
                    }
                }
                //*verifica qual o proximo melhor estado*/
                for(i = 0; i < c_jogadas; i++){
                    for(int c = 0; c < c_derrotas; c++){
                        grau = mapa_prox_jogada[i].matches(mapa_derrota[c].label);
                        if(grau == numJogadas+1 && mapa_derrota[c].numJogadas == numJogadas+2){
                            //mapa_prox_jogada[i].printMatriz();
                            //System.out.println();
                            //mapa_derrota[c].printMatriz();
                            //System.out.println();
                            //"X..OO...."
                            //"XX.OOO..."
                            for(int z = 0; z < 9; z++){
                                if(label.charAt(z) == '.' && mapa_derrota[c].label.charAt(z) == opCaractere){
                                    return z;
                                }
                            }
                        }
                    }
                }
                // jogagada com maior peso em cenario trivial
                for(i = 0; i < c_jogadas; i++){
                    if(mapa_prox_jogada[i].label.charAt(4) == meuCaractere && label.charAt(4) != meuCaractere){
                        return 4;
                    }
                }
                // jogada com peso medio em cenario trivial
                for(i = 0; i < c_jogadas; i++){
                    for(int c = 0; c < 9; c++){
                        if(c%2 == 0 && mapa_prox_jogada[i].label.charAt(c) == meuCaractere && label.charAt(c) != meuCaractere){
                            return c;
                        }
                    }
                }
                // jogada com peso baixo em cenario trivial
                for(i = 0; i < c_jogadas; i++){
                    for(int c = 0; c < 9; c++){
                        if(c%2 != 0 && mapa_prox_jogada[i].label.charAt(c) == meuCaractere && label.charAt(c) != meuCaractere){
                            return c;
                        }
                    }
                }
            }
            /*jogada para o O */
            if(numJogadas%2 == 0){
                c_jogadas = 0;
                
                for(i = 0; i < 5477; i++){
                    grau = vertex[i].matches(label);
                    if(grau == numJogadas && vertex[i].numJogadas == numJogadas+1){
                        mapa_prox_jogada[c_jogadas] = new Vertex(vertex[i].label, vertex[i].numJogadas);
                        c_jogadas++;
                    }
                }
                //*verifica se o proximo estado e o de vitoria*/
                for(i = 0; i < c_jogadas; i++){
                    for(int c = 0; c < c_vitorias; c++){
                        grau = mapa_prox_jogada[i].matches(mapa_vitoria[c].label);
                        if(grau == numJogadas && mapa_vitoria[c].numJogadas == numJogadas){
                            for(int z = 0; z < 9; z++){
                                if(label.charAt(z) == meuCaractere ^ mapa_vitoria[c].label.charAt(z) == meuCaractere){
                                    return z;
                                }
                            }
                        }
                    }
                }
                //*verifica se o oponente vence nas proximos estado*/
                for(i = 0; i < c_jogadas; i++){
                    for(int c = 0; c < c_derrotas; c++){
                        grau = mapa_prox_jogada[i].matches(mapa_derrota[c].label);
                        if(grau == numJogadas+1 && mapa_derrota[c].numJogadas == numJogadas+2){
                            //mapa_prox_jogada[i].printMatriz();
                            //System.out.println();
                            //mapa_derrota[c].printMatriz();
                            //System.out.println();
                            //"X...O..O."
                            //"XOX.O..O."
                            //System.out.println(mapa_derrota[c].label);
                            for(int z = 0; z < 9; z++){
                                if(label.charAt(z) == '.' && mapa_derrota[c].label.charAt(z) == opCaractere){
                                    return z;
                                }
                            }
                        }
                    }
                }
                // jogagada com maior peso em cenario trivial
                for(i = 0; i < c_jogadas; i++){
                    if(mapa_prox_jogada[i].label.charAt(4) == meuCaractere && label.charAt(4) != meuCaractere){
                        return 4;
                    }
                }
                // jogada com peso medio em cenario trivial
                for(i = 0; i < c_jogadas; i++){
                    for(int c = 0; c < 9; c++){
                        if(c%2 == 0 && mapa_prox_jogada[i].label.charAt(c) == meuCaractere && label.charAt(c) != meuCaractere){
                            return c;
                        }
                    }
                }
                // jogada com peso baixo em cenario trivial
                for(i = 0; i < c_jogadas; i++){
                    for(int c = 0; c < 9; c++){
                        if(c%2 != 0 && mapa_prox_jogada[i].label.charAt(c) == meuCaractere && label.charAt(c) != meuCaractere){
                            return c;
                        }
                    }
                }
            }
        }
        return -1;
    }
}
