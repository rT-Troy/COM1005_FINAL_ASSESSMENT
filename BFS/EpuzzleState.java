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


    @Override //check if every tile match the target order
    boolean goalPredicate(Search searcher) {
        boolean result = true;
        EpuzzleSearch esearcher = (EpuzzleSearch) searcher;
        HashMap<Integer,Integer> searList = esearcher.getEPuzzleList();
        for (int i = 0; i <searList.size()-1; i++) {
            if(searList.get(i) != i+1) {
                result = false;
                break;
            }
        }
        return (result);
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
