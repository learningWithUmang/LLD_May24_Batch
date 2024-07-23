package TicTacToe.factory;

import TicTacToe.models.BotDifficultyLevel;
import TicTacToe.strategies.botwinningstrategies.BotwinningStrategy;
import TicTacToe.strategies.botwinningstrategies.EasyBotWinningStrategy;
import TicTacToe.strategies.botwinningstrategies.HardBotWinningStrategy;
import TicTacToe.strategies.botwinningstrategies.MediumBotWinningStrategy;

public class BotPlayingStrategyFactory {
     public static BotwinningStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel){
        if(botDifficultyLevel.equals(BotDifficultyLevel.EASY)){
            return new EasyBotWinningStrategy();
        }else if(botDifficultyLevel.equals(BotDifficultyLevel.MEDIUM)){
            return new MediumBotWinningStrategy();
        }else  return new HardBotWinningStrategy();
    }
}
