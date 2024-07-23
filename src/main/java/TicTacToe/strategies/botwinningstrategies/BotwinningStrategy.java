package TicTacToe.strategies.botwinningstrategies;

import TicTacToe.models.Board;
import TicTacToe.models.Move;

public interface BotwinningStrategy {
    Move makeMove(Board board);
}
