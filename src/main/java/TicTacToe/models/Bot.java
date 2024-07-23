package TicTacToe.models;

import TicTacToe.factory.BotPlayingStrategyFactory;
import TicTacToe.strategies.botwinningstrategies.BotwinningStrategy;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;
    private BotwinningStrategy botPlayingStrategy;
    /*
    BOT bot = new BOT(name, symbol, difflevel, playstrategy);
     */
    public Bot(String name, Symbol symbol, BotDifficultyLevel botDifficultyLevel){
        super(name, symbol, PlayerType.BOT);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(botDifficultyLevel);
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public BotwinningStrategy getBotPlayingStrategy() {
        return botPlayingStrategy;
    }

    public void setBotPlayingStrategy(BotwinningStrategy botPlayingStrategy) {
        this.botPlayingStrategy = botPlayingStrategy;
    }

    @Override
    public Move makeMove(Board board){
        Move move = botPlayingStrategy.makeMove(board);
        return move;
    }
}
