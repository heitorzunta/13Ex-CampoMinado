public class Minesweeper {


    public Minesweeper(char[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] != '*'){
                    matrix[i][j] = '0';
                }
            }
        }
    }

    public void resultMinesweeper(char[][]matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] != '*') { //efetua verificacao apenas nos campos nao minados

                    //todos os elementos centrais da matriz
                    if (i > 0 && i < matrix.length - 1) { //para todos os elementos no centro da matriz
                        if (j > 0 && j < matrix[0].length - 1) {
                            if (matrix[i - 1][j - 1] == '*') matrix[i][j]++; //diagonal superior esquerda
                            if (matrix[i - 1][j] == '*') matrix[i][j]++; //cima
                            if (matrix[i][j - 1] == '*') matrix[i][j]++; //elemento esquerda
                            if (matrix[i][j + 1] == '*') matrix[i][j]++; //elemento direita
                            if (matrix[i + 1][j - 1] == '*') matrix[i][j]++; //diagonal inferior esquerda
                            if (matrix[i + 1][j + 1] == '*') matrix[i][j]++; //diagonal inferior direita
                            if (matrix[i + 1][j] == '*') matrix[i][i]++; //abaixo
                            if (matrix[i - 1][j + 1] == '*') matrix[i][j]++; //diagonal superior direita
                        }
                    }

                    //caso coluna esquerda(entre o primeiro e o ultimo termo da coluna)
                    if (j == 0) { //caso: canto esquerdo
                        if (matrix[i][j + 1] == '*') matrix[i][j]++; //posterior

                        if (i > 0 && i < matrix.length - 1) { //elementos da primeira coluna entre primeiro e ultimo
                            if (matrix[i - 1][j] == '*') matrix[i][j]++; //elemento abaixo
                            if(matrix[i + 1][j] == '*') matrix[i][j]++; //elemento acima
                            if(matrix[i+1][j+1] == '*') matrix[i][j]++; //diagonal inferior
                            if(matrix[i-1][j+1] == '*') matrix[i][j]++; //diagonal superior
                        }

                        if(i == 0){ //elemento a(0,0)
                            if(matrix[i+1][j]=='*') matrix[i][j]++; //termo de baixo
                            if(matrix[i+1][j+1]=='*') matrix[i][j]++; //diagonal inferior
                        }

                        if(i == matrix[0].length-1){ //termo matrix.lenght
                          if(matrix[i-1][j]=='*') matrix[i][j]++; //acima
                          if(matrix[i-1][j+1]=='*') matrix[i][j]++; //diagonal superior
                         }

                    }

                    //caso coluna direita
                    if (j == matrix[0].length - 1) { //caso: canto direito
                          if(matrix[i][j-1] == '*') matrix[i][j]++;

                         if(i > 0 && i < matrix.length -1){ //elementos da primeira coluna entre primeiro e ultimo
                             if(matrix[i-1][j] == '*') matrix[i][j]++; //elemento abaixo
                             if(matrix[i+1][j] == '*') matrix[i][j]++; //elemento acima
                             if(matrix[i-1][j-1] == '*') matrix[i][j]++; //diagonal superior
                             if(matrix[i+1][j-1] == '*') matrix[i][j]++; //diagonal inferior
                         }

                         if(i==0) { //termo a(lenght, 0)
                             if(matrix[i+1][j]=='*') matrix[i][j]++; //termo de baixo
                             if(matrix[i+1][j-1]=='*') matrix[i][j]++; //diagonal inferior
                         }


                        if(i == matrix.length-1){ //termo matrix[lenght, lenght]
                            if(matrix[i-1][j]=='*') matrix[i][j]++; //acima
                            if(matrix[i-1][j-1]=='*') matrix[i][j]++; //diagonal superior
                        }

                    }

                     //Centro da barda superior
                    if(i==0){ //canto superior
                        if(j>0 && j<matrix.length-1){
                            if(matrix[i][j-1] == '*') matrix[i][j]++; //anterior
                            if(matrix[i][j+1] == '*') matrix[i][j]++; //posterior
                            if(matrix[i+1][j-1] == '*') matrix[i][j]++; //diagonal inferior
                            if(matrix[i+1][j+1] == '*') matrix[i][j]++; //diagonal posterior
                            if(matrix[i+1][j] == '*') matrix[i][j]++; //abaixo
                        }
                    }

                    //Centro da borda inferior
                    if(i==matrix.length-1){ //canto inferior
                        if(j>0 && j<matrix.length-1){
                            if(matrix[i][j-1] == '*') matrix[i][j]++; //anterior
                            if(matrix[i][j+1] == '*') matrix[i][j]++; //posterior
                            if(matrix[i-1][j-1] == '*') matrix[i][j]++; //diagonal inferior
                            if(matrix[i-1][j+1] == '*') matrix[i][j]++; //diagonal posterior
                            if(matrix[i-1][j] == '*') matrix[i][j]++; // acima
                        }

                    }
                }
            }
        }
        drawnMinesweeper(matrix);
    }

    // Desenha a Matriz do campo minado
    public void drawnMinesweeper(char[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
