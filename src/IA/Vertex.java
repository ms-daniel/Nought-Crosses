package IA;

class Vertex
   {
   public String label;
   public int numJogadas;
   public boolean vencedorX = false;
   public boolean vencedorO = false;
   public char[][] matriz = new char[3][3];

   public Vertex(String lab, int numJogadas) {
      this.numJogadas = numJogadas;
      this.label = lab;
      this.matriz = preencheMatriz(lab);
      verificaVecedor(lab);
   }

   public void verificaVecedor(String label){
      int contX = 0;
      int contO = 0;
      /*conta linhas */
      for(int i = 0; i < 3;i++){
         for(int c = 0; c < 3; c++){
            if(matriz[i][c] == 'O')
               contO++;
            if(matriz[i][c] == 'X')
               contX++;
         }
         if(contO == 3){
            this.vencedorO = true;
            return;
         }
         if(contX == 3){
            this.vencedorX = true;
            return;
         }
         contX = 0;
         contO = 0;
      }
      
      contX = 0;
      contO = 0;
      /*conta colunas */
      for(int i = 0; i < 3;i++){
         for(int c = 0; c < 3; c++){
            if(matriz[c][i] == 'O')
               contO++;
            if(matriz[c][i] == 'X')
               contX++;
         }
         if(contO == 3){
            this.vencedorO = true;
            return;
         }
         if(contX == 3){
            this.vencedorX = true;
            return;
         }
         contX = 0;
         contO = 0;
      }      

      contX = 0;
      contO = 0;
      /*conta diagonal */
      for(int i = 0; i < 3;i++){
         if(matriz[i][i] == 'O')
            contO++;
         if(matriz[i][i] == 'X')
            contX++;
      }
      if(contO == 3){
         this.vencedorO = true;
         return;
      }
      if(contX == 3){
         this.vencedorX = true;
         return;
      }

      contX = 0;
      contO = 0;
      /*conta diagonal-contraria */
      if(matriz[0][2] == 'O')
         contO++;
      if(matriz[0][2] == 'X')
         contX++;
      
      if(matriz[1][1] == 'O')
         contO++;
      if(matriz[1][1] == 'X')
         contX++;

      if(matriz[2][0] == 'O')
         contO++;
      if(matriz[2][0] == 'X')
         contX++;

      if(contO == 3){
         this.vencedorO = true;
         return;
      }
      if(contX == 3){
         this.vencedorX = true;
         return;
      }
   }

   public char[][] preencheMatriz(String label){
      char matriz[][] = new char[3][3];

      matriz[0][0] = label.charAt(0);
      matriz[0][1] = label.charAt(1);
      matriz[0][2] = label.charAt(2);

      matriz[1][0] = label.charAt(3);
      matriz[1][1] = label.charAt(4);
      matriz[1][2] = label.charAt(5);

      matriz[2][0] = label.charAt(6);
      matriz[2][1] = label.charAt(7);
      matriz[2][2] = label.charAt(8);

      return matriz;
   }

   public void printMatriz(){
      for(int i = 0; i < 3; i++){
         for(int c = 0; c < 3; c++){
            System.out.print(matriz[i][c]);
            System.out.print(" ");
         }
         System.out.println();
      }
   }

   public int matches(String lab){
      char matrix[][] = new char[3][3];
      matrix = preencheMatriz(lab);

      int grau = 0;

      for(int i = 0; i < 3; i++){
         for(int c = 0; c < 3; c++){
            if((matrix[i][c] == matriz[i][c]) && matrix[i][c] != '.')
               grau++;
         }
      }

      return grau;
   }
   } 
