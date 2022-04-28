import java.util.ArrayList;
import java.util.HashMap;

public class EpuzzleState extends SearchState{

    private int serValue;
    private int thisValue;

    public EpuzzleState(int sva, int tva){
        serValue = sva;
        thisValue = tva;
    }

    //find the initState position
    public EpuzzleState(HashMap<Integer,Integer> list){
        int num = 0;
        for(int x : list.keySet()){
            if (list.get(x).equals(0)){
                serValue = num;
                thisValue = list.get(num);
            }
            num++;
        }
    }

    public int getSerValue() {
        return serValue;
    }

    public int getThisValue() {
        return thisValue;
    }


    @Override
    boolean goalPredicate(Search searcher) {
        return false;
    }

    @Override
    ArrayList<SearchState> getSuccessors(Search searcher) {
        return null;
    }

    @Override
    boolean sameState(SearchState n2) {
        return false;
    }
}
