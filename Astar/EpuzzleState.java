import java.util.ArrayList;
import java.util.Arrays;

public class EpuzzleState extends SearchState{

    private int[][] ePuzzleList;


    //Constructor
    public EpuzzleState(int[][] list, int lc, int rc){
        ePuzzleList = list;
        localCost = lc;
        estRemCost = rc;
    }

    public int[][] getePuzzleList() {
        return ePuzzleList;
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
        int[] serArr = getSerNum(esearcher.getPuzzleList());
        localCost++;
        if (esearcher.getMETHOD() == "Hamming"){
            estRemCost = hamming(esearcher);
        } else{
            estRemCost = manhattan(esearcher);
        }

        if (serArr[0] == 0) {
            if (serArr[1] == 0){
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][1], ePuzzleList[0][0], ePuzzleList[0][2]}, {ePuzzleList[1][3], ePuzzleList[1][4], ePuzzleList[1][5]}, {ePuzzleList[2][6], ePuzzleList[2][7], ePuzzleList[2][8]}},localCost,estRemCost));
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[1][3], ePuzzleList[0][1], ePuzzleList[0][2]}, {ePuzzleList[0][0], ePuzzleList[1][4], ePuzzleList[1][5]}, {ePuzzleList[2][6], ePuzzleList[2][7], ePuzzleList[2][8]}},localCost,estRemCost));
            } else if (serArr[1] == 1) {
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][1], ePuzzleList[0][0], ePuzzleList[0][2]}, {ePuzzleList[1][3], ePuzzleList[1][4], ePuzzleList[1][5]}, {ePuzzleList[2][6], ePuzzleList[2][7], ePuzzleList[2][8]}},localCost,estRemCost));
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][2], ePuzzleList[0][1]}, {ePuzzleList[1][3], ePuzzleList[1][4], ePuzzleList[1][5]}, {ePuzzleList[2][6], ePuzzleList[2][7], ePuzzleList[2][8]}},localCost,estRemCost));
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[1][4], ePuzzleList[1][2]}, {ePuzzleList[1][3], ePuzzleList[0][1], ePuzzleList[1][5]}, {ePuzzleList[2][6], ePuzzleList[2][7], ePuzzleList[2][8]}},localCost,estRemCost));
            } else if (serArr[1] == 2) {
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][2], ePuzzleList[0][1]}, {ePuzzleList[1][3], ePuzzleList[1][4], ePuzzleList[1][5]}, {ePuzzleList[2][6], ePuzzleList[2][7], ePuzzleList[2][8]}},localCost,estRemCost));
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][1], ePuzzleList[1][5]}, {ePuzzleList[1][3], ePuzzleList[1][4], ePuzzleList[0][2]}, {ePuzzleList[2][6], ePuzzleList[2][7], ePuzzleList[2][8]}},localCost,estRemCost));
            }
        } else if (serArr[0] == 1) {
            if (serArr[1] == 0) {
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[1][3], ePuzzleList[0][1], ePuzzleList[0][2]}, {ePuzzleList[0][0], ePuzzleList[1][4], ePuzzleList[1][5]}, {ePuzzleList[2][6], ePuzzleList[2][7], ePuzzleList[2][8]}},localCost,estRemCost));
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][1], ePuzzleList[0][2]}, {ePuzzleList[1][4], ePuzzleList[1][3], ePuzzleList[1][5]}, {ePuzzleList[2][6], ePuzzleList[2][7], ePuzzleList[2][8]}},localCost,estRemCost));
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][1], ePuzzleList[0][2]}, {ePuzzleList[2][6], ePuzzleList[1][4], ePuzzleList[1][5]}, {ePuzzleList[1][3], ePuzzleList[2][7], ePuzzleList[2][8]}},localCost,estRemCost));
            } else if (serArr[1] == 1) {
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[1][4], ePuzzleList[0][2]}, {ePuzzleList[1][3], ePuzzleList[0][1], ePuzzleList[1][5]}, {ePuzzleList[2][6], ePuzzleList[2][7], ePuzzleList[2][8]}},localCost,estRemCost));
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][1], ePuzzleList[0][2]}, {ePuzzleList[1][4], ePuzzleList[1][3], ePuzzleList[1][5]}, {ePuzzleList[2][6], ePuzzleList[2][7], ePuzzleList[2][8]}},localCost,estRemCost));
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][1], ePuzzleList[0][2]}, {ePuzzleList[1][3], ePuzzleList[1][5], ePuzzleList[1][4]}, {ePuzzleList[2][6], ePuzzleList[2][7], ePuzzleList[2][8]}},localCost,estRemCost));
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][1], ePuzzleList[0][2]}, {ePuzzleList[1][3], ePuzzleList[2][7], ePuzzleList[1][5]}, {ePuzzleList[2][6], ePuzzleList[1][4], ePuzzleList[2][8]}},localCost,estRemCost));
            } else if (serArr[1] == 2) {
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][1], ePuzzleList[1][5]}, {ePuzzleList[1][3], ePuzzleList[1][4], ePuzzleList[0][2]}, {ePuzzleList[2][6], ePuzzleList[2][7], ePuzzleList[2][8]}},localCost,estRemCost));
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][1], ePuzzleList[0][2]}, {ePuzzleList[1][3], ePuzzleList[1][5], ePuzzleList[1][4]}, {ePuzzleList[2][6], ePuzzleList[2][7], ePuzzleList[2][8]}},localCost,estRemCost));
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][1], ePuzzleList[0][2]}, {ePuzzleList[1][3], ePuzzleList[1][4], ePuzzleList[2][8]}, {ePuzzleList[2][6], ePuzzleList[2][7], ePuzzleList[1][5]}},localCost,estRemCost));
            }
        } else if (serArr[0] == 2) {
            if (serArr[1] == 0) {
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][1], ePuzzleList[0][2]}, {ePuzzleList[2][6], ePuzzleList[1][4], ePuzzleList[1][5]}, {ePuzzleList[1][3], ePuzzleList[2][7], ePuzzleList[2][8]}},localCost,estRemCost));
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][1], ePuzzleList[0][2]}, {ePuzzleList[1][3], ePuzzleList[1][4], ePuzzleList[1][5]}, {ePuzzleList[2][7], ePuzzleList[2][6], ePuzzleList[2][8]}},localCost,estRemCost));
            } else if (serArr[1] == 1) {
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][1], ePuzzleList[0][2]}, {ePuzzleList[1][3], ePuzzleList[2][7], ePuzzleList[1][5]}, {ePuzzleList[2][6], ePuzzleList[1][4], ePuzzleList[2][8]}},localCost,estRemCost));
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][1], ePuzzleList[0][2]}, {ePuzzleList[1][3], ePuzzleList[1][4], ePuzzleList[1][5]}, {ePuzzleList[2][7], ePuzzleList[2][6], ePuzzleList[2][8]}},localCost,estRemCost));
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][1], ePuzzleList[0][2]}, {ePuzzleList[1][3], ePuzzleList[1][4], ePuzzleList[1][5]}, {ePuzzleList[2][6], ePuzzleList[2][8], ePuzzleList[2][7]}},localCost,estRemCost));
            } else if (serArr[1] == 2) {
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][1], ePuzzleList[0][2]}, {ePuzzleList[1][3], ePuzzleList[1][4], ePuzzleList[2][8]}, {ePuzzleList[2][6], ePuzzleList[2][7], ePuzzleList[1][5]}},localCost,estRemCost));
                epslist.add(new EpuzzleState(new int[][]{{ePuzzleList[0][0], ePuzzleList[0][1], ePuzzleList[0][2]}, {ePuzzleList[1][3], ePuzzleList[1][4], ePuzzleList[1][5]}, {ePuzzleList[2][6], ePuzzleList[2][8], ePuzzleList[2][7]}},localCost,estRemCost));
            }
        }
        return new ArrayList<SearchState>(epslist);
    }

    @Override
    boolean sameState(SearchState n2) {
        EpuzzleState ss2 = (EpuzzleState) n2;
        return (Arrays.deepEquals(ePuzzleList,ss2.getePuzzleList()));
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

    public int hamming(EpuzzleSearch searcher){
        int count = 0;
        int[][] arr = searcher.getPuzzleList();
        int[][] tar = searcher.getTARGET();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == tar[i][j]){
                    count++;
                }
            }
        }
        return count;
    }

    public int manhattan(EpuzzleSearch searcher){
        int[][] arr = searcher.getPuzzleList();
        int x, y;
        for (int i = 0; i < arr.length; i++) {

        }

        return 0;
    }

}
