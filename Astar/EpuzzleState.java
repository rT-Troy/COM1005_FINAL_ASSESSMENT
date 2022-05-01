import java.util.ArrayList;
import java.util.Arrays;

public class EpuzzleState extends SearchState{

    private int[][] ePuzzleList;
    private final String method;

    //Constructor
    public EpuzzleState(int[][] list, int lc, int rc, String m){
        ePuzzleList = list;
        localCost = lc;
        estRemCost = rc;
        method = m;
    }


    @Override
    boolean goalPredicate(Search searcher) {
        EpuzzleSearch esearcher = (EpuzzleSearch) searcher;
        return (Arrays.deepEquals(ePuzzleList, esearcher.getTARGET()));
    }

    @Override
    ArrayList<SearchState> getSuccessors(Search searcher) {
        EpuzzleSearch esearcher = (EpuzzleSearch) searcher;
        ArrayList<EpuzzleState> epslist = new ArrayList<EpuzzleState>();
        ArrayList<SearchState> sslist = new ArrayList<SearchState>();
        int[] serArr = getSerNum(esearcher.getePuzzleList());



        return null;
    }

    @Override
    boolean sameState(SearchState n2) {
        EpuzzleState ss2 = (EpuzzleState) n2;
        return (Arrays.deepEquals(ePuzzleList,ss2.ePuzzleList));
    }

    public int[] getSerNum(int[][] list){
        int[] arr = new int[1];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j]==0){
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }
        return arr;
    }

}
