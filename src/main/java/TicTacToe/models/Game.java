package TicTacToe.models;

import TicTacToe.exceptions.InvalidBotCountException;
import TicTacToe.exceptions.InvalidPlayerCountException;
import TicTacToe.strategies.winningstrategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private Player winner;
    private GameState gameState;
    private int nextPlayerMoveIndex;
    private List<WinningStrategy> winningStrategies;

    private Game(int dimension, List<Player> players, List<WinningStrategy> winningStrategies){
        this.players = players;
        this.winningStrategies = winningStrategies;
        this.board = new Board(dimension);
        this.moves = new ArrayList<>();
        this.gameState = GameState.IN_PROGRESS;
        this.nextPlayerMoveIndex = 0;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public void makeMove(){

    }

    public void printBoard(){
        board.print();
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public int getNextPlayerMoveIndex() {
        return nextPlayerMoveIndex;
    }

    public void setNextPlayerMoveIndex(int nextPlayerMoveIndex) {
        this.nextPlayerMoveIndex = nextPlayerMoveIndex;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public static class Builder{
        private int dimension;
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;

        //Game.getBuilder().setDimension().setPlayers().setWinningStrategies().build();
        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        private void validateBotCount() throws InvalidBotCountException{
            int botCount = 0;
            for(Player player : players){
                if(player.getPlayerType() == PlayerType.BOT){
                    botCount++;
                }
            }
            if(botCount > 1){
                throw new InvalidBotCountException("Count of BOTs are greater than 1");
            }
        }

        private void validatePlayerCount() throws InvalidPlayerCountException{
            if(players.size() != dimension - 1){
                throw new InvalidPlayerCountException("Player count is invalid");
            }
        }

        private void validateUniqueSymbolsForEachPlayers(){

        }

        private void validate() throws InvalidBotCountException, InvalidPlayerCountException{
            validateBotCount();
            validateUniqueSymbolsForEachPlayers();
            validatePlayerCount();
        }

        public Game build() throws InvalidPlayerCountException, InvalidBotCountException{
            //Before building the game, we should validate the game object
            validate();
            return new Game(
                    dimension,
                    players,
                    winningStrategies
            );
        }

    }
}
