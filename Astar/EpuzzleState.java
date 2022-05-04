/** EpuzzleState.java
 * State in an 8-puzzle search
 * Version for A* and branch and bound
 * COM1005 - (Bsc)Computer Science
 * Jun Zhang (jzhang213@sheffield.ac.uk)
 * 4 May 2022 Version
 */
package Astar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class EpuzzleState extends SearchState {


    private int[][] ePuzzleList;


    /** Constructor
     * EpuzzleState
     * @param list - two-dimensional array of puzzle state
     * @param lc - the local cost of getting to this state from the parent state
     * @param rc - the estimated remaining cost
     */
    public EpuzzleState(int[][] list, int lc, int rc){
        ePuzzleList = list;
        localCost = lc;
        estRemCost = rc;
    }

    /**
     * getePuzzleList
     * @return the erray of puzzle state
     */
    public int[][] getePuzzleList() {
        return ePuzzleList;
    }

    @Override
    /**
     * goalPredicate - judge if the current state equals to the goal
     */
    boolean goalPredicate(Search searcher) {
        EpuzzleSearch esearcher = (EpuzzleSearch) searcher;
        return (Arrays.deepEquals(ePuzzleList, esearcher.getTARGET()));
    }

    @Override
    /**
     * getSuccessors
     * @param searcher - the current search
     */
    ArrayList<SearchState> getSuccessors(Search searcher) {
        EpuzzleSearch esearcher = (EpuzzleSearch) searcher;
        ArrayList<EpuzzleState> epslist = new ArrayList<EpuzzleState>();
        int[] serArr = getSerNum();
        localCost = 1;

        //use different slide way according to the serial number of different space(0)
        if (serArr[0] == 0) {
            if (serArr[1] == 0){
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][1], ePuzzleList[0][0], ePuzzleList[0][2]}, {ePuzzleList[1][0], ePuzzleList[1][1], ePuzzleList[1][2]}, {ePuzzleList[2][0], ePuzzleList[2][1], ePuzzleList[2][2]}},localCost,setEstRemCost(esearcher)));
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[1][0], ePuzzleList[0][1], ePuzzleList[0][2]}, {ePuzzleList[0][0], ePuzzleList[1][1], ePuzzleList[1][2]}, {ePuzzleList[2][0], ePuzzleList[2][1], ePuzzleList[2][2]}},localCost,setEstRemCost(esearcher)));
            } else if (serArr[1] == 1) {
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][1], ePuzzleList[0][0], ePuzzleList[0][2]}, {ePuzzleList[1][0], ePuzzleList[1][1], ePuzzleList[1][2]}, {ePuzzleList[2][0], ePuzzleList[2][1], ePuzzleList[2][2]}},localCost,setEstRemCost(esearcher)));
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][2], ePuzzleList[0][1]}, {ePuzzleList[1][0], ePuzzleList[1][1], ePuzzleList[1][2]}, {ePuzzleList[2][0], ePuzzleList[2][1], ePuzzleList[2][2]}},localCost,setEstRemCost(esearcher)));
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[1][1], ePuzzleList[1][2]}, {ePuzzleList[1][0], ePuzzleList[0][1], ePuzzleList[1][2]}, {ePuzzleList[2][0], ePuzzleList[2][1], ePuzzleList[2][2]}},localCost,setEstRemCost(esearcher)));
            } else if (serArr[1] == 2) {
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][2], ePuzzleList[0][1]}, {ePuzzleList[1][0], ePuzzleList[1][1], ePuzzleList[1][2]}, {ePuzzleList[2][0], ePuzzleList[2][1], ePuzzleList[2][2]}},localCost,setEstRemCost(esearcher)));
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][1], ePuzzleList[1][2]}, {ePuzzleList[1][0], ePuzzleList[1][1], ePuzzleList[0][2]}, {ePuzzleList[2][0], ePuzzleList[2][1], ePuzzleList[2][2]}},localCost,setEstRemCost(esearcher)));
            }
        } else if (serArr[0] == 1) {
            if (serArr[1] == 0) {
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[1][0], ePuzzleList[0][1], ePuzzleList[0][2]}, {ePuzzleList[0][0], ePuzzleList[1][1], ePuzzleList[1][2]}, {ePuzzleList[2][0], ePuzzleList[2][1], ePuzzleList[2][2]}},localCost,setEstRemCost(esearcher)));
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][1], ePuzzleList[0][2]}, {ePuzzleList[1][1], ePuzzleList[1][0], ePuzzleList[1][2]}, {ePuzzleList[2][0], ePuzzleList[2][1], ePuzzleList[2][2]}},localCost,setEstRemCost(esearcher)));
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][1], ePuzzleList[0][2]}, {ePuzzleList[2][0], ePuzzleList[1][1], ePuzzleList[1][2]}, {ePuzzleList[1][0], ePuzzleList[2][1], ePuzzleList[2][2]}},localCost,setEstRemCost(esearcher)));
            } else if (serArr[1] == 1) {
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[1][1], ePuzzleList[0][2]}, {ePuzzleList[1][0], ePuzzleList[0][1], ePuzzleList[1][2]}, {ePuzzleList[2][0], ePuzzleList[2][1], ePuzzleList[2][2]}},localCost,setEstRemCost(esearcher)));
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][1], ePuzzleList[0][2]}, {ePuzzleList[1][1], ePuzzleList[1][0], ePuzzleList[1][2]}, {ePuzzleList[2][0], ePuzzleList[2][1], ePuzzleList[2][2]}},localCost,setEstRemCost(esearcher)));
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][1], ePuzzleList[0][2]}, {ePuzzleList[1][0], ePuzzleList[1][2], ePuzzleList[1][1]}, {ePuzzleList[2][0], ePuzzleList[2][1], ePuzzleList[2][2]}},localCost,setEstRemCost(esearcher)));
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][1], ePuzzleList[0][2]}, {ePuzzleList[1][0], ePuzzleList[2][1], ePuzzleList[1][2]}, {ePuzzleList[2][0], ePuzzleList[1][1], ePuzzleList[2][2]}},localCost,setEstRemCost(esearcher)));
            } else if (serArr[1] == 2) {
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][1], ePuzzleList[1][2]}, {ePuzzleList[1][0], ePuzzleList[1][1], ePuzzleList[0][2]}, {ePuzzleList[2][0], ePuzzleList[2][1], ePuzzleList[2][2]}},localCost,setEstRemCost(esearcher)));
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][1], ePuzzleList[0][2]}, {ePuzzleList[1][0], ePuzzleList[1][2], ePuzzleList[1][1]}, {ePuzzleList[2][0], ePuzzleList[2][1], ePuzzleList[2][2]}},localCost,setEstRemCost(esearcher)));
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][1], ePuzzleList[0][2]}, {ePuzzleList[1][0], ePuzzleList[1][1], ePuzzleList[2][2]}, {ePuzzleList[2][0], ePuzzleList[2][1], ePuzzleList[1][2]}},localCost,setEstRemCost(esearcher)));
            }
        } else if (serArr[0] == 2) {
            if (serArr[1] == 0) {
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][1], ePuzzleList[0][2]}, {ePuzzleList[2][0], ePuzzleList[1][1], ePuzzleList[1][2]}, {ePuzzleList[1][0], ePuzzleList[2][1], ePuzzleList[2][2]}},localCost,setEstRemCost(esearcher)));
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][1], ePuzzleList[0][2]}, {ePuzzleList[1][0], ePuzzleList[1][1], ePuzzleList[1][2]}, {ePuzzleList[2][1], ePuzzleList[2][0], ePuzzleList[2][2]}},localCost,setEstRemCost(esearcher)));
            } else if (serArr[1] == 1) {
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][1], ePuzzleList[0][2]}, {ePuzzleList[1][0], ePuzzleList[2][1], ePuzzleList[1][2]}, {ePuzzleList[2][0], ePuzzleList[1][1], ePuzzleList[2][2]}},localCost,setEstRemCost(esearcher)));
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][1], ePuzzleList[0][2]}, {ePuzzleList[1][0], ePuzzleList[1][1], ePuzzleList[1][2]}, {ePuzzleList[2][1], ePuzzleList[2][0], ePuzzleList[2][2]}},localCost,setEstRemCost(esearcher)));
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][1], ePuzzleList[0][2]}, {ePuzzleList[1][0], ePuzzleList[1][1], ePuzzleList[1][2]}, {ePuzzleList[2][0], ePuzzleList[2][2], ePuzzleList[2][1]}},localCost,setEstRemCost(esearcher)));
            } else if (serArr[1] == 2) {
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][1], ePuzzleList[0][2]}, {ePuzzleList[1][0], ePuzzleList[1][1], ePuzzleList[2][2]}, {ePuzzleList[2][0], ePuzzleList[2][1], ePuzzleList[1][2]}},localCost,setEstRemCost(esearcher)));
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][1], ePuzzleList[0][2]}, {ePuzzleList[1][0], ePuzzleList[1][1], ePuzzleList[1][2]}, {ePuzzleList[2][0], ePuzzleList[2][2], ePuzzleList[2][1]}},localCost,setEstRemCost(esearcher)));
            }
        }
        return new ArrayList<SearchState>(epslist);
    }

    @Override
    /**
     * sameState
     * @param n2 - the given state
     */
    boolean sameState(SearchState n2) {
        EpuzzleState ss2 = (EpuzzleState) n2;
        return (Arrays.deepEquals(ePuzzleList,ss2.getePuzzleList()));
    }

    /**
     * setEstRemCost - choose different method for the estimated remaining cost
     * @param searcher - the current search
     * @return the estimated remaining cost
     */
    public int setEstRemCost(EpuzzleSearch searcher){
        if (Objects.equals(searcher.getMETHOD(), "Hamming")){
            estRemCost = hamming(searcher);
        } else{
            estRemCost = manhattan();
        }
        return estRemCost;
    }

    /**
     * getSerNum - get the array which represent the serial number that determine the direction
     * @return the two-dimensional array represent serial number of space(0)
     */
    public int[] getSerNum(){
        int[] arr = new int[2];
        for (int i = 0; i < ePuzzleList.length; i++) {
            for (int j = 0; j < ePuzzleList[i].length; j++) {
                if (ePuzzleList[i][j]==0){
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }
        return arr;
    }

    /**
     * hamming - define how much number of tiles out of place
     * @param searcher - the current search
     * @return the local cost of hamming method
     */
    public int hamming(EpuzzleSearch searcher){
        int count = 0;
        int[][] arr = ePuzzleList;
        int[][] tar = searcher.getTARGET();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == tar[i][j]){
                    count++;
                }
            }
        }
        return 9-count;
    }

    /**
     * manhattan - define the sum of the moves each tile needs to get the goal
     * @return the local cost of manhattan method
     */
    public int manhattan(){
        int[][] arr = ePuzzleList;
        int x, y;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                x = (arr[i][j]-1)%3;    //the column of a two-dimensional array like x-axis
                y = (arr[i][j]-1-x)/3;  //the row of a two-dimensional array like y-axis
                count = count + Math.abs(y-i) + Math.abs(x-j);
            }
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\r\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sb.append(ePuzzleList[i][j]);
                sb.append("\t");
            }
                sb.append("\r\n");
        }
        return sb.toString();
    }
}
