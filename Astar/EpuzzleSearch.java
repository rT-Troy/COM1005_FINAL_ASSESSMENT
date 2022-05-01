import java.util.HashMap;

public class EpuzzleSearch extends Search{

    private int[][] ePuzzleList;
    private final int[][] TARGET;
//    private HashMap<Integer,Integer> ePuzzleList = new HashMap<Integer,Integer>();


    //constructor
    public EpuzzleSearch(int[][] pg, int[][] goal) {
        ePuzzleList = pg;
        TARGET = goal;
    }

    public int[][] getePuzzleList() {
        return ePuzzleList;
    }

    public int[][] getTARGET() {
        return TARGET;
    }
}
