package TicTacToe.models;

import TicTacToe.strategies.botwinningstrategies.BotwinningStrategy;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;
    private BotwinningStrategy botPlayingStrategy;
    /*
    BOT bot = new BOT(name, symbol, difflevel, playstrategy);
     */
    public Bot(String name, Symbol symbol, BotDifficultyLevel botDifficultyLevel, BotwinningStrategy botPlayingStrategy){
        super(name, symbol, PlayerType.BOT);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy = botPlayingStrategy;
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
}
