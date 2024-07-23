package TicTacToe.strategies.winningstrategies;

import TicTacToe.models.*;

import java.util.HashMap;
import java.util.Map;

public class RowWinningStrategy implements WinningStrategy{
    private Map<Integer, Map<Symbol, Integer>> rowHashmaps = new HashMap<>();

    @Override
    public boolean checkWinner(Move move, Board board) {
        Cell cell = move.getCell();
        int row = cell.getRow();

        Player player = move.getPlayer();
        Symbol symbol = player.getSymbol();

        if(!rowHashmaps.containsKey(row)){
            rowHashmaps.put(row, new HashMap<Symbol,Integer>());
        }

        Map<Symbol, Integer> hm = rowHashmaps.get(row);

        if(!hm.containsKey(symbol)){
            hm.put(symbol,0);
        }

        hm.put(symbol, hm.get(symbol) + 1);

        int count = hm.get(symbol);
        return count ==  board.getDimension();
    }
}

/*


[          ] -> (0,hm1)
[  X , X , . .     'O'  ] -> (1,hm2) -> {X,2},{'0',1}
[          ] -> (2,hm3) -'X'

(1,2) -> (1, hm)
In every hashmap, are we storing the count of every symbol??
hashmap<Symbol, int> hm -> N
 */
