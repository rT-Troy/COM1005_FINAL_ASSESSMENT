import java.util.ArrayList;
import java.util.HashMap;

public class EpuzzleSearch extends Search {

    private int puzzleSer; //the serial number
    private HashMap<Integer,Integer> puzzleList = new HashMap<Integer,Integer>();

    //constructor-transfer int array to hashmap
    public EpuzzleSearch(int[][] pg) {
        int initKey = 0;
        for (int i = 0; i < pg.length; i++) {
            for (int j = 0; j < pg[i].length; j++) {
                puzzleList.put(initKey,pg[i][j]);
                initKey ++;
            }
        }

    }
    public EpuzzleSearch(HashMap<Integer,Integer> list) {
        puzzleList = list;
    }

    public HashMap<Integer,Integer> getHashList(){
        return puzzleList;
    }





}
