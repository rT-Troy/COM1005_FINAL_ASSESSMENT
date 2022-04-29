import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class EpuzzleSearch extends Search {

    private int serNum;
    private int thisNum;
    private HashMap<Integer,Integer> puzzleList =
            new HashMap<Integer,Integer>();

    //constructor
    public EpuzzleSearch(int sn, int tn){
        serNum = sn;
        thisNum = tn;
    }

    public EpuzzleSearch(int[] thisNumArr){
        for (int i = 0; i < thisNumArr.length; i++) {
            puzzleList.put(i,thisNumArr[i]);
        }
    }

    public int getSerNum() {
        return serNum;
    }

    public int getThisNum() {
        return thisNum;
    }

    public HashMap<Integer, Integer> getEPuzzleList() {
        return puzzleList;
    }



    public ArrayList<Integer> transfer(int sur1, int sur2) {
        HashMap<Integer,Integer> list = puzzleList;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int tile1 = list.get(sur1);
        int tile2 = list.get(sur2);
        list.replace(sur1,tile2);
        list.replace(sur2,tile1);

        for (int x : list.keySet()){
            arr.add(x);
        }


        return arr;
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