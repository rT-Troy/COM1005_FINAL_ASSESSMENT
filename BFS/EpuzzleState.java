import java.util.ArrayList;

public class EpuzzleState extends SearchState{

    private int serValue;
    private int thisValue;

    public EpuzzleState(int sva, int tva){
        this.serValue = sva;
        this.thisValue = tva;
    }

    //find initState position
    public EpuzzleState(int[] list){
        this.thisValue = tva;
        this.serValue =
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
