package TicTacToe.strategies.winningstrategies;

import TicTacToe.models.Board;
import TicTacToe.models.Cell;
import TicTacToe.models.Move;
import TicTacToe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class DiagonalWinningStrategy implements WinningStrategy {
    private Map<Symbol, Integer> leftDiagonalMap = new HashMap<>();
    private Map<Symbol, Integer> rightDiagonalMap = new HashMap<>();
    @Override
    public boolean checkWinner(Move move, Board board) {
        Cell cell = move.getCell();
        int row = cell.getRow();
        int col = cell.getCol();

        Symbol symbol = move.getPlayer().getSymbol();

        //row, col belong to left diagonal => r == c
        //row, col belong to right diagonal => r + c == dimension - 1

        if(row == col){
            if(!leftDiagonalMap.containsKey(symbol)){
                leftDiagonalMap.put(symbol, 0);
            }
            leftDiagonalMap.put(symbol, leftDiagonalMap.get(symbol) + 1);

            int count = leftDiagonalMap.get(symbol);
            return count == board.getDimension();
        }

        if(row + col == board.getDimension() - 1){
            if(!rightDiagonalMap.containsKey(symbol)){
                rightDiagonalMap.put(symbol, 0);
            }
            rightDiagonalMap.put(symbol, rightDiagonalMap.get(symbol) + 1);

            int count = rightDiagonalMap.get(symbol);
            return count == board.getDimension();
        }

        return false;
    }
}

/*
[ ,   ,   ]
[ ,    ,  ]
[ ,    ,  ]
left = (0,0) , (1,1) , (2,2) - r == c
right = (0,2) , (1,1) , (2,0) = > 2 = n-1
 */