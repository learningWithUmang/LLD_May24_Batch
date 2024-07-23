package TicTacToe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int dimension;
    List<List<Cell>> board;

    public Board(int dimension){
        this.dimension = dimension;
        this.board = new ArrayList<>(); // []
        for(int i = 0 ; i < dimension ; i++){
            this.board.add(new ArrayList<>()); //[ [] , [] , [] ]

            for(int j = 0 ; j < dimension ; j++){
                this.board.get(i).add(new Cell(i,j));
            }
        }
        // [ cellobj, cellobkj, cellobj.... ] for every row
    }

    void print(){ // List<List<Cell>>
        for(List<Cell> cells :board){
            for(Cell cell : cells){
                if(cell.getCellState() == CellState.EMPTY){
                    System.out.print("|  |");
                }else{
                    System.out.print("| " + cell.getPlayer().getSymbol().getaChar() + " |");
                }
            }
            System.out.println();
        }
    }

    public int getDimension() {
        return dimension;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }
}
