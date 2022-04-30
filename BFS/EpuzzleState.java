import java.util.ArrayList;
import java.util.Arrays;

public class EpuzzleState extends SearchState{

    private int[] ePuzzleList;

    /** Constructor
     * EpuzzleState
     * @param epList puzzle list for state
     */
    public EpuzzleState(int[] epList){
        ePuzzleList = epList;
    }

    /**
     * getePuzzleList
     * @return the array of state
     */
    public int[] getePuzzleList() {
        return ePuzzleList;
    }

    @Override
    /**
     * goalPredicate
     * @param searcher - the current search
     */
    boolean goalPredicate(Search searcher) {
        EpuzzleSearch eps = (EpuzzleSearch) searcher;
        return (Arrays.equals(ePuzzleList,eps.getTarget()));
    }

    @Override
    /**
     * getSuccessors
     * @param searcher - the current search
     */
    ArrayList<SearchState> getSuccessors(Search searcher) {
        ArrayList<EpuzzleState> epslist = new ArrayList<EpuzzleState>();
        int ser = getSerNum(ePuzzleList);
        //use different slide way according to the serial number of different space
        if (ser == 0) {
            epslist.add(new EpuzzleState(new int[]{getePuzzleList()[1], getePuzzleList()[0], getePuzzleList()[2], getePuzzleList()[3], getePuzzleList()[4], getePuzzleList()[5], getePuzzleList()[6], getePuzzleList()[7], getePuzzleList()[8]}));
            epslist.add(new EpuzzleState(new int[]{getePuzzleList()[3], getePuzzleList()[1], getePuzzleList()[2], getePuzzleList()[0], getePuzzleList()[4], getePuzzleList()[5], getePuzzleList()[6], getePuzzleList()[7], getePuzzleList()[8]}));
        } else if (ser == 1) {
            epslist.add(new EpuzzleState(new int[]{getePuzzleList()[1], getePuzzleList()[0], getePuzzleList()[2], getePuzzleList()[3], getePuzzleList()[4], getePuzzleList()[5], getePuzzleList()[6], getePuzzleList()[7], getePuzzleList()[8]}));
            epslist.add(new EpuzzleState(new int[]{getePuzzleList()[0], getePuzzleList()[2], getePuzzleList()[1], getePuzzleList()[3], getePuzzleList()[4], getePuzzleList()[5], getePuzzleList()[6], getePuzzleList()[7], getePuzzleList()[8]}));
            epslist.add(new EpuzzleState(new int[]{getePuzzleList()[0], getePuzzleList()[4], getePuzzleList()[2], getePuzzleList()[3], getePuzzleList()[1], getePuzzleList()[5], getePuzzleList()[6], getePuzzleList()[7], getePuzzleList()[8]}));
        } else if (ser == 2) {
            epslist.add(new EpuzzleState(new int[]{getePuzzleList()[0], getePuzzleList()[2], getePuzzleList()[1], getePuzzleList()[3], getePuzzleList()[4], getePuzzleList()[5], getePuzzleList()[6], getePuzzleList()[7], getePuzzleList()[8]}));
            epslist.add(new EpuzzleState(new int[]{getePuzzleList()[0], getePuzzleList()[1], getePuzzleList()[5], getePuzzleList()[3], getePuzzleList()[4], getePuzzleList()[2], getePuzzleList()[6], getePuzzleList()[7], getePuzzleList()[8]}));
        } else if (ser == 3) {
            epslist.add(new EpuzzleState(new int[]{getePuzzleList()[3], getePuzzleList()[1], getePuzzleList()[2], getePuzzleList()[0], getePuzzleList()[4], getePuzzleList()[5], getePuzzleList()[6], getePuzzleList()[7], getePuzzleList()[8]}));
            epslist.add(new EpuzzleState(new int[]{getePuzzleList()[0], getePuzzleList()[1], getePuzzleList()[2], getePuzzleList()[4], getePuzzleList()[3], getePuzzleList()[5], getePuzzleList()[6], getePuzzleList()[7], getePuzzleList()[8]}));
            epslist.add(new EpuzzleState(new int[]{getePuzzleList()[0], getePuzzleList()[1], getePuzzleList()[2], getePuzzleList()[6], getePuzzleList()[4], getePuzzleList()[5], getePuzzleList()[3], getePuzzleList()[7], getePuzzleList()[8]}));
        } else if (ser == 4) {
            epslist.add(new EpuzzleState(new int[]{getePuzzleList()[0], getePuzzleList()[4], getePuzzleList()[2], getePuzzleList()[3], getePuzzleList()[1], getePuzzleList()[5], getePuzzleList()[6], getePuzzleList()[7], getePuzzleList()[8]}));
            epslist.add(new EpuzzleState(new int[]{getePuzzleList()[0], getePuzzleList()[1], getePuzzleList()[2], getePuzzleList()[4], getePuzzleList()[3], getePuzzleList()[5], getePuzzleList()[6], getePuzzleList()[7], getePuzzleList()[8]}));
            epslist.add(new EpuzzleState(new int[]{getePuzzleList()[0], getePuzzleList()[1], getePuzzleList()[2], getePuzzleList()[3], getePuzzleList()[5], getePuzzleList()[4], getePuzzleList()[6], getePuzzleList()[7], getePuzzleList()[8]}));
            epslist.add(new EpuzzleState(new int[]{getePuzzleList()[0], getePuzzleList()[1], getePuzzleList()[2], getePuzzleList()[3], getePuzzleList()[7], getePuzzleList()[5], getePuzzleList()[6], getePuzzleList()[4], getePuzzleList()[8]}));
        } else if (ser == 5) {
            epslist.add(new EpuzzleState(new int[]{getePuzzleList()[0], getePuzzleList()[1], getePuzzleList()[5], getePuzzleList()[3], getePuzzleList()[4], getePuzzleList()[2], getePuzzleList()[6], getePuzzleList()[7], getePuzzleList()[8]}));
            epslist.add(new EpuzzleState(new int[]{getePuzzleList()[0], getePuzzleList()[1], getePuzzleList()[2], getePuzzleList()[3], getePuzzleList()[5], getePuzzleList()[4], getePuzzleList()[6], getePuzzleList()[7], getePuzzleList()[8]}));
            epslist.add(new EpuzzleState(new int[]{getePuzzleList()[0], getePuzzleList()[1], getePuzzleList()[2], getePuzzleList()[3], getePuzzleList()[4], getePuzzleList()[8], getePuzzleList()[6], getePuzzleList()[7], getePuzzleList()[5]}));
        } else if (ser == 6) {
            epslist.add(new EpuzzleState(new int[]{getePuzzleList()[0], getePuzzleList()[1], getePuzzleList()[2], getePuzzleList()[6], getePuzzleList()[4], getePuzzleList()[5], getePuzzleList()[3], getePuzzleList()[7], getePuzzleList()[8]}));
            epslist.add(new EpuzzleState(new int[]{getePuzzleList()[0], getePuzzleList()[1], getePuzzleList()[2], getePuzzleList()[3], getePuzzleList()[4], getePuzzleList()[5], getePuzzleList()[7], getePuzzleList()[6], getePuzzleList()[8]}));
        } else if (ser == 7) {
            epslist.add(new EpuzzleState(new int[]{getePuzzleList()[0], getePuzzleList()[1], getePuzzleList()[2], getePuzzleList()[3], getePuzzleList()[7], getePuzzleList()[5], getePuzzleList()[6], getePuzzleList()[4], getePuzzleList()[8]}));
            epslist.add(new EpuzzleState(new int[]{getePuzzleList()[0], getePuzzleList()[1], getePuzzleList()[2], getePuzzleList()[3], getePuzzleList()[4], getePuzzleList()[5], getePuzzleList()[7], getePuzzleList()[6], getePuzzleList()[8]}));
            epslist.add(new EpuzzleState(new int[]{getePuzzleList()[0], getePuzzleList()[1], getePuzzleList()[2], getePuzzleList()[3], getePuzzleList()[4], getePuzzleList()[5], getePuzzleList()[6], getePuzzleList()[8], getePuzzleList()[7]}));
        } else if (ser == 8) {
            epslist.add(new EpuzzleState(new int[]{getePuzzleList()[0], getePuzzleList()[1], getePuzzleList()[2], getePuzzleList()[3], getePuzzleList()[4], getePuzzleList()[8], getePuzzleList()[6], getePuzzleList()[7], getePuzzleList()[5]}));
            epslist.add(new EpuzzleState(new int[]{getePuzzleList()[0], getePuzzleList()[1], getePuzzleList()[2], getePuzzleList()[3], getePuzzleList()[4], getePuzzleList()[5], getePuzzleList()[6], getePuzzleList()[8], getePuzzleList()[7]}));
        }

        return new ArrayList<SearchState>(epslist);
    }

    @Override
    /**
     * sameState
     * @param n2 the given state
     */
    boolean sameState(SearchState n2) {
        EpuzzleState eqs = (EpuzzleState) n2;
        return Arrays.equals(ePuzzleList,eqs.getePuzzleList());
    }

    /**
     * getSerNum
     * @param list the array
     * @return the serial number of space(0)
     */
    public int getSerNum(int[] list){
        int s = -1;
        for (int i = 0; i < list.length; i++) {
            if (list[i]==0){
                s = i;
                break;
            }
        }
        return s;
    }

    @Override
    /**
     * toString
     */
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\r\n");
        for (int i = 0; i < 9; i++) {
            sb.append(getePuzzleList()[i]);
            sb.append("\t");
            if ((i+1)%3==0){
                sb.append("\r\n");
            }
        }
        return sb.toString();
    }
}
