package backtracking;

/**
 * Created by Sigora on 07.07.2015.
 */
public class NQueenProblem {

    static int n = 3;
    static int [][] board = new int[][]{
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0}};


    public static void main(String[] args) {
        putFigure(board,0);
        printBoard(board);

        //System.out.println(isOverlap(board, 1, 2, n));
    }

    public static boolean isOverlap(int [][] board, int xPos, int yPos, int n){
        //check vertical
        for(int i = 0; i <= n; i++){
            if(board[i][xPos] == 1) return true;
        }

        //check horizontal
        for(int j = 0; j <= n; j++){
            if(board[yPos][j] == 1) return true;
        }

        //check right top diagonal
        for(int i = xPos, j = yPos; j >= 0 && i <= n; i++, j--){
            if(board[j][i] == 1) return true;
        }

        //check right bottom diagonal
        for(int i = xPos, j = yPos; j <=n && i <= n; i++, j++){
            if(board[j][i] == 1) return true;
        }

        //check left top diagonal
        for(int i = xPos, j = yPos; j >=0 && i >= 0; i--, j--){
            if(board[j][i] == 1) return true;
        }

        //check left bottom diagonal
        for(int i = xPos, j = yPos; j <=n && i >= 0; i--, j++){
            if(board[j][i] == 1) return true;
        }

        return false;
    }

    public static boolean putFigure(int [][] board, int column){

        if(column > n){
            return true;
        }

        for(int i = 0; i <= n; i++){
            if(!isOverlap(board,i,column,n)){
                board[column][i] = 1;

                if(putFigure(board, column + 1))
                    return true;

                board[column][i] = 0;
            }
        }

        return false;
    }


    public static void printBoard(int [][] board){
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= n; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
