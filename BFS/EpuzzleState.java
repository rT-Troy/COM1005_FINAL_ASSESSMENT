import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class EpuzzleState extends SearchState{

    private int[] ePuzzleList;

    public EpuzzleState(EpuzzleSearch searcher){
        ePuzzleList = searcher.getPuzzleList();
//        for (int i = 0; i < searcher.getPuzzleList().length; i++) {
//            if(searcher.getPuzzleList()[i]==0){
//                ePuzzleList = searcher.getPuzzleList();
//            }
//        }
    }

    @Override
    boolean goalPredicate(Search searcher) {
        EpuzzleSearch esearcher = (EpuzzleSearch) searcher;
        boolean result = true;
        for (int i = 0; i < esearcher.getPuzzleList().length-1; i++) {
            if (esearcher.getPuzzleList()[i] != 1){
                result = false;
                break;
            }
        }
        return result;
    }

    @Override
    ArrayList<SearchState> getSuccessors(Search searcher) {
        EpuzzleSearch esearcher = (EpuzzleSearch) searcher;
        ArrayList<EpuzzleState> epslist = new ArrayList<EpuzzleState>();
        ArrayList<SearchState> sslist = new ArrayList<SearchState>();

        int i = esearcher.getZero(esearcher.getPuzzleList());

            if (esearcher.getPuzzleList()[i]==0){
                epslist.add(slide(esearcher,0,1));
                epslist.add(slide(esearcher,0,3));
            }
            if (esearcher.getPuzzleList()[i]==1){
                epslist.add(slide(esearcher,1,0));
                epslist.add(slide(esearcher,1,2));
                epslist.add(slide(esearcher,1,4));
            }
            if (esearcher.getPuzzleList()[i]==2){
                epslist.add(slide(esearcher,2,1));
                epslist.add(slide(esearcher,2,5));
            }
            if (esearcher.getPuzzleList()[i]==3){
                epslist.add(slide(esearcher,3,0));
                epslist.add(slide(esearcher,3,4));
                epslist.add(slide(esearcher,3,6));
            }
            if (esearcher.getPuzzleList()[i]==4){
                epslist.add(slide(esearcher,4,1));
                epslist.add(slide(esearcher,4,3));
                epslist.add(slide(esearcher,4,5));
                epslist.add(slide(esearcher,4,7));
            }
            if (esearcher.getPuzzleList()[i]==5){
                epslist.add(slide(esearcher,5,2));
                epslist.add(slide(esearcher,5,4));
                epslist.add(slide(esearcher,5,8));
            }
            if (esearcher.getPuzzleList()[i]==6){
                epslist.add(slide(esearcher,6,3));
                epslist.add(slide(esearcher,6,7));
            }
            if (esearcher.getPuzzleList()[i]==7){
                epslist.add(slide(esearcher,7,4));
                epslist.add(slide(esearcher,7,6));
                epslist.add(slide(esearcher,7,8));
            }
            if (esearcher.getPuzzleList()[i]==8){
                epslist.add(slide(esearcher,8,5));
                epslist.add(slide(esearcher,8,7));
            }

        for(EpuzzleState x : epslist){
            sslist.add((SearchState) x);
        }

        return sslist;
    }

    @Override
    boolean sameState(SearchState n2) {
        EpuzzleState eqs = (EpuzzleState) n2;
        return (ePuzzleList == eqs.ePuzzleList);
    }

    public EpuzzleState slide(EpuzzleSearch searcher, int serNum, int sucSerNum){
        EpuzzleSearch ssearcher = searcher;
        int[] list = ssearcher.getPuzzleList();
        for (int i = 0; i < list.length; i++) {
            int x = list[serNum];
            int y = list[sucSerNum];
            list[serNum] = y;
            list[sucSerNum] = x;
        }
        EpuzzleState theState = new EpuzzleState(new EpuzzleSearch(list));
        return theState;

    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\r\n");
        for (int i = 0; i < 9; i++) {
            sb.append(ePuzzleList[i]);
            if ((i+1)%3==0){
                sb.append("\r\n");
            }
        }
        String st = sb.toString();
        return st;
    }
}
