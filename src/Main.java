import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));
        int line, colluns;
        char matrix[][];

        line = sc.nextInt();
        colluns = sc.nextInt();
        matrix = new char[line][colluns];

        for(int i=0; i < line; i++){
            String string = sc.next();
            for(int j=0; j < colluns; j++){

                matrix[i][j]= string.charAt(j);
            }
        }

        Minesweeper campoMinado = new Minesweeper(matrix);
        campoMinado.resultMinesweeper(matrix);
    }
}
