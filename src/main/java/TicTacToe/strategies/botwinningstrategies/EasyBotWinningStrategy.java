package TicTacToe.strategies.botwinningstrategies;

import TicTacToe.models.Board;
import TicTacToe.models.Cell;
import TicTacToe.models.CellState;
import TicTacToe.models.Move;
import TicTacToe.strategies.winningstrategies.WinningStrategy;

import java.util.List;

public class EasyBotWinningStrategy implements BotwinningStrategy {
    @Override
    public Move makeMove(Board board) {
        //Iterate through the board and make the move at the first empty cell

        for(List<Cell> cells : board.getBoard()){
            for(Cell cell : cells){
                if(cell.getCellState() == CellState.EMPTY){
                    return new Move(null, cell);
                }
            }
        }

        return null;
    }
}
