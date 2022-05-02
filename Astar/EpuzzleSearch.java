public class EpuzzleSearch extends Search{

    private int[][] puzzleList;
    private final int[][] TARGET;
    private final String METHOD;
//    private HashMap<Integer,Integer> ePuzzleList = new HashMap<Integer,Integer>();


    //constructor
    public EpuzzleSearch(int[][] pg, int[][] goal,String method) {
        puzzleList = pg;
        TARGET = goal;
        METHOD = method;
    }

    public int[][] getPuzzleList() {
        return puzzleList;
    }

    public int[][] getTARGET() {
        return TARGET;
    }

    public String getMETHOD() {
        return METHOD;
    }
}
