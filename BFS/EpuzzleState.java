/** State in a 8-puzzle search
 * Version for Breadth and breadth-first and depth-first
 * COM1005 - (Bsc)Computer Science
 * Jun Zhang (jzhang213@sheffield.ac.uk)
 * 4 May 2022 Version
 */

import java.util.ArrayList;
import java.util.Arrays;

public class EpuzzleState extends SearchState{

    private int[] ePuzzleList;

    /** Constructor
     * EpuzzleState
     * @param epList - array of puzzle state
     */
    public EpuzzleState(int[] epList){
        ePuzzleList = epList;
    }

    /**
     * getePuzzleList
     * @return the array of puzzle state
     */
    public int[] getePuzzleList() {
        return ePuzzleList;
    }

    @Override
    /**
     * goalPredicate- judge if the current state equals to the goal
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
        //use different slide way according to the serial number of different space(0)
        if (ser == 0) {
            epslist.add(new EpuzzleState(new int[]{ePuzzleList[1], ePuzzleList[0], ePuzzleList[2], ePuzzleList[3], ePuzzleList[4], ePuzzleList[5], ePuzzleList[6], ePuzzleList[7], ePuzzleList[8]}));
            epslist.add(new EpuzzleState(new int[]{ePuzzleList[3], ePuzzleList[1], ePuzzleList[2], ePuzzleList[0], ePuzzleList[4], ePuzzleList[5], ePuzzleList[6], ePuzzleList[7], ePuzzleList[8]}));
        } else if (ser == 1) {
            epslist.add(new EpuzzleState(new int[]{ePuzzleList[1], ePuzzleList[0], ePuzzleList[2], ePuzzleList[3], ePuzzleList[4], ePuzzleList[5], ePuzzleList[6], ePuzzleList[7], ePuzzleList[8]}));
            epslist.add(new EpuzzleState(new int[]{ePuzzleList[0], ePuzzleList[2], ePuzzleList[1], ePuzzleList[3], ePuzzleList[4], ePuzzleList[5], ePuzzleList[6], ePuzzleList[7], ePuzzleList[8]}));
            epslist.add(new EpuzzleState(new int[]{ePuzzleList[0], ePuzzleList[4], ePuzzleList[2], ePuzzleList[3], ePuzzleList[1], ePuzzleList[5], ePuzzleList[6], ePuzzleList[7], ePuzzleList[8]}));
        } else if (ser == 2) {
            epslist.add(new EpuzzleState(new int[]{ePuzzleList[0], ePuzzleList[2], ePuzzleList[1], ePuzzleList[3], ePuzzleList[4], ePuzzleList[5], ePuzzleList[6], ePuzzleList[7], ePuzzleList[8]}));
            epslist.add(new EpuzzleState(new int[]{ePuzzleList[0], ePuzzleList[1], ePuzzleList[5], ePuzzleList[3], ePuzzleList[4], ePuzzleList[2], ePuzzleList[6], ePuzzleList[7], ePuzzleList[8]}));
        } else if (ser == 3) {
            epslist.add(new EpuzzleState(new int[]{ePuzzleList[3], ePuzzleList[1], ePuzzleList[2], ePuzzleList[0], ePuzzleList[4], ePuzzleList[5], ePuzzleList[6], ePuzzleList[7], ePuzzleList[8]}));
            epslist.add(new EpuzzleState(new int[]{ePuzzleList[0], ePuzzleList[1], ePuzzleList[2], ePuzzleList[4], ePuzzleList[3], ePuzzleList[5], ePuzzleList[6], ePuzzleList[7], ePuzzleList[8]}));
            epslist.add(new EpuzzleState(new int[]{ePuzzleList[0], ePuzzleList[1], ePuzzleList[2], ePuzzleList[6], ePuzzleList[4], ePuzzleList[5], ePuzzleList[3], ePuzzleList[7], ePuzzleList[8]}));
        } else if (ser == 4) {
            epslist.add(new EpuzzleState(new int[]{ePuzzleList[0], ePuzzleList[4], ePuzzleList[2], ePuzzleList[3], ePuzzleList[1], ePuzzleList[5], ePuzzleList[6], ePuzzleList[7], ePuzzleList[8]}));
            epslist.add(new EpuzzleState(new int[]{ePuzzleList[0], ePuzzleList[1], ePuzzleList[2], ePuzzleList[4], ePuzzleList[3], ePuzzleList[5], ePuzzleList[6], ePuzzleList[7], ePuzzleList[8]}));
            epslist.add(new EpuzzleState(new int[]{ePuzzleList[0], ePuzzleList[1], ePuzzleList[2], ePuzzleList[3], ePuzzleList[5], ePuzzleList[4], ePuzzleList[6], ePuzzleList[7], ePuzzleList[8]}));
            epslist.add(new EpuzzleState(new int[]{ePuzzleList[0], ePuzzleList[1], ePuzzleList[2], ePuzzleList[3], ePuzzleList[7], ePuzzleList[5], ePuzzleList[6], ePuzzleList[4], ePuzzleList[8]}));
        } else if (ser == 5) {
            epslist.add(new EpuzzleState(new int[]{ePuzzleList[0], ePuzzleList[1], ePuzzleList[5], ePuzzleList[3], ePuzzleList[4], ePuzzleList[2], ePuzzleList[6], ePuzzleList[7], ePuzzleList[8]}));
            epslist.add(new EpuzzleState(new int[]{ePuzzleList[0], ePuzzleList[1], ePuzzleList[2], ePuzzleList[3], ePuzzleList[5], ePuzzleList[4], ePuzzleList[6], ePuzzleList[7], ePuzzleList[8]}));
            epslist.add(new EpuzzleState(new int[]{ePuzzleList[0], ePuzzleList[1], ePuzzleList[2], ePuzzleList[3], ePuzzleList[4], ePuzzleList[8], ePuzzleList[6], ePuzzleList[7], ePuzzleList[5]}));
        } else if (ser == 6) {
            epslist.add(new EpuzzleState(new int[]{ePuzzleList[0], ePuzzleList[1], ePuzzleList[2], ePuzzleList[6], ePuzzleList[4], ePuzzleList[5], ePuzzleList[3], ePuzzleList[7], ePuzzleList[8]}));
            epslist.add(new EpuzzleState(new int[]{ePuzzleList[0], ePuzzleList[1], ePuzzleList[2], ePuzzleList[3], ePuzzleList[4], ePuzzleList[5], ePuzzleList[7], ePuzzleList[6], ePuzzleList[8]}));
        } else if (ser == 7) {
            epslist.add(new EpuzzleState(new int[]{ePuzzleList[0], ePuzzleList[1], ePuzzleList[2], ePuzzleList[3], ePuzzleList[7], ePuzzleList[5], ePuzzleList[6], ePuzzleList[4], ePuzzleList[8]}));
            epslist.add(new EpuzzleState(new int[]{ePuzzleList[0], ePuzzleList[1], ePuzzleList[2], ePuzzleList[3], ePuzzleList[4], ePuzzleList[5], ePuzzleList[7], ePuzzleList[6], ePuzzleList[8]}));
            epslist.add(new EpuzzleState(new int[]{ePuzzleList[0], ePuzzleList[1], ePuzzleList[2], ePuzzleList[3], ePuzzleList[4], ePuzzleList[5], ePuzzleList[6], ePuzzleList[8], ePuzzleList[7]}));
        } else if (ser == 8) {
            epslist.add(new EpuzzleState(new int[]{ePuzzleList[0], ePuzzleList[1], ePuzzleList[2], ePuzzleList[3], ePuzzleList[4], ePuzzleList[8], ePuzzleList[6], ePuzzleList[7], ePuzzleList[5]}));
            epslist.add(new EpuzzleState(new int[]{ePuzzleList[0], ePuzzleList[1], ePuzzleList[2], ePuzzleList[3], ePuzzleList[4], ePuzzleList[5], ePuzzleList[6], ePuzzleList[8], ePuzzleList[7]}));
        }

        return new ArrayList<SearchState>(epslist);
    }

    @Override
    /**
     * sameState
     * @param n2 - the given state
     */
    boolean sameState(SearchState n2) {
        EpuzzleState eqs = (EpuzzleState) n2;
        return Arrays.equals(ePuzzleList,eqs.getePuzzleList());
    }

    /**
     * getSerNum - get the serial number that determine the direction
     * @param list - the given array
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
            sb.append(ePuzzleList[i]);
            sb.append("\t");
            if ((i+1)%3==0){
                sb.append("\r\n");
            }
        }
        return sb.toString();
    }
}
