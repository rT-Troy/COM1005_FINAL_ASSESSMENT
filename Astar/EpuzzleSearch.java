public class EpuzzleSearch extends Search{

    private int[][] puzzleList;
    private final int[][] TARGET;
//    private HashMap<Integer,Integer> ePuzzleList = new HashMap<Integer,Integer>();


    //constructor
    public EpuzzleSearch(int[][] pg, int[][] goal) {
        puzzleList = pg;
        TARGET = goal;
    }

    public int[][] getPuzzleList() {
        return puzzleList;
    }

    public int[][] getTARGET() {
        return TARGET;
    }
}
