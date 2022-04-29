import java.util.ArrayList;
import java.util.HashMap;

public class EpuzzleSearch extends Search {

    private int[] puzzleList;

    //constructor
    public EpuzzleSearch(int[] arr){
        puzzleList = arr;
    }

    public int[] getPuzzleList() {
        return puzzleList;
    }

    public int getZero(int[] arr) {
        int serNum = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                serNum = i;
                break;
            }
        }
        return serNum;
    }

    //    @Override
//    public String toString() {
//        StringBuffer sb = new StringBuffer();
//        for (int i = 0; i < ePuzzleList.size(); i++) {
//            sb.append(ePuzzleList.get(i));
//            sb.append(" ");
//            if ((i+1)%3==0){
//                System.getProperty("line.separator");
//            }
//        }
//        String st = sb.toString();
//        return st;
//    }
}



//    private int puzzleSer; //the serial number
//    private HashMap<Integer,Integer> puzzleList = new HashMap<Integer,Integer>();
//
//    //constructor-transfer int array to hashmap
//    public EpuzzleSearch(int[][] pg) {
//        int initKey = 0;
//        for (int i = 0; i < pg.length; i++) {
//            for (int j = 0; j < pg[i].length; j++) {
//                puzzleList.put(initKey,pg[i][j]);
//                initKey ++;
//            }
//        }
//
//    }
//    public EpuzzleSearch(HashMap<Integer,Integer> list) {
//        puzzleList = list;
//    }
//
//    public HashMap<Integer,Integer> getHashList(){
//        return puzzleList;
//    }