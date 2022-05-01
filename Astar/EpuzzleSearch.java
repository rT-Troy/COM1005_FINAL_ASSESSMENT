import java.util.HashMap;

public class EpuzzleSearch {

    private HashMap<Integer,Integer> ePuzzleList = new HashMap<Integer,Integer>();
    //constructor

    public EpuzzleSearch(int[][] pg) {
        int initKey = 0;
        for (int i = 0; i < pg.length; i++) {
            for (int j = 0; j < pg[i].length; j++) {
                ePuzzleList.put(initKey, pg[i][j]);
                initKey++;
            }
        }
    }

    public HashMap<Integer, Integer> getePuzzleList() {
        return ePuzzleList;
    }
}
