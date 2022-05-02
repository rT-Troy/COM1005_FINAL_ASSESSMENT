public class EpuzzleSearch extends Search{
    private int[][] puzzleList;
    private final int[][] TARGET;
    private final String METHOD;

    /** Constructor
     * @param pg array of puzzle state
     * @param goal the array of target
     * @param method chosen method
     */
    public EpuzzleSearch(int[][] pg, int[][] goal,String method) {
        puzzleList = pg;
        TARGET = goal;
        METHOD = method;
    }

    /**
     * accessor for the puzzle list
     * @return the array of tile content
     */
    public int[][] getPuzzleList() {
        return puzzleList;
    }

    /**
     * accessor for the target
     * @return the array of target
     */
    public int[][] getTARGET() {
        return TARGET;
    }

    /**
     * accessor for the method
     * @return the String method
     */
    public String getMETHOD() {
        return METHOD;
    }
}
