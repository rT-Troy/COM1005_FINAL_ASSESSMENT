import java.util.ArrayList;
import java.util.HashMap;

public class EpuzzleSearch extends Search {

    private int[] puzzleList;
    private int[] target;

    /**
     * Constructor
     * @param arr the array of tile content
     * @param goal the array of target
     */
    public EpuzzleSearch(int[] arr, int[] goal){
        puzzleList = arr;
        target = goal;
    }

    /**
     * accessor for the puzzle list
     * @return the array of tile content
     */
    public int[] getPuzzleList() {
        return puzzleList;
    }

    public int[] getTarget() {
        return target;
    }
}